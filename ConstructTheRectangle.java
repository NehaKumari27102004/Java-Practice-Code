package Constructor;

public class ConstructTheRectangle {
    public static int[] constructRectangle(int area){
        int w=(int) Math.sqrt(area);
        while(area % w !=0){
            w--;
        }
        int l=area / w;
        return new int[]{l,w};
    }

    public static void main(String[] args){
        int[] result1= constructRectangle(4);
        System.out.println(result1[0] + " " + result1[1]);

        int[] result2 =constructRectangle(37);
        System.out.println(result2[0] + " " + result2[1]);

        int[] result3=constructRectangle(122122);
        System.out.println(result3[0] + " " + result3[1]);
    }
}
