//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

    }

   public static String task1() {
    int a = 1; //1,0,-3
    if (a==0) {
        return "Right";
    } else {
        return "Wrong";
    }
}

   public static String task2() {
    int a = 1; //1,0,-3
    if (a>0) {
        return "Right";
    } else {
        return "Wrong";
    }
}

   public static String task3() {
    int a = 1; //1,0,-3
    if (a<0) {
        return "Right";
    } else {
        return "Wrong";
    }
}

   public static String task4() {
    int a = 1; //1,0,-3
    if (a==0 || a>0) {
        return "Right";
} else{
        return "Wrong";
    }
}

   public static String task5() {
    int a = 1; //1,0,-3
    if (a<0 || a==0) {
        return "Right";
    } else {
        return "Wrong";
    }
}

   public static String task6() {
    int a = 1; //1,0,-3
    if (a!=0) {
        return "Right";
    } else {
        return "Wrong";
    }
 }

   public static String task7() {
    int a = 1; //1,0,-3
    int test = 1;
    if (a==test) {
        return "Right";
    } else {
        return "Wrong";
    }
}

   public static String task8() {
    String a = "1"; //"1",1,3
    if (a=="1") {
        return "Right";
    } else {
        return "Wrong";
    }

}

   public static String task9() {
       boolean a = true;
       if (a=true) {
           return "Right";
       } else {
           return "Wrong";
       }
}

   public static void task10_1() {
     boolean a = true;
       System.out.println(a ? "Right" : "Wrong");
}

   public static String task10_2() {
       boolean a = true;
       if (a!=true) {
           return "Right";
       } else {
           return "Wrong";
       }
}

   public static void task11_1() {
     boolean a = true;
       System.out.println(a ? "Wrong" : "Right");
}

   public static String task11_2() {
        int a = 5;
        if (a<5 && a>0) {
            return "Right";
        } else {
            return "Wrong";
        }
}

   public static int task12() {
        int a = 5;
        if (a==0 || a==2) {
            a = a + 7;
            return a;
        } else {
            a = a / 10;
            return a;
        }
}

   public static int task13() {
            int a = 1;
            int b = 1;
            if (a == 1 || a < 1) {
                if(b>3 || b==3) {
                    return a + b;
                } else {
                    return a - b;
                }
            } else {
               return a - b;
            }
}

   public static String task14() {
            int a = 12;
            int b = 13;
            if (a > 2 && a < 11) {
                return "Right";
            } else if(b > 6 && b < 14 || b == 6 && b < 14) {
                return "Right";
            } else {
                return "Wrong";
            }
}

   public static void task15() {
                int num = 2;
                String result = "";
                switch(num) {
                    case 1:
                        result = "зима";
                        break;
                    case 2:
                        result = "весна";
                        break;
                    case 3:
                        result = "лето";
                        break;
                    case 4:
                        result = "осень";
                        break;
                }
}

    public static int fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Невірний вхід, n має бути більше 0");
            return -1; // Повертаємо -1 як помилку
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacciHelper(n, 0, 1);
        }
    }

    private static int fibonacciHelper(int n, int a, int b) {
        if (n == 0) {
            return a;
        } else {
            return fibonacciHelper(n - 1, b, a + b);
        }
    }



}