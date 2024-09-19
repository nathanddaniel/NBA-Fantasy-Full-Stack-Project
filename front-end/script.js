const hamburger = document.getElementById('hamburger');
const navIcons = document.getElementById('nav-icons');

hamburger.addEventListener('click', () => {
    navIcons.classList.toggle('active');
});