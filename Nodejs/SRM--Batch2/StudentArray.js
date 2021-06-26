let Student = [];

Student[0] = { id: "1", name: "varsha", add:"4,gandhi nagar", city: "Hosur", marks: 45 };
Student[1] = { id: "2", name: "thaaru",  add:"6,nehru nagar", city: "Kovai", marks: 88 };
Student[2] = { id: "3", name: "maya", add:"8,nethaji nagar", city: "Madurai", marks: 39 };
Student[3] = { id: "4", name: "ramya", add:"5,kalam nagar", city: "chennai", marks: 65 };
Student[4] = { id: "5", name: "chen", add:"7,periyar nagar", city: "bengaluru", marks: 53 };

Student.sort(function(a, b) {
    var nameA = a.name.toUpperCase(); 
    var nameB = b.name.toUpperCase(); 
   // console.log(nameA);
    //console.log(nameB);
    if (nameA < nameB) {
      return -1;
    }
    if (nameA > nameB) {
      return 1;
    }
    students.forEach((e) => {
    console.log(`NAME: ${e.name} Stuednt id: ${e.id} Mark: ${e.marks} City: ${e.city}`)
  });
  console.log("|||||||||||||||||||||-----name sort-----|||||||||||||||||||||");
    //console.log(Student);
    Student.sort(function (a,b){
        var CityA = a.city.toUpperCase(); 
    var CityB = b.city.toUpperCase();
    if (CityA < CityB) {
        return -1;
      }
      if (CityA > CityB) {
        return 1;
      }
    
    });
    console.log("|||||||||||||||||||||-----city sort-----|||||||||||||||||||||");
    console.log(Student);

    let addmarks = Student.map(addmarks => {
        let mar = addmarks.marks + 20;
        console.log(`NAME: ${addmarks.name} Stuednt id: ${addmarks.id} Mark: ${mar} City: ${addmarks.city}`);
    });
    console.log("|||||||||||||||||||||-----add 20-----|||||||||||||||||||||");
        console.log(Student);
    
    console.log("|||||||||||||||||||||-----filter-----|||||||||||||||||||||");
    var result = Student.filter(citysort => {
    return citysort.city == "Chennai" || citysort.city == "Banglore";
});
    
    students.sort((a, b) => 
{
    let fa = a.name.toLowerCase(),

        fb = b.name.toLowerCase();

    if (fa < fb) {
        return -1;
    }
    if (fa > fb) {
        return 1;
    }
    return 0;
});
students.forEach((e) => {
    console.log(`NAME: ${e.name} Stuednt id: ${e.id} Mark: ${e.marks} City: ${e.city}`);
});
    
   
    
