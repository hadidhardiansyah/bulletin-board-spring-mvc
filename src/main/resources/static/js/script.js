
document.getElementById("postForm").addEventListener("submit", function (e) {
    let isValid = true;

    // Validate Title
    const titleField = document.getElementById("title");
    const titleError = document.getElementById("titleError");
    if (!titleField.value.trim()) {
        titleError.style.display = "block";
        titleField.classList.add("is-invalid");
        isValid = false;
    } else {
        titleError.style.display = "none";
        titleField.classList.remove("is-invalid");
    }

    // Validate Author
    const authorField = document.getElementById("author");
    const authorError = document.getElementById("authorError");
    if (!authorField.value.trim()) {
        authorError.style.display = "block";
        authorField.classList.add("is-invalid");
        isValid = false;
    } else {
        authorError.style.display = "none";
        authorField.classList.remove("is-invalid");
    }

    // Validate Content
    const contentField = document.getElementById("content");
    const contentError = document.getElementById("contentError");
    if (!contentField.value.trim()) {
        contentError.style.display = "block";
        contentField.classList.add("is-invalid");
        isValid = false;
    } else {
        contentError.style.display = "none";
        contentField.classList.remove("is-invalid");
    }

    // Validate Password
    const passwordField = document.getElementById("password");
    const passwordError = document.getElementById("passwordError");
    if (passwordField.value.length < 6) {
        passwordError.style.display = "block";
        passwordField.classList.add("is-invalid");
        isValid = false;
    } else {
        passwordError.style.display = "none";
        passwordField.classList.remove("is-invalid");
    }

    // Prevent form submission if not valid
    if (!isValid) {
        e.preventDefault();
    }
});