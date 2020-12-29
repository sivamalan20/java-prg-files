class abstract GBase{ 
public void testBase(){ 
System.out.println(“Hello World”);
 } 
}
 public class Sample extends GBase{
 public static void main() { 
GBase ob = new GBase();
 ob.testBase(); 
}