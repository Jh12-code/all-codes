package 面向对象基础.car;

public class ThisDemo {
    public static void main(String[] args) {
        Car c=new Car("宝马x3",37.89);
        System.out.println(c);
        System.out.println(c.name);
        System.out.println(c.price);
        c.gowith("奔驰GLC");
    }
}
