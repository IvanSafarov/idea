package semestr2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCollectionsDemo {
    CollectionsDemo collectionsDemo = new CollectionsDemo();
    @Test
    public void testNumberRowsWithCharacter(){
        String str1 = "hello";
        String str2 = "h";
        String str3 = "123";
        String str4 = "dghgfj";
        String str5 = "hfgsf";
        String str6 = " ";
        String str7 = null;
        List<String> list = new ArrayList<>();
        Collections.addAll(list,str1,str2,str3,str4,str5, str6, str7);
        assertEquals(3,collectionsDemo.numberRowsWithCharacter(list,'h'));
    }
}
// ТЕст на пустую строчку