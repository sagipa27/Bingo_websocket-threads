# bingoGame_Springboot-


Se requiere realizar el juego Bingo por medio del uso obligatorio de hilos y sockets. La herramienta de desarrollo puede ser Java, Python, c, node.js o visual studio en ambiente  web, consola o gráfico.
CLIENTES
 

Cada Columna del cartón oscila con un rango de números de la siguiente manera:
Letra B 1 – 15	Letra I 16 – 30	Letra N 31 - 45	Letra G 46 - 60	Letra O 61 - 75
Explicación del Juego:
- Se gana el juego al cantar BINGO.
- A cada participante, el servidor le produce un socket y le envía una cartilla con sus números impresos al azar o quemados (usar hilos). 
- Aleatoriamente el Servidor va generando al azar una balota con su respectiva letra ejemplo B12, G47 (números entre el 1 y el 75).
-Mostrar el avance del juego cuando acierta un número.
Se produce el mensaje BINGO cuando: 
1.	Todos los números de una fila corresponde a los números anteriormente dichos.
2.	 Todos los números de una columna corresponde a los números anteriormente dichos
