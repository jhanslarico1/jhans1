Algoritmo identificarNumeroMayor
	Definir num1, num2, num3, numMayor Como Real
	//datos de entrada
	Escribir "Ingrese 3 valores numericos:"
	Leer num1, num2, num3
	//Proceso
	si num1>num2 y num1>num3 Entonces
		numMayor=num1
	sino si num2>num1 y num2>num3 entonces
			numMayor=num2
		SiNo
			numMayor=num3
		Finsi	
	FinSi
	//datos de salida
	Escribir "El numero mayor es:", numMayor
FinAlgoritmo