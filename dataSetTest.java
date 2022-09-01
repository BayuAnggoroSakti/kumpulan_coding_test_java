import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class dataSetTest {
    public static class Set{
        int size=0;
        private String[] array = new String[10];
        public boolean add(String value){
            if(contains(value)){
                return false;
            }else{
                ensureCapacity();
                array[size]  = value;
                size++;
                return true;
            }
        }
        public int size(){
            return size;
        }
        public void ensureCapacity(){
            if (size >= array.length) {
                String[] temp = new String[array.length*2];
                for (int i = 0; i < array.length; i++) {
                    temp[i] = array[i];
                }
                array = temp;
            }
        }
        public boolean contains(String value){
            for(String items : array){
                if (value.equals(items)) {
                    return true;
                }
            }
            return false;
        }
        public int indexOf(String value){
            for(int i = 0 ; i < array.length ; i++){
                if (array[i].equals(value)) {
                    return i;
                }
            }
            return -1;
        }
        public boolean remove(String value){
            if (contains(value)) {
                int indexRemoved = indexOf(value);
                for (int i = indexRemoved ; i <= size(); i++){
                    array[i] = array[i+1];
                }
                size--;
                return true;
            }else{
                return false;
            }
        }
    }

    @Test
    void TestAdd(){
        Set set = new Set();
        Assertions.assertTrue(set.add("bayu"));
        Assertions.assertFalse(set.add("bayu"));
    }

    @Test
    void TestContains(){
        Set set = new Set();
        set.add("bayu");
        Assertions.assertTrue(set.contains("bayu"));
        Assertions.assertFalse(set.contains("anggoro"));
        Assertions.assertTrue(set.contains("bayu"));
    }

    @Test
    void TestRemove(){
        Set set = new Set();
        set.add("bayu");
        set.add("anggoro");
        set.add("sakti");
        
        Assertions.assertEquals(3,set.size());
        set.remove("anggoro");
        Assertions.assertEquals(2,set.size());
        Assertions.assertFalse(set.contains("anggoro"));
        Assertions.assertTrue(set.contains("bayu"));
        Assertions.assertTrue(set.contains("sakti"));
    }

    @Test
    void TestGrowth(){
        Set set = new Set();
        for (int i = 0; i < 100; i++) {
            set.add("item "+i);
        }
        Assertions.assertEquals(100,set.size());
    }
}
