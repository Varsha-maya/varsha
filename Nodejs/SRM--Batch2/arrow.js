console.log(" arrow functions");
let number1=2;
let number2=5;
const add=()=>number1+number2;
const sub=()=>number2-number1;
const mul=()=>number1*number2;
console.log("sum===",add());
console.log("diff===",sub());
console.log("mul===",mul());
