void setup(){
   size(800,600);
  PImage face = loadImage("Smiley-001.jpg");
  face.resize(width,height);
    background(face);
 
  
  
  
}




void draw(){
  fill(#FFFFFF);
 ellipse(370,180,70,70);
fill(#000000);
 ellipse(370,180,20,20);
  
}
