package selfTest;

public class Student{

    static int nextId;

    static String School;

    static int id = 0;

    String name;

    int currentLevel;
    int getID() {
    	id += 1;
    	return id;
    }
    String getName() {
    	return name;
    }
    String getSchool() {
    	return School;
    }
    Student (String name, int currentLevel, String school){

        this.name = name;
        this.currentLevel = currentLevel; 
    	this.School = school;
    }
    public static void main(String[] args){
    	
    //create 2 students.
    	Student s1 = new Student("Sameer", 1, "Ocean Air Elementary");
    	Student s2 = new Student("Ishan", 0, "Torrey Hills School");
    //print their names, ids and school. 
    	System.out.println(s1.getName());
    	System.out.println(s1.getID());
    	System.out.println(s1.getSchool());
    	System.out.println(s2.getName());
    	System.out.println(s2.getID());
    	System.out.println(s2.getName());
    	}}
