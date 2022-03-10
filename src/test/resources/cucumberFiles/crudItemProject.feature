Feature: Item

  Scenario: create read update delete Item


    Given yo uso la authenticacion basica
    When envio POST request a la /api/projects.json con el body
    """
    {
      "Content":"MyProject2",
      "Icon":"6"
    }
    """
    Then el codigo de respuesta deberia ser 200
    And el expected body deberia ser
    """
    {
        "Id": "IGNORE",
        "Content": "MyProject2",
        "ItemsCount": 0,
        "Icon":6,
        "ItemType": 2,
        "ParentId": null,
        "Collapsed": false,
        "ItemOrder": "IGNORE",
        "Children": [
        ],
        "IsProjectShared": false,
        "ProjectShareOwnerName": null,
        "ProjectShareOwnerEmail": null,
        "IsShareApproved": false,
        "IsOwnProject": true,
        "LastSyncedDateTime": "IGNORE",
        "LastUpdatedDate": "IGNORE",
        "Deleted": false,
        "SyncClientCreationId": null
    }
    """
    And guardo el Id de la respuesta en ID_PROJ

    When envio POST request a la /api/items.json con el body
    """
        "ItemContent":"MyItem1"
    """
    Then el codigo de respuesta deberia ser 200
    And el expected body deberia ser
    """
{
    "Id": "IGNORE",
    "Content": "MyItem1",
    "ItemType": 1,
    "Checked": false,
    "ProjectId": null,
    "ParentId": null,
    "Path": "",
    "Collapsed": false,
    "DateString": null,
    "DateStringPriority": 0,
    "DueDate": "",
    "Recurrence": null,
    "ItemOrder": null,
    "Priority": 4,
    "LastSyncedDateTime": "IGNORE",
    "Children": [],
    "DueDateTime": null,
    "CreatedDate": "IGNORE",
    "LastCheckedDate": null,
    "LastUpdatedDate": "IGNORE",
    "Deleted": false,
    "Notes": "",
    "InHistory": false,
    "SyncClientCreationId": null,
    "DueTimeSpecified": true,
    "OwnerId": "IGNORE"
}
    """
    And guardo el Id de la respuesta en ID_ITEM


    When envio GET request a la /api/items/ID_ITEM.json con el body
    """
    """
    Then el codigo de respuesta deberia ser 200
    And el expected body deberia ser
    """
    {
    "Id": "IGNORE",
    "Content": "MyItem1",
    "ItemType": 1,
    "Checked": false,
    "ProjectId": null,
    "ParentId": null,
    "Path": "",
    "Collapsed": false,
    "DateString": null,
    "DateStringPriority": 0,
    "DueDate": "",
    "Recurrence": null,
    "ItemOrder": null,
    "Priority": 4,
    "LastSyncedDateTime": "IGNORE",
    "Children": [],
    "DueDateTime": null,
    "CreatedDate": "IGNORE",
    "LastCheckedDate": null,
    "LastUpdatedDate": "IGNORE",
    "Deleted": false,
    "Notes": "",
    "InHistory": false,
    "SyncClientCreationId": null,
    "DueTimeSpecified": true,
    "OwnerId": "IGNORE"
}
    """

    When envio PUT request a la /api/items/ID_ITEM.format con el body
    """
    {
      "Content":"MyItemUpdate"
    }
    """

    Then el codigo de respuesta deberia ser 200
    And el atributo Content deberia ser MyItemUpdate

    When envio DELETE request a la /api/items/ID_ITEM.format con el body
    """
    """
    Then el codigo de respuesta deberia ser 200
    And el atributo Content deberia ser MyItemUpdate