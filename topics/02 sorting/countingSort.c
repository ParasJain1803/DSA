#include <stdio.h>
#include <stdlib.h>

void counting_sort(int A[], int B[], int n, int k) {
    int C[k + 1];
    int i, j;

    for (i = 0; i <= k; i++) {
        C[i] = 0;
    }

    for (j = 0; j < n; j++) {
        C[A[j]]++;
    }

    for (i = 1; i <= k; i++) {
        C[i] += C[i - 1];
    }

    for (j = n - 1; j >= 0; j--) {
        B[C[A[j]] - 1] = A[j];
        C[A[j]]--;
    }
}

int main() {
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int *A = (int *)malloc(n * sizeof(int));
    int *B = (int *)malloc(n * sizeof(int));

    if (A == NULL || B == NULL) {
        printf("Memory allocation failed\n");
        return 1;
    }

    printf("Enter %d integers:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &A[i]);
    }

    int k = A[0];
    for (int i = 1; i < n; i++) {
        if (A[i] > k) {
            k = A[i];
        }
    }

    counting_sort(A, B, n, k);

    printf("Sorted array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", B[i]);
    }
    printf("\n");

    return 0;
}
