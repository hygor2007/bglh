function startCountdown(durationInSeconds) {
  const countdownElement = document.getElementById("countdown");
  let remainingTime = durationInSeconds;

  function updateCountdown() {
    const hours = Math.floor(remainingTime / 3600);
    const minutes = Math.floor((remainingTime % 3600) / 60);
    const seconds = remainingTime % 60;

    const formattedTime = `${String(hours).padStart(2, '0')}:${String(minutes).padStart(2, '0')}:${String(seconds).padStart(2, '0')}`;
    countdownElement.textContent = formattedTime;

    if (remainingTime <= 0) {
      countdownElement.textContent = "00:00:00";
      clearInterval(interval);
    } else {
      remainingTime--;
    }
  }

  updateCountdown();
  const interval = setInterval(updateCountdown, 1000);
}

startCountdown(43800); // Iniciar a contagem regressiva de 60 segundos
