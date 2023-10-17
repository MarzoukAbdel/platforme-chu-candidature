import React, { useState } from 'react';
import './Login.css'; // Import your CSS file (create this file with your styles)

function Login() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');

  const handleLogin = () => {
    // Add your authentication logic here (e.g., check credentials)
    if (username === 'demo' && password === 'password') {
      // Successful login, you can redirect or perform actions here
      setError('');
      console.log('Login successful');
    } else {
      setError('Invalid credentials');
    }
  };

  return (
    <div className="login-container">
      <h1>Login</h1>
      <div className="login-form">
        <input
          type="text"
          placeholder="Username"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
        />
        <input
          type="password"
          placeholder="Password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        <button onClick={handleLogin}>Login</button>
        <p className="error-message">{error}</p>
      </div>
    </div>
  );
}

export default Login;
