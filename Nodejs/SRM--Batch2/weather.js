import React, { useState } from "react";
import Select from "react-select";

export default function weather() {

  const details = [
    { label:"Chennai"
      Temp: "38'c",
      humidity: "35%",
      wind: "2km/h",
     
       
    },
    { label:"Hosur"
      Temp: "21'c",
      humidity: "88%",
      wind: "5km/h",
     
    },
    { label:"Coimbatore"
      Temp: "30'c",
      humidity: "65%",
      wind: "3km/h",
     
       
    },
    { label:"Bengaluru"
      Temp: "29'c",
      humidity: "85%",
      wind: "6km/h",
     
       
    }
  ];
  const [temp, setTemp] = useState(details.Temp);
  const [hum, sethum] = useState(details.humidity);
  const [win, setwin] = useState(details.wind);
  const handleChange = (event) => {
    setTemp(event.Temp);
    sethum(event.humidity);
    setwin(event.wind);
  };


  return (
    <div>
      Weather Report
      <div>
        <Select name="city" options={details} onChange={handleChange} />
        
        {data ? (
         <h1>Temp: {temp}
         <h1>Humidity: {hum}</h1> 
          <h1>Wind : {win}</h1>
           ):(<p>PLEASE SELECT OTHER CITY</p>
           )}

      </div>

    </div>

  )
}
