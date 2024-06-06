import java.util.Objects;
/**
 * Интерфейс, представляющий фильтр для товаров.
 */
public interface Filter {
    /**
     * Применяет фильтр к заданной строке.
     * @param str Строка, к которой применяется фильтр
     * @return true, если строка удовлетворяет фильтру, иначе false
     */
   boolean apply(String str);
}