package sample;

import java.util.*;

public class RectangleMain {
    public static void main(String[] args) {
        System.out.println("Start...");
        Polygon onePolygon=new Polygon();
        onePolygon.createPolygonScenario1();//1
        onePolygon.createAllCombinationsOfQuadrilaterals();
        onePolygon.countRectangleQuadrilateral();

        onePolygon.createPolygonScenario2();//1
        onePolygon.createAllCombinationsOfQuadrilaterals();
        onePolygon.countRectangleQuadrilateral();

        onePolygon.createPolygonScenario3();//3
        onePolygon.createAllCombinationsOfQuadrilaterals();
        onePolygon.countRectangleQuadrilateral();

        onePolygon.createPolygonScenario4();//0
        onePolygon.createAllCombinationsOfQuadrilaterals();
        onePolygon.countRectangleQuadrilateral();

        onePolygon.createPolygonScenario5();//10
        onePolygon.createAllCombinationsOfQuadrilaterals();
        onePolygon.countRectangleQuadrilateral();

        onePolygon.createPolygonScenario6();//10
        onePolygon.createAllCombinationsOfQuadrilaterals();
        onePolygon.countRectangleQuadrilateral();

        onePolygon.createPolygonScenario7();//6
        onePolygon.createAllCombinationsOfQuadrilaterals();
        onePolygon.countRectangleQuadrilateral();

        onePolygon.createPolygonScenario8();//3
        onePolygon.createAllCombinationsOfQuadrilaterals();
        onePolygon.countRectangleQuadrilateral();

        onePolygon.createPolygonScenario9();//6
        onePolygon.createAllCombinationsOfQuadrilaterals();
        onePolygon.countRectangleQuadrilateral();

        onePolygon.createPolygonScenario10();//0
        onePolygon.createAllCombinationsOfQuadrilaterals();
        onePolygon.countRectangleQuadrilateral();

        onePolygon.createPolygonScenario11();//15
        onePolygon.createAllCombinationsOfQuadrilaterals();
        onePolygon.countRectangleQuadrilateral();

        System.out.println("End...");
    }
}
