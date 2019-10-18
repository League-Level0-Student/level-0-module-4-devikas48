int x= 50;
int y= 50;
int cx=0;
int cy=0;

PImage minecraft;
PImage creeper;     //at the top of your program
void setup() {
  size(600, 600);
  
minecraft = loadImage("broccoli.jpg");     //in setup method
minecraft.resize(600,600);          //in setup method
background(minecraft);          //in setup method
  
  
creeper=loadImage("creeper.png");     //in setup method

creeper.resize(10,10);     //in setup method
  
  
} void draw() {
background(minecraft);          //in setup method
image(creeper, x, y);     //in draw method
if(mousePressed == true){
  cx=mouseX;
  cy=mouseY;
}
if(isNear(x,cx)&& isNear(y,cy)){
  fill(#568E5F);
  println("You found the creeper!");
   
}



else {fill(#FF0000);
}
ellipse(cx,cy,15,15);
  
}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
