import React, { Component } from 'react'

export default class MyLabel extends Component {
    render() {
        return (
            <div>
                
                <label>
                Name:<input type="text" name="name"/>
                </label>
                <label>
                Mobile:<input type="text" name="mobile"/>
                </label> 
                
                <input type="submit" value="submit"/>
                
            </div>
        )
    }
}
