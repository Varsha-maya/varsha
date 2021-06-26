class Animal{

constructor(name){
    this.name=name;
    

}
display(){
    console.log(`${this.name} *************`);
    
}
}
class Tiger extends Animal{

    constructor(name){
        super(name);
    }

}
let obj=new  Tiger("Tiger");
obj.display();
