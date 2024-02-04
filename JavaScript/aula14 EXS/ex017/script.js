function tabuada(){
    var num = window.document.getElementById("txtnumero");
    var tabuada = window.document.getElementById("seltab")

    /*if( num.value.length == 0){
        window.alert('Por favor, digite um número')
    }else{
        var n = Number(num.value)
        var c = 1
        tabuada.innerHTML = ''

        while(c <= 10){
            var item= document.createElement('option')
            item.text = `${n} X ${c} = ${n*c}`
            item.value = `tab${c}`
            tabuada.appendChild(item)
            c++
        }
    }*/

    if( num.value.length == 0){
        window.alert('Por favor, digite um número')
    }else{
        var n = Number(num.value)
        var c = 1
        tabuada.innerHTML = ''

        for(var n = n; c <= 10; c++){
            var item= document.createElement('option')
            item.text = `${n} X ${c} = ${n*c}`
            //item.value = `tab${c}`
            tabuada.appendChild(item)
        }
    }
}