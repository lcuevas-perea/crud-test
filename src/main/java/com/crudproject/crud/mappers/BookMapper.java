package com.crudproject.crud.mappers;

import com.crudproject.crud.models.Book;
import com.crudproject.crud.repositories.entities.BookEntity;

public class BookMapper {

  public static Book map (BookEntity from){
    Book to =  new Book();
    to.setAuthor(from.getAuthor());
    to.setId(from.getId());
    to.setYear(from.getYearof());
    to.setTitle(from.getTitle());
   return to;
  }

  public static BookEntity map (Book from){
    BookEntity to =  new BookEntity();
    to.setAuthor(from.getAuthor());
    to.setId(from.getId());
    to.setYearof(from.getYear());
    to.setTitle(from.getTitle());
    return to;
  }

}
