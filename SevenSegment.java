public class SevenSegment {

    private static void a() {
        System.out.println();
        System.out.print(" ");
        System.out.print("_");
        System.out.print(" ");

        System.out.println();

    }

    private static void b() {
        System.out.print("|");

    }

    private static void c() {
        System.out.print("_");

    }

    private static void d() {
        System.out.print("|");
        System.out.println();
    }

    private static void e() {

        System.out.print("|");
    }

    private static void f() {
        System.out.print("_");
    }

    private static void g() {
        System.out.print("|");
    }

    // Numeric Method
    private static void zero() {
        a();
        b();
        System.out.print(" ");
        d();
        e();
        f();
        g();
    }

    private static void one() {
        System.out.println();
        System.out.println();
        System.out.print("  ");
        d();
        System.out.print("  ");
        g();
    }

    private static void two() {
        a();
        System.out.print(" ");
        c();
        d();
        e();
        f();
    }

    private static void three() {

        a();
        System.out.print(" ");
        c();
        d();
        System.out.print(" ");
        f();
        g();
    }

    private static void four() {
        System.out.println();
        System.out.println(" ");
        b();
        c();
        d();
        System.out.print(" ");
        System.out.print(" ");
        g();
    }

    private static void five() {
        a();
        b();
        c();
        System.out.print("\n");
        System.out.print(" ");
        f();
        g();
    }

    private static void six() {
        a();
        b();
        c();
        System.out.print(" ");
        System.out.println();
        e();
        f();
        g();

    }

    private static void seven() {
        a();
        System.out.print(" ");
        System.out.print(" ");
        d();
        System.out.print(" ");
        System.out.print(" ");
        g();

    }

    private static void eight() {
        a();
        b();
        c();
        d();
        e();
        f();
        g();

    }

    private static void nine() {
        a();
        b();
        c();
        d();
        System.out.print(" ");
        f();
        g();

    }

    private static void ten() {
        System.out.println();
        System.out.print("   ");
        System.out.print("_");
        System.out.println();
        System.out.print("|");
        System.out.print(" | |");
        System.out.println();
        System.out.print("|");
        System.out.print(" |_|");

    }

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int sec = 0;
        int munite = 0;
        int hourse = 0;
        int count = 0;
        System.out.print("Second : " + sec++ + "    ");
        System.out.print("Munite : " + munite + "   ");
        System.out.print("Hour : " + hourse + "   ");
        System.out.print("Count : " + count + "   ");

        zero();
        Thread.sleep(1000);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Second : " + sec + "    ");
        System.out.print("Munite : " + munite + "   ");
        System.out.print("Hour : " + hourse + "   ");
        System.out.print("Count : " + count + "   ");

        for (int i = 0; i < 10000; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Second : " + sec++ + "    ");
            System.out.print("Munite : " + munite + "   ");
            System.out.print("Hour : " + hourse + "   ");
            System.out.print("Count : " + count + "   ");

            one();
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Second : " + sec++ + "    ");
            System.out.print("Munite : " + munite + "   ");
            System.out.print("Hour : " + hourse + "   ");
            System.out.print("Count : " + count + "   ");
            two();
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Second : " + sec++ + "    ");
            System.out.print("Munite : " + munite + "   ");
            System.out.print("Hour : " + hourse + "   ");
            System.out.print("Count : " + count + "   ");
            three();
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Second : " + sec++ + "    ");
            System.out.print("Munite : " + munite + "   ");
            System.out.print("Hour : " + hourse + "   ");
            System.out.print("Count : " + count + "   ");
            four();
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Second : " + sec++ + "    ");
            System.out.print("Munite : " + munite + "   ");
            System.out.print("Hour : " + hourse + "   ");
            System.out.print("Count : " + count + "   ");
            five();
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Second : " + sec++ + "    ");
            System.out.print("Munite : " + munite + "   ");
            System.out.print("Hour : " + hourse + "   ");
            System.out.print("Count : " + count + "   ");
            six();
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Second : " + sec++ + "    ");
            System.out.print("Munite : " + munite + "   ");
            System.out.print("Hour : " + hourse + "   ");
            System.out.print("Count : " + count + "   ");
            seven();
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Second : " + sec++ + "    ");
            System.out.print("Munite : " + munite + "   ");
            System.out.print("Hour : " + hourse + "   ");
            System.out.print("Count : " + count + "   ");
            eight();
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Second : " + sec++ + "    ");
            System.out.print("Munite : " + munite + "   ");
            System.out.print("Hour : " + hourse + "   ");
            System.out.print("Count : " + count + "   ");
            nine();
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Second : " + sec++ + "    ");
            System.out.print("Munite : " + munite + "   ");
            System.out.print("Hour : " + hourse + "   ");
            System.out.print("Count : " + count + "   ");
            ten();
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Second : " + sec + "    ");
            System.out.print("Munite : " + munite + "   ");
            System.out.print("Hour : " + hourse + "   ");
            System.out.print("Count : " + count + "   ");
            count++;
            
            if (sec == 61 && count == 6) {
                System.out.println("ok");
                munite++;
                sec = 0;
                count = 0;
                System.out.print("Second : " + sec++ + "    ");
                System.out.print("Munite : " + munite + "   ");
                System.out.print("Hour : " + hourse + "   ");
                System.out.print("Count : " + count + "   ");
            }
            if (munite == 60) {
                hourse++;
                munite = 0;
                System.out.print("Second : " + sec++ + "    ");
                System.out.print("Munite : " + munite + "   ");
                System.out.print("Hour : " + hourse + "   ");
                System.out.print("Count : " + count + "   ");
            }

        }

    }

}
