// // Задание 2 - Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

// import java.util.Arrays;
// import java.io.FileWriter;
// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.util.Date;

// public class hw2 {
//     public static void main(String[] args) {
//         int[] array = new int[6];
//         for (int i = 0; i < array.length; i++) {
//             array[i] = (int)(10*Math.random()) * (int)Math.pow(-1.0,(double)i);
//         }

//         try {
//             FileWriter writer = new FileWriter("log.txt", true);
//             BufferedWriter bufferWriter = new BufferedWriter(writer);
//             Date date = new Date();
//             bufferWriter.write(date.toString());
//             bufferWriter.write("\n");

//             boolean isSorted = false;
//             int tmp = 0;
//             for (int i = 0; i < array.length - 1; i++) {
//                 isSorted = true;
//                 for (int j = 0; j < array.length - 1 - i; j++) {
//                     if (array[j] > array[j + 1]) {
//                         isSorted = false;
//                         tmp = array[j];
//                         array[j] = array[j + 1];
//                         array[j + 1] = tmp;
//                     }
//                 }
//                 bufferWriter.write(Arrays.toString(array));
//                 bufferWriter.write("\n");
//                 if (isSorted)
//                     break;
//             }
//             bufferWriter.close();
//         }
//         catch (IOException e) {
//             System.out.println(e);
//         }
//     }
// }

// // Задание 3 - Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// // 1 Расширение файла: txt
// // 2 Расширение файла: pdf
// // 3 Расширение файла:
// // 4 Расширение файла: jpg

// import java.io.File;
// import java.nio.file.Path;
// import java.nio.file.Paths;

// public class hw2 {
//     public static void main(String[] args) {
//         Path path = Paths.get("hw2.java");
//         File folder = new File(path.toAbsolutePath().getParent().toString());
//         int i = 1;
//         for (File file : folder.listFiles())
//         {
//             //System.out.println(file.getName());
//             System.out.printf("%d Расширение файла: %s\n", i, (file.getName().toString().split("\\."))[1]);
//             i++;
//         }
//     } 
// }



// // Задание 4 - К калькулятору из предыдущего дз добавить логирование.

// import java.util.Scanner;
// import java.io.FileWriter;
// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.util.Date;

// public class hw2 {
//     public static void main(String[] args) {
//         double a = 0;
//         double b = 0;
//         char op = '+';

//         boolean flag = false;

//         Scanner iScanner = new Scanner(System.in);
//         do {
//             System.out.printf("Input number a: ");
//             flag = iScanner.hasNextDouble(); // проверка на корректный ввод
//             if (flag == true) {
//                 a = iScanner.nextDouble();
//             } else {
//                 System.out.println("Incorrect input! Try again!");
//                 iScanner.nextLine(); // "вхолостую" считываем всё из входного потока
//             }
//         } while (flag != true);

//         do {
//             System.out.printf("Input number b: ");
//             flag = iScanner.hasNextDouble(); // проверка на корректный ввод
//             if (flag == true) {
//                 b = iScanner.nextDouble();
//             } else {
//                 System.out.println("Incorrect input! Try again!");
//                 iScanner.nextLine(); // "вхолостую" считываем всё из входного потока2
//             }
//         } while (flag != true);

//         System.out.println("Input operation (+ - / *): ");
//         op = iScanner.next().charAt(0);
//         iScanner.close();

//         try {
//             FileWriter writer = new FileWriter("log4.txt", true);
//             BufferedWriter bufferWriter = new BufferedWriter(writer);
//             Date date = new Date();
//             bufferWriter.write(date.toString());
//             bufferWriter.write("\n");
//             switch (op) {
//                 case '+':
//                     bufferWriter.write(String.format("%.2f + %.2f = %.2f\n", a, b, a + b));
//                     break;
//                 case '-':
//                     bufferWriter.write(String.format("%.2f - %.2f = %.2f\n", a, b, a - b));
//                     break;
//                 case '/':
//                     if (b != 0)
//                         bufferWriter.write(String.format("%.2f / %.2f = %.2f\n", a, b, a / b));
//                     else
//                         bufferWriter.write("Error! Division by zero!\n");
//                     break;
//                 case '*':
//                     bufferWriter.write(String.format("%.2f * %.2f = %.2f\n", a, b, a * b));
//                     break;
//                 default:
//                     bufferWriter.write("Incorrect operation!\n");
//                     break;
//             }   
//             bufferWriter.close();
//         } catch (IOException e) {
//             System.out.println(e);
//         }
//     }
// }