public class DRoot {

    public static int digital_root(int numberInt) {

        while (numberInt >= 10) {
            numberInt = calculateDigitsSum(numberInt);
        }
        return numberInt;
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
