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
    public static void calculatingSubArray(int[] newArray)
    {
        int i,j,maximumIndexOne=0,maximumIndexTwo=0,maximum=0,currentMaximum,sum,k;
        for(i=0;i<newArray.length;i++)
        {
            for(j=newArray.length-1;j>i;j--) {
                sum=0;
                for (k = i; k <= j; k++) {
                    if(newArray[k]==0){
                    sum = sum -1;}
                    else
                    {
                        sum=sum+1;
                    }
                }
                if (sum == 0) {
                    currentMaximum=j-i;
                    if (currentMaximum > maximum) {
                        maximum = currentMaximum;
                        maximumIndexOne = i;
                        maximumIndexTwo = j;}
                    }
                }
            }
        if(maximumIndexOne!=maximumIndexTwo){
        System.out.println(maximumIndexOne+" to "+maximumIndexTwo);}
        else {
            System.out.println("No sub array found");
        }
        }
}