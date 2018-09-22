public class Point {
    double x, y;

    public String quadrandCheck(){

        if ( x>0 && y>0 ){
            return String.format("Punkt (%.1f; %.1f) leży w I ćwiartce układu współrzędnych.", getX(),getY());
        } else if (x>0 && y<0){
            return String.format("Punkt (%.1f; %.1f) leży w IV ćwiartce układu współrzędnych.", getX(),getY());
        }else if (x<0 && y<0){
            return String.format("Punkt (%.1f; %.1f) leży w III ćwiartce układu współrzędnych.", getX(),getY());
        }else if (x<0 && y>0){
            return String.format("Punkt (%.1f; %.1f) leży w II ćwiartce układu współrzędnych.", getX(),getY());
        }else {
            return "Punkt(0,0) nie leży w żadnej ćwiartce układu współrzędnych.";
        }

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        setY(y);
        setX(x);
    }
}
