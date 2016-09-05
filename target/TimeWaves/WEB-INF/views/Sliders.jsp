<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>
<body>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
    <div class="thumbnail">
      <img src="resources/image/img1.jpg" width="20%" height="20%">
      </div>
      <div class="carousel-caption">
        <h3>Model 1</h3>
        <p>The new model arrival.</p>
      </div>
    </div>

    <div class="item">
    <div class="thumbnail">
      <img src="resources/image/img2.jpg"  width="20%" height="20%">
      </div>
      <div class="carousel-caption">
        <h3>Model 2</h3>
        <p>the model2.</p>
      </div>
    </div>

    <div class="item">
    <div class="thumbnail">
      <img src="resources/image/img3.jpg" width="20%" height="20%">
      </div>
      <div class="carousel-caption">
        <h3>Model3</h3>
        <p>The model 3.</p>
      </div>
    </div>

    <div class="item">
    <div class="thumbnail">
      <img src="resources/image/img4.jpg" width="20%" height="20%" color="blue">
      </div>
      <div class="carousel-caption">
        <h3>Model 4</h3>
        <p>The model 4.</p>
      </div>
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

</body>
</html>