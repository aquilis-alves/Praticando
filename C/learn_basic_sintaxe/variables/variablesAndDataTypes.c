#include <stdio.h>
#include <stdbool.h>

int main(void) {
    int number = 1;
    number = 2;
    printf("%d\n", number);

    float floatNumber = 2.5;
    printf("%.2f\n", floatNumber);

    char myChar = 'a';
    printf("%d, %c\n", myChar, myChar);

    int x = 1, y = 2, z = 3;
    printf("%d, %d, %d\n", x, y, z);

    const int numberConst = 5;
    printf("%d\n", numberConst);

    bool isProgrammingFun = true;
    printf("%d, %d\n",10 == 1 ,isProgrammingFun);

    return 0;
}