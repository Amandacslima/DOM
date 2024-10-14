document.getElementById("modificar-frases").addEventListener("click", function() {
    var frases = document.getElementsByClassName("mensagem1");

    for (var i = 0; i < frases.length; i++) {
        frases[i].textContent = "Frase modificada " + (i + 1);
    }
});
