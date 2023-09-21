package contstructors;

public class Rectangle {
    int length;
    int width;
    
    public Rectangle(int l, int w) {
        setLength(l);
        setWidth(w);
    }
    
   
    
    public Rectangle() {
        this(10,10);
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        if (length <= 0) {
            System.out.println("length must be greater than 0");
            return ;
        }
        this.length = length;
        
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
    
    public int getRectanglePerimeter(){
        return this.width*2+this.length*2;
    }
    public int getRectangleArea(){
        return this.width*this.length;
    }
    public void print(){
        for (int i = 0; i < getLength(); i++) {
            for (int j = 0; j <getWidth(); j++) {
               if(i==0||i==length-1||j==0||j==width-1){
                   System.out.print("x  ");
               }else System.out.print("   ");
               
            }
            System.out.println();
            
        }
    }
    
    
    public void print(char c){
        for (int i = 0; i < getLength(); i++) {
            for (int j = 0; j <getWidth(); j++) {
                if(i==0||i==length-1||j==0||j==width-1){
                    System.out.print(c+"  ");
                }else System.out.print("   ");
                
            }
            System.out.println();
            
        }
    }
}
