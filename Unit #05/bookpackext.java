package bookpackext;

class ExtBook extends bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p){
        super{t, a, d};
        publisher = p;
    }

    public void show(){
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {return publisher;}
    public void setPublisher(String p) {publisher = p;}

    public String getTitle() {return title;}
    public void setTitle(String t) {title = t;}
    public String getAuthor() {return author;}
    public void setAuthor(String a) {auther = a;}
    public int getPubDate() {return pubDate;}
    public void setPubDate(int d) {pubDate = d; }
}

class ProtectDemo {
    public static void main(String[] args) {
        ExtBook books [] = new ExtBook[5];
        
        books[0] = new ExtBook("Java: A Beginners Guide", "Schidt", 2019, "Oracle Press");
        books[1] = new ExtBook("Java: The Complete Refrences", "Schidt", 2019, "Oracle Press");
        books[2] = new ExtBook("Introduction to Java Programming", "Schidt", 2015, "Oracle Press");
        books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road", "Keronauc", 1995, "Viking");

        for (int i = 0; i < books.length; i++) books[i].show();

        System.out.println("Showing all books by Schidt.");
        for (int i = 0; i < books.length; i++)
            if(books[i].getAuthor() == "Schildt")
                System.out.println(books[i].getTitle());
    }
}