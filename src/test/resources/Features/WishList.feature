# language: es

Característica: Lista de favoritos

  @TEST-FV001
  Escenario: Agregar producto a favoritos
    Dado que el usuario ingresa a la página de inicio
    Y el usuario se loguea en la aplicación
    Cuando el usuario agrega un producto a favoritos
    Entonces se valida que se agregó un producto en favoritos