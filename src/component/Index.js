import { useEffect, useState } from 'react';

import axios from 'axios';



function Index () {

  const [data, setData] = useState([]);
  const [isLoading, setIsLoading] = useState(true);
  

  useEffect(() => {
    // Define your API endpoint URL here
    const apiUrl = 'http://localhost:8084/metier/api/listmetier';

    // Get the access token from storage (localStorage in this example)
    const accessToken = 'eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJUT1ZVcGRMTVFyQ3NmVmlSTzA5RVlqVEZicHFSZUE4UXRCaWxzZkZ0WEc0In0.eyJleHAiOjE2OTUzOTYxNDksImlhdCI6MTY5NTM5MzA4OSwianRpIjoiNmIzZDBiZjgtMGRkNi00ODNmLThiMmYtN2M1OGI5YTIwMzBmIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9wbGF0Zm9ybS1jaHUtc3RhZ2UtcmVhbG0iLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiODU1NzM3MGQtNjhmNi00Nzk3LWE1OTktN2UxYzcyMGI1MDBmIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoibXMtY2xpZW50Iiwic2Vzc2lvbl9zdGF0ZSI6ImIyMmNkMjA1LTI1OTAtNDI4ZS1hZTc5LTdiZWUzNDg0MTFjOCIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiLyoiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIlN0YWdpYWlyZSIsIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJkZWZhdWx0LXJvbGVzLXBsYXRmb3JtLWNodS1zdGFnZS1yZWFsbSJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsInNpZCI6ImIyMmNkMjA1LTI1OTAtNDI4ZS1hZTc5LTdiZWUzNDg0MTFjOCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwibmFtZSI6ImFobWVkIGtoYWxpZCIsInByZWZlcnJlZF91c2VybmFtZSI6InRlc3QiLCJnaXZlbl9uYW1lIjoiYWhtZWQiLCJmYW1pbHlfbmFtZSI6ImtoYWxpZCIsImVtYWlsIjoidGVzdEBnbWFpbC5jb20ifQ.u0a1BwtjdOe0iR9FoL4dAbXqRqSo9uI2uEiTZ8auGQpibgGmr1Ons9-l3cwSThEOdIumJASM1frcVJR396AoM0zwE_QA3ApjsBC9NFcBR6hjMDp5hZG_GN3Asr54K0GUq7451ay1PnDnvvyr6Q2Ai4K-Z6f3pZ1xLBFM1eor2s5xCVPdVdm7F8iNzzyEYwtE0doHQevZ7Ge-y7Zkm-bDX590XVIuzy-JS2tz5i4PXjv5jTtBe3l9NWdolDSa8Gj6VwsuZb31LfDEmfzHJ_HljLiQ6TcDzUdqxpsupGuLJbNMsyIn2UAWBYMcTDqFKYh1WXWZKG1L7khB-3_zyTTIvg'
    // Set the authorization header with the access token
    const headers = {
      Authorization: `Bearer ${accessToken}`,
    };

    console.log("header " , headers);
    // Get the data from the API with the access token
   axios.get(apiUrl, { headers })
      .then(response => {
        setData(response.data);
        setIsLoading(false);
        console.log(data);
      })
      .catch(error => {
        console.error('Error fetching data:', error);
        setIsLoading(false);
         console.log(data);
      });
  }, []);
    return (
    
  
        <div className="container-xxl bg-white p-0">
          {/* Spinner Start */}
          <div id="spinner" className="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
            <div className="spinner-border text-primary" style={{width: '3rem', height: '3rem'}} role="status">
              <span className="sr-only">Loading...</span>
            </div>
          </div>
          {/* Spinner End */}

          {/* Carousel Start */}
          <div className="container-fluid p-0">
            <div className="owl-carousel header-carousel position-relative">
              <div className="owl-carousel-item position-relative">
                <img className="img-fluid" src="assets/img/carousel-1.jpg" alt="" />
                <div className="position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center" style={{background: 'rgba(43, 57, 64, .5)'}}>
                  <div className="container">
                    <div className="row justify-content-start">
                      <div className="col-10 col-lg-8">
                        <h1 className="display-3 text-white animated slideInDown mb-4">Find The Perfect Job That You Deserved</h1>
                        <p className="fs-5 fw-medium text-white mb-4 pb-2">Vero elitr justo clita lorem. Ipsum dolor at sed stet sit diam no. Kasd rebum ipsum et diam justo clita et kasd rebum sea elitr.</p>
                        <a href className="btn btn-primary py-md-3 px-md-5 me-3 animated slideInLeft">Search A Job</a>
                        <a href className="btn btn-secondary py-md-3 px-md-5 animated slideInRight">Find A Talent</a>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div className="owl-carousel-item position-relative">
                <img className="img-fluid" src="assets/img/carousel-2.jpg" alt="" />
                <div className="position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center" style={{background: 'rgba(43, 57, 64, .5)'}}>
                  <div className="container">
                    <div className="row justify-content-start">
                      <div className="col-10 col-lg-8">
                        <h1 className="display-3 text-white animated slideInDown mb-4">Find The Best Startup Job That Fit You</h1>
                        <p className="fs-5 fw-medium text-white mb-4 pb-2">Vero elitr justo clita lorem. Ipsum dolor at sed stet sit diam no. Kasd rebum ipsum et diam justo clita et kasd rebum sea elitr.</p>
                        <a href className="btn btn-primary py-md-3 px-md-5 me-3 animated slideInLeft">Search A Job</a>
                        <a href className="btn btn-secondary py-md-3 px-md-5 animated slideInRight">Find A Talent</a>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          {/* Carousel End */}
          {/* Category Start */}

         

          <div className="container-xxl py-5">
            <div className="container">
              <h1 className="text-center mb-5 wow fadeInUp" data-wow-delay="0.1s">Explore By Category</h1>
              <div className="row g-4">

              {isLoading ? (
          <p>Loading...</p>
        ) : (
          data.map(item => (
            <div key={item.id} className="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.3s">
            <a className="cat-item rounded p-4" href="Candidature.js">
              <i className="fa fa-3x fa-mail-bulk text-primary mb-4" />
              <h6 className="mb-3" >{item.nomMetier}</h6>
              <p className="mb-0">{item.nbrStagiaire}</p>
              <p className="mb-0">{item.email}</p>
            </a>
          </div>
          ))
        )}


{/* <p>ID: ${item.id}</p>
                        <p>Nom Metier: ${item.nomMetier}</p>
                        <p>Nombre Stagiaire: ${item.nbrStagiaire}</p>
                        <p>Email: ${item.email}</p> */}
                        
{/* 

                <div className="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.3s">
                  <a className="cat-item rounded p-4" href>
                    <i className="fa fa-3x fa-headset text-primary mb-4" />
                    <h6 className="mb-3">Customer Service</h6>
                    <p className="mb-0">123 Vacancy</p>
                  </a>
                </div>
                <div className="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.5s">
                  <a className="cat-item rounded p-4" href>
                    <i className="fa fa-3x fa-user-tie text-primary mb-4" />
                    <h6 className="mb-3">Human Resource</h6>
                    <p className="mb-0">123 Vacancy</p>
                  </a>
                </div>
                <div className="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.7s">
                  <a className="cat-item rounded p-4" href>
                    <i className="fa fa-3x fa-tasks text-primary mb-4" />
                    <h6 className="mb-3">Project Management</h6>
                    <p className="mb-0">123 Vacancy</p>
                  </a>
                </div>
                <div className="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.1s">
                  <a className="cat-item rounded p-4" href>
                    <i className="fa fa-3x fa-chart-line text-primary mb-4" />
                    <h6 className="mb-3">Business Development</h6>
                    <p className="mb-0">123 Vacancy</p>
                  </a>
                </div>
                <div className="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.3s">
                  <a className="cat-item rounded p-4" href>
                    <i className="fa fa-3x fa-hands-helping text-primary mb-4" />
                    <h6 className="mb-3">Sales &amp; Communication</h6>
                    <p className="mb-0">123 Vacancy</p>
                  </a>
                </div>
                <div className="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.5s">
                  <a className="cat-item rounded p-4" href>
                    <i className="fa fa-3x fa-book-reader text-primary mb-4" />
                    <h6 className="mb-3">Teaching &amp; Education</h6>
                    <p className="mb-0">123 Vacancy</p>
                  </a>
                </div>
                <div className="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.7s">
                  <a className="cat-item rounded p-4" href>
                    <i className="fa fa-3x fa-drafting-compass text-primary mb-4" />
                    <h6 className="mb-3">Design &amp; Creative</h6>
                    <p className="mb-0">123 Vacancy</p>
                  </a>
                </div> */}
              </div>
            </div>
          </div>
          {/* Category End */}
          {/* About Start */}
          <div className="container-xxl py-5">
            <div className="container">
              <div className="row g-5 align-items-center">
                <div className="col-lg-6 wow fadeIn" data-wow-delay="0.1s">
                  <div className="row g-0 about-bg rounded overflow-hidden">
                    <div className="col-6 text-start">
                      <img className="img-fluid w-100" src="assets/img/about-1.jpg" />
                    </div>
                    <div className="col-6 text-start">
                      <img className="img-fluid" src="assets/img/about-2.jpg" style={{width: '85%', marginTop: '15%'}} />
                    </div>
                    <div className="col-6 text-end">
                      <img className="img-fluid" src="assets/img/about-3.jpg" style={{width: '85%'}} />
                    </div>
                    <div className="col-6 text-end">
                      <img className="img-fluid w-100" src="assets/img/about-4.jpg" />
                    </div>
                  </div>
                </div>
                <div className="col-lg-6 wow fadeIn" data-wow-delay="0.5s">
                  <h1 className="mb-4">We Help To Get The Best Job And Find A Talent</h1>
                  <p className="mb-4">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit. Aliqu diam amet diam et eos. Clita erat ipsum et lorem et sit, sed stet lorem sit clita duo justo magna dolore erat amet</p>
                  <p><i className="fa fa-check text-primary me-3" />Tempor erat elitr rebum at clita</p>
                  <p><i className="fa fa-check text-primary me-3" />Aliqu diam amet diam et eos</p>
                  <p><i className="fa fa-check text-primary me-3" />Clita duo justo magna dolore erat amet</p>
                  <a className="btn btn-primary py-3 px-5 mt-3" href>Read More</a>
                </div>
              </div>
            </div>
          </div>
          {/* About End */}
          {/* Footer Start */}
          <div className="container-fluid bg-dark text-white-50 footer pt-5 mt-5 wow fadeIn" data-wow-delay="0.1s">
            <div className="container py-5">
              <div className="row g-5">
                <div className="col-lg-3 col-md-6">
                  <h5 className="text-white mb-4">Company</h5>
                  <a className="btn btn-link text-white-50" href>About Us</a>
                  <a className="btn btn-link text-white-50" href>Contact Us</a>
                  <a className="btn btn-link text-white-50" href>Our Services</a>
                  <a className="btn btn-link text-white-50" href>Privacy Policy</a>
                  <a className="btn btn-link text-white-50" href>Terms &amp; Condition</a>
                </div>
                <div className="col-lg-3 col-md-6">
                  <h5 className="text-white mb-4">Quick Links</h5>
                  <a className="btn btn-link text-white-50" href>About Us</a>
                  <a className="btn btn-link text-white-50" href>Contact Us</a>
                  <a className="btn btn-link text-white-50" href>Our Services</a>
                  <a className="btn btn-link text-white-50" href>Privacy Policy</a>
                  <a className="btn btn-link text-white-50" href>Terms &amp; Condition</a>
                </div>
                <div className="col-lg-3 col-md-6">
                  <h5 className="text-white mb-4">Contact</h5>
                  <p className="mb-2"><i className="fa fa-map-marker-alt me-3" />123 Street, New York, USA</p>
                  <p className="mb-2"><i className="fa fa-phone-alt me-3" />+012 345 67890</p>
                  <p className="mb-2"><i className="fa fa-envelope me-3" />info@example.com</p>
                  <div className="d-flex pt-2">
                    <a className="btn btn-outline-light btn-social" href><i className="fab fa-twitter" /></a>
                    <a className="btn btn-outline-light btn-social" href><i className="fab fa-facebook-f" /></a>
                    <a className="btn btn-outline-light btn-social" href><i className="fab fa-youtube" /></a>
                    <a className="btn btn-outline-light btn-social" href><i className="fab fa-linkedin-in" /></a>
                  </div>
                </div>
                <div className="col-lg-3 col-md-6">
                  <h5 className="text-white mb-4">Newsletter</h5>
                  <p>Dolor amet sit justo amet elitr clita ipsum elitr est.</p>
                  <div className="position-relative mx-auto" style={{maxWidth: '400px'}}>
                    <input className="form-control bg-transparent w-100 py-3 ps-4 pe-5" type="text" placeholder="Your email" />
                    <button type="button" className="btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2">SignUp</button>
                  </div>
                </div>
              </div>
            </div>
            <div className="container">
              <div className="copyright">
                <div className="row">
                  <div className="col-md-6 text-center text-md-start mb-3 mb-md-0">
                    © <a className="border-bottom" href="#">Your Site Name</a>, All Right Reserved. 
                    {/*/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from "https://htmlcodex.com/credit-removal". Thank you for your support. *** /*/}
                    Designed By <a className="border-bottom" href="https://htmlcodex.com">HTML Codex</a>
                  </div>
                  <div className="col-md-6 text-center text-md-end">
                    <div className="footer-menu">
                      <a href>Home</a>
                      <a href>Cookies</a>
                      <a href>Help</a>
                      <a href>FQAs</a>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          {/* Footer End */}
          {/* Back to Top */}
          <a href="#" className="btn btn-lg btn-primary btn-lg-square back-to-top"><i className="bi bi-arrow-up" /></a>
        </div>
    
      
    );
  }
  
  export default Index;

