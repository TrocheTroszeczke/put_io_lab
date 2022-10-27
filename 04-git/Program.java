class Student
{ 
    int student_id;//data member (also instance variable) 
    String name; //data member (also instance variable) 
 
    public static void main(String args[])
    { 
        Student s1=new Student();//creating an object of Student 
        System.out.println(s1.student_id); 
        System.out.println(s1.name); 
        System.out.println("Hello!");
     } 
} 

//This comment is a little change in the file
//source: https://www.geeksforgeeks.org/classes-objects-java/