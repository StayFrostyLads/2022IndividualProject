Circle c1;
Circle c2;

ArrayList<Circle> circles = new ArrayList<Circle>(3);

void setup() {
  size(400, 400);
  background(255, 255, 255);
  for (int i = 0; i < circles.size(); i++) {
    Circle f = circles.get(i);
    f.show();
  }
  
  c1 = new Circle(width/2, height/2, 100);
  c2 = new Circle(c1.getLineOuterX(), c1.getLineOuterY(), c1.getRadius()/2);
  c1.show();
  c2.show();
}

void draw() {
  background(255,255,255);
  for (int i = 0; i < circles.size(); i++) {
    Circle z = circles.get(i);
    if (i == 0) {
      z.reDraw(width/2, height/2, 3);
    } else {
      Circle prv = circles.get(i-1);
      z.reDraw(prv.getLineOuterX(), prv.getLineOuterY(), 3 + i);
    }
  }
  //c1.reDraw(width/2, height/2, 3);
  //c2.reDraw(c1.getLineOuterX(), c1.getLineOuterY(), 10);
}

public class Circle {
  private float x, y, r;
  private float lineCenterX;
  private float lineCenterY;
  private float lineOuterX;
  private float lineOuterY;
  private float theta = 0;
  
  public Circle(float x, float y, float r) {
    this.x = x;
    this.y = y;
    this.r = r;
    this.lineCenterX = x;
    this.lineCenterY = y;
    this.lineOuterX = x;
    this.lineOuterY = y-(r/2);
  }
  
  public float getLineOuterX() {
    return lineOuterX;
  }
  
  public float getLineOuterY() {
   return lineOuterY; 
  }
  
  public float getRadius() {
    return r;  
  }
  
  public void show() {
    noFill();
    ellipse(x, y, r, r);
    line(lineCenterX, lineCenterY, lineOuterX, lineOuterY);
  }
  
  public void reDraw(float tempX, float tempY, float speed) {
  noFill();
  theta += speed;
  lineCenterX = tempX;
  lineCenterY = tempY;
  lineOuterX = (r/2)*cos(radians(theta)) + tempX;
  lineOuterY = (r/2)*sin(radians(theta)) + tempY;
  ellipse(tempX, tempY, r, r);
  line(lineCenterX, lineCenterY, lineOuterX, lineOuterY);
}
}
