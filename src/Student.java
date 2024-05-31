public class Student {
    private String firstname;
    private String lastname;
    private int age;

    public Student(String firstname, String lastname, int age){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }

    public void print(){
        System.out.printf(
                "имя: %s, фамилия: %s, возраст: %d\n",
                this.firstname, this.lastname, this.age
        );
    }
}

