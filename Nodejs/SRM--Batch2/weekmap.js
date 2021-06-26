let keyes=new WeakMap();
let key1={id:1};
let key2={id:2};
let key3={id:3};
key3=null;


keyes.set(key1,"varsha");
keyes.set(key2,"thaaru");
keyes.set(key3,"ramya");



keyes.forEach((val,key)=>{
console.log(val +" "+key);

});
