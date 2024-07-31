package com.crudproject.crud.repositories.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(
    name = "BOOK"
)
public class BookEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(
      name = "ID"
  )
  private Long id;

  @Column(
      name = "TITLE"
  )
  private String title;

  @Column(
      name = "AUTHOR"
  )
  private String author;

  @Column(
      name = "YEAROF"
  )
  private int yearof;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getYearof() {
    return yearof;
  }

  public void setYearof(int yearof) {
    this.yearof = yearof;
  }

  @Override
  public String toString() {
    return "BookEntity{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", yearof=" + yearof +
        '}';
  }
}
