package sample;

import java.util.*;

public class RectangleMain {
    public static void main(String[] args) {
        System.out.println("Start...");
        Polygon onePolygon=new Polygon();
        onePolygon.createPolygonScenario1();//1
//        onePolygon.createPolygonScenario2();//1
//        onePolygon.createPolygonScenario3();//3
//        onePolygon.createPolygonScenario4();//0
//        onePolygon.createPolygonScenario5();//10
//        onePolygon.createPolygonScenario6();//10
//        onePolygon.createPolygonScenario7();//6
//        onePolygon.createPolygonScenario8();//3
//        onePolygon.createPolygonScenario9();//6
//        onePolygon.createPolygonScenario10();//0
//        onePolygon.createPolygonScenario11();//15
        onePolygon.createAllCombinationsOfQuadrilaterals();
        onePolygon.countRectangleQuadrilateral();
        System.out.println("End...");
    }
}
