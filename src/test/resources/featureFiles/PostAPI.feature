Feature: Verify the Get Post API endpoint
  Scenario Outline: Get all posts from the API
    Given Get call to "<url>"
    Then Response is "<statusCode>"
    Examples:
      | url    | statusCode |
      | /posts | 200        |