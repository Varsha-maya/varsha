console.log("HOF");

function2=(v)=>v+"value";

const valhoc=(dataval,func)=>{
    let v=dataval +3;
    return func(v);
}
let resulthoc=valhoc(14,function2);
console.log(resulthoc);
