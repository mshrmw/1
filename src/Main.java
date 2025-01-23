import java.util.Scanner;
//Четное или нечетное число
class ex1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число");
        int n = in.nextInt();
        if (n%2 == 0)
        {
            System.out.println("Число четное");
        }
        else System.out.println("Число нечетное");
    }
}

// Минимальное из трех чисел
class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int min = n1;
        if (min > n2){
            min = n2;
        }
        if (min > n3){
            min = n3;
        }
        System.out.println("Минимальное число "+ min);
    }
}

//Таблица умножения
class ex3 {
    public static void main(String[] args) {
        int n =0;
        while (n!= 11) {
        System.out.println("5 * " + n + " = " + (5 * n));
        n++;
        }
    }
}

//Сумма чисел от 1 до N
class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число");
        int n = in.nextInt();
        int res = 0;
        while (n > 0) {
            res+=n;
            n--;
        }
        System.out.print(res);
    }
}

//Число Фибоначчи
class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Введите число больше 0");
        }
        else {
            System.out.println("Первые " + n + " чисел Фибоначчи:");
            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }
    }
}

//Проверка простого числа
class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число");
        int number = in.nextInt();
        if (number <= 1) {
            System.out.println(number + " не является простым числом");
        }
        else if (isPrime(number)) {
            System.out.println(number + " является простым числом");
        }
        else {
            System.out.println(number + " не является простым числом");
        }
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Обратный порядок чисел
class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
    }
}

//Сумма четных чисел
class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                c+=i;
            }
        }
        System.out.println(c);
    }
}

//Реверс строки
class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = "";
        for (int i = s.length()-1; i >=0; i--) {
            result += s.charAt(i);
        }
        System.out.println(result);
    }
}

//Количество цифр в числе
class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n = 0;
        while (num > 0) {
            if (num / 10 >= 0) {
                n++;
            }
            num = num / 10;
        }
        System.out.println(n);
    }
}

//Факториал числа
class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 1;
        if (n == 0) System.out.println("0");
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}

//Сумма цифр числа
class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;

        }
        System.out.println(sum);
    }
}

//Палиндром
class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.replaceAll(" ", "").toLowerCase();
        boolean flag = true;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Палиндром");
        }
        else System.out.println("Не палиндром");
    }
}

// Найти максимальное число в массиве
class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}

//Сумма всех элементов массива
class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = array[0];
        for (int i = 1; i < n; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}

// Количество положительных и отрицательных чисел
class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int plus = 0, minus = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                plus++;
            }
            else if (array[i] < 0) {
                minus++;
            }
        }
        System.out.println("The plus of the elements in the array is: " + plus);
        System.out.println("The minus of the elements in the array is: " + minus);
    }
}

//Простые числа в диапазоне
class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a  и b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Простые числа в диапазоне от " + a + " до " + b + ":");
        for (int i = a; i <= b; i++) {
            if (i >= 2) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

//Подсчет гласных и согласных в строке
class ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sogl = 0;
        int glas = 0;
        input = input.replaceAll("[^a-zA-Z0-9]", "");
        input = input.toLowerCase();
        for (char c : input.toCharArray()) {
            if ("aeiouаеиоуыэюя".indexOf(c) != -1) glas++;
            else  sogl++;
        }
        System.out.println(sogl + " " + glas);
    }
}

//Перестановка слов в строке
class ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        for(int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}

// Число Армстронга
class ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int originalNum = n;
        int num = n;
        int kolvo = 0;
        while (num > 0) {
            kolvo++;
            num /= 10;
        }
        num = n;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, kolvo);
            num /= 10;
        }
        if (sum == originalNum) {
            System.out.println("Число Армстронга");
        } else {
            System.out.println("Не число Армстронга");
        }
    }
}