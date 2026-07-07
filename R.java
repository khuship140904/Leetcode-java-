public class R {
    String name;
    int age;

    static int maxAge = 20;

    public static void main(String[] args) {
        R a = new R();
        a.name = "golu";
        a.age = 12;
        
        R b = new R();
        b.name = "bholu";
        b.age = 14;     
        
        b.showInfo();
        a.showInfo();
    }

    void showInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(maxAge);
    }
    
}
