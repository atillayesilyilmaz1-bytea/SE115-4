public class senario0_lab6 {
    public static void main(String[] args){
        int [] myArr = {4,8,15,16,23,42};
        /*
         Length of myArr: 6
         First element:4
         Index of last element:5
         Third element:16
         Value of myArr[3]:16
         Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6
	     at senario0.main(senario0.java:17)
         */
        System.out.println("Length of myArr: " +myArr.length);
        System.out.println("First element:"+myArr[0]);
        System.out.println("Index of last element:"+5);
        System.out.println("Third element:"+myArr[3]);
        System.out.println("Value of myArr[3]:"+ myArr[3]);
        System.out.println("Trying to access myArr[10]:" +myArr[10]);

    }
}
