package com.company;

public class User implements Reader, Supplier {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void takeBook(Book book, Librarian librarian) {


        System.out.println(getName() +" reader took the book " + book.getTitleBook() +
                 " from " + librarian.getName()+ " librarian.");
    }

    @Override
    public void returnBook(Book book, Librarian librarian) {
        System.out.println("Reader " + getName() + ", return the book " + book.getTitleBook() + " librarian " + librarian.getName()+".");
    }

    @Override
    public void supplyBook(Book book, Administrator administrator) {
        System.out.println("Supplier " + getName() + ", brought the book " + book.getTitleBook() + " to the administrator "+ administrator.getName()+".");
    }

    @Override
    public String getName() {
        return name;
    }
}
