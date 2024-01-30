#include <stdio.h>

int main (void) {
    char hello[] = "Hello, world!";
    char hello2[] = {'H', 'l', 'l', 'o', '\0'};
    hello[7] = 'W';

    int length = sizeof(hello) / sizeof(hello[0]);

    for (int i = 0; i < length; i++) {
        printf("%c\n", hello[i]);
    }

    return 0;
}