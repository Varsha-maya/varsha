import React,{useState} from 'react'

export default function Stuform2(props) {

    const initialValues = {

        roll:'',
        fname:'',
        lname:'',
        ffname:'',
        dept:'',
        bat:'',
        mob:'',
        age:'',
        mail:''
    };

    const [formValues, setFormValues] = useState(initialValues);

  

    const handleonSubmit = (e) => {
        e.preventDefault();
        
    
         console.log(formValues);
        console.log("Submitted");
    
    
        
      };
    
    const handleOnChange = (event) => {
        const {name,value} = event.target;
        
        setFormValues((prevstate) => {
            return {
                ...prevstate,
                [name]:value
            }
        })  
        console.log(formValues)      
    }



    
    return (
        <div>
            <h1>Students Form</h1>
           <form onSubmit={handleonSubmit}>
                <div>
                    <label>Roll No</label>
                    <input type="text" name="roll" value={formValues.roll} id="roll" onChange={handleOnChange}/>
                    
                </div>
                <div>
                    <label>First Name</label>
                    <input type="text" name="fname" value={formValues.fname} id="fname" onChange={handleOnChange}/>
                    
                </div>
                <div>
                    <label>Last Name</label>
                    <input type="text" name="lname" value={formValues.lname} id="lname"onChange={handleOnChange}/>
                </div>
                <div>
                    <label>Fathers Name</label>
                    <input type="text" name="ffname" value={formValues.ffname} id="ffname"onChange={handleOnChange}/>
                </div>
                <div>
                    <label>Department</label>
                    <select  name="dept" value={formValues.dept} id="dept"onChange={handleOnChange}>
                        <option value="ece" >Electronics and Communication Engineering</option>
                        <option value="eee" >Electrical and Electronics Engineering</option>
                        <option value="cse" >Computer Science Engineering</option>
                        <option value="mech" >Mechanical Engineering</option>
                        <option value="civil" >Civil Engineering</option>
                        <option value="it" >Information Technology</option>
                        
                    </select>
                </div>
                <div>
                    <label>Batch</label>
                    <select  name="bat" value={formValues.bat} id="bat"onChange={handleOnChange}>
                        <option value="1822" >2018 - 2022</option>
                        <option value="1721" >2017 - 2021</option>
                        <option value="1620" >2016 - 2020</option>
                        <option value="1519" >2015 - 2019</option>
                        <option value="1418" >2014 - 2018</option>
                        <option value="1317" >2013 - 2017</option>
                        
                    </select>
                </div>
                <div>
                    <label>Mobile No</label>
                    <input type="text" name="mob" value={formValues.mob} id="mob"onChange={handleOnChange}/>
                </div> 
                <div>
                    <label>Age</label>
                    <input type="text" name="age" value={formValues.age} id="age"onChange={handleOnChange}/>
                </div>
                <div>
                    <label>Email id</label>
                    <input type="text" name="mail" value={formValues.mail} id="mail"onChange={handleOnChange}/>
                </div>
                 <div>
                    <button value="submit" id="sub" >Submit</button>
                </div> 
                
            </form> 
        </div>
    )
}