public class MyClassTest {
    
    public static void main (String[] args) {
        MyClass myClass = new MyClass();
        myClass.setId ("065002100012");
        myClass.setName ("Alvito Yumna Satrio Arianto");
        myClass.setAge (19);

        System.out.println("ID  : " + myClass.getId());
        System.out.println("Name : " + myClass.getName());
        System.out.println("Age : " + myClass.getAge());
    }
}
