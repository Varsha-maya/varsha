import React,{useState} from 'react'

export default function Stuform1() {

    const [user,setUser] = useState({
        roll:'',
        fname:'',
        lname:'',
        ffname:'',
        dept:'',
        bat:'',
        mob:'',
        age:'',
        mail:''
    });

    const handleOnChange = (event) => {
        const {name,value} = event.target;
        //  if (name === 'fname'){
        //      setUser({
        //          fnme:value,
        //          lnme:user.lnme
        //      });
        //  } else {
        //      setUser({
        //          lnme:value,
        //          fnme:user.fnme
        //      });
        //  }
        setUser((prevstate) => {
            return {
                ...prevstate,
                [name]:value
            }
        })        
    }


    
    return (
        <div>
            <h1>Students Form</h1>
           <form>
                <div>
                    <label>Roll No</label>
                    <input type="text" name="roll" value={user.roll} id="roll" onChange={handleOnChange}/>
                    
                </div>
                <div>
                    <label>First Name</label>
                    <input type="text" name="fname" value={user.fname} id="fname" onChange={handleOnChange}/>
                    
                </div>
                <div>
                    <label>Last Name</label>
                    <input type="text" name="lname" value={user.lname} id="lname"onChange={handleOnChange}/>
                </div>
                <div>
                    <label>Fathers Name</label>
                    <input type="text" name="ffname" value={user.ffname} id="ffname"onChange={handleOnChange}/>
                </div>
                <div>
                    <label>Department</label>
                    <select  name="dept" value={user.dept} id="dept"onChange={handleOnChange}>
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
                    <select  name="bat" value={user.bat} id="bat"onChange={handleOnChange}>
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
                    <input type="text" name="mob" value={user.mob} id="mob"onChange={handleOnChange}/>
                </div> 
                <div>
                    <label>Age</label>
                    <input type="text" name="age" value={user.age} id="age"onChange={handleOnChange}/>
                </div>
                <div>
                    <label>Email id</label>
                    <input type="text" name="mail" value={user.mail} id="mail"onChange={handleOnChange}/>
                </div>
                {/* <div>
                    <button>Submit</button>
                </div>  */}
                
            </form> 
        </div>
    )
}