public class DRoot {

    public static int digital_root(int numberInt) {

        int dig = calculateDigitsSum(numberInt);
        String digString = Integer.toString(dig);

        while (digString.length() > 1) {
            dig = calculateDigitsSum(dig);
            digString = Integer.toString(dig);
        }

        return dig;
    }

    public static int calculateDigitsSum(int num){

        String number = Integer.toString(num);
        int sum = 0;

        for(int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            sum += digit;
        }

        return sum;
    }

}
