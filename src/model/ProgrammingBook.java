package model;

public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(int id, String name, String author, int price) {
        super(id, name, author, price);
    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(int id, String name, String author, int price, String language, String framework) {
        super(id, name, author, price);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}