function Candidature() {
    return (
                <div className="container-xxl bg-white p-0">
                  {/* Spinner Start */}
                  <div id="spinner" className="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
                    <div className="spinner-border text-primary" style={{width: '3rem', height: '3rem'}} role="status">
                      <span className="sr-only">Loading...</span>
                    </div>
                  </div>
                  {/* Spinner End */}
               
                  {/* Header End */}
                  <div className="container-xxl py-5 bg-dark page-header mb-5">
                    <div className="container my-5 pt-5 pb-4">
                      <h1 className="display-3 text-white mb-3 animated slideInDown">Candidature</h1>
                      <nav aria-label="breadcrumb">
                        <ol className="breadcrumb text-uppercase">
                          <li className="breadcrumb-item"><a href="#">Home</a></li>
                          <li className="breadcrumb-item"><a href="#">Pages</a></li>
                          <li className="breadcrumb-item text-white active" aria-current="page">Candidature</li>
                        </ol>
                      </nav>
                    </div>
                  </div>
                  {/* Header End */}
                  {/* Job Detail Start */}
                  <div className="container-xxl py-5 wow fadeInUp" data-wow-delay="0.1s">
                    <div className="container">
                      <div className="row gy-5 gx-4">
                        <div className="col-lg-8">
                          <div className="d-flex align-items-center mb-5">
                            <img className="flex-shrink-0 img-fluid border rounded" src="assets/img/com-logo-2.jpg" alt="" style={{width: '80px', height: '80px'}} />
                            <div className="text-start ps-4">
                              <h3 className="mb-3">Marketing Manager</h3>
                            </div>
                          </div>
                          <div className="mb-5">
                            <h4 className="mb-3">Job description</h4>
                            <p>Dolor justo tempor duo ipsum accusam rebum gubergren erat. Elitr stet dolor vero clita labore gubergren. Kasd sed ipsum elitr clita rebum ut sea diam tempor. Sadipscing nonumy vero labore invidunt dolor sed, eirmod dolore amet aliquyam consetetur lorem, amet elitr clita et sed consetetur dolore accusam. Vero kasd nonumy justo rebum stet. Ipsum amet sed lorem sea magna. Rebum vero dolores dolores elitr vero dolores magna, stet sea sadipscing stet et. Est voluptua et sanctus at sanctus erat vero sed sed, amet duo no diam clita rebum duo, accusam tempor takimata clita stet nonumy rebum est invidunt stet, dolor.</p>
                            <h4 className="mb-3">Responsibility</h4>
                            <p>Magna et elitr diam sed lorem. Diam diam stet erat no est est. Accusam sed lorem stet voluptua sit sit at stet consetetur, takimata at diam kasd gubergren elitr dolor</p>
                            <ul className="list-unstyled">
                              <li><i className="fa fa-angle-right text-primary me-2" />Dolor justo tempor duo ipsum accusam</li>
                              <li><i className="fa fa-angle-right text-primary me-2" />Elitr stet dolor vero clita labore gubergren</li>
                              <li><i className="fa fa-angle-right text-primary me-2" />Rebum vero dolores dolores elitr</li>
                              <li><i className="fa fa-angle-right text-primary me-2" />Est voluptua et sanctus at sanctus erat</li>
                              <li><i className="fa fa-angle-right text-primary me-2" />Diam diam stet erat no est est</li>
                            </ul>
                            <h4 className="mb-3">Qualifications</h4>
                            <p>Magna et elitr diam sed lorem. Diam diam stet erat no est est. Accusam sed lorem stet voluptua sit sit at stet consetetur, takimata at diam kasd gubergren elitr dolor</p>
                            <ul className="list-unstyled">
                              <li><i className="fa fa-angle-right text-primary me-2" />Dolor justo tempor duo ipsum accusam</li>
                              <li><i className="fa fa-angle-right text-primary me-2" />Elitr stet dolor vero clita labore gubergren</li>
                              <li><i className="fa fa-angle-right text-primary me-2" />Rebum vero dolores dolores elitr</li>
                              <li><i className="fa fa-angle-right text-primary me-2" />Est voluptua et sanctus at sanctus erat</li>
                              <li><i className="fa fa-angle-right text-primary me-2" />Diam diam stet erat no est est</li>
                            </ul>
                          </div>
                          <div className>
                            <h4 className="mb-4">Postuler Pour Ce Metier</h4>
                            <form>
                              <div className="row g-3">
                                <div className="col-12 col-sm-6">
                                  <input type="text" className="form-control" placeholder="Nom" />
                                </div>    
                                <div className="col-12 col-sm-6">
                                  <input type="text" className="form-control" placeholder="Prenom" />
                                </div>
                                <div className="col-12 col-sm-6">
                                  <input type="email" className="form-control" placeholder="Email" />
                                </div>
                                <div className="col-12 col-sm-6">
                                  <input type="text" className="form-control" placeholder />
                                </div>
                                <div className="col-12 col-sm-6">
                                  <label htmlFor>CV</label>
                                  <input type="file" className="form-control bg-white" />
                                </div>
                                <div className="col-12 col-sm-6">
                                  <label htmlFor>Lettre de Demande</label>
                                  <input type="file" className="form-control bg-white" />
                                </div>
                                <div className="col-12 col-sm-6">
                                  <label htmlFor />
                                  <input type="file" className="form-control bg-white" />
                                </div>
                                <div className="col-12">
                                  <textarea className="form-control" rows={5} placeholder="Coverletter" defaultValue={""} />
                                </div>
                                <div className="col-12">
                                  <button className="btn btn-primary w-100" type="submit">Apply Now</button>
                                </div>
                              </div>
                            </form>
                          </div>
                        </div>
                        <div className="col-lg-4">
                          <div className="bg-light rounded p-5 mb-4 wow slideInUp" data-wow-delay="0.1s">
                            <h4 className="mb-4">Job Summery</h4>
                            <p><i className="fa fa-angle-right text-primary me-2" />Published On: 01 Jan, 2045</p>
                            <p><i className="fa fa-angle-right text-primary me-2" />Vacancy: 123 Position</p>
                            <p><i className="fa fa-angle-right text-primary me-2" />Job Nature: Full Time</p>
                            <p><i className="fa fa-angle-right text-primary me-2" />Salary: $123 - $456</p>
                            <p><i className="fa fa-angle-right text-primary me-2" />Location: New York, USA</p>
                            <p className="m-0"><i className="fa fa-angle-right text-primary me-2" />Date Line: 01 Jan, 2045</p>
                          </div>
                          <div className="bg-light rounded p-5 wow slideInUp" data-wow-delay="0.1s">
                            <h4 className="mb-4">Company Detail</h4>
                            <p className="m-0">Ipsum dolor ipsum accusam stet et et diam dolores, sed rebum sadipscing elitr vero dolores. Lorem dolore elitr justo et no gubergren sadipscing, ipsum et takimata aliquyam et rebum est ipsum lorem diam. Et lorem magna eirmod est et et sanctus et, kasd clita labore.</p>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                  {/* Job Detail End */}
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
  
  export default Candidature;
  