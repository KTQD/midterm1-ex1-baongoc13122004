public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng MP3
        MP3 mp3 = new MP3("Nhung loi hua bo quen", "This is a popular song", "12345", 13.12f);

        // Tạo một đối tượng Book
        Book book = new Book("Java Programming", "Learn Java programming language", "67890", 69.69f, "John Doe", 400, "Programming");

        // Hiển thị thông tin của đối tượng MP3
        System.out.println("Information of MP3:");
        mp3.showInfo();
        System.out.println();

        // Hiển thị thông tin của đối tượng Book
        System.out.println("Information of Book:");
        book.showInfo();
    }
}
