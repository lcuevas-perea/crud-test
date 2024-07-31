package com.crudproject.crud.services;

import com.crudproject.crud.exceptions.NotFoundException;
import com.crudproject.crud.mappers.BookMapper;
import com.crudproject.crud.models.Book;
import com.crudproject.crud.repositories.BookRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class BookService implements ICrudTemplate<Book> {

  private static final String NOT_FOUND_MESSAGE = "El elemento buscado no fue encontrado";

  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public List<Book> all() {
    return bookRepository.findAll().stream().map(BookMapper::map).collect(Collectors.toList());
  }

  @Override

  public Book create(Book book) {
    return BookMapper.map(bookRepository.save(BookMapper.map(book)));
  }

  @Override
  public Book read(Long id) {
    return BookMapper.map(bookRepository.findById(id).orElseThrow(() ->
        new NotFoundException(NOT_FOUND_MESSAGE)));
  }

  @Override
  public Book update(Long id, Book book) {
    return bookRepository.findById(id).map(e -> {
      book.setId(id);
      return BookMapper.map(bookRepository.save(BookMapper.map(book)));
    }).orElseThrow(() ->
        new NotFoundException(NOT_FOUND_MESSAGE));
  }

  @Override
  public Book delete(Long id) {
    return bookRepository.findById(id).map(e -> {
      Book deleted = BookMapper.map(e);
      bookRepository.deleteById(id);
      return deleted;
    }).orElseThrow(() ->
        new NotFoundException(NOT_FOUND_MESSAGE));
  }
}
