#include <stdio.h>
#include <string.h>

int main (void) {
    char stringAlphabet[50] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    printf("%lu\n", strlen(stringAlphabet));
    printf("%lu\n", sizeof(stringAlphabet));

    char hello[] = "hello, ";
    char world[] = "world";

    strcat(hello, world);
    printf("%s\n", hello);

    char helloWorld[20] = "Hello, World!";
    char copy[20];

    strcpy(copy, helloWorld);
    printf("%s\n", copy);

    printf("%d\n", strcmp(hello, world));
    printf("%d\n", strcmp(helloWorld, copy));

    return 0;
}