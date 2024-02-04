var num = [5,8,2,9,3]
//num[3] = 6//mudando o valor da 3 posição do vetor
num.push(1)//acrescenta numero na ultima posiçao do vetor
num.sort()//numeros de forma ordenada
num.length//comprimento do vetor
 
console.log(num)
console.log(`o vetor tem ${num.length} posições`)
console.log(`O primero valor do vetor é ${num[0]}`)

let pos = num.indexOf(8)
if(pos == -1){
    console.log('O valor não foi encontrado')
} else {
    console.log(`O valor está na posição ${pos}`)

}
