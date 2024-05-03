import pandas as pd
#Load_data
df = pd.read_csv('Employees.csv')
#Remove_duplicate
df = df.drop_duplicates()
#Remove decimal places in the Age
df['Age'] = df['Age'].astype(int)

#Convert the USD salary to EGP
df['Salary(EG)'] = df['Salary(USD)'] * 50

#Average age
print("Average age:", df['Age'].mean())

#Median Salaries
print("Median salary:", df['Salary(USD)'].median())

#Ration between males and female employees
male_count = df['Gender'].value_counts().get('M', 0)
female_count = df['Gender'].value_counts().get('F', 0)
print("Male to Female ratio:", male_count / female_count if female_count != 0 else "No female employees")

#write the data in a new CSV file
df.to_csv('NewData.csv', index=False)
