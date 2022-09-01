import java.util.List;

public class bubbleSort {

    void pakeList(List<Integer> arr){
        for (int a = 0; a < arr.size(); a++)
        {
            for(int b = a+1 ; b< arr.size(); b++)
            {
                int temp=0;
                if(arr.get(b) < arr.get(a))
                {
                    temp = arr.get(a);
                    arr.set(a,arr.get(b));
                    arr.set(b,temp);
                }
            }
        }
    }
}
