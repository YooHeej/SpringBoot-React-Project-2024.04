import React, {useEffect, useState} from 'react';
import axios from 'axios';
import logo from './logo.svg';
import './App.css';

function App() {
  const [form, setForm] = useState({uid:'', uname:''});
  const handleChange = (event) => {
    const{name, value} = event.target;
    setForm({ ...form, [name]:value});
  }
  const handleSubmit = (event) => {
    event.preventDefault();
  }
  return (
    <div className="App">
      <form onSubmit={handleSubmit}>
      <label htmlFor='uid'>아이디:</label>
        <input type='text' id='uid' name='uid' value={form.id} onChange={handleChange} /><br />
        <label htmlFor='name'>이름:</label>
        <input type='text' id='name' name='name' value={form.name} onChange={handleChange} /><br />
        <button>확인</button>
      </form>
    </div>
  );
}

export default App;
