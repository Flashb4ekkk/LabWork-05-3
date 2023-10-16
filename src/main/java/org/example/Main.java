package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tp, tk, z;
        int n;
        System.out.print("tp = ");
        tp = scan.nextDouble();
        System.out.print("tk = ");
        tk = scan.nextDouble();
        System.out.print("n = ");
        n = scan.nextInt();
        System.out.println("-------------------------");
        System.out.println("| " + String.format("%9s", "t") + " | " + String.format("%9s", "z") +  " |");
        System.out.println("-------------------------");
        double dt = (tk - tp) / n;
        double t = tp;
        while (t <= tk) {
            z = f(2 * t) + Math.pow(f(Math.pow(t, 2) + 1), 2);
            System.out.printf("| %9.2f | %9.5f |%n", t, z);
            t += dt;
        }
        System.out.println("-------------------------");
    }

    public static double f(final double x) {
        if (Math.abs(x) >= 1)
            return ((Math.sin(2 * x) + 1) / (Math.sin(x) + Math.pow(Math.cos(x), 2)));
        else {
            double S;
            int n = 0;
            double a = 1;
            S = a;
            do {
                n++;
                double R = Math.pow(x, 4 * n + 2) / factorial(2 * n + 1);
                a *= R;
                S += a;
            } while (n < 7);
            return S;
        }
    }

    public static double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            double result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}