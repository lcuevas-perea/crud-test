package com.crudproject.crud.controllers;

import com.crudproject.crud.models.Book;
import com.crudproject.crud.services.ICrudTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

  private final ICrudTemplate<Book> bookService;

  public BookController(ICrudTemplate<Book> bookService) {
    this.bookService = bookService;
  }

  @GetMapping
  public List<Book> all() {
    return bookService.all();
  }

  @GetMapping("/{id}")
  public Book read(@PathVariable Long id) {
    return bookService.read(id);
  }

  @PostMapping
  public Book create(@RequestBody Book book) {
    return bookService.create(book);
  }

  @PutMapping("/{id}")
  public Book update(@PathVariable Long id, @RequestBody Book book) {
    return bookService.update(id, book);
  }

  @DeleteMapping("/{id}")
  public Book delete(@PathVariable Long id) {
    return bookService.delete(id);
  }

}
