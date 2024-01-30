#include <stdio.h>

int main (void) {
    int myArray[] = {0, 1, 2, 3, 4, 5};
    printf("%lu\n", sizeof(myArray));

    int size = sizeof(myArray) / sizeof(myArray[0]);
    printf("%d\n", size);

    for (int i = 0; i < size; i++) {
        printf("%d\n", myArray[i]);
    }

    return 0;
}