package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quadrilateral {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
    }
    public void showP1(){
        System.out.println("P1: (" +p1.getX() + ", " + p1.getY()+ ")");
    }
    public void showP2(){
        System.out.println("P2: (" +p2.getX() + ", " + p2.getY()+ ")");
    }
    public void showP3(){
        System.out.println("P3: (" +p3.getX() + ", " + p3.getY()+ ")");
    }
    public void showP4(){
        System.out.println("P4: (" +p4.getX() + ", " + p4.getY()+ ")");
    }

    public int checkRectangle(){
//        System.out.println("Points are : " + "("+ p1.getX() + ", " + p1.getY() + "), (" +p2.getX() + ", " + p2.getY()+"), ("+ p3.getX() +", "+ p3.getY()+ "), (" +p4.getX()+", "+ p4.getY()+")");
        double p1p2Sqr=(p1.getX()-p2.getX())*(p1.getX()-p2.getX()) +(p1.getY()-p2.getY())*(p1.getY()-p2.getY());
        double p2p3Sqr=(p2.getX()-p3.getX())*(p2.getX()-p3.getX()) +(p2.getY()-p3.getY())*(p2.getY()-p3.getY());
        double p3p4Sqr=(p3.getX()-p4.getX())*(p3.getX()-p4.getX()) +(p3.getY()-p4.getY())*(p3.getY()-p4.getY());
        double p1p4Sqr=(p1.getX()-p4.getX())*(p1.getX()-p4.getX()) +(p1.getY()-p4.getY())*(p1.getY()-p4.getY());
        double p1p3Sqr=(p1.getX()-p3.getX())*(p1.getX()-p3.getX()) +(p1.getY()-p3.getY())*(p1.getY()-p3.getY());
        double p2p4Sqr=(p2.getX()-p4.getX())*(p2.getX()-p4.getX()) +(p2.getY()-p4.getY())*(p2.getY()-p4.getY());

        List<Double> allDistanceAngle1=new ArrayList<Double>();
        allDistanceAngle1.add(p1p2Sqr);
        allDistanceAngle1.add(p2p3Sqr);
        allDistanceAngle1.add(p1p3Sqr);
        Collections.sort(allDistanceAngle1);

        List<Double> allDistanceAngle2=new ArrayList<Double>();
        allDistanceAngle2.add(p2p3Sqr);
        allDistanceAngle2.add(p3p4Sqr);
        allDistanceAngle2.add(p2p4Sqr);
        Collections.sort(allDistanceAngle2);

        List<Double> allDistanceAngle3=new ArrayList<Double>();
        allDistanceAngle3.add(p3p4Sqr);
        allDistanceAngle3.add(p1p4Sqr);
        allDistanceAngle3.add(p1p3Sqr);
        Collections.sort(allDistanceAngle3);

        List<Double> allDistanceAngle4=new ArrayList<Double>();
        allDistanceAngle4.add(p1p4Sqr);
        allDistanceAngle4.add(p1p2Sqr);
        allDistanceAngle4.add(p2p4Sqr);
        Collections.sort(allDistanceAngle4);

        if((double)allDistanceAngle1.get(0)+(double)allDistanceAngle1.get(1)==(double)allDistanceAngle1.get(2)&&
                (double)allDistanceAngle2.get(0)+(double)allDistanceAngle2.get(1)==(double)allDistanceAngle2.get(2) &&
                (double)allDistanceAngle3.get(0)+(double)allDistanceAngle3.get(1)==(double)allDistanceAngle3.get(2) &&
                (double)allDistanceAngle4.get(0)+(double)allDistanceAngle4.get(1)==(double)allDistanceAngle4.get(2)){
            System.out.println("Points are : " + "("+ p1.getX() + ", " + p1.getY() + "), (" +p2.getX() + ", " + p2.getY()+"), ("+ p3.getX() +", "+ p3.getY()+ "), (" +p4.getX()+", "+ p4.getY()+")");
            System.out.println("Points are forming rectangle: ");
            return 1;
        }else{
//            System.out.println("Points are NOT forming rectangle: ");
            return 0;
        }
    }
}
