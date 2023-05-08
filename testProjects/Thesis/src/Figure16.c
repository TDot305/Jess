int dummy(void){

	int i = 0;
	#ifdef ADD
		i++;
	#else
		i--;
	#endif

	printf(i);

}
