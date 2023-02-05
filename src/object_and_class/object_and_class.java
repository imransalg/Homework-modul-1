package object_and_class;

public class object_and_class {
    public static void printSeparator() {
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        Book littlePrince = new Book("Маленький принц", 1943);
        Author author = new Author("Антуан де", "Сент-Экзюпери");
        System.out.println("Книга - " + littlePrince.getBookName());
        System.out.println("Автор - " + author.getFirstName() + " " + author.getLastName());
        System.out.println("Год выпуска - " + littlePrince.getPublishingYear());
        littlePrince.setPublishingYear(1988);
        System.out.println("Год выпуска - " + littlePrince.getPublishingYear());
        printSeparator();
        Book masterAndMargarita = new Book("Мастер и Маргарита", 1966);
        Author author1 = new Author("Михаил", "Булгаков");
        System.out.println("Книга - " + masterAndMargarita.getBookName());
        System.out.println("Автор - " + author1.getFirstName() + " " + author1.getLastName());
        System.out.println("Год выпуска - " + masterAndMargarita.getPublishingYear());
        masterAndMargarita.setPublishingYear(1967);
        System.out.println("Год выпуска - " + masterAndMargarita.getPublishingYear());
    }
}
