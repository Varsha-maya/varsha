let names=["varsha","thaaru","ramya","nisha","maya","chitra"]

    const newarray=names.map((ele,idx)=>{
        if(idx%2==0){
            return(`Dr.${names[idx]}`);
    }
    else{
        return(`Er.${names[idx]}`);
    }

    });
    console.log(newarray);