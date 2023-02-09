#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int slice, int n) {
    int answer = 1;
    while(slice * answer < n) {
        answer++;
    }
    return answer;
}