public class Hello {
    int num;
    String str;

    public Hello(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public void doSomething() {
        System.out.println("doing ur mom haha");
    }

    public void getStr() {
        doSomething();
         System.out.println(this.str);
    }

    public static void main(String[] args)
    {
        Hello yo = new Hello(3, "yo");

        yo.getStr();
    }
}
