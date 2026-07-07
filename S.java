public class S {
      String name;
    int age;

    static int maxAge = 20;

    public static void main(String[] args) {
        S a = new S();
        a.name = "golu";
        a.age = 12;
        
        S b = new S();
        b.name = "bholu";
        b.age = 14;     
        
        b.showInfo();
        a.showInfo();
    }

    static void showInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(maxAge);
    }
    
}

/*S.java:21: error: non-static variable name cannot be referenced from a static context
        System.out.println(name);
                           ^
S.java:22: error: non-static variable age cannot be referenced from a static context
        System.out.println(age); */