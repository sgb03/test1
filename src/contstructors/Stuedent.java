package contstructors;

public class Stuedent {
    private String name;
    private String[]subjects;
    private int numOfSubjects;
    public Stuedent() {
    
    }
    public Stuedent(String name,  int maxSubjects) {
        this.name = name;
        subjects = new String[maxSubjects];
        numOfSubjects = 0;
    }
    public Stuedent(String name ) {
        this.name = name;
        numOfSubjects = 0;
    }
    
    
    public int getNumOfSubjects() {
        return numOfSubjects;
    }
    public int getMaxSubjects(){
        return subjects.length;
    }
    public boolean addSubject(String newSubject){
        if(numOfSubjects==subjects.length)
        return false;
        subjects[numOfSubjects]=newSubject;
        numOfSubjects++;
        return true;
    }
    public void show(){
        System.out.println(name+ " learns "+numOfSubjects+" subjects: ");
        for (int i = 0; i <numOfSubjects; i++) {
            System.out.println("\t- "+subjects[i]);
        }
    
    }
}
