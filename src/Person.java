public class Person {

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getLength(long height){
        long width = Math.round(Math.random() * 10);
        long avg = 150 + Math.round((Math.random() * width));
        System.out.println(avg);
        avg = height * width;
        System.out.println(avg);
        return avg;
    }
}
