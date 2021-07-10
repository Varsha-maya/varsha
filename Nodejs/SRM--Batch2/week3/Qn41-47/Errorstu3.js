import React from 'react'

export default function Errorstu3({message}) {
    return (
        <div>
            { 
                message &&  <span className="error">{message}</span> 
            }
        </div>
    )
}