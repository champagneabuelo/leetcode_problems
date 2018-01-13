int getLength(char* s) {
    int length = 0;
    while (s[length] != '\0') {
        length += 1;
    }
    return length;
}

char* reverseString(char* s) {
    int length = strlen(s);
    char* result = malloc(length*sizeof(char*));
    int i;
    for (i = 0; i < length; i++) {
        result[i] = s[length-i-1];
    }
    result[length] = '\0';
    return result;
}
