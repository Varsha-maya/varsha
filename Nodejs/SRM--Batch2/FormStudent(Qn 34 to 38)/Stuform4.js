import React from 'react'
import {useFormik} from 'formik';
import * as Yup from 'yup';
export default function Stuform4() {
    const validationSchema = Yup.object({
        roll:Yup.string().required("Roll no is mandatorty"),
        fname : Yup.string().required("Firstname is mandatorty"),
        dept : Yup.string().required("Please select Department"),
        bat : Yup.string().required("Please select Batch"),
        mail : Yup.string().email("Invalid").required("Please enter a valid email"),
        age : Yup.string().typeError("Enter Valid age").max(35, "Max age is 35"),
        mob:Yup.string().typeError("Enter numbers only")

    })

    const { handleSubmit,handleChange,values,errors} = useFormik({
        initialValues: {
            roll:'',
        fname:'',
        lname:'',
        ffname:'',
        dept:'',
        bat:'',
        mob:'',
        age:'',
        mail:''
        },
        validationSchema,
        onSubmit(values){
            const {name,val} = values.target;
            console.log("Submitted");
            console.log(values);
            values((prevstate) => {
                return {
                    ...prevstate,
                    [name]:values
                }
            })  
            console.log(values) 
            alert("Submitted Successfully");

        }
    })
    return (
        <div>
            <h1><center>Student Form</center></h1>
            <form onSubmit={handleSubmit} noValidate>
            <div>
                    <label>Roll No</label>
                    <input type="text" name="roll" value={values.roll} id="roll" onChange={handleChange}/>
                    {
                        errors.roll ? errors.roll : null
                    }
                    
                </div>
                <div>
                    <label>First Name</label>
                    <input type="text" name="fname" id="fname" onChange={handleChange} values={values.fname}/>
                    {errors.fname ? errors.fname : null}
                </div>
                <div>
                    <label>Last Name</label>
                    <input type="text" name="lname" id="lname" onChange={handleChange} values={values.lname}/>
                    {errors.lname ? errors.lname : null}
                </div>
                <div>
                    <label>Father's Name</label>
                    <input type="text" name="ffname" id="ffname" onChange={handleChange} values={values.lname}/>
                    {errors.ffname ? errors.ffname : null}
                </div>
                <div>
                    <label>Department</label>
                    <select  name="dept" value={values.dept} id="dept"onChange={handleChange}>
                        <option value="ece" >Electronics and Communication Engineering</option>
                        <option value="eee" >Electrical and Electronics Engineering</option>
                        <option value="cse" >Computer Science Engineering</option>
                        <option value="mech" >Mechanical Engineering</option>
                        <option value="civil" >Civil Engineering</option>
                        <option value="it" >Information Technology</option>
                        
                    </select>
                    {
                        errors.dept ? errors.dept : null
                    }
                </div>
                <div>
                    <label>Batch</label>
                    <select  name="bat" value={values.bat} id="bat"onChange={handleChange}>
                        <option value="1822" >2018 - 2022</option>
                        <option value="1721" >2017 - 2021</option>
                        <option value="1620" >2016 - 2020</option>
                        <option value="1519" >2015 - 2019</option>
                        <option value="1418" >2014 - 2018</option>
                        <option value="1317" >2013 - 2017</option>
                        
                    </select>
                    {
                        errors.bat ? errors.bat : null
                    }
                </div>
                <div>
                    <label>Mobile No</label>
                    <input type="number" name="mob" id="mob" onChange={handleChange} values={values.mob}/>
                    {errors.mob ? errors.mob : null}
                </div>
                <div>
                    <label>Age</label>
                    <input type="number" name="age" id="age" onChange={handleChange} values={values.age}/>
                    {errors.age ? errors.age: null}
                </div>
                <div>
                    <label>Email id</label>
                    <input type="email" name="mail" id="mail" onChange={handleChange} values={values.mail}/>
                    {errors.mail ? errors.mail : null}
                </div>

                <button type='submit' className="but">Submit</button>
            </form>
        </div>
    )
}