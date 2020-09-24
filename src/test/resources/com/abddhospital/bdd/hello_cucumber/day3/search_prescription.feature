Feature: Search for prescriptions
	Background:
	Given User is logged in as "jerry"
	And Following patients exist
	| patientId | patientName | mobile |
	| 12345 | Arun K | 9876543210 |
	| 67890 | Ram K | 8765432109 |
	| 78906 | Krish R | 7654321098 |
	| 23456 | Hari K | 6543210987 |
	And Following cases exist
	| patientId | caseNumber | caseDate | DrugName | dose |
	| 12345 | 2020092301 | 20200923 | Calpol | 6 hrly |
	| 67890 | 2020092301 | 20200923 | HCQ | 1-0-1 |
	| 78906 | 2020092301 | 20200923 | Erithromycin | 1-0-1 |
	| 23456 | 2020092301 | 20200923 | Koflet | 6 hrly |
	| 12345 | 2020092101 | 20200901 | HCQ | 1-0-1 |
	| 12345 | 2020092001 | 20200920 | Aspirin | 1-0-0 |
	
  Scenario: Search with Hong Kong Id and Case number
		Given user specifies HK Id as "12345"
		And Case number as "2020092301"
		When The user invokes search prescription
		Then User sees following prescription
		| patientId | caseNumber | caseDate | DrugName | dose |
		| 12345 | 2020092301 | 20200923 | Calpol | 6 hrly|
	
	@wip
  Scenario: Search with Hong Kong Id only
	
	@wip
  Scenario: Search with Case number only
	
	@wip
  Scenario: Search without Hong Kong Id and Case number
	
	@wip
  Scenario: Search with partial match should not happen for Hong Kong Id
	
	@wip
  Scenario: Search with partial match should not happen for Case number Id
    When Invoke search with input search criteria
    Then Matching prescriptions should be retreived
      | patientId | caseNumber | caseDate | DrugName | dose |
