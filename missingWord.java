import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class missingWord {
    void ShowMissingWord(String s, String t)
    {
        String a[] = s.split("\\s+");
        String b[] = t.split("\\s+");
        List<String> missing = new ArrayList<>();
        int j = 0;
        for(int i = 0 ; i< a.length ; i++){
            if (a[i].equals(b[j])) {
                j++;
            }else{
                missing.add(a[i]);
            }
        }
        System.out.println(Arrays.toString(missing.toArray()));
    }

    @Test
    void missingWordTest(){
        ShowMissingWord("Bayu Anggoro Sakti cinta lutvi", "Anggoro lutvi");
    }
}
