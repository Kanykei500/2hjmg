import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;
import service.BookService;
import service.impl.BookServiceImpl;
import service.impl.UserServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.
        BookServiceImpl bookService=new BookServiceImpl();
        UserServiceImpl userService=new UserServiceImpl();

        List<Book>books=new ArrayList<>();
        Book book=new Book(1L,"Magiya", Genre.DETECTIVE, BigDecimal.valueOf(500),
                "ASD", Language.ENGLISH, LocalDate.of(2000,12,3));
        Book book1=new Book(2L,"Kyzyl alma", Genre.ROMANCE, BigDecimal.valueOf(456),
                "Chyngyz Aitmatov", Language.KYRGYZ, LocalDate.of(1992,4,12));
        Book book2=new Book(3L,"Birinchi Mugalim ", Genre.HISTORICAL, BigDecimal.valueOf(600),
                "Chyngyz Aitmatov", Language.KYRGYZ, LocalDate.of(1900,12,7));
        Book book3=new Book(4L,"Ak jaan ", Genre.ROMANCE, BigDecimal.valueOf(560),
                "Oskon Danikeev", Language.RUSSIAN, LocalDate.of(2002,6,3));
        Book book4=new Book(5L,"Erte kelgen  turnalar", Genre.DETECTIVE, BigDecimal.valueOf(1000),
                "Aitmatov", Language.ENGLISH, LocalDate.of(2022,12,24));
        List<User>users=new ArrayList<>();
        User user=new User(1L,"Kanykei","Askarbekova",
                "@kanykei","+996702666357", Gender.FEMALE,BigDecimal.valueOf(6712),
                books);
        User user1=new User(2L,"Saltanat","Nematilla kyzy",
                "@saltanat","+996774666357", Gender.FEMALE,BigDecimal.valueOf(5000),
                books);
        User user2=new User(3L,"Aiperi ","Toktosunova",
                "@toktosunova","+996702645657", Gender.FEMALE,BigDecimal.valueOf(4612),
                books);
        User user3=new User(4L,"Dastan","Askarbekov",
                "@dastan","+996702789347", Gender.MALE,BigDecimal.valueOf(2135),
                books);
        User user4=new User(5L,"Baktiyar","Toktogulov",
                "@baku","+996702663426", Gender.MALE,BigDecimal.valueOf(2354),
                books);




        while (true){
            System.out.println("""
                    ~~~~~~~~~~~~~COMMANDS~~~~~~~~~~
                    1.CREATE BOOKS
                    2.GET ALL BOOKS
                    3.CREATE USER
                    4.FIND ALL USERS
                    5.GET BOOKS BY GENRE
                    6.REMOVE BOOK BY ID
                    7.SORT BOOKS BY PRICE IN DescendingOrder
                    8.FILTER BOOKS BY PUBLISHED YEAR
                    9.GET BOOK BY INITIAL LETTER
                    10.MAX PRICE BOOK
                    11.FIND USER BY ID
                    12.REMOVE USER BY NAME
                    13.UP DATE USER
                    14.GROUP USERS BY GENDER
                    15.BUY BOOKS
                    
                    
                    WRITE COMMAND:
                   
                    """);

            Scanner scanner=new Scanner(System.in);
            int numer = scanner.nextInt();
            switch (numer){
                case 1:
                    System.out.println(bookService.createBooks(books));
                    break;
                case 2:
                    System.out.println(bookService.getAllBooks());
                    break;
                case 3:
                    System.out.println(bookService.getBooksByGenre(books.toString()));
                case 4:
                    System.out.println(userService.createUser(users));
                case 5:



            }
        }


        

    }
}