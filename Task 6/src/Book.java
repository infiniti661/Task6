public class Book {
    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public Book (String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        if (pages < 500) {
           return false;
        } else {
            return true;
        }
    }

    public boolean mathes(String word) {
        if (title.contains (word)) {
            return true;
        } else if (author.contains (word)){
            return true;
        } else {
            return false;
        }
    }

    public int estimatePrice() {
        int price = pages * 3;
        if (price < 250) {
            return 250;
        } else {
            return price;
        }
    }

}
