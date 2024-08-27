package app;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();

        PrinterImpl.Message msg1 = new PrinterImpl.Message("Hello!", "Alice");
        PrinterImpl.Message msg2 = new PrinterImpl.Message("Hello!", "");
        PrinterImpl.Message msg3 = new PrinterImpl.Message("", "Bob");
        PrinterImpl.Message msg4 = new PrinterImpl.Message("", "");

        printer.print(msg1); // Користувач Alice відправив повідомлення: Hello!
        printer.print(msg2); // Анонімний користувач відправив повідомлення: Hello!
        printer.print(msg3); // Користувач Bob відправив повідомлення:
        printer.print(msg4); // Опрацьовується пусте повідомлення від анонімного користувача...
    }
}
