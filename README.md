# BMICalculator
This calculator will calculate a person's Body Mass Index (BMI) based on a user's weight and height and determines if the user is underweight, normal weight, overweight, or obese according to standard BMI categories.

 BMI Calculator

A simple Java program that calculates and classifies a user's Body Mass Index (BMI) based on their weight (in pounds) and height (in feet and inches).

📋 Features

- Accepts user input for weight and height.
- Calculates BMI using the US customary formula.
- Outputs the BMI value rounded to two decimal places.
- Classifies the BMI into standard categories:
  - Underweight
  - Normal weight
  - Overweight
  - Obese

 🛠️ How It Works

The BMI is calculated using the following formula:

\[
\text{BMI} = \left( \frac{\text{weight in pounds}}{(\text{height in inches})^2} \right) \times 703
\]

💻 Usage

1. Compile the program:

```bash
javac BmiCalculator.java
```

2. Run the program:

```bash
java BmiCalculator
```

3. Follow the prompts to enter:
   - Your weight in pounds
   - Your height in feet and inches

4. Receive your BMI value and category classification.

📦 Example

```
Enter your weight in pounds (lbs): 150
Enter your height in feet: 5
Enter your height in inches: 7
Your BMI is: 23.49
Category: Normal weight
```
 📄 Code Structure

- **Weight Input**: Takes weight from the user in pounds.
- **Height Input**: Takes height in feet and inches and converts it to total inches.
- **BMI Calculation**: Uses the US formula to calculate BMI.
- **Category Output**: Classifies the BMI into standard health categories.

 🧹 Requirements

- Java JDK 8 or later

 📚 Future Improvements

- Allow input in metric units (kilograms and meters).
- Add input validation for non-numeric or negative values.
- Create a graphical user interface (GUI) version.
