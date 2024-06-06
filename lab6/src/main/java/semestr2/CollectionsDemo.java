package semestr2;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {
    public int numberRowsWithCharacter(List<String> list, char a){
        int sum = 0;
        for (String str: list){
            if(str != null && str.charAt(0) == a){
                sum++;
            }
        }
        return sum;
    }
}
