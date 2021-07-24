package localinner;

class Outer
{
    int x=10;
    static int y=20;
    
    static class My
    {
        public void show()
        {
            System.out.println(y);
        }
    }
    
    
}

public class LocalInner 
{
    public static void main(String[] args) 
    {
        Outer.My m=new Outer.My();
        m.show();

    }
    
}
//abstract class My
//interface My
//{
//    //abstract public void show();
//    public void show();
//}
//class Outer 
//{
//    public void display()
//    {
//        My m=new My()
//        {
//            public void show()
//            {
//                System.out.println("Hello");//anonymous class inherit from class my
//            }
//        };
//        m.show();
//    }
//}
//class Outer
//{
//    public void display()
//    {
//        class Inner
//       {
//                public void show()
//               {
//                    System.out.println("Hello");
//                }
//        }
//        Inner i=new Inner();
//        i.show();
//    }
//}
public class LocalInnerClas {

    
    public static void main(String[] args) {
       
        
        
//        Outer o=new Outer();
//        o.display();
//        Outer o=new Outer();
//        o.display();
        
    }
}
    
