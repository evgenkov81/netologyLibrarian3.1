package com.company;

public class Employee implements Librarian, Administrator {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void overdueNotification(Book book, Reader reader) {
        System.out.println("Reader " + reader.getName()+" has expired the return time of the book "+ book.getTitleBook()+".");
    }

    @Override
    public void findBook(Book book) {
        System.out.println("Administrator  " + getName() + ", find the book " + book.getTitleBook()+".");
    }

    @Override
    public void giveBook(Book book, Reader reader) {
        System.out.println("Administrator " + getName() + ", gave the book " + book.getTitleBook() + " to the reader " + reader.getName()+".");
    }

    @Override
    public void orderBook(Book book, Supplier supplier) {
        System.out.println("Librarian " + getName() + ", ordered the book " + book.getTitleBook() + " from the supplier " + supplier.getName()+".");
    }

    @Override
    public String getName() {
        return name;
    }
}
