package baitap5;

import baitap5.entities.Book;
import baitap5.entities.Person;
import baitap5.entities.TicketBook;
import baitap5.service.ServiceLibrary;
import baitap5.service.impl.BookServiceimpl;
import baitap5.service.impl.CustomerServiceimpl;
import baitap5.service.impl.TicketBookService;
import baitap5.service.view.Menu;
import baitap5.utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.displayMenu();
        Utils utils = new Utils();
        utils.inputNumber(scanner);
        ArrayList <Book> books = new ArrayList<>();
        ArrayList <Person> people = new ArrayList<>();
        BookServiceimpl bookServiceimpl = new BookServiceimpl();
        CustomerServiceimpl customerServiceimpl = new CustomerServiceimpl();
        do {
            int choose = utils.inputNumber(scanner);
            switch (choose){
                case 1:
                    bookServiceimpl.handleMenuBook(menu,utils,scanner,books);
                    break;
                case 2:
                    customerServiceimpl.handleMenuPerson(menu,utils,scanner,people);
                    break;
                case 3:
                    menu.displayMenuTicketBook();
                    break;
                default:
            }
        }while (true);
    }
}
