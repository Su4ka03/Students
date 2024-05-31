import java.util.ArrayList;

public class Group {
    private String number;
    private ArrayList<Student> students;

    public Group(String number){
        this.number=number;
        this.students= new ArrayList<>();
    }

    public void addStudent(Student student){
        if (this.students.size()==20)
            return;

        this.students.add(student);
    }

    public void print(){
        System.out.printf(
                "номер: %s, кол-во студентов: %d\n",
                this.number, this.students.size()
        );

        for (Student student : this.students){
            student.print();
        }
    }
}