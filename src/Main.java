

public class Main {
    public static void main(String[] args) {
        Group g330c = new Group("330c");
        Group g100 = new Group("100");
        Group g225 = new Group("225");

        g330c.addStudent(new Student("pop", "pops", 18));
        g330c.addStudent(new Student("tot", "tots", 19));
        g330c.addStudent(new Student("as", "ass", 17));
        g330c.addStudent(new Student("rop", "rops", 18));

        g100.addStudent(new Student("sop", "sops", 18));
        g100.addStudent(new Student("dop", "dops", 19));
        g100.addStudent(new Student("wod", "wods", 20));

        g225.addStudent(new Student("dok", "doks", 18));
        g225.addStudent(new Student("vog", "vogs", 19));
        g225.addStudent(new Student("hot", "hots", 19));

        g330c.print();
        g100.print();
        g225.print();
    }
}