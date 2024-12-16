public class Main {
    public static void main(String[] args) {
        Author sergey = new Author("Сергей", "Иванов");
        Author vasiliy = new Author("Василий", "Беспалов");

        Book dune = new Book("Дюна", 1963, sergey);
        Book warAndPeace = new Book ("Война и мир", 1870, vasiliy);

        warAndPeace.setYear(1871);
    }
}