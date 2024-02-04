function contar (){

    var inicio = window.document.getElementById("txtn1");
    var fim = window.document.getElementById('txtn2')
    var passo = window.document.getElementById('txtn3')
    var res = window.document.getElementById("res")

    if( inicio.value.length == 0||fim.value.length == 0|| passo.value.length == 0){
        res.innerHTML = `[ERRO] Impossível contar!`
    } else {
        res.innerHTML = 'Contando: <br>'
        var i = Number(inicio.value)//inicio
        var f = Number(fim.value)//fim
        var p = Number(passo.value)//passos

        if( p <= 0|| p > f ){
            window.alert('Passo Inválido! Considerando PASSO 1')
            p = 1
        }
        
        if( i < f){
            for(c = i; c <= f;  c +=p){
                res.innerHTML +=` ${c}  \u{1F449} `
            }
        }else{
            for(c =i; c >= f ; c-=p){
                res.innerHTML += ` ${c} \u{1F449} `
            }
        }

        res.innerHTML +=`\u{1F3C1}`
    }
}

