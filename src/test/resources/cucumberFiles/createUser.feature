Feature: User

  Scenario:Create user


    Given yo no me autentico
    When envio POST request a la /api/user.json con el body
"""
    {
      "Email":"testing@upb.com",
      "FullName":"test",
      "Password":"123"
    }
    """
    Then el codigo de respuesta deberia ser 200
    And el expected body deberia ser
"""
    {
        "Id": "IGNORE",
        "Email": "testing@upb.com",
        "Password": "IGNORE",
        "FullName": "test",
        "TimeZone": 0,
        "IsProUser": false,
        "DefaultProjectId": "IGNORE",
        "AddItemMoreExpanded": false,
        "EditDueDateMoreExpanded": false,
        "ListSortType": 0,
        "FirstDayOfWeek": 0,
        "NewTaskDueDate": -1,
        "TimeZoneId": "IGNORE"
    }
    """
    And el atributo Email deberia ser testing@upb.com