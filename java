function updateClock() {
    const clockElement = document.getElementById('clock');
    const now = new Date();
    const hours = now.getHours().toString().padStart(2, '0');
    const minutes = now.getMinutes().toString().padStart(2, '0');
    const seconds = now.getSeconds().toString().padStart(2, '0');
    const timeString = `${hours}:${minutes}:${seconds}`;
    clockElement.textContent = timeString;
}

// Atualize o relógio a cada segundo
setInterval(updateClock, 1000);

// Atualize o relógio imediatamente após o carregamento da página
updateClock();





