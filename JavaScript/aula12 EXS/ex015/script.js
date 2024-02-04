function verificar (){
    var data = new Date()
    var ano = data.getFullYear()
    var fano= document.getElementById('txtano')
    var res = document.querySelector('div#res')
    if(fano.value.length ==0 || fano.value > ano){
        window.alert('[ERRO] Verifique os dados e envie novamente!!' )
    } else {
        var fsex = document.getElementsByName('radsex')
        var idade = ano- fano.value
        //res.innerHTML = `Idade calculada ${idade}`
        var genero = ''
        var img = document.createElement('img')
        img.setAttribute('id','foto')
        if (fsex[0].checked){
            genero = 'Homem'
            if(idade >=0 && idade < 10){
                //criança
                img.setAttribute('src', 'bebe-homem.jpg')
            }else if (idade <21){
                //jovem
                img.setAttribute('src', 'homem-jovem.jpg')
            }else if (idade <50){
                //adulto
                img.setAttribute('src', 'homem-adulto.jpg')
            }else {
                //idoso
                img.setAttribute('src', 'idoso-homem.jpg')
            }
        } else if(fsex[1].checked) {
            genero = 'Mulher'
            if(idade >=0 && idade < 10){
                //criança
                img.setAttribute('src', 'bebe-mulher.jpg')
            }else if (idade <21){
                //jovem
                img.setAttribute('src', 'mulher-jovem.jpg')
            }else if (idade <50){
                //adulto
                img.setAttribute('src', 'mulher-adulta.jpg')
            }else {
                //idoso
                img.setAttribute('src', 'idoso-mulher.jpg')
            }
        }
        res.style.textAlign= 'center'
        res.innerHTML = `Detectamos ${genero} com ${idade} anos.`
        res.appendChild(img)
    }
}