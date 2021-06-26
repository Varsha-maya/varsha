console.log("usage of const against array");

const employid=["56","65","66","76"];
//changing an element
employid[0]="86";
//adding an element
employid.push("34");
for(let i=0;i<employid.length;i++){
    console.log(employid[i]);
}
