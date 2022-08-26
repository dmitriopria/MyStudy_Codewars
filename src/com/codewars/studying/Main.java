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





}

