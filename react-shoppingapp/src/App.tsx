import React from 'react';
import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <div>
        <form>
          <input className="form" type="text" placeholder="List Name" disabled={variable}></input>
          <button onClick={(e) => {
            e.preventDefault();
            variable = !variable;
          }}>Enter List</button>
        </form>
        <br/>
      </div>
      <form>
        <input type="text" placeholder="Item Name"></input>
        <button>click</button>
        </form>
    </div>
  );
}

let variable = false;

export default App;
