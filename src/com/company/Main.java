package com.company;

public class Main {

    public static void main(String[] args) {
        Reader reader = new User("Scot");
        Reader reader1 = new User("Max");
        Supplier supplier = new User("Tom");
        Administrator administrator = new Employee("Ban");
        Librarian librarian = new Employee("Sam");

        Book book1 = new Book("'Head First Java'");
        Book book2 = new Book("'Effective Java'");
        Book book3 = new Book("'Clean Code'");

       supplier.supplyBook(book2, administrator);
        reader.returnBook(book1,librarian);
        reader1.takeBook(book3,librarian);
        librarian.orderBook(book1, supplier);
        administrator.findBook(book1);
     reader.takeBook(book3, librarian);
        administrator.overdueNotification(book2, reader);
    }
    }
