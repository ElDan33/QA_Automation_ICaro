# language: es

  Característica: Login
    @TEST-LI001
    Escenario: Login válido
      Dado que el ususario ingresa a la página de login
      Cuando el usuario se logea con credenciales válidas
      Entonces el usuario se encuentra en su cuenta

    @TEST-LI002
    Escenario: Login inválido
      Dado que el ususario ingresa a la página de login
      Cuando el usuario se logea con credenciales no válidas
      Entonces el sitio lanza una advertencia de credenciales no válidas