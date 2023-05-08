
int dummy(void) {

	if (performance){
		value = calcFast(input);
	} else {
		value = calcPrecise(input);
	}

	return value;


}
