package baitap5.service;

import baitap5.entities.Book;
import baitap5.entities.Person;
import baitap5.entities.TicketBook;

import java.util.ArrayList;
import java.util.Scanner;

public interface ServiceLibrary<T> {
    void insert(Scanner scanner, ArrayList<T> list);
    void edit(int id, ArrayList <T> list);
    void delete(int id, ArrayList <T> list);

}
