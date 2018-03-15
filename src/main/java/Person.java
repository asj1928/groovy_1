public class Person {
  //  name, age, gender, address
    String name;
    Integer age;
    String gender;
    String address;

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Integer getAge ( ) {
        return age;
    }

    public void setAge ( Integer age ) {
        this.age = age;
    }

    public String getGender ( ) {
        return gender;
    }

    public void setGender ( String gender ) {
        this.gender = gender;
    }

    public String getAddress ( ) {
        return address;
    }

    public void setAddress ( String address ) {
        this.address = address;
    }
//"Sachin is a man aged 24 who lives at Delhi. He works for Intelligrape with employee id 12 and draws $$$$$$$ lots of money !!!!.
    @Override
    public String toString ( ) {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

