package baitap5.entities;

public class Book {
    public static int autoId;
    private int id;
    private String name;
    private String topic;
    private String author;
    private int quatity;

    public Book(String name, String topic, String author, int quatity) {
        this.id = ++autoId;
        this.name = name;
        this.topic = topic;
        this.author = author;
        this.quatity = quatity;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Book.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topic='" + topic + '\'' +
                ", author='" + author + '\'' +
                ", quatity=" + quatity +
                '}';
    }
}
