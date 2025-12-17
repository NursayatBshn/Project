# Student Management System

This is a Java program for managing students and courses. It uses object-oriented programming with classes, encapsulation, and arrays of objects.

## Project Overview
The program creates Student objects with name, ID, major, GPA, and credits. It also has a Course class that holds students and calculates average GPA and highest credits. The main program shows all features with 5 students.

Main goals:
- Use private fields and getters/setters for encapsulation
- Work with arrays of Student objects
- Calculate student statistics
- Show Course composition with students

## Class Descriptions

### Student Class
**Private fields:**
- `name` (String) - full student name
- `id` (String) - student ID
- `major` (String) - academic program
- `gpa` (double) - current GPA
- `credits` (int) - total earned credits

**Constructor:** `Student(String name, String id, String major)` - sets GPA=0.0, credits=0

**Key methods:**
- `addCredits(int c)` - adds credits if c > 0
- `updateGPA(double newGPA)` - updates GPA
- `isHonors()` - returns true if GPA ≥ 3.5
- `toString()` - prints student info

### Course Class
**Private fields:**
- `courseName` (String)
- `instructor` (String)
- `students` (Student array)

**Constructor:** `Course(String courseName, String instructor, int size)`

**Key methods:**
- `addStudent(Student s, int index)` - adds student to array position
- `courseAverageGPA()` - calculates average GPA of students
- `highestCreditStudent()` - finds student with most credits
- `toString()` - shows course summary

## Instructions to Compile and Run
1. Open terminal in `src/` folder
2. Compile: `javac *.java`
3. Run: `java Main`

Expected output shows 5 students, top GPA student, honors count, total credits, and course info.

## Screenshots
[Program Output]

docs/screenshots/output.png:
```
Student: Qailau Marat (ID: 253696), Major: CS, GPA: 3.8, Credits: 15
Student: Palensgeev Tugenshe (ID: 252496), Major: SE, GPA: 3.2, Credits: 12
Student: Maqsat Oral (ID: 259685), Major: IT, GPA: 3.9, Credits: 18
Student: Tokashbek Kasym (ID: 258536), Major: ITM, GPA: 4.0, Credits: 20
Student: Qaisar Medeu (ID: 257593), Major: MT, GPA: 2.7, Credits: 10
Top GPA: Student: Tokashbek Kasym (ID: 258536), Major: ITM, GPA: 4.0, Credits: 20
Honors count: 3
Total credits: 75
Course: Java Programming by Prof.Aidana, Avg GPA: 3.5200000000000005
Top credits student: Student: Qailau Marat (ID: 253696), Major: CS, GPA: 3.8, Credits: 15
```

Вставь этот блок в конец README.md как отдельный раздел.

### UML Diagram

This project also includes a simple UML class diagram that shows the main structure of the system.  
The diagram focuses on the two main classes, `Student` and `Course`, and how they are related in the program.

The **`Student`** class is shown with private fields for `name`, `id`, `major`, `gpa`, and `credits`.  
It also includes public methods such as the constructor, getters and setters, `addCredits(int c)`, `updateGPA(double newGpa)`, `isHonors()`, and `toString()`.

The **`Course`** class is shown with private fields for `courseName`, `instructor`, and an array of `Student` objects called `students`.  
Its public methods include the constructor, `addStudent(Student s, int index)`, `courseAverageGPA()`, `highestCreditStudent()`, and `toString()`.

The diagram uses a **composition relationship** from `Course` to `Student`.  
This means that one course *contains* many students, which matches the Java code where `Course` stores a `Student[]` array.

The UML diagram is saved as `docs/uml-diagram.png` inside the project.  
It helps to visualize the object-oriented design of the student management system and makes the relationships between classes easier to understand.
## Reflection

I learned how encapsulation works with private fields and public methods. Getters and setters control access to student data safely.

The biggest challenge was working with arrays of objects and finding maximum values (GPA, credits). I fixed bugs like wrong variable names and code outside main method.

OOP makes code organized and reusable. Student class can be used in other programs. Course shows composition - one class contains many others.

This project helped me understand Java classes, loops, conditions, and Git workflow better.
