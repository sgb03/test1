package learning_2.contstructors;

import java.util.Objects;

public class Adult {
    private String name;
    private int height;
    private String occupation;
    
    public Adult(String name, int height, String occupation) {
        setName(name);
        this.height = height;
        setOccupation(occupation);
    }
    
    public Adult(String name, int height) {
        this(name, height, "");
        
    }
    
    public Adult(Adult other) {
        name = other.name;
        height = other.height;
        occupation = other.occupation;
        
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHeight() {
        return height;
    }
    
    public String getOccupation() {
        if(Objects.equals(this.occupation, "")){
            return null;
        }
             return occupation;
    }
    
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    public void show(){
        System.out.println();
        System.out.print("name:"+this.getName()+", height:"+this.getHeight());
        if(this.getOccupation()!=null){
            System.out.print(", occupation:"+this.getOccupation());
        }
    }
    
   
    
    
}