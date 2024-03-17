# language: es

  Característica: Crear cuenta
    @TEST-CA001
    Escenario: Creación de cuenta válido
      Dado un usuario no registrado que desea crear una cuenta en la plataforma
      Cuando completa adecuadamente el formulario de registro
      Entonces la cuenta se crea satisfactoriamente

    @TEST-CA002
    Escenario: Creación de cuenta no válido 1
      Dado un usuario no registrado que desea crear una cuenta en la plataforma
      Cuando no completa adecuadamente el campo de email
      Entonces el sistema muestra un mensaje de error en el campo de email

    @TEST-CA003
    Escenario: Creación de cuenta no válido 2
      Dado un usuario no registrado que desea crear una cuenta en la plataforma
      Cuando ingresa un mail ya existente
      Entonces el sistema muestra un mensaje de alerta de mail ya registrado

    @TEST-CA004
    Escenario: Creación de cuenta no válido 3
      Dado un usuario no registrado que desea crear una cuenta en la plataforma
      Cuando ingresa una password incorrecta
      Entonces el sistema muestra un mensaje de error en el campo de password

    @TEST-CA005
    Escenario: Creación de cuenta no válido 4
      Dado un usuario no registrado que desea crear una cuenta en la plataforma
      Cuando no acepta los términos y condiciones de la plataforma
      Entonces el sistema muestra un mensaje alertando que debe aceptar los términos de la plataforma