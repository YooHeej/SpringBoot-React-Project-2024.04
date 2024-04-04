import { useEffect } from "react";
import axios from "axios";
import '../App.css';

function App() {
  const [users, setUsers] = useState([]);
  const [isLoading, setIsLoading] = useState(true);
  useEffect(() => {
    axios.get('/rp/react/users')
    .then(res => {
      console.log(res.data);
      setUsers(res.data);
      setIsLoading(false);
    })
    .catch(err => {console.log(err);});
  }, []);
  return (
    <div>
      <h1>사용자 목록</h1>
      <h3>{isLoading ? '로딩 중...' : ''}</h3>
      <table border={1}>
        <tr>
          <th>uid</th>
          <th>uname</th>
          <th>이메일</th>
          <th>등록일</th>
          <th>사진</th>
          <th>깃허브</th>
          <th>인스타</th>
          <th>지역</th>
        </tr>
        {
          users.map(users => (
          <tr key={users.uid}>
            <td>{users.uid}</td><td>{users.uname}</td>
            <td>{users.email}</td><td>{users.regDate}</td>
            <td>{users.profile}</td><td>{users.github}</td>
            <td>{users.insta}</td><td>{users.location}</td>
          </tr>
        ))
      } 
      </table>
    </div>
  );
}

export default App;