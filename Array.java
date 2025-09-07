package Array;

public class Array {
    public static void main(String[] args){
      //  int[] myArr= new int[5];
        //myArr[0]=88;
        //myArr[1]=33;
        //myArr[2]=64;
        //myArr[3]=11;
        //myArr[4]=28;

        int[] myArr={2,5,7,8,33,99,12,33,456,77,40};

        //System.out.println(myArr[0]);
        //System.out.println(myArr[1]);
        //System.out.println(myArr[2]);
        //System.out.println(myArr[3]);
        //System.out.println(myArr[4]);

        //By using loop(Array traversal)

        int index=0;
        while(index< myArr.length){
            System.out.println(myArr[index]);
            index++;
        }
    }
}
