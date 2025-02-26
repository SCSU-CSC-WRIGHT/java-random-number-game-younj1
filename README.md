# java-random-number-game

# Guess the Number

The **“Guess the Number”** game is a classic interactive game in which the program randomly generates a number, and the user tries to guess it. The game provides feedback based on the player's guesses, such as whether the guess is too high or too low, until they guess correctly or exhaust their attempts.

This assignment focuses on building a simple, interactive console-based application in Java.

---

## 🎯 Objective
Build a console-based "Guess the Number" game where the program selects a random number, and the user must guess it within a limited number of attempts.

---

## 📌 Step-by-Step Instructions

### 1⃣ Prompt the user to Select a difficulty level and then generate the respective random number.
   - **Easy:** 1-50
   - **Medium:** 1-100
   - **Hard:** 1-500

Generate a Random Number
Use the `Random` class in Java to generate a random number within a predefined range (e.g., 1 to 100).

**Example Code:**
```java
import java.util.Random;

Random random = new Random();
int randomNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
```

---

### 2⃣ Prompt the User for Input
Use `Scanner` to get input from the user. Ask the player to guess a number within the range.

**Example Code:**
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.print("Guess a number between 1 and 100: ");
```

---

### 3⃣ Implement Game Logic with score tracking
- Keep track of how many guesses it took and display a score based on the number of attempts used.
- Compare the user’s guess with the randomly generated number.
- Provide feedback:
  - If the guess is **too high**, print `"Too high!"`
  - If the guess is **too low**, print `"Too low!"`
  - If the guess is **correct**, print `"Congratulations! You guessed the number!"`
- Limit the number of attempts (e.g., **5 or 10 guesses**).

---

### 4⃣ Endgame Logic
- If the user **guesses the number correctly**, print a congratulatory message.
- If the user **exhausts the number of attempts**, reveal the correct number and end the game.

**Example Output:**
```
Congratulations! You guessed the number in 4 attempts!
```
**OR**
```
Sorry, you've run out of attempts! The number was 57.
```

---

## 📝 Submission Guidelines/Options
- **Blackboard** Submit screenshots of gameplay via Blackboard along with the .java source file(s) of the game.
- **GitHub Classroom** Complete all work in the assigned GitHub Classroom.
- **Email** Zip the Java package and email it to me.

---

By following this guide, you will build a fun and engaging **Java console-based game** that reinforces fundamental programming concepts! 🎮🚀

