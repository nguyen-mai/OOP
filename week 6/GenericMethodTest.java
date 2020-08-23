public class GenericMethodTest { 
    public static <T> void printArr(T[] inputArray) { 
        for ( T element : inputArray ){ 
            System.out.printf( "%s ", element ); 
        } 
    } 
 
    public static void main( String args[] ) { 
        Integer[] intArr = { 10, 12, 3, -4, 5 }; 
        Double[] doubleArr = { 5.1, 2.5, 7.3, -4.5 }; 
        Character[] charArr = { 'U', 'E', 'T', 'V', 'N', 'U' }; 
 
        System.out.println("Mang intArr bao gom:"); 
        printArr(intArr); 
 
        System.out.println("\nMang doubleArr bao gom:"); 
        printArr(doubleArr); 
 
        System.out.println("\nMang charArr bao gom:"); 
        printArr(charArr);  
    } 
} 