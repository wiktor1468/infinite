import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



//zd2
class Numbers {
        public static void numbers(String text) {
            List<Integer> numbers = new ArrayList<Integer>();

            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                numbers.add(Integer.valueOf(matcher.group()));
            }
            //str to char to get last char
            char lastChar = text.charAt(text.length() - 1);
            int result = 0;
            if (lastChar == '-') {
                for (int i = 0; i < numbers.size(); i++) {
                    result = result - numbers.get(i);
                }
                System.out.println(result);

            } else if (lastChar == '+') {
                for (int i = 0; i < numbers.size(); i++) {
                    result = result + numbers.get(i);
                }
                System.out.println(result);
            } else if (lastChar == '*') {
                result = 1;
                for (int i = 0; i < numbers.size(); i++) {

                    result = result * numbers.get(i);
                }
                System.out.println(result);
            } else {
                System.out.println("Invalid last char");
                System.out.println(numbers);
            }

        }
    }
public class zd2 {
    public static void main(String[] args) {


        //zd2
        Numbers.numbers("12,10*");
    }

}
