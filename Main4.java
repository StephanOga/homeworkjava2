import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main4 {
    private static final Logger logger = Logger.getLogger(Main4.class.getName());
    
    public static void main(String[] args) {
        // Настройка логирования
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL);

        Scanner sc = new Scanner(System.in);

        logger.info("Введите первое число: ");
        int num1 = sc.nextInt();

        logger.info("Введите знак операции (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        logger.info("Введите второе число: ");
        int num2 = sc.nextInt();

        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                logger.info("Результат: " + result);
                break;
            case '-':
                result = num1 - num2;
                logger.info("Результат: " + result);
                break;
            case '*':
                result = num1 * num2;
                logger.info("Результат: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    logger.info("Результат: " + result);
                } else {
                    logger.warning("Ошибка: деление на ноль.");
                }
                break;
            default:
                logger.warning("Ошибка: некорректный знак операции.");
        }
    }
}
