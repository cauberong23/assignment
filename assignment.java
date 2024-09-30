class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Nguyen Van A", 2000, "17020001");
        Student student2 = new Student("Nguyen Van B", 2001, "17020002");
        Student student3 = new Student("Nguyen Van C", 2002, "17020003");
        Teacher teacher1 = new Teacher("Nguyen Van D", 2000);
        Teacher teacher2 = new Teacher("Nguyen Van E", 2000);
    }
}

class Student extends Person {
    private String id;

    public Student(String name, int birthYear, String id) {
        super(name, birthYear);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class Teacher extends Person {
    public Teacher(String name, int birthYear) {
        super(name, birthYear);
    }
}






