# Guess the Number Game

A simple, interactive, and fun web-based game where players try to guess a randomly generated number between 1 and 100. Built using fundamental web development technologies.

## Features

- **Random Number Generation**: A new number between 1 and 100 is generated every game.
- **Input Validation**: Prevents invalid inputs (empty fields, non-numbers, or numbers out of bounds).
- **Live Feedback**: Real-time hints telling you if your guess is "Too high!" or "Too low!".
- **Attempt Tracker**: Keeps score by tracking how many tries it takes to win.
- **Victory Celebration**: Includes custom visual win-animations and a colorful, dynamic confetti burst upon a correct guess.
- **Instant Reset**: Reset button to quickly start a new game with zero hassle.

## Tech Stack

- **HTML5**: Structured interface elements and layout containers.
- **CSS3**: Layout styling, typography, responsively centered design, and win animations.
- **JavaScript (ES6+)**: Core game logic, custom DOM manipulations, input handling, and math calculations.

##  File Structure

Ensure your project files are organized like this in your repository:
```text
├── index.html          # Game structure and UI elements
├── style.css           # Custom styling and confetti animations
└── script.js           # Core game engine (contains your Javascript functions)
```

## How to Run Locally

1. **Clone the repository**:
   ```bash
   git clone https://github.com
   ```
2. **Navigate into the folder**:
   ```bash
   cd your-repo-name
   ```
3. **Launch the game**:
   - Double-click `index.html` to open it directly in your browser.
   - Alternatively, open the directory using an editor like VS Code and use the **Live Server** extension.

##  Code Highlights

This project utilizes custom DOM rendering to generate interactive canvas-free confetti animations on the fly. 
When a user wins, the `createConfetti()` function dynamically generates individual colored elements, appends CSS delay variables, 
and cleans up the browser DOM automatically after 2.5 seconds to maintain high performance.

## 📝 License

This project is open-source and free to modify or distribute. Happy coding!
