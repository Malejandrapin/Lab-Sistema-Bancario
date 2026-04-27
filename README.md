# Laboratorio Sistema Bancario 

Preguntas: ¿por qué fue necesario usar CuentaBancaria como tipo de variable en lugar de cada tipo específico? ¿Qué ventaja concreta te dio eso?\
Respuesta: Fue necesario usar CuentaBancaria como tipo de variable para poder aplicar el polimorfismo, usando el padre vamos a poder tratar diferentes objetos en nuestro caso ahorros, corriente, inversión

La ventaja es la flexibilidad y el mantenimiento del código. Si el banco decide más adelante agregar un cuarto tipo de cuenta, por ejemplo CuentaNomina, el código Main va a seguir funcionando sin cambios
