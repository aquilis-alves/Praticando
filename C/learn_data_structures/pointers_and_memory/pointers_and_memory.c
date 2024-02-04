#include <stdio.h>

int main (void) {
    int myAge = 16;
    int* pointer = &myAge;

    printf("%d\n", myAge);
    printf("%p\n", &myAge);
    printf("%p\n", pointer);
    printf("%d\n", *pointer);

    int myNumbers[6] = {10, 11, 12, 13, 14, 15};
    int *pointerNumbers = myNumbers;

    for (int i = 0; i < 6; i++) {
        printf("%d\n", *(pointerNumbers + i));
    }

    printf("%p\n", myNumbers);
    printf("%p\n", &myNumbers[0]);
    printf("%d\n", *(myNumbers + 3));

    return 0;
}