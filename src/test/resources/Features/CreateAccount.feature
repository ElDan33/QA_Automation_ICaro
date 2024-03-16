# language: es

  Característica: Crear cuenta
    @TEST-0001
    Escenario: Creación de cuenta válido
      Dado un usuario no registrado que desea crear una cuenta en la plataforma
      Cuando completa adecuadamente el formulario de registro
      Entonces la cuenta se crea satisfactoriamente

    @TEST-0002
    Escenario: Creación de cuenta no válido
      Dado un usuario no registrado que desea crear una cuenta en la plataforma
      Cuando completa no adecuadamente el formulario de registro
      Entonces el sistema muestra un mensaje de error al intentar crear la cuenta