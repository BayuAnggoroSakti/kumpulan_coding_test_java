import org.junit.jupiter.api.Test;

public class arrayDataTest {
    //menghilangkan data double
    void dataTunggal(int[] data ){
        int[] datatampung = new int[100];
       
        for (int i = 0 ; i < data.length ; i++)
        {
            boolean result = false;
            for(int j=0;j< datatampung.length;j++)
            {
                if(data[i] == datatampung[j])
                {
                    result = true;
                }
            }
            if(!result){
                datatampung[i] = data[i];
                //System.out.println(datatampung[i]);

                int totaldouble = 0;
                for (int e = 0 ; e<data.length;e++){
                    
                    if(data[i] == data[e])
                    {
                        totaldouble = totaldouble +1;
                    }
                }
                System.out.println(data[i]+" Punya "+totaldouble);
            }
        }
    }

    @Test
    void testDataTunggal(){
        int[] data = {1,4,5,3,2,5,3,4,8,5,4,3,6,0,4,3,2,1,5,9,9,4,3,1,3,0,2,2,4,6,2,4,7,4};
        dataTunggal(data);
    }
}
