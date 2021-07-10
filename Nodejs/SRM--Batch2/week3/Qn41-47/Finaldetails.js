import React,{useState,useEffect} from 'react'
import axios from 'axios';

export default function Finaldetails() {
    const [user1,setUser1]=useState([]);
    useEffect(() => {
        const fetchData=async ()=>{
            const result =await axios.get("http://localhost:4000/user1");
    
        setUser1(result.data);
        };
        fetchData();
    }, []);
    console.log(user1)
    return (
        <div>
            
            
            <div className="container">
                <div className="det">
                    {/* {user1 &&
                    // user1.map((user1)=>(
                    //     <div className="det">
                    //     <h2>{user1.roll}</h2> 
                    //     <p>{user1.fname}</p>
                    //     <p>{user1.lname}</p>
                    //     <p>{user1.ffname}</p>
                    //     <p>{user1.dept}</p>
                    //     <p>{user1.bat}</p>
                    //     <p>{user1.mob}</p>
                    //     <p>{user1.age}</p>
                    //     <p>{user1.mail}</p>
                    //     <p>{user1.country}</p>
                    //     </div>   
                    // ))} */}
                    <br></br>
                    <br></br>
            <h1><center>STUDENT DETAILS</center></h1>
            <table border ="2px">
            <tr> 
                <td><h4>Roll No</h4></td>
                <td><h4>First Name</h4></td>
                <td><h4>Last Name</h4></td>
                <td><h4>Father's Name</h4></td>
                <td><h4>Department</h4></td>
                <td><h4>Batch</h4></td>
                <td><h4>Mobile No</h4></td>
                <td><h4>Age</h4></td>
                <td><h4>Mail Id</h4></td>
                <td><h4>Country of Origin</h4></td>
            </tr>
              {user1.map((x) => {
                return <tr>
                    <td><label key={x.id}>{x.roll}</label></td>
                    <td><label key={x.id}>{x.fname}</label></td>
                    <td><label key={x.id}>{x.lname}</label></td>
                    <td><label key={x.id}>{x.ffname}</label></td>
                    <td><label key={x.id}>{x.dept}</label></td>
                    <td><label key={x.id}>{x.bat}</label></td>
                    <td><label key={x.id}>{x.mob}</label></td>
                    <td><label key={x.id}>{x.age}</label></td>
                    <td><label key={x.id}>{x.mail}</label></td>
                    <td><label key={x.id}>{x.country}</label></td>
                </tr>
              })}
            </table>
                    </div>
                    </div>
                </div>
                    
        
    )
}