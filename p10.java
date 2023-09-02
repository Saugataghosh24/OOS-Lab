import java.util.Arrays;

class Student {
    private String name;
    private int rollNo;
    private String[] subjects;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = new String[5];
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
}

class TabulationSheet {
    private int rollNo;
    private int[] marks;

    public TabulationSheet(int rollNo, int[] marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}

class MarkSheet {
    private String name;
    private int[] marks;

    public MarkSheet(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}

class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("Saugata", 1);
        Student student2 = new Student("Sayan", 2);
        Student student3 = new Student("Suvajit", 3);

        
        TabulationSheet tabulationSheet1 = new TabulationSheet(1, new int[]{90, 85, 92, 88, 93});
        TabulationSheet tabulationSheet2 = new TabulationSheet(2, new int[]{87, 91, 89, 92, 90});
        TabulationSheet tabulationSheet3 = new TabulationSheet(3, new int[]{92, 88, 90, 87, 95});
        TabulationSheet tabulationSheet4 = new TabulationSheet(4, new int[]{88, 90, 92, 85, 91});
        TabulationSheet tabulationSheet5 = new TabulationSheet(5, new int[]{89, 92, 88, 90, 93});

        
        MarkSheet markSheet1 = new MarkSheet("Saugata", new int[]{90, 85, 92, 88, 93});
        MarkSheet markSheet2 = new MarkSheet("Sayan", new int[]{87, 91, 89, 92, 90});
        MarkSheet markSheet3 = new MarkSheet("Suvajit", new int[]{92, 88, 90, 87, 95});

        
        System.out.println("Mark Sheet of " + markSheet1.getName() + ":");
        System.out.println(Arrays.toString(markSheet1.getMarks()));
        System.out.println("Mark Sheet of " + markSheet2.getName() + ":");
        System.out.println(Arrays.toString(markSheet2.getMarks()));
        System.out.println("Mark Sheet of " + markSheet3.getName() + ":");
        System.out.println(Arrays.toString(markSheet3.getMarks()));
    }
}

