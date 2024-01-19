public class ControlOfDigits {

    int numberOfDigits;

    int whatNumberOfDigits(int number) {

        int numberOfDigits = 0;

        while (number != 0) {

            number = number / 10;

            numberOfDigits++;
        }

        return numberOfDigits;

    }

    void limitOfDigit (int limit, int numberOne, int numberTwo, int numberThree) {

        int numbersArray = {numberOne, numberTwo, numberThree}

        for (int numbers : numbersArray) {

            System.out.println("The program requires number of " + limit + " digits");
            System.exit(0);
            
        }

    }

}
