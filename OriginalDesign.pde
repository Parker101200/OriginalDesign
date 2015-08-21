void setup()
{
size(400, 400);
}
void draw()
{
  outline();
  shapes();
}

void outline() {
	background(255, 255, 255);
	fill(0);
	rect(0, 275, 330, 5); 
	rect(250, 0, 5, 400); 
	rect(330, 0, 5, 400); 
	rect(330, 205, 400, 5); 
	rect(250, 70, 80, 5);
	rect(330, 155, 400, 5);
}

void shapes() {
	fill(219, 0, 0); 
	rect(0, 0, 250, 275); 
	fill(252, 221, 20);
	rect(255, 0, 75, 70); 
	fill(252, 220, 20);
	rect(335, 210, 65, 190); 
	fill(60, 0, 255);
	rect(335, 160, 65, 45); 
}