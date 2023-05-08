
int dummy(void) {

#ifdef MOBILE
	height = width * 2;
	irrelevant = 42;
#else
	height = width * 0.5;
	irrelevant = -1;
#endif
printf("%f \n", height);

}
