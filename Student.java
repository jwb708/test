public class Student{
  private String name;
  private int age;
  private String address;
  
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public String getAge(){
    return age;
  }
  public void setAddress(String address){
    this.address = address;
  }
  public String getAddredd(){
    return address;
  }
  
  public Student(){}
  
  public Student(String name,int age,String address){
    super();
    this.name = name;
    this.age = age;
    this.address = address;
  }
}
