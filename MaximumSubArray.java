import java.util.*;
public class MaximumSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        int length=input.nextInt();
        for(int index=0;index<length;index++)
        {
          array.add(input.nextInt());
        }
        ArrayList<Integer> newArray=convertingZerosToMinusOne(array);
        calculatingSubArray(newArray);
    }
    public static ArrayList<Integer> convertingZerosToMinusOne(ArrayList<Integer> array)
    {int index;
        for(Integer element:array)
        {
            if(element==0)
            {index= array.indexOf(element);
                array.set(index,-1);
            }
        }
        return array;
    }
    public static void calculatingSubArray(ArrayList<Integer> newArray)
    {
        int indexOne,indexTwo,maximumIndexOne=0,maximumIndexTwo=0,maximum=0,currentMaximum,sum,indexThree;
        int newIndexTwo,newIndexOne;
        for(indexOne=0;indexOne<newArray.size();indexOne++)
        {
            for(indexTwo=newArray.size()-1;indexTwo>indexOne;indexTwo--) {
               int[] index=findingMaximumLength(indexOne,indexTwo);
               newIndexOne=index[0];
               newIndexTwo=index[1];
                 sum=0;
                for (indexThree = newIndexOne; indexThree <= newIndexTwo; indexThree++) {
                    sum = sum + newArray.get(indexThree);
                }
                if (sum == 0) {
                    currentMaximum=newIndexTwo-newIndexOne;

                    if (currentMaximum > maximum) {
                        maximum = currentMaximum;
                        maximumIndexOne = newIndexOne;
                        maximumIndexTwo = newIndexTwo;}
                    }
                }
            }
        if(maximumIndexOne!=maximumIndexTwo){
        System.out.println(maximumIndexOne+" to "+maximumIndexTwo);}
        else {
            System.out.println("No sub array found");
        }
        }

    public static int[] findingMaximumLength(int indexOne,int indexTwo)
    { int [] indexArray=new int[2];
        if(indexOne>indexTwo)
        { indexArray[0]=indexTwo;
            indexArray[1]=indexOne;
           return indexArray;

        }
        else {indexArray[1]=indexTwo;
            indexArray[0]=indexOne;
            return indexArray;
        }
    }
}