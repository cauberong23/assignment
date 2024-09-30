public class Person {
    private String name;
    private String year;
    private String id;

    public Person(String name, String year){
        this.name = name;
        this.year = year;
    }

    public Person(String name, String id, String year){
        this.name = name;
        this.year = year;
        this.id = id;
    }

    public static void main(String[] args){
        Person s1 = new Person("Nguyen Van A", "17020001","2000");
        Person s2 = new Person("Nguyen Van B", "17020002", "2001");
        Person s3 = new Person("Nguyen Van C", "17020003", "2002");
        Person s4 = new Person("Nguyen Van D", "2000");
        Person s5 = new Person("Nguyen Van E", "2000");
    }
}