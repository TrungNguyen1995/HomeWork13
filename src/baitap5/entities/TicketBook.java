package baitap5.entities;

import java.time.LocalDate;

public class TicketBook {
    public TicketBook(Person person, Book book, LocalDate startDate, LocalDate endDate) {
        this.id = ++autoId;
        this.person = person;
        this.book = book;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public  static int autoId;
    private int id;
    private Person person;
    private Book book;
    private LocalDate startDate;
    private LocalDate endDate;

    public int getId() {
        return id;
    }



    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "TicketBook{" +
                "id=" + id +
                ", person=" + person +
                ", book=" + book +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
