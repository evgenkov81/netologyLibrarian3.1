package com.company;

public interface Reader extends Human{
    void takeBook(Book book, Librarian librarian);
    void returnBook(Book book, Librarian librarian);
}
