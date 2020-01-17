# Test Cases:
 

- When a "GET" request is made with valid query parameters, then the response Status Code should be 200 
(Included in automation for PET,STORE & USER).
- Validate the response schema
 
(Included in automation for PET,STORE & USER). 
- Validate that the "POST" request are successfully by checking asserting on status code
 
(Included in automation for PET,STORE & USER) .
- Validate that the data sent in request body of the "POST" request is retrieved when a "GET" call is made
 
- Validate that when "DELETE" request is made with valid query parameters, corresponding entry should get deleted.
(Included in automation for PET,STORE & USER) 
 
- Validate when a "GET" request is made,then the response should have required fields.
 
- Validate "PUT" request updates the data.
(Included in automation for PET,STORE & USER) 
- Validate "GET" request for inventories for Store order.
- Validate the service behavior when required parameter is - `null`-,`empty`
 ,INVALID  (will ensure that it should be covered in Integration test thats why not included in E2E test).
- validate the service for User Login (for user only)
- Validate the service for User Loggedout (for user only)
- Validate the service for PET upload image (will ensure that it should be covered in Integration test thats why not included in E2E test).