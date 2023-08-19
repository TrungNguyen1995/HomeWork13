package baitap5.service.impl;

import baitap5.entities.Book;
import baitap5.entities.Person;
import baitap5.entities.TicketBook;
import baitap5.service.ServiceLibrary;
import baitap5.service.view.Menu;
import baitap5.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerServiceimpl implements ServiceLibrary <Person> {

    @Override
    public void insert(Scanner scanner,ArrayList<Person> list) {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter phoneNumber:");
        int phonenumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address");
        String address = scanner.nextLine();
        Person person = new Person(name,phonenumber,address);
        list.add(person);
    }

    @Override
    public void edit(int id, ArrayList<Person> list) {
        Scanner scanner = new Scanner(System.in);
        for (Person p: list){
            if (p.getId()==id){
                System.out.println("Enter newName:");
                String name = scanner.nextLine();
                System.out.println("Enter phoneNumber:");
                int phonenumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Address");
                String address = scanner.nextLine();
                p.setName(name);
                p.setPhonenumber(phonenumber);
                p.setAddress(address);
                return;
            }
        }
    }

    @Override
    public void delete(int id, ArrayList<Person> list) {
        Scanner scanner = new Scanner(System.in);
        for (Person p: list){
            if (p.getId()==id){
                list.remove(p);
                return;
            }
        }
    }
    public void handleMenuPerson(Menu menu, Utils utils, Scanner scanner, ArrayList <Person> people){
        menu.displayMenuBook();
        int selectMenuPerson = utils.inputNumber(scanner);
        CustomerServiceimpl customerServiceimpl = new CustomerServiceimpl();
        switch (selectMenuPerson){
            case 1:
                customerServiceimpl.insert(scanner,people);
                break;
            case 2:
                System.out.println("Enter idPerson:");
                int idPerson = Integer.parseInt(scanner.nextLine());
                customerServiceimpl.edit(idPerson,people);
                break;
            case 3:
                System.out.println("Enter idDeletePerson");
                int idDeletePerson = Integer.parseInt(scanner.nextLine());
                customerServiceimpl.edit(idDeletePerson,people);
                break;
        }
    }
}
