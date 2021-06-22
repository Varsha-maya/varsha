let names=["varsha","thaaru","ramya","nisha","maya","chitra"]


    const newarray=names.map((ele,idx)=>{
        if(idx%2==0){
            console.log(`Dr.${names[idx]} ${"chen"}`);
    }
    else{
        console.log(`Er.${names[idx]}`);
    }

    });