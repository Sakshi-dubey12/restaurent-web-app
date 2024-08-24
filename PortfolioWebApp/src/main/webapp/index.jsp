<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PORTFOLIO WEBSITE</title>
    <link rel="stylesheet" href="portfolio.css"> <!-- css link-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />

    <!-- font design start -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@1,300&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,400;1,300&display=swap" rel="stylesheet">
    <!-- font design end -->
</head>
<body>
    <!-- header start -->
  <section id="header">
    <div class="header container">
        <div class="nav-bbar">
            <div class="brand">
                <a href="#hero"><h1><span>SAKSHI</span>DUBEY </h1></a>
            </div>
            <div class="nav-list">
                <div class="hamburger"><div class="bbar"></div></div>
                <ul>
                    <li><a href="#hero" data-after="Home">Home</a></li>
                    <li><a href="#skill-section" data-after="Skills">Skills</a></li>
                    <li><a href="#education-section" data-after="Education">Education</a></li>
                    <li><a href="#about" data-after="About">About</a></li>
                    <li><a href="#contact" data-after="Contact">Contact</a></li>
                </ul>
            </div>
        </div>
    </div>
  </section>
    <!-- header end -->

    <!-- hero section start -->
    <section id="hero">
        <div class="hero container">
            <div>
                <h1>Hello,<span></span></h1>
                <h1>My Name Is <span></span></h1>
                <h1>Sakshi Dubey<span></span></h1>
                <a href="#skill-section" type="button" class="cta">PORTFOLIO</a>
            </div>
        </div>
    </section>
   <!-- hero section end -->

   <!-- skills section -->
   <section id="skill-section">
    <div class="header skill-head"> <!--container-->
            <h1 class="section-title">SK<span>I</span>LLS</h1>
            <p class="para"> <u> Here Is My Skills To Represent My Expertise </u></p>
    </div>
    <div class="skill-main">
        <div class="skill-bar">
            <div class="info">
               <p>Java</p>
            </div>
            <div class="bar">
                <span class="java"></span>
            </div>
        </div>
        <div class="skill-bar">
            <div class="info">
               <p>HTML</p>
            </div>
            <div class="bar">
                <span class="sql"></span>
            </div>
        </div>
        <div class="skill-bar">
            <div class="info">
               <p>CSS</p>
            </div>
            <div class="bar">
                <span class="html"></span>
            </div>
        </div>
        <div class="skill-bar">
            <div class="info">
               <p>DSA</p>
            </div>
            <div class="bar">
                <span class="css"></span>
            </div>
        </div>


    </div>
   </section>
   <!-- end of skills section -->

   <!-- start of education section -->
   <section id="education-section">
    <div class="header skill-head">
        <h1 class="section-title">EDUC<span>A</span>TION</h1>
    </div>
    <div class="timeline">
        <div class="contain left-contain">
            <img src="bbd.png">
            <div class="text-box">
                <h1>B.Tech (CSE)</h1>
                <h2> Babu Banarsi Das Institute Of Technology And Management</h2>
                <small>2021-2025</small>
                <p>Currently In Fourth year.</p>
                <span class="left-contain-arrow"></span>
            </div>
        </div>

    </div>
   </section>
   <!-- end of education section -->

   <!-- about section starts -->
   <section id="about">
    <div class="about container">
        <div class="col-left">
            <div class="about-img">
                <img src="sakshi.png.jpg"height="450px",width="100px">
            </div>
        </div>
        <div class="col-right">
            <h1 class="section-title">About <span>Me</span> </h1>
            <h2> <b><i><u> Web Developer</u> </i></b></h2>
            <p> I'm <span><b> Sakshi Dubey </b></span>, Fourth year Student of Bachelor of technology from Computer Science Engineering Branch in <span><b>Babu Banarsi Das Institute of Technology And Management</b></span>.
                I am having allegiance towards my passion of being a Developer.
                I am keen and very willing to learn and develop new skills.
                I'm looking forward to the oppurtunity to utilize my skills and experience to make a meaningful impact in the fields of <span><b><i>Web Development and Java Developer</i></b></span>.  </p>

        </div>
    </div>
   </section>
   <!-- about section ends -->

   <!-- contact section starts -->
   <section id="contact">
    <div class="contact container">
        <div><h1 class="section-title">Contact <span>Info</span> </h1></div>
        <div class="contact-items">
            <div class="contact-item">
                <div class="icons"><img src=""></div>
                <div class="contact-info">
                    <h1>Phone</h1>
                    <h2><b>+91 8953438857</b></h2>
                </div>
            </div>
            <div class="contact-item">
                <div class="icons"><img src=""></div>
                <div class="contact-info">
                    <h1>Email</h1>
                    <h2><b>ssakshidubey015@gmail.com</b></h2><b>

                </div>
            </div>
            <div class="contact-item">
                <div class="icons"><img src=""></div>
                <div class="contact-info">
                    <h1>Address</h1>
                    <h2><b>Lucknow</b></h2>
                    <h2><b>Uttar Pradesh</b></h2>
                </div>
            </div>
        </div>
    </div>
   </section>
   <!-- contact section ends -->


   <script src="portfolio.js"></script>
</body>
</html>