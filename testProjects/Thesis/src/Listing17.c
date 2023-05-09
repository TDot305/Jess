#define dprint(x) printf("\n%s at %s:%i is %i",#x,__FILE__,__LINE__,x)

int compute(int value){
    value = value * value;
#ifdef DEBUG
    dprint(value);
#endif
    printf("Computation complete");
    return value;
}
