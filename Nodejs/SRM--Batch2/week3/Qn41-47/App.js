
import './App.css';
import React,{useEffect,useState}from 'react'
//import Stuform1 from './comp/Stuform1'
//import Stuform2 from './comp/Stuform2'
//import Stuform3 from './comp/Stuform3'
 //import Stuform4 from './comp/Stuform4'
 //import Stuform5 from './comp/Stuform5'
 //import Stuapi from './comp/Stuapi'
 import Stuaxi from './comp/Stuaxi'
 import Finaldetails from './comp/Finaldetails';

 


function App() {
  
  return (
    <div className="App" style={{backgroundColor:"#282c3"}}>
      <header className="App-header">
        <div className="abc">
        {/* <Stuform1/> */}
        {/* <Stuform2/> */}
        {/* <Stuform3/> */}
        {/* <Stuform4/> */}
        {/* <Stuform5/> */}
        {/* <Stuapi/> */}
        <Stuaxi/>
        <Finaldetails style={{backgroundColor:"lightblue"}}/>
        
        
        
        </div>
      </header>
    </div>
  );
}

export default App;
