public class Book {

    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBag() {
        if (pages > 500) {
            System.out.println("В этой книге больше 500 страниц.");
            return true;
        } else System.out.println("В этой книше меньше 500 страниц.");
        return false;
    }

    public boolean matches(String word) {

        if (title.contains(word) || author.name.contains(word) ||author.surname.contains(word)) {
            System.out.println("слово " + "<" + word + ">" + " содержится в описании книги.");
            return true;

        } else
            System.out.println("слово " + "<" + word + ">" + " не содержится в описании книги.");
        return false;

    }

    public int estimatePrice( ) {
        int result;
        int sum = (int) (Math.floor((pages *3) * Math.sqrt(author.rating)));

        result = Math.max(sum, 250);
        return result;
    }


}
