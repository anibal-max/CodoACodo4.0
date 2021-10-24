

function calcularResumen(){
    let cantidad = document.getElementById("cantidad").value
    let categoria = document.getElementById("categoria").value
    let descuento = 0
    let resultado
    let precio = 200
    switch(categoria){
        case "1":
            descuento = 80;
            break;
        case "2":
            descuento = 50;
            break;
        case "3":
            descuento = 15;
            break;
    }
    resultado = cantidad * (precio - precio*descuento/100)
    console.log(cantidad)
    console.log(categoria)  
    console.log(descuento)
    document.getElementById("resultTotal").innerText = resultado
};

function borrarCampos(){
    document.getElementById("nombre").value = ""
    document.getElementById("apellido").value = ""
    document.getElementById("correo").value = ""
    document.getElementById("cantidad").value = ""
    document.getElementById("categoria").value = 1
    document.getElementById("resultTotal").innerText = ""

}