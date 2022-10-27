package ch13hw1;
public class Reader {
    String firstName;
    int age;
    char gender;


    public Reader(String firstName, int age, char gender) {
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
     }
  
      public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public void getReader() {
        System.out.println("Reader: " + firstName + " , " + age + " , " + gender + "\n");
    }

 }