print("Question 1")

old_list = [[1,'a',['cat'],2],[[[3]],'dog'],4,5]

print(f"Example Input: {old_list}")

def flatten(x):
	new_list = []
	for i in x:
		if type(i) == list:
			for j in i:
				if type(j) == list:
					for k in j:
						if type(k) == list:
							for l in k:
								new_list.append(l)
						else:
							new_list.append(k)
				else:
					new_list.append(j)
		else:
			new_list.append(i)
	return new_list

print(f"Result: {flatten(old_list)}")

print("------------")

print("Question 2")

numbers = [[1, 2], [3, 4], [5, 6, 7]]

print(f"Example Input: {numbers}")

def flat_n_rev(y):
	flat_list = flatten(y)
	flat_list.reverse()
	return flat_list

print(f"Result: {flat_n_rev(numbers)}")
