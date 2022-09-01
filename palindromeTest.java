import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class palindromeTest{
    boolean isPalindrome(String value){
        String temp = "";
        for (int i = value.length() -1; i >= 0 ; i--){
            temp = temp + value.charAt(i);
        }
     
        if (temp.equals(value) ){
            return true;
        }else{
            return false;
        }
    }

    boolean isPalindrome2(String value){
        for (int i=0 ; i <= value.length() -1 ; i++){
            if (value.charAt(i) != (value.charAt(value.length()-i -1))) {
                return false;
            }
        }
        return true;
    }
    boolean isPolindromeRecursive(String value, int i){
        if (i < value.length()) {
            int indexAwal = i;
            int indexAkhir = value.length()-i -1;
            if (value.charAt(indexAwal) != value.charAt(indexAkhir)) {
                return false;
            }else{
                return isPolindromeRecursive(value, i+1);
            }
        }else{
            return true;
        }
     
       
    }
    @Test
    void coba(){
        isPalindrome("kodok");
    }
    @Test
    void TestPalindrom(){
        Assertions.assertTrue(isPalindrome("kodok"));
        Assertions.assertTrue(isPalindrome("aba"));
        Assertions.assertTrue(isPalindrome("aca"));

        Assertions.assertFalse(isPalindrome("Bayu"));
        Assertions.assertFalse(isPalindrome("Anggoro"));
        Assertions.assertFalse(isPalindrome("Sakti"));
    }

    @Test
    void TestPalindrom2(){
        Assertions.assertTrue(isPalindrome2("kodok"));
        Assertions.assertTrue(isPalindrome2("aba"));
        Assertions.assertTrue(isPalindrome2("aca"));

        Assertions.assertFalse(isPalindrome2("Bayu"));
        Assertions.assertFalse(isPalindrome2("Anggoro"));
        Assertions.assertFalse(isPalindrome2("Sakti"));
    }

    @Test
    void TestPalindromRecursive(){
        Assertions.assertTrue(isPolindromeRecursive("kodok",0));
        Assertions.assertTrue(isPolindromeRecursive("aba",0));
        Assertions.assertTrue(isPolindromeRecursive("aca",0));

        Assertions.assertFalse(isPolindromeRecursive("Bayu",0));
        Assertions.assertFalse(isPolindromeRecursive("Anggoro",0));
        Assertions.assertFalse(isPolindromeRecursive("Sakti",0));
    }
   
}