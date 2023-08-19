package baitap5.service.view;

import java.util.Scanner;

public class Menu {
    public void displayMenu(){
        System.out.println("1. Quản lý sách");
        System.out.println("2. Quản lý người đọc");
        System.out.println("3. Quản lý mượn trả sách");
        System.out.println("Mời bạn chọn");
    }
    public void displayMenuBook(){
        System.out.println("1. Thêm sách");
        System.out.println("2. Sửa thông tin sách");
        System.out.println("3. Xóa sách");
        System.out.println("Mời bạn chọn");
    }
    public void displayMenuPerson(){
        System.out.println("1. Thêm khách hàng");
        System.out.println("2. Sửa thông tin khách hàng");
        System.out.println("3. Xóa khach hàng");
        System.out.println("Mời bạn chọn");
    }
    public void displayMenuTicketBook(){
        System.out.println("1. Thêm TicketBook");
        System.out.println("2. Sửa thông tin TicketBook");
        System.out.println("3. Xóa TicketBook");
        System.out.println("Mời bạn chọn");
    }
}
