import java.util.*;
public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int length=input.nextInt();
       int[] array=new int[length];
       for(int index=0;index<length;index++)
        {
          array[index]=input.nextInt();
        }
        calculatingSubArray(array);
    }
    public static int calculatingSubArray(int[] newArray)
    {
        int i,j,maximumIndexOne=0,maximumIndexTwo=0,maximum=0,currentMaximum,sum,length=newArray.length;
        for(i=0;i<newArray.length;i++) {
            sum = 0;
           currentMaximum=0;
            for (j =i; j<newArray.length; j++) {
                if (newArray[j] == 0) {
                    sum = sum - 1;
                } else {
                    sum = sum + 1;
                }
                currentMaximum++;
                if (sum == 0&&currentMaximum >maximum) {
                        maximum = currentMaximum;
                        maximumIndexOne = i;
                        maximumIndexTwo = j;
                        if (maximum == length) {
                            System.out.println(maximumIndexOne + " to " + maximumIndexTwo);
                            return 0;
                        }
                    }
                else if(length<i)
                {
                    if(maximumIndexOne!=maximumIndexTwo){
                        System.out.println(maximumIndexOne+" to "+maximumIndexTwo);}
                    else {
                        System.out.println("No sub array found");
                    }
                    return 0;
                }

            }
            length--;
            }
        return 0;
        }
}