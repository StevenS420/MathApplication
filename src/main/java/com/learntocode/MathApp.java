package com.learntocode;

public class MathApp {
    public static void main(String[] args) {
        long job1Salary = 70000;
        long job2Salary = 60000;
        long maxSalary = Math.max(job1Salary, job2Salary);
        System.out.println("The max is " + maxSalary);


       long carPrice = 30000;
       long truckPrice = 400000;
       long minPrice = Math.min(carPrice, truckPrice);
       System.out.println("The smallest price is ") + minPrice);


      double radius = 7.25;
      double area = Math.PI * Math.pow(radius, 2);
      System.out.println("The area of the circle is " + area);


      double num1 = 5.0;
      double sqrtNum1 = Math.sqrt(num1);
      System.out.println("The square root of " + num1 + " is ' + sqrtNum1");


      int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
      double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      System.out.println("The distance between the points is " + distance);


      double num2 = -3.8;
      double absNum2 = Math.abs(num2);
      System.out.println("The absolute value of " + num2 + " is " + absNum2);


      double randomNum = Math.random();
      System.out.println("The random number is " + randomNum);



    }
}
