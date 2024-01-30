#include <stdio.h>

int main (void) {
    int matrix[2][3] = {{1, 9, 3}, {4, 5, 6}};
    matrix[0][1] = 2;

    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            printf("%d\n", matrix[i][j]);
        }
    }

    return 0;
}