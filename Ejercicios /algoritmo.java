Algoritmo calificacionCualitativa

	Definir calCuant Como Entero

	Definir calCualt Como cadena

	//datos de entrada

	Escribir "Ingrese la nota numerica:"

	Leer calCuant

	//Proceso

	Segun calCuant hacer

		10:calCualt="A"

		9:calCualt="B"

		8:calCualt="C"

		7 o 6:calCualt="D"

		5 o 4 o 3 o 2 o 1 o 0:calCualt="F"

		De Otro Modo:
			Escribir "La nota no esta entre las opciones existentes"
	FinSegun

	//Datos de Salida

	Escribir "La calificacion cualitativa de ", calCuant, " Es: ", calCualt
	
FinAlgoritmo