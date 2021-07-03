import logo from './logo.svg';
import './App.css';
 import MyLabel from './component/MyLabel';
 
function App() {
   const dte = new Date();
 const value = dte.toString();
  return (
    <div>
       <MyLabel/>
      <div className="name">
       <h1>User Name: VARSHA</h1>
       </div>
      <div className="date">
      <h1>{value}</h1>
      </div>  
    </div>
  );
}
