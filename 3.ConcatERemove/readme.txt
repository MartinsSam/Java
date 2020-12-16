Class: ConcatERemove
Author: Samila Martins
Date: 12.2020

Purpose: 
	Check if the number of operations to change se initial string to desired string matches with the number provided by the user.

Function Arguments: 
	 * initial_str = Initial String 
	 * desired_str = Desired String
	 * number_of_operation = Number of allowed operations 

Methodology: 
	Check if the number of allowed operation is at least the double of initial_str
		If the condition returns true: (it indicates that is possible remove and add all characters from initial_str(if needed))
			Return the positive result('Sim')
		If condition return false:
			check if initial_str length is bigger than desired_str and get the difference(count_difference)
			else if check if desired_str is bigger than initial_str and get the difference(count_difference)
		
		Iterate(i) over the strings based on smallest string (initial_str or desired_str) --> We already got the difference and it means concat (1 operation per char)
			check if the char at position(i) of initial_str and desired_str are different. If it is the case add +2(1 remove/1 concat) on the count_difference var 
			
		In the end of iterator execution check if the the count_difference is bigger than  number_of_operation
			return the operation according to result (if bigger return(Não) else return (Sim))