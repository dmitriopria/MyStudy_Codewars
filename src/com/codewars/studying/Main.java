package com.codewars.studying;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String args[]) {

    }

    public class Multiply {
        public static Double multiply(Double a, Double b) {

            return a * b;
        }
    }

    public class Kata {
        public static String solution(String str) {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return sb.toString();
        }
    }

    public class Sid {
        public static int simpleMultiplication(int number) {

            return number * (number % 2 > 0 ? 9 : 8);
        }
    }

    public class Banjo {
        public static String areYouPlayingBanjo(String name) {
            if (name.startsWith("R") | name.startsWith("r"))
                return name + " plays banjo";
            else
                return name + " does not play banjo";
        }
    }

    public class RemoveChars {
        public static String remove(String str) {
            String remove = str.substring(1, str.length() - 1);
            return remove;
        }
    }

    public class Solution1 {
        public static String repeatStr(final int repeat, final String string) {
            return string.repeat(repeat);
        }
    }

    public class Kata1 {
        public static String noSpace(final String x) {
            return x.replaceAll(" ", "");
        }
    }

    public class Kata2 {
        public static String noSpace(final String x) {
            return x.replace(" ", "");
        }
    }

    public class Solution2 {
        public static int century(int number) {
            return (number + 99) / 100;
        }
    }

    public class HelloWorld {
        public static String greet() {
            return "hello world!";
        }
    }

    public class OppositesAttract {
        public static boolean isLove(final int flower1, final int flower2) {
            return flower1 % 2 != flower2 % 2;
        }
    }

    public class Kata3 {
        public static boolean solution(String str, String ending) {
            return str.endsWith(ending);
        }
    }

    class Java {
        public static int doubleInteger(int i) {
            return i * 2;
        }
    }

    class YesOrNo {
        public static String boolToWord(boolean b) {
            String a;
            if (b == true) {
                a = "Yes";
            } else a = "No";
            return a;
        }
    }

    public class Vowels {
        public static int getCount(String str) {
            int getCount = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    getCount++;
                }
            }
            return getCount;
        }
    }

    public class BooleanToString {
        public static String convert(boolean b) {
            String a = String.valueOf(b);
            return a;
        }
    }

    public class StringToNumber {
        public static int stringToNumber(String str) {
            return Integer.valueOf(str);
        }
    }

    public class Kata4 {
        public static int makeNegative(int x) {
            if (x > 0) {
                x *= -1;
            }
            return x;
        }
    }

    public class Kata5 {
        public static int opposite(int number) {
            return number * -1;
        }
    }

    public class Solution {
        public static boolean check(Object[] a, Object x) {
            if (Arrays.asList(a).contains(x)) {
                return true;
            } else return false;
        }
    }

    class Kata6 {
        public static String numberToString(int num) {
            return String.valueOf(num);
        }
    }

    public class Cockroach {
        public int cockroachSpeed(double x) {
            return (int) (x * 100000 / 3600);
        }
    }

    public class KeepHydrated {
        public int Liters(double time) {
            return (int) Math.floor(time / 2);
        }
    }

    public class Kata7 {
        public static int quarterOf(int month) {
            int num = 0;
            if (month <= 3) {
                return num = 1;
            } else if (month > 3 && month <= 6) {
                return num = 2;
            } else if (month > 6 && month <= 9) {
                return num = 3;
            } else if (month > 9 && month <= 12) {
                return num = 4;
            }
            return num;
        }
    }

    public class EvenOrOdd {
        public static String even_or_odd(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else return "Odd";
        }
    }

    public class HelpAlex {
        public static String hoopCount(int n) {
            if (n >= 10) {
                return "Great, now move on to tricks";
            } else return "Keep at it until you get it";
        }
    }

    public class FindDivisor {
        public long numberOfDivisors(int n) {
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    result++;
                }
            }
            return result;
        }
    }


    public class Sum {
        public int GetSum(int a, int b) {
            int sum = 0;
            if (a < b) {
                for (int i = a; i <= b; i++) {
                    sum += i;
                }
                return sum;
            } else if (a > b) {
                for (int i = b; i <= a; i++) {
                    sum += i;
                }
                return sum;
            } else return a;
        }
    }

    public class Bio {
        public String dnaToRna(String dna) {
            String splitLetters[] = dna.split("");
            ArrayList alfa = new ArrayList(List.of(splitLetters));
            for (int i = 0; i < alfa.size(); i++) {
                String replaceLetters = String.valueOf(alfa.get(i));
                replaceLetters = replaceLetters.replaceAll("T", "U");
                alfa.set(i, replaceLetters);
            }
            return String.join("", alfa);
        }
    }

    public class Bio2 {
        public String dnaToRna(String dna) {
            return dna.replace("T", "U");
        }
    }

    public class CharProblem {
        public static int howOld(final String herOld) {
            String numberOnly = herOld.replaceAll("[^0-9]", "");
            return Integer.parseInt(numberOnly);
        }
    }

    public class Clock {
        public static int Past(int h, int m, int s) {
            int milliSeconds = (h * 60 * 60 * 1000) + (m * 60 * 1000) + (s * 1000);
            return milliSeconds;
        }
    }

    public class AbbreviateTwoWords {
        public static String abbrevName(String name) {
            name = name.toUpperCase();
            String[] names = name.split(" ");
            return names[0].charAt(0) + "." + names[1].charAt(0);
        }
    }

    public class StringUtils {
        public static String toAlternativeString(String string) {
            int strLen;
            if (string == null || (strLen = string.length()) == 0) {
                return string;
            }
            StringBuffer buffer = new StringBuffer(strLen);
            char ch = 0;
            for (int i = 0; i < strLen; i++) {
                ch = string.charAt(i);
                if (Character.isUpperCase(ch)) {
                    ch = Character.toLowerCase(ch);
                } else if (Character.isTitleCase(ch)) {
                    ch = Character.toLowerCase(ch);
                } else if (Character.isLowerCase(ch)) {
                    ch = Character.toUpperCase(ch);
                }
                buffer.append(ch);
            }
            return buffer.toString();
        }
    }

    public class SmashWords {
        public static String smash(String words[]) {
            return String.join(" ", words);
        }
    }

    public class Kata8 {
        public static int[] between(int a, int b) {
            int list[] = new int[]{};
            for (int i = a; i <= b; i++) {
                int c = i++;
                list[i] = c;
            }
            return list;
        }
    }

    public class SaleHotdogs {
        public static int saleHotdogs(final int n) {
            int price = 0;
            if (n < 5) {
                price = n * 100;
            } else if (n >= 5 && n < 10) {
                price = n * 95;
            } else if (n >= 10) {
                price = n * 90;
            }
            return price;
        }
    }

    public class Kata9 {
        public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
            if (distanceToPump / fuelLeft <= mpg) {
                return true;
            } else return false;
            // return distanceToPump <= mpg * fuelLeft;
        }
    }

    public class isogram {
        public static boolean isIsogram(String str) {
            str = str.toLowerCase();
            int length = str.length();
            char array[] = str.toCharArray();

            Arrays.sort(array);
            for (int i = 0; i < length - 1; i++) {
                if (array[i] == array[i + 1])
                    return false;
            }
            return true;
        }
    }

    public class Kata10 {
        public static int squareSum(int[] n) {
            int sum = 0;
            for (int i = 0; i < n.length; i++) {
                sum += Math.pow(n[i], 2);
            }
            return sum;
        }
    }

    public class BouncingBall {

        public static int bouncingBall(double h, double bounce, double window) {
            if (h > 0 && bounce > 0 && bounce < 1 && window < h) {
                return 2 + bouncingBall((h * bounce), bounce, window);
            } else return -1;
        }
    }

    public class Solution3 {
        public static int[] twoSum(int[] numbers, int target) {
            int size = numbers.length;
            int[] result = new int[2];
            if (size < 2) {
                return new int[]{-1, -1};
            } else {
                for (int i = 0; i < size - 1; i++) {
                    for (int j = i + 1; j < size; j++) {
                        if ((target - numbers[i]) == numbers[j]) {
                            result[0] = i;
                            result[1] = j;
                        }
                    }
                }
            }
            return result;
        }
    }

    public class Goals {
        public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
            int sum = laLigaGoals + copaDelReyGoals + championsLeagueGoals;
            return sum;
        }
    }

    public class Paper {
        public static int paperWork(int n, int m) {
            if (n > 0 && m > 0) {
                return n * m;
            }
            return 0;
        }
    }

    public class Kata11 {
        public static int[] digitize(long n) {
            String numString = String.valueOf(n);
            int numArray[] = new int[numString.length()];
            int counter = 0;
            for (int i = numString.length() - 1; i >= 0; i--) {
                numArray[i] = Integer.valueOf(Character.toString(numString.charAt(counter++)));
            }
            return numArray;
        }
    }

    class Kata11_2_iterativeReverse {
        static int reverseDigits(int num) {
            int revNum = 0;
            while (num > 0) {
                revNum = revNum * 10 + num % 10;
                num = num / 10;
            }
            return revNum;
        }
    }

    class Kata11_2_recursiveReverse {
        static int revNum = 0;
        static int basePos = 1;

        static int reversDigits(int num) {
            if (num > 0) {
                reversDigits(num / 10);
                revNum += (num % 10) * basePos;
                basePos *= 10;
            }
            return revNum;
        }
    }

    public class GrassHopper {
        public static int summation(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            return sum;
        }
    }

    public class Solution_2 {
        public static String whoLikesIt(String... names) {
            int length = names.length;
            switch (length) {
                case 0:
                    return "no one likes this";
                case 1:
                    return names[0] + " likes this";
                case 2:
                    return names[0] + " and " + names[1] + " like this";
                case 3:
                    return names[0] + ", " + names[1] + " and " + names[2] + " like this";
                default:
                    return names[0] + ", " + names[1] + " and " + (length - 2) + " others like this";
            }
        }
    }

    public class Kata_12 {
        public static String highAndLow(String numbers) {
            String[] nums = numbers.split(" ");
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;
            for (String num : nums) {
                int current = Integer.parseInt(num);
                highest = Math.max(highest, current);
                lowest = Math.min(lowest, current);
            }
            return highest + " " + lowest;
        }
    }

    public class Kata_13 {
        public static int findShort(String s) {
            int min = 100;
            for (String str : s.split(" ")) {
                if (str.length() < min) {
                    min = str.length();
                }
            }
            return min;
        }
    }

    public class Calculate {
        public static String bmi(double weight, double height) {
            double bmi = weight / height / height;
            String result = "";
            if (bmi <= 18.5) {
                result = "Underweight";
            } else if (bmi <= 25.0) {
                result = "Normal";
            } else if (bmi <= 30.0) {
                result = "Overweight";
            } else result = "Obese";
            return result;
        }
    }

    public class Square {
        public static boolean isSquare(int n) {
            if (n < 0) {
                return false;
            }
            int i = 0;
            while (i * i < n) {
                i++;
            }
            return i * i == n;
        }
    }

    public class Printer {
        public static String printerError(String s) {
            int error = 0;
            for (char c : s.toCharArray()) {
                if (c < 'a' || c > 'm') {
                    error++;
                }
            }
            return error + "/" + s.length();
        }
    }

    public class Xbonacci {
        public double[] tribonacci(double[] s, int n) {
            double[] result = new double[n];
            for (int i = 0; i < n; i++) {
                if (s.length > i) {
                    result[i] = s[i];
                } else {
                    result[i] = result[i - 1] + result[i - 2] + result[i - 3];
                }
            }
            return result;
        }
    }

    public class Kata_14 {
        public class StringFormatter {
            public static String reverseWord(String str) {
                if (str.trim().isEmpty()) {
                    return str;
                }
                String words[] = str.split(" ");
                String reverseWord = "";
                for (String w : words) {
                    StringBuilder sb = new StringBuilder(w);
                    sb.reverse();
                    reverseWord += sb.toString() + " ";
                }
                return reverseWord.trim();
            }
        }
        public static String reverseWords(final String original) {
            return StringFormatter.reverseWord(original);
        }
    }

    public class NumberFun {
        public static long findNextSquare(long sq) {
            double a = Math.sqrt(sq);
            if (a % 1 == 0) {
                long b = (long) (a + 1);
                return b * b;
            } else return -1;
        }
    }

    public class Sequence {
        public static int[] reverse(int n) {
            int temp = n;
            int[] a = new int[n];
            for (int i = 0; i < temp; i++) {
                a[i] = n;
                n--;
            }
            return a;
        }
    }



}

