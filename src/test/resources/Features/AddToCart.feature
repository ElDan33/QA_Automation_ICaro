# language: es

  Característica: Carrito
    @TEST-111
    Escenario: Agregar producto al carrito válido
      Dado que el usuario ingresa a la página de inicio
      Y el usuario se loguea en la aplicación
      Cuando el usuario agrega un producto al carrito
      Entonces se valida que se ha agregado el producto en el carrito