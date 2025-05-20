class Student{
    private int studentId;
    private  String name;
    private int daysAttended;

    Student(int studentId,String name,int daysAttended){
        this.studentId=studentId;
        this.name=name;
        this.daysAttended=daysAttended;
    }
    int getStudentId(){
        return StudentId;
    }
    void setStudentId(int studentId){
        this.studentId=studentId;
    }
    String getname(){
        return name;
    }
    void setName(string name){
        this.name=name;
    }
    int getdaysAttended(){
        return daysAttended;
    }
    void setdaysAttended(int daysAttended){
        this.daysAttended=daysAttended;
    }
    public String toString(){
        return "ID:"+studentId+",Name:"+name+",Days Attended:"+daysAttended;
    }
    class Classroom{
        int[] obj=new int[10];
        int stcount=0;
        
    void addStudent(Student s){
        if(count<10){
            students[count]=s;
            count++;
         }else{
            System.out.println("Class full");
         }
    }
    void updateAttendance(int id,int newDays){
        boolean found=false;
        for(int i=0; i<count; i++){
            if(students[i].getStudentId()==id){
                students[i].setDaysAttended(newDays);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Student id"+id+"not found");
        }
        void studentDetails(){
            for(int i=0; i<count; i++){
                System.out.println(students[i]);
            }
        }
    }
    public class Main{
        public static void main(String[] args){
            classroom classroom=new classroom();
            classroom.addStudent(new Student(101,"Alice Smith",12));
            classroom.addStudent(new Student(102,"Bob Jones",15));
            classroom.addStudent(new Student(103,"Carol Lee",10));
            classroom.updateAttendance(102,16);
            classroom.updateAttendance(104,8);
            classroom.studentDetails();
        }
    }
    
}

