function generaterandomnumber() {
    return Math.floor(Math.random() * 100) + 1;
}

let randomnumber = generaterandomnumber();
let attempts = 0;

function createConfetti() {
    const confettiContainer = document.getElementById("confettiContainer");
    const colors = ["#ff0000", "#00ff00", "#0000ff", "#ffff00", "#ff00ff", "#00ffff", "#ff8000", "#8000ff"];
    
    for (let i = 0; i < 50; i++) {
        const confetti = document.createElement("div");
        confetti.className = "confetti";
        confetti.style.left = Math.random() * 100 + "%";
        confetti.style.backgroundColor = colors[Math.floor(Math.random() * colors.length)];
        confetti.style.animationDelay = Math.random() * 0.5 + "s";
        confettiContainer.appendChild(confetti);
        
        // Clean up after animation
        setTimeout(() => {
            confetti.remove();
        }, 2500);
    }
}

function checkguess() {
    let userguess = document.getElementById("userguess").value.trim();
    let message = document.getElementById("message");
    let attemptsdisplay = document.getElementById("attempts");
    
    if (userguess < 1 || userguess > 100 || isNaN(userguess)) {
        message.textContent = "Please enter a valid number between 1 and 100!";
        message.style.color = "red";
        return;
    }
    
    userguess = Number(userguess);  // Convert to number for proper comparison
    attempts++;
    attemptsdisplay.textContent = "Attempts: " + attempts;
    
    // Remove previous animation
    message.classList.remove("win-animation");

    if (userguess === randomnumber) {
        message.textContent = "Congratulations! You guessed the number!";
        message.style.color = "green";
        message.classList.add("win-animation");
        createConfetti();
    } else if (userguess > randomnumber) {
        message.textContent = "Too high! Try again.";
        message.style.color = "red";
    } else {
        message.textContent = "Too low! Try again.";
        message.style.color = "red";
    }
}

function reset() {
    randomnumber = generaterandomnumber();
    attempts = 0;
    const message = document.getElementById("message");
    message.textContent = "";
    message.classList.remove("win-animation");
    document.getElementById("attempts").textContent = "Attempts: " + attempts;
    document.getElementById("userguess").value = "";
}