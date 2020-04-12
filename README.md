# ProducerConsumer
Producer / Consumer problem in java

# Cuantos consumidores se necesitan para que el productor llegue a 0?

No importa cuantos consumidores tengas, al flaguearse como habilitado y no habilitado, solo uno podra tomar, y luego el productor podra volver a producir. Es decir nunca llegaras a 0.

# Por que hay bloques synchronized?

Para reservar espacios de memoria.
Hasta que un metodo synchronized termine de usar esos espacios, ningun otro hilo puede tocarlo.
El recurso compartido en este caso, es la cerveza.

# Cuales son las 3 formas de instanciar un  threads?

- Heredando la clase thread.
- Implementando la interfaz Runable.
