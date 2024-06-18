#include <stdio.h>
#include <stdlib.h>

// Node structure for the list
typedef struct Node {
    int data;
    struct Node* next;
} Node;

// List structure
typedef struct {
    Node* head;
} List;

// Function to initialize the list
void initList(List* list) {
    list->head = NULL;
}

#ifdef ADD_FEATURE
// Function to add an element to the list
void addElement(List* list, int data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->next = list->head;
    list->head = newNode;
}
#endif

#ifdef REMOVE_FEATURE
// Function to remove an element from the list
void removeElement(List* list, int data) {
    Node* current = list->head;
    Node* previous = NULL;
    while (current != NULL && current->data != data) {
        previous = current;
        current = current->next;
    }
    if (current != NULL) {
        if (previous == NULL) {
            list->head = current->next;
        } else {
            previous->next = current->next;
        }
        free(current);
    }
}
#endif

#ifdef PRINT_FEATURE
// Function to print all elements in the list
void printList(List* list) {
    Node* current = list->head;
    while (current != NULL) {
        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}
#endif

int main() {
    List list;
    initList(&list);

    #ifdef ADD_FEATURE
    addElement(&list, 1);
    addElement(&list, 2);
    addElement(&list, 3);
    #endif

    #ifdef PRINT_FEATURE
    printf("List after adding elements:\n");
    printList(&list);
    #endif

    #ifdef REMOVE_FEATURE
    removeElement(&list, 2);
    #endif

    #ifdef PRINT_FEATURE
    printf("List after removing element 2:\n");
    printList(&list);
    #endif

    return 0;
}

