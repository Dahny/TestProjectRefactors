public class Person {

    private String personName;
    private int age;

    public String getName(){
        return personName;
    }

    public void setName(String name) {
        this.personName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long calculateLength(long height){
        long width = Math.round(Math.random() * 10);
        final long tempAvg = 150 + Math.round((Math.random() * width));
        System.out.println(tempAvg);
        final long length = height * width;
        System.out.println(length);
        return length;
    }
}
