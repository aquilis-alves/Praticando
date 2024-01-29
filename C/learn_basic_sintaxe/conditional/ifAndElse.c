#include <stdio.h>

int main (void) {
    int time = 22;

    if (time < 10) {
        printf("Good morning\n");
    } else if (time < 20) {
        printf("Good dayzn");
    } else {
        printf("Good evening\n");
    }

    int num1 = 10;
    int num2 = 20;

    (num1 == num2) ? printf("numbers is equals\n") : printf("numbers is different\n");

    return 0;
}