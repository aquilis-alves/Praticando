#include <stdio.h>

int main (void) {
    int myNumbers[4] = {0, 1, 2, 3};
    int i;
    myNumbers[0] = 6;

    for (i = 0; i != 4; i++) {
        printf("%d\n", myNumbers[i]);
    }
    

    return 0;
}