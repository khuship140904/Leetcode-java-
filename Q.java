class Q {
    static String name;
    static int age;

    public static void main(String[] args) {
        Q a = new Q();
        a.name = "mohan";
        a.age = 14;

        Q b = new Q();
        b.name = "dinesh";
        b.age = 18;

        Q c = new Q();
        c.name = "om";
        c.age = 9;

        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(c.name);
        System.out.println(c.age);
    }
}