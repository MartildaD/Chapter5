public class Pythagorean{
public static void main(String[] args){
int triangle = 0;

for(int side1 = 1; side1 <= 500; side1++){
for(int side2 = side1; side2 <= 500; side2++){
for(int hypotenuse = side2; hypotenuse <= 500; hypotenuse++){

int left = (side1 * side1) + (side2 * side2);
int right = hypotenuse * hypotenuse;

if( left == right) {
System.out.println(side1 + "\t" + side2 + "\t" + hypotenuse);
triangle += 1;
}
}
}
}
System.out.println("Total Pythagorean triple: " + triangle);
}
}
