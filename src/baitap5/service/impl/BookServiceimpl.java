package baitap5.service.impl;

import baitap5.entities.Book;
import baitap5.service.ServiceLibrary;
import baitap5.service.view.Menu;
import baitap5.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class BookServiceimpl implements ServiceLibrary <Book> {

    @Override
    public void insert(Scanner scanner, ArrayList<Book> list) {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter topic:");
        String topic = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter Quatity");
        int quatity = Integer.parseInt(scanner.nextLine());
        Book book = new Book(name,topic,author,quatity);
        list.add(book);
    }

    @Override
    public void edit(int id, ArrayList<Book> list) {
        Scanner scanner = new Scanner(System.in);
        for (Book b: list){
            if (b.getId()==id){
                System.out.println("Enter newName:");
                String name = scanner.nextLine();
                System.out.println("Enter topic:");
                String topic = scanner.nextLine();
                System.out.println("Enter author:");
                String author = scanner.nextLine();
                System.out.println("Enter Quatity");
                int quatity = Integer.parseInt(scanner.nextLine());
                b.setName(name);
                b.setTopic(topic);
                b.setAuthor(author);
                b.setQuatity(quatity);
                return;
            }
        }
    }

    @Override
    public void delete(int id, ArrayList<Book> list) {
        Scanner scanner = new Scanner(System.in);
        for (Book b: list){
            if (b.getId()==id){
                list.remove(b);
                return;
            }
        }
    }
    public void handleMenuBook(Menu menu, Utils utils, Scanner scanner, ArrayList <Book> books){
        menu.displayMenuBook();
        int selectMenuBook = utils.inputNumber(scanner);
        BookServiceimpl bookServiceimpl = new BookServiceimpl();
        switch (selectMenuBook){
            case 1:
                bookServiceimpl.insert(scanner,books);
                break;
            case 2:
                System.out.println("Enter idBook:");
                int idBook = Integer.parseInt(scanner.nextLine());
                bookServiceimpl.edit(idBook,books);
                break;
            case 3:
                System.out.println("Enter idDeleteBook");
                int idDeleteBook = Integer.parseInt(scanner.nextLine());
                bookServiceimpl.edit(idDeleteBook,books);
                break;
        }
    }
}

