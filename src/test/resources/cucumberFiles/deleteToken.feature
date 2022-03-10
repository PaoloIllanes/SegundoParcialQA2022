Feature: Token

  Scenario: borrar token


    Given yo uso la authenticacion token
    When envio DELETE request a la /api/authentication/token.json con el body
    Then el codigo de respuesta deberia ser 200
    And el expected body deberia ser
    """

{
    "TokenString": "5782f5f0a9a24aae81aa9c17462f012d",
    "UserEmail": "ui@upb.com",
    "ExpirationTime": "IGNORE"
  }

    """
