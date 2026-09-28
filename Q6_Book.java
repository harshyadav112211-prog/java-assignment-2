public class Q6_Book {

    // Author Class
    public static class Author {
        private String name;
        private String email;
        private char gender;

        // Default Constructor
        public Author() {
            this.name = "";
            this.email = "";
            this.gender = ' ';
        }

        // Parameterized Constructor
        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        // Override toString()
        @Override
        public String toString() {
            return name + " (" + gender + "), Email: " + email;
        }
    }

    // Book Class
    public static class Book {
        private String title;
        private double price;
        private Author author;

        // Default Constructor
        public Book() {
            this.title = "";
            this.price = 0;
            this.author = null;
        }

        // Parameterized Constructor
        public Book(String title, double price, Author author) {
            this.title = title;
            this.price = price;
            this.author = author;
        }

        // Getters and Setters
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        // Override toString()
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Book: ").append(title).append("\n");
            sb.append("Price: ").append(price).append("\n");
            sb.append("Author: ").append(author.toString());
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        // Create Author
        Author author = new Author("Joshua Bloch", "jbloch@abc.com", 'M');

        // Create Book
        Book book = new Book("Effective Java", 550, author);

        // Print Book Details
        System.out.println(book);
    }
}
