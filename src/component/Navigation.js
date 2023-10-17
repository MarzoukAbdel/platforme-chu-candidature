import React, { useState } from 'react';
function Navigation() 
{



  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Step 2: Render a button with a conditional label
  const loginButtonLabel = isLoggedIn ? "Logout" : "Login";

  // Step 3: Add an event handler to toggle the login status
  const handleLoginToggle = () => {
    // If logged in, log out (set isLoggedIn to false)
    //isLoggedIn = false;
    // If logged out, log in (set isLoggedIn to true)
    setIsLoggedIn(!isLoggedIn);
  };
    return( 
<nav className="navbar navbar-expand-lg bg-white navbar-light shadow sticky-top p-0">
                    <a href="index.html" className="navbar-brand d-flex align-items-center text-center py-0 px-4 px-lg-5">
                      <h1 className="m-0 text-primary">CHUKandid</h1>
                    </a>
                    <button type="button" className="navbar-toggler me-4" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                      <span className="navbar-toggler-icon" />
                    </button>
                    <div className="collapse navbar-collapse" id="navbarCollapse">
                      <div className="navbar-nav ms-auto p-4 p-lg-0">
                        <a href="index.html" className="nav-item nav-link">Home</a>
                        <a href="about.html" className="nav-item nav-link">About</a>
                        <div className="nav-item dropdown">
                          <a href="#" className="nav-link dropdown-toggle active" data-bs-toggle="dropdown">Jobs</a>
                          <div className="dropdown-menu rounded-0 m-0">
                            <a href="job-list.html" className="dropdown-item">Job List</a>
                            <a href="job-detail.html" className="dropdown-item active">Job Detail</a>
                          </div>
                        </div>
                        <div className="nav-item dropdown">
                          <a href="#" className="nav-link dropdown-toggle" data-bs-toggle="dropdown">Pages</a>
                          <div className="dropdown-menu rounded-0 m-0">
                            <a href="category.html" className="dropdown-item">Job Category</a>
                            <a href="testimonial.html" className="dropdown-item">Testimonial</a>
                            <a href="404.html" className="dropdown-item">404</a>
                          </div>
                        </div>
                        <a href="contact.html" className="nav-item nav-link">Contact</a>
                      </div>
                      <a href className="btn btn-primary rounded-0 py-4 px-lg-5 d-none d-lg-block" onClick={handleLoginToggle}>{loginButtonLabel}</a>
                    </div>
                  </nav>)


}
export default Navigation