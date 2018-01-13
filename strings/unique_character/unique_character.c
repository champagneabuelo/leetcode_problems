typedef struct {
    char letter;
    int count;
    int index;
} Map;

Map createNew(char l, int c, int i) {
    Map m;
    m.letter = l;
    m.count = c;
    m.index = index;
    
    return m;
}

char getLetter(Map* m) {
    return m->letter;
}

int getCount(Map* m) {
    return m->count;
}

void setCount(Map* m, int val) {
    m->count = val;
}

char getIndex(Map* m) {
    return m->index;
}

int containsKey(Map* m, char match, int length) {
    int i;
    for (i = 0; i < length; i++) {
        Map currentMap = m[i];
        if (getLetter(&currentMap) == match) {
            return i;
        }
    }
    return -1;
}

int stringLength(char* s) {
    int i = 0;
    while (s[i] != '\0') {
        i += 1;
    }
    return i;
}

int firstUniqChar(char* s) {
    Map* occurences = malloc(26*sizeof(Map));
    int mapLength = 0;
    int length = stringLength(s);
    int i;
    
    for (i = 0; i < length; i++) {
        char currentChar = s[i];
        if (containsKey(occurences, currentChar, mapLength) != -1) {
            
        } else {
            occurences[mapLength] = createNew(currentChar, 1, i);
            mapLength += 1;
        }
    }
    
    for (i = 0; i < mapLength; i++) {
        Map current = occurences[i];
        printf("%s, %d, %d", getLetter(&current), getCount(&current), getIndex(&current));
    }
    
    
    
    return -1;
}
