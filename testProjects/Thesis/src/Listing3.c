#define input 5
#define notRelevant 1
#define checkInput(x) x < 5

int dummy(void) {

//Check the input
#if (checkInput(input))
	printf("Input is smaller than 5");
#else
	printf("Input is greater or equal 5");
#endif


}
