public class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String dept;
    private int joinedYear;
    private double cgpaUpdated;

    public Student (int id,String name, int age, String gender, String dept, int joinedYear,double cgpaUpdated){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.dept=dept;
        this.joinedYear=joinedYear;
        this.cgpaUpdated=cgpaUpdated;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getJoinedYear(){
        return joinedYear;
    }
    public String getGender(){
        return gender;
    }
    public String getDept(){
        return dept;
    }
    public double getCgpaUpdated(){
        return cgpaUpdated;
    }

    public String toString(){
        return "Student details ->[ name= "+name+", id= "+id+", age= "+age+", gender= "+gender+", Joined-Year= "+joinedYear+", Department= "+dept+", CGPA="+cgpaUpdated+" ]";
    }
}
