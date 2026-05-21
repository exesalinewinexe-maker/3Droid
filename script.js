// Console message (for devs)
console.log("3Droid website loaded successfully");

// Smooth scroll for internal links (future‑proof)
document.querySelectorAll('a[href^="#"]').forEach(link => {
    link.addEventListener("click", function(e) {
        e.preventDefault();
        const target = document.querySelector(this.getAttribute("href"));
        if (target) {
            target.scrollIntoView({ behavior: "smooth" });
        }
    });
});

// Button click animation
const downloadBtn = document.querySelector(".btn");
if (downloadBtn) {
    downloadBtn.addEventListener("click", () => {
        downloadBtn.style.transform = "scale(0.95)";
        setTimeout(() => {
            downloadBtn.style.transform = "scale(1)";
        }, 150);
    });
}

// Fade‑in animation on load
document.addEventListener("DOMContentLoaded", () => {
    document.body.style.opacity = "0";
    setTimeout(() => {
        document.body.style.transition = "opacity 0.6s ease";
        document.body.style.opacity = "1";
    }, 50);
});