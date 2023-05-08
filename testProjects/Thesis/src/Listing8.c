#ifdef ADDITION
#define func(x) x + 1
#else
#define func(x) x - 1
#endif

//Calculates something
int calc (int value){
	return func(value);
}
