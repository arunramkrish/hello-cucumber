Feature: Search for prescriptions
	#Background with logged in user, patient records, sample prescription records
	
  Scenario: Search with Hong Kong Id and Case number
		Given user specifies HK Id as "12345"
		And Case number as "2020092301"
		When The user invokes search prescription
		Then User sees following prescription
		| patientId | caseNumber | caseDate | DrugName | dose |
		| 12345 | 2020092301 | 20200923 | Calpol | 6 hrly|
		
  Scenario: Search with Hong Kong Id only

  Scenario: Search with Case number only

  Scenario: Search without Hong Kong Id and Case number

  Scenario: Search with partial match should not happen for Hong Kong Id

  Scenario: Search with partial match should not happen for Case number Id
    When Invoke search with input search criteria
    Then Matching prescriptions should be retreived
      | patientId | caseNumber | caseDate | DrugName | dose |
