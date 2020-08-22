public public class Box<T> { 
    private T t; 
    public void add(T t) { 
        this.t = t; 
    } 
    public T get() { 
        return t; 
    } 
 
    public static void main(String[] args) { 
        Box<Integer> integerBox = new Box<Integer>(); 
        Box<String> stringBox = new Box<String>(); 
 
        integerBox.add(new Integer(10)); 
        stringBox.add(new String("Hello World")); 
 
        System.out.printf("Gia tri integer la: %d\n", integerBox.get()); 
        System.out.printf("Gia tri string la: %s", stringBox.get()); 
    } 
} class Test {
    
}