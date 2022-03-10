Feature: User

  Scenario:Update user


    Given yo uso la authenticacion basica


    When envio PUT request a la /api/user/0.json con el body
      """
          {
            "Email":"testUpdate12345@upb.com",
            "Password":"12345"
          }
          """
    Then el codigo de respuesta deberia ser 200
    And el expected body deberia ser
      """
             {
              "Id": "IGNORE",
              "Email": "testUpdate12345@upb.com",
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


    And el atributo Email deberia ser testUpdate12345@upb.com