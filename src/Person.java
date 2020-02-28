public class Person {

    private String personName;
    private long age;

    public String getName(){
        return personName;
    }

    public void setName(String name) {
        this.personName = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long calculateLength(long height){
        int width = 10;
        final long tempAvg = 150 + Math.round((Math.random() * (long) width));
        System.out.println(tempAvg);
        final long length = height * width;
        System.out.println(length);
        return length;
    }
}
