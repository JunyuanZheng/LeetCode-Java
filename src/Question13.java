public class Question13 {
    public int romanToInt(String s) {
        int result = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    result += 1;
                    break;
            }
        }

        if (s.contains("IV"))
            result -= 2;
        if (s.contains("IX"))
            result -= 2;
        if (s.contains("XL"))
            result -= 20;
        if (s.contains("XC"))
            result -= 20;
        if (s.contains("CD"))
            result -= 200;
        if (s.contains("CM"))
            result -= 200;

        return result;
    }
}
