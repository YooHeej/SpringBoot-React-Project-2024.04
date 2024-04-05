import React, {useEffect, useState} from 'react';
import axios from 'axios';
import './App.css';

function App() {
  const [usera, setUser] = useState([]);
  useEffect(() => {
    axios.get('/rp/react/json')
    .then(res=>{
      console.log(res.data);
      setUser(res.data)
    })
  })
  
  return (
    <>
      <tr>
        <th>uid</th>
        <th>uname</th>
        <th>mail</th>
        <th>등록일</th>
      </tr>
      {
        usera.map(usera=> (
          <tr key={usera.uid}>
            <td>{usera.uid}</td>
            <td>{usera.uname}</td>
            <td>{usera.email}</td>
            <td>{usera.regDate}</td>
          </tr>
        ))
      }
    </>
  );
}

export default App;
