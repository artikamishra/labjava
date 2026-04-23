[program 1 W.A.P to add 2 number](#assi1)

[program 2 W.A.P to sub 2 number](#assi2)

[program 3 WAP to Add Numbers Using Methods and Additional Class](#assi3)

[program 4 WAP to Add Two Distances (m, cm, mm)](#assi4) 

[program 5 WAP to Add Two times (hr, min, sec)](#assi5) 

[program 6 WAP to Reverse 1D Array](#assi6)

[program 7 calculator using class and object](#assi7)

[program 8 Matrix Operations (Transpose, Addition, Row/Column/Diagonal Sum)](#assi8)

[program 9 Write a class that is having four method for 1-dimensional array. (Input, output 1,out2, reverse).](#assi9)

[program 10 WAP for factorial](#assi10)

[program 11 WAP for Armstrong Number](#assi11)

[program 12 WAP for Palindrome Number](#assi12)

[program 13 WAP for Printing 1–100 using 3 Classes(without thread)](#assi13)

[program 14 WAP for Printing 1–100 using 3 Classes(with thread) ](#assi14)

[program 15 WAP for Synchronised Threads using join() ](#assi15)

[program 16 WAP for Addition of 2 Numbers using Swing](#assi16)

[program 17 WAP for Registration Form + JDBC (Basic) ](#assi17)

[program 18 WAP for Calculator in Swing ](#assi18)

[program 19 WAP for Matrix Addition using Swing](#assi19)

[program 20 WAP for JFrame with 10 Buttons (Shapes) ](#assi20)

[program 21 WAP for Paint Brush (Mouse Event Basic) ](#assi21)

[program 22 WAP for Package with 5 Classes ](#assi22)

[program 23 WAP for Package + Subpackage](#assi23)

[program 24 WAP for Exception Handling](#assi24)

[program 25 WAP for User Defined Exception (Age Check)](#assi25)

[program 26 WAP for File Handling](#assi26)

[program 27 WAP for Inheritance + Interface + Abstract Class](#assi27)

[program 28 WAP for ](#assi28)

[program 29 WAP for ](#assi29)

[program 30 WAP for ](#assi30)
## assi1
```
public class Addition {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int sum;

        sum = a + b;

        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        System.out.println("Sum = " + sum);
    }
}
```
<img width="747" height="288" alt="image" src="https://github.com/user-attachments/assets/6f138757-5e2c-4254-85c9-0bc9b77002f5" />


## assi2
```
public class Subtraction {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int result;

        result = a - b;

        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        System.out.println("Subtraction = " + result);
    }
}
```
<img width="650" height="268" alt="image" src="https://github.com/user-attachments/assets/00befdf5-1e54-4dcc-bdf7-3ce214059a6f" />


## assi3
```
public class AddNumbers {

    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        AddNumbers obj = new AddNumbers();
        int result = obj.add(10, 5);

        System.out.println("Sum = " + result);
    }
}

```
<img width="872" height="343" alt="image" src="https://github.com/user-attachments/assets/55f01091-167d-4b09-b2b6-7282e019d7d8" />

## assi4
```
public class Distance {

    int m, cm, mm;

    void addDistance(Distance d1, Distance d2) {

        mm = d1.mm + d2.mm;
        cm = d1.cm + d2.cm + mm / 10;
        mm = mm % 10;

        m = d1.m + d2.m + cm / 100;
        cm = cm % 100;
    }

    void display() {
        System.out.println("Distance = " + m + " m " + cm + " cm " + mm + " mm");
    }

    public static void main(String[] args) {

        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance result = new Distance();

        d1.m = 2;
        d1.cm = 50;
        d1.mm = 8;

        d2.m = 3;
        d2.cm = 40;
        d2.mm = 7;

        result.addDistance(d1, d2);
        result.display();
    }
}
```
<img width="868" height="307" alt="image" src="https://github.com/user-attachments/assets/0cca2db3-44ed-4b4c-9319-45b11c47a4e3" />


## assi5
```
public class Time {

    int hr, min, sec;

    void addTime(Time t1, Time t2) {

        sec = t1.sec + t2.sec;
        min = t1.min + t2.min + sec / 60;
        sec = sec % 60;

        hr = t1.hr + t2.hr + min / 60;
        min = min % 60;
    }

    void display() {
        System.out.println("Time = " + hr + ":" + min + ":" + sec);
    }

    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        t1.hr = 2;
        t1.min = 45;
        t1.sec = 30;

        t2.hr = 1;
        t2.min = 20;
        t2.sec = 40;

        result.addTime(t1, t2);
        result.display();
    }
}
```
<img width="832" height="238" alt="image" src="https://github.com/user-attachments/assets/e577d706-3bed-4006-b209-8b8ec0f7e44a" />

## assi6
```
public class ReverseArray {

    void reverse(int arr[]) {

        System.out.println("Reversed Array:");

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        System.out.println("Original Array:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        ReverseArray obj = new ReverseArray();
        obj.reverse(arr);
    }
}
```
<img width="932" height="249" alt="image" src="https://github.com/user-attachments/assets/bffa0674-75a4-4a82-8ae9-94156732e578" />


## assi7
```
class Calculator {
    int a, b;

    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    void add() {
        System.out.println("Addition = " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }

    void mul() {
        System.out.println("Multiplication = " + (a * b));
    }

    void div() {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Division not possible");
    }
}

class Main {
    public static void main(String args[]) {
        Calculator obj = new Calculator(10, 5);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
```
<img width="413" height="241" alt="image" src="https://github.com/user-attachments/assets/fa13e307-18a5-4e49-83ae-f0d3b64b619a" />

## assi8
```
class Matrix {
    int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int b[][] = {{9,8,7},{6,5,4},{3,2,1}};
    int c[][] = new int[3][3];

    void add() {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                c[i][j]=a[i][j]+b[i][j];

        System.out.println("Addition:");
        display(c);
    }

    void transpose() {
        System.out.println("Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(a[j][i]+" ");
            System.out.println();
        }
    }

    void rowSum() {
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++)
                sum+=a[i][j];
            System.out.println("Row "+i+" sum="+sum);
        }
    }

    void colSum() {
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++)
                sum+=a[j][i];
            System.out.println("Column "+i+" sum="+sum);
        }
    }

    void diagonalSum() {
        int sum=0;
        for(int i=0;i<3;i++)
            sum+=a[i][i];
        System.out.println("Diagonal sum="+sum);
    }

    void display(int x[][]) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(x[i][j]+" ");
            System.out.println();
        }
    }
}

class Main {
    public static void main(String args[]) {
        Matrix m = new Matrix();
        m.add();
        m.transpose();
        m.rowSum();
        m.colSum();
        m.diagonalSum();
    }
}
```
<img width="537" height="601" alt="image" src="https://github.com/user-attachments/assets/0ffe3826-bbbd-4bb0-8d18-431faff13ea3" />

## assi9
```
import java.util.*;

class ArrayDemo {
    int arr[] = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();
    }

    void output1() {
        System.out.println("Array elements:");
        for(int i=0;i<5;i++)
            System.out.print(arr[i]+" ");
    }

    void output2() {
        System.out.println("\nEven elements:");
        for(int i=0;i<5;i++)
            if(arr[i]%2==0)
                System.out.print(arr[i]+" ");
    }

    void reverse() {
        System.out.println("\nReverse array:");
        for(int i=4;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
}

class Main {
    public static void main(String args[]) {
        ArrayDemo obj = new ArrayDemo();
        obj.input();
        obj.output1();
        obj.output2();
        obj.reverse();
    }
}
```
<img width="358" height="412" alt="image" src="https://github.com/user-attachments/assets/db02d65f-0e7b-47b5-a47b-d8c697704bfb" />

## assi10
```
import java.util.*;

class Factorial {
    public static void main(String args[]) {
        int n, fact = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}

```
<img width="357" height="148" alt="image" src="https://github.com/user-attachments/assets/425a5917-2530-4fc4-b21e-ca4bd4dffcd3" />

## assi11
```
import java.util.*;

class Armstrong {
    public static void main(String args[]) {
        int num, temp, sum = 0, r;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = sc.nextInt();

        temp = num;

        while(temp > 0) {
            r = temp % 10;
            sum = sum + (r * r * r);
            temp = temp / 10;
        }

        if(sum == num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong");
    }
}

```
<img width="361" height="193" alt="image" src="https://github.com/user-attachments/assets/59a2eecb-426a-40ef-86e7-99f585b70f1f" />

## assi12
```
import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        int num, temp, rev = 0, r;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = sc.nextInt();

        temp = num;

        while(temp > 0) {
            r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
        }

        if(rev == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

```
<img width="376" height="230" alt="image" src="https://github.com/user-attachments/assets/4f1b28b7-19eb-4083-b75f-162b57e8c86d" />

## assi13
```
class A {
    void print() {
        for(int i=1;i<=100;i++)
            System.out.println("A: " + i);
    }
}
class B {
    void print() {
        for(int i=1;i<=100;i++)
            System.out.println("B: " + i);
    }
}
class C {
    void print() {
        for(int i=1;i<=100;i++)
            System.out.println("C: " + i);
    }
}

class Main {
    public static void main(String args[]) {
        new A().print();
        new B().print();
        new C().print();
    }
}
```
<img width="197" height="717" alt="image" src="https://github.com/user-attachments/assets/35392fbf-5692-4062-b75a-62755ce86084" />

## assi14
```
class A extends Thread {
    public void run() {
        for(int i=1;i<=100;i++)
            System.out.println("A: " + i);
    }
}
class B extends Thread {
    public void run() {
        for(int i=1;i<=100;i++)
            System.out.println("B: " + i);
    }
}
class C extends Thread {
    public void run() {
        for(int i=1;i<=100;i++)
            System.out.println("C: " + i);
    }
}

class Main {
    public static void main(String args[]) {
        new A().start();
        new B().start();
        new C().start();
    }
}
```
<img width="78" height="665" alt="image" src="https://github.com/user-attachments/assets/a984ab85-9a54-497d-950e-9b1531f96653" />

## assi15
```
class A extends Thread {
    public void run() {
        for(int i=1;i<=5;i++)
            System.out.println("A: " + i);
    }
}

class Main {
    public static void main(String args[]) throws Exception {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}
```
<img width="388" height="525" alt="image" src="https://github.com/user-attachments/assets/39023fee-8981-4ae7-99be-0bf78ae0c238" />

## assi16
```

```

## assi17
```

```

## assi18
```

```

## assi19
```

```

## assi20
```

```

## assi21
```

```

## assi22
```

```

## assi23
```

```

## assi24
```

```
## assi25
```

```
## assi26
```

```
## assi27
```

```

## assi28
```

```

## assi29
```

```

## assi30
```

```
