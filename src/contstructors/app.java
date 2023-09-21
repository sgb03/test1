package contstructors;

public class app {
    public static void main(String[] args) {
        Stuedent stuedent=new Stuedent("jf",3);
        stuedent.addSubject("java1");
        stuedent.addSubject("java2");
        stuedent.addSubject("java3");
        stuedent.addSubject("java4");
        stuedent.addSubject("java5");
        stuedent.addSubject("java6");
        
       // stuedent.show();
        
       // System.out.println(stuedent.getMaxSubjects());
//        Number n1=new Number();
//        System.out.println(n1);
//
//        Clock clock=new Clock();
//        clock.setHours(22);
        
        Stuedent stuedent1=new Stuedent();
        Stuedent stuedent2=new Stuedent("uiu");
        Stuedent stuedent3=new Stuedent("uiu",22);
        
        
        Adult p1=new Adult("asd",177,"portetr");
        Adult p2=new Adult("sdf",188);
        Adult p3=new Adult(p1);
        
//        p1.show();
//        p2.show();
//        p3.show();
//        p1.setOccupation("thieve");
//        p1.show();
//        p2.show();
//        p3.show();
        
        
        Rectangle rectangle1=new Rectangle();
        //System.out.println(rectangle1.getRectangleCircumference());
       //System.out.println(rectangle1.getRectangleArea());
        Rectangle rectangle2=new Rectangle(10,17);
        System.out.println(rectangle2.getRectanglePerimeter());
        System.out.println(rectangle2.getRectangleArea());
        rectangle2.print('A');
        System.out.println();
       rectangle1.print();
    }
   
}
