Feature: Login en SauceLab

  @test
  Scenario: Login exitoso a SauceLab

    Given que me enuentro en el login de la app SauceLab
    When ingreso las credenciales "standard_user" y "secret_sauce"
    And hago clic en Login
    Then muestra la interfaz de productos
    And valido que aparezca el título "PRODUCTS"
    And valido que al menos hay un item