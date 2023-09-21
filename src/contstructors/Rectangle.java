package contstructors;

public class Rectangle {
    int length;
    int width;
    
    public Rectangle(int l, int w) {
        setLength(l);
        setWidth(w);
    }
    
   
    
    public Rectangle() {
        length = 10;
        width = 10;
    }
    
    
    public int getLength() {
        return length;
    }
    
    public boolean setLength(int length) {
        if (length <= 0) {
            System.out.println("length must be greater than 0");
            return false;
        }
        this.length = length;
        return true;
    }
    
    public int getWidth() {
        return width;
    }
    
    public boolean setWidth(int width) {
        if (width <= 0) {
            System.out.println("width must be greater than 0");
            return false;
        }
        this.width = width;
        return true;
    }
    
    public int getRectangleCircumference(){
        return width*2+length*2;
    }
    public int getRectangleArea(){
        return width*length;
    }
    public void print(){
        for (int column = 0; column < getLength(); column++) {
            for (int line = 0; line <getWidth(); line++) {
                System.out.print("x"+"  ");
                
            }
            System.out.println();
            
        }
    }
//    public void print(char c){
//        for (int column = 0; column <this.getLength(); column++) {
//            for (int line = 0; line <this.getWidth(); line++) {
//                if(column==0||column==length-1||line==0||line==6){
//                    System.out.print(c+"  ");
//                }
//
//            }
//            System.out.println();
//
//        }
//    }
}
