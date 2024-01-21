package sequentialStructure.reverseOrderOfNumber;

public class ControlOfDigits {

    int numberOfDigits;

    private int whatNumberOfDigits(int number) {

        int numberOfDigits = 0;

        while (number != 0) {

            number = number / 10;

            numberOfDigits++;
        }

        return numberOfDigits;

    }

    void limitOfDigit (int limit, int number) {

        if (whatNumberOfDigits(number) != limit) {

            System.out.println("The code need a numbers of " +limit +" digits");
            System.exit(0);

        }

    }

}