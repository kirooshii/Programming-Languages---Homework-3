#include <stdio.h>

// using conditional expessions
int main() {
    for (int i = 1; i <= 100; i++) {
        (i % 3 == 0 && i % 5 == 0) ? printf("FizzBuzz\n") :
        (i % 3 == 0) ? printf("Fizz\n") :
        (i % 5 == 0) ? printf("Buzz\n") :
        printf("%d\n", i);
    }
    return 0;
}
