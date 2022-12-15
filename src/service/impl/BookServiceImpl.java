package service.impl;

import enums.Genre;
import model.Book;
import service.BookService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class BookServiceImpl implements BookService {
    private final List<Book>list=new ArrayList<>();





    @Override
    public List<Book> createBooks(List<Book> books) {

     this.list.addAll(books);

        return books;
    }

    @Override
    public List<Book> getAllBooks() {
        return list;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        System.out.println("Genre :");
        String Genre=new Scanner(System.in).nextLine();

        for (Book book:list) {
            if (book.getGenre().equals(genre)){
                return (List<Book>) book;
            }

        }
        return null;
        

    }

    @Override
    public Book removeBookById(Long id) {


        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        return null;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
     //   list.stream().filter(book -> ())
        return null;

    }

    @Override
    public List<Book> getBookByInitialLetter() {

        return null;
    }

    @Override
    public Book maxPriceBook() {
       // list.stream().max(Integer).ifPresent(System.out::println);
        return null;
    }
}
