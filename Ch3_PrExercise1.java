CSM10J Lab #2
1.
a.  import java.util.Scanner;
    import java.io.FileReader;
    import java.io.PrintWriter;
    

b. Scanner inFile;
    PrintWriter outFile;

c.  Scanner inFile = new Scanner (h:/inData.txt”);
    PrintWriter outFile = new PrintWriter (“h:/outData.dat”);

d. double length, width, radius, Pi = 3.1416;
   string firstName, lastName;
   int age;
   double balance, interest;
   char character;

  length = inFile.nextDouble();
  width = inFile.nextDouble();
   
outFile.println (“Rectangle:”);
outFile.println (“Length” + length);
outFile.println (“Width” + width);
outFile.printf (“, area = %.2f”, length*width);
outFile.printf(“, perimeter = %.2f%n”, 2(length*width);
outFile.println();

radius = inFile.nextDouble();
outFile.println(“Circle:”);
outFile.print (“Radius =” + radius);
outFile.print (“, area = %.2f”, (Pi*radius*radius);
outFile.printf (“, circumference = %.2f%n”, (Pi*2*radius));
outFile. Println();

firstName = inFile.next();
lastName = inFile.next();
age = inFile.nextInt();
balance = inFile.nextDouble();
interest = inFile.nextDouble();
outFile.println(“Name:” + firstName + lastName + “, Age: ” + age);
outFile.printf(“Beginning balance = $”  + balance + “, interest rate = %.2f%n”,         rate);
outFile.printf(“Balance at the end of the Month = $” + %.2f%n”, balance + (balance*(rate/(12*100))));
outFile.println();



character = (inFile.next()).charAt(0);
outFile.println(“The character that comes after “ + character + “in the ASCII set is “ + (char)(character + 1));

e. outFile.close();

