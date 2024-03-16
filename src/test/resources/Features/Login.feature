# language: es

  Característica: Login
    @TEST-1235
    Escenario: Login válido
      Dado que el ususario ingresa a la página de login
      Cuando el usuario se logea con credenciales válidas
      Entonces el usuario se encuentra en su cuenta

    @TEST-1236
    Escenario: Login inválido
      Dado que el ususario ingresa a la página de login
      Cuando el usuario se logea con credenciales no válidas
      Entonces el sitio lanza una advertencia de credenciales no válidas