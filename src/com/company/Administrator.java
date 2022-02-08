package com.company;

public interface Administrator extends Human{
    void overdueNotification(Book book,Reader reader);
    void findBook(Book book);
    void giveBook(Book book, Reader reader);
}
