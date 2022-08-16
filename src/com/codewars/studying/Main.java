package com.codewars.studying;

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


}

