import './App.css';
import Candidature from './component/Candidature';
import Index from './component/Index';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Navigation from './component/Navigation';


function App() {
  
  return (

  

 <Router>
<div>
  {/* Navigation or common components can go here */}
  <Navigation/>
  <Routes>
  {/* <Route
            path="/"
            element={<Index data={data} isLoading={isLoading} />}
          /> */}
    <Route path="/" element={<Index />} />
    {/* {/* <Route path="/about" element={<AboutPage />} /> */}
    <Route path="/Candidature" element={<Candidature />} /> 
    {/* Add more routes for other pages */}
  </Routes>
</div>
</Router>
    
  );
}

export default App;
