[program 1 W.A.P to add 2 number](#assi1)

[program 2 W.A.P to sub 2 number](#assi2)

[program 3 WAP to Add Numbers Using Methods and Additional Class](#assi3)

[program 4 WAP to Add Two Distances (m, cm, mm)](#assi4) 

[program 5 WAP to Add Two times (hr, min, sec)](#assi5) 

[program 6 WAP to Reverse 1D Array](#assi6)


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
