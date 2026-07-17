import test.Foundation;

public class Demo {

    public static void main(String[] args) {

        Foundation obj = new Foundation();

        // System.out.println(obj.var1); // Private - Not Accessible
        // System.out.println(obj.var2); // Default - Not Accessible

        // System.out.println(obj.var3); // Protected - Not Accessible
        // (Accessible only through inheritance in another package)

        System.out.println("Public Variable : " + obj.var4);
    }
}