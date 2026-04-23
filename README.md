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

[program 17 WAP for Registration Form  ](#assi17)

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
import javax.swing.*;
import java.awt.event.*;

class AddGUI extends JFrame implements ActionListener {
    JTextField t1,t2,t3;
    JButton b;

    AddGUI() {
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b = new JButton("Add");

        t1.setBounds(50,50,100,30);
        t2.setBounds(50,100,100,30);
        t3.setBounds(50,150,100,30);
        b.setBounds(50,200,100,30);

        add(t1); add(t2); add(t3); add(b);
        b.addActionListener(this);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        t3.setText(String.valueOf(a+b));
    }

    public static void main(String args[]) {
        new AddGUI();
    }
}
```
<img width="182" height="317" alt="image" src="https://github.com/user-attachments/assets/321aa53a-7c56-4041-86b2-facb51028dbd" />

## assi17
```
import javax.swing.*;
import java.awt.event.*;

class Register extends JFrame implements ActionListener {

    JTextField name, age;
    JRadioButton male, female;
    JButton submit;

    Register() {
        setLayout(null);

        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Age:");
        JLabel l3 = new JLabel("Gender:");

        name = new JTextField();
        age = new JTextField();

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        submit = new JButton("Submit");

        l1.setBounds(50,50,100,30);
        name.setBounds(150,50,120,30);

        l2.setBounds(50,90,100,30);
        age.setBounds(150,90,120,30);

        l3.setBounds(50,130,100,30);
        male.setBounds(150,130,70,30);
        female.setBounds(220,130,80,30);

        submit.setBounds(150,180,100,30);

        add(l1); add(name);
        add(l2); add(age);
        add(l3); add(male); add(female);
        add(submit);

        submit.addActionListener(this);

        setSize(350,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String gender = male.isSelected() ? "Male" : "Female";

        JOptionPane.showMessageDialog(this,
            "Name: " + name.getText() +
            "\nAge: " + age.getText() +
            "\nGender: " + gender);
    }

    public static void main(String args[]) {
        new Register();
    }
}

```
<img width="1077" height="561" alt="image" src="https://github.com/user-attachments/assets/2c8b59d5-0523-4836-be20-63b1d06163d7" />


## assi18
```
import javax.swing.*;
import java.awt.event.*;

class Calc extends JFrame implements ActionListener {
    JTextField t1,t2,t3;
    JButton add,sub;

    Calc() {
        t1=new JTextField(); t2=new JTextField(); t3=new JTextField();
        add=new JButton("+"); sub=new JButton("-");

        t1.setBounds(50,50,100,30);
        t2.setBounds(50,100,100,30);
        t3.setBounds(50,150,100,30);
        add.setBounds(50,200,50,30);
        sub.setBounds(110,200,50,30);

        add(t1); add(t2); add(t3); add(add); add(sub);

        add.addActionListener(this);
        sub.addActionListener(this);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());

        if(e.getSource()==add)
            t3.setText(""+(a+b));
        else
            t3.setText(""+(a-b));
    }

    public static void main(String args[]) {
        new Calc();
    }
}
```
<img width="210" height="333" alt="image" src="https://github.com/user-attachments/assets/27adece6-1b51-4323-8267-64d2e70af0cd" />

## assi19
```
import javax.swing.*;
import java.awt.event.*;

class Add extends JFrame implements ActionListener {

    JTextField a11,a12,a21,a22;
    JTextField b11,b12,b21,b22;
    JTextField r11,r12,r21,r22;
    JButton add;

    Add() {
        setLayout(null);

        // Matrix A
        a11 = new JTextField(); a12 = new JTextField();
        a21 = new JTextField(); a22 = new JTextField();

        // Matrix B
        b11 = new JTextField(); b12 = new JTextField();
        b21 = new JTextField(); b22 = new JTextField();

        // Result Matrix
        r11 = new JTextField(); r12 = new JTextField();
        r21 = new JTextField(); r22 = new JTextField();

        add = new JButton("Add");

        // Set bounds (A matrix)
        a11.setBounds(50,50,40,30);
        a12.setBounds(100,50,40,30);
        a21.setBounds(50,90,40,30);
        a22.setBounds(100,90,40,30);

        // B matrix
        b11.setBounds(200,50,40,30);
        b12.setBounds(250,50,40,30);
        b21.setBounds(200,90,40,30);
        b22.setBounds(250,90,40,30);

        // Result matrix
        r11.setBounds(350,50,40,30);
        r12.setBounds(400,50,40,30);
        r21.setBounds(350,90,40,30);
        r22.setBounds(400,90,40,30);

        add.setBounds(200,150,80,30);

        // Add components
        add(a11); add(a12); add(a21); add(a22);
        add(b11); add(b12); add(b21); add(b22);
        add(r11); add(r12); add(r21); add(r22);
        add(add);

        add.addActionListener(this);

        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int A11 = Integer.parseInt(a11.getText());
        int A12 = Integer.parseInt(a12.getText());
        int A21 = Integer.parseInt(a21.getText());
        int A22 = Integer.parseInt(a22.getText());

        int B11 = Integer.parseInt(b11.getText());
        int B12 = Integer.parseInt(b12.getText());
        int B21 = Integer.parseInt(b21.getText());
        int B22 = Integer.parseInt(b22.getText());

        r11.setText(""+(A11+B11));
        r12.setText(""+(A12+B12));
        r21.setText(""+(A21+B21));
        r22.setText(""+(A22+B22));
    }

    public static void main(String args[]) {
        new Add();
    }
}

```
<img width="550" height="257" alt="image" src="https://github.com/user-attachments/assets/92e5a267-c2c7-4f69-b011-04b079d1ce74" />

## assi20
```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Shapes extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    String shape = "";

    Shapes() {
        setLayout(new FlowLayout());

        // Create 10 buttons
        b1 = new JButton("Circle");
        b2 = new JButton("Oval");
        b3 = new JButton("Rectangle");
        b4 = new JButton("Square");
        b5 = new JButton("Line");
        b6 = new JButton("Arc");
        b7 = new JButton("RoundRect");
        b8 = new JButton("Fill Circle");
        b9 = new JButton("Fill Rect");
        b10 = new JButton("Clear");

        // Add buttons
        add(b1); add(b2); add(b3); add(b4); add(b5);
        add(b6); add(b7); add(b8); add(b9); add(b10);

        // Add action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);

        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        shape = e.getActionCommand(); // get button name
        repaint(); // call paint()
    }

    public void paint(Graphics g) {
        super.paint(g);

        if(shape.equals("Circle"))
            g.drawOval(200,200,100,100);

        else if(shape.equals("Oval"))
            g.drawOval(200,200,150,100);

        else if(shape.equals("Rectangle"))
            g.drawRect(200,200,150,100);

        else if(shape.equals("Square"))
            g.drawRect(200,200,100,100);

        else if(shape.equals("Line"))
            g.drawLine(200,200,350,300);

        else if(shape.equals("Arc"))
            g.drawArc(200,200,100,100,0,180);

        else if(shape.equals("RoundRect"))
            g.drawRoundRect(200,200,150,100,30,30);

        else if(shape.equals("Fill Circle"))
            g.fillOval(200,200,100,100);

        else if(shape.equals("Fill Rect"))
            g.fillRect(200,200,150,100);

        else if(shape.equals("Clear"))
            repaint();
    }

    public static void main(String args[]) {
        new Shapes();
    }
}
```
<img width="1352" height="530" alt="image" src="https://github.com/user-attachments/assets/f4f1e1aa-5323-4f33-b7da-d9eb575c4e5e" />

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
