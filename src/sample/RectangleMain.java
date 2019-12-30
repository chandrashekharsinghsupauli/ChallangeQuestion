package sample;

import java.util.*;

public class RectangleMain {
//    static Map<String, Integer> rectangleStatus=new TreeMap<String, Integer>();
    static Map<String, Quadrilateral> allQuadrilaterals=new TreeMap<>();
    static Map<String, Point> allPoints=new TreeMap<String, Point>();
    public static void main(String[] args) {
        System.out.println("Start...");
//        createPolygonScenario1();//1
//        createPolygonScenario2();//1
//        createPolygonScenario3();//3
//        createPolygonScenario4();//0
//        createPolygonScenario5();//10
//        createPolygonScenario6();//10
//        createPolygonScenario7();//6
//        createPolygonScenario8();//3
//        createPolygonScenario9();//6
//        createPolygonScenario10();//0
        createPolygonScenario11();//15
        createAllCombinationsOfQuadrilaterals(new ArrayList<String>(allPoints.keySet()));
        System.out.println("allQuadrilaterals.size() : " + allQuadrilaterals.size());
        System.out.println("allQuadrilaterals : " + allQuadrilaterals);
        countRectangleQuadrilateral();
        System.out.println("End...");
    }
    public static void createPolygonScenario1(){
        allPoints.clear();
        //Scenario 1 => 1
        allPoints.put("P1", new Point(1,1));
        allPoints.put("P2", new Point(4,1));
        allPoints.put("P3", new Point(1,3));
        allPoints.put("P4", new Point(4,3));
    }
    public static void createPolygonScenario2(){
        allPoints.clear();
        //Scenario2 => 1
        allPoints.put("P1", new Point(1,1));
        allPoints.put("P2", new Point(4,1));
        allPoints.put("P3", new Point(1,3));
        allPoints.put("P4", new Point(4,3));
        allPoints.put("P5", new Point(5,1));
    }
    public static void createPolygonScenario3(){
        allPoints.clear();
        //Scenario3 => 3
        allPoints.put("P1", new Point(1,1));
        allPoints.put("P2", new Point(4,1));
        allPoints.put("P3", new Point(1,3));
        allPoints.put("P4", new Point(4,3));
        allPoints.put("P5", new Point(5,1));
        allPoints.put("P6", new Point(5,3));

    }
    public static void createPolygonScenario4(){
        allPoints.clear();
        //Scenario 4 => 0
        allPoints.put("P1", new Point(2,2));
        allPoints.put("P2", new Point(9,2));
        allPoints.put("P3", new Point(16,2));
        allPoints.put("P4", new Point(5,8));
        allPoints.put("P5", new Point(12,8));
        allPoints.put("P6", new Point(18,8));
    }
    public static void createPolygonScenario5(){
        allPoints.clear();
        //Scenario5 => 10
        allPoints.put("P1", new Point(1,1));
        allPoints.put("P2", new Point(0,1));
        allPoints.put("P3", new Point(-1,1));
        allPoints.put("P4", new Point(-1,0));
        allPoints.put("P5", new Point(-1,-1));
        allPoints.put("P6", new Point(0,-1));
        allPoints.put("P7", new Point(1,-1));
        allPoints.put("P8", new Point(1,0));
        allPoints.put("P9", new Point(0,0));

    }
    public static void createPolygonScenario6(){
        allPoints.clear();
        //Scenario6  => 10
        allPoints.put("P1", new Point(2,2));
        allPoints.put("P2", new Point(0,2));
        allPoints.put("P3", new Point(-2,2));
        allPoints.put("P4", new Point(-2,0));
        allPoints.put("P5", new Point(-2,-2));
        allPoints.put("P6", new Point(0,-2));
        allPoints.put("P7", new Point(2,-2));
        allPoints.put("P8", new Point(2,0));
        allPoints.put("P9", new Point(0,0));

    }
    public static void createPolygonScenario7(){
        allPoints.clear();
        //Scenario 7 => 6
        allPoints.put("P1", new Point(2,2));
        allPoints.put("P2", new Point(0,2));
        allPoints.put("P3", new Point(-2,2));
        allPoints.put("P4", new Point(-2,0));
        allPoints.put("P5", new Point(-2,-2));
        allPoints.put("P6", new Point(0,-2));
        allPoints.put("P7", new Point(2,-2));
        allPoints.put("P8", new Point(2,0));

    }
    public static void createPolygonScenario8(){
        allPoints.clear();
        //Scenario 8 => 3
        allPoints.put("P2", new Point(0,2));
        allPoints.put("P3", new Point(-2,2));
        allPoints.put("P4", new Point(-2,0));
        allPoints.put("P5", new Point(-2,-2));
        allPoints.put("P6", new Point(0,-2));
        allPoints.put("P7", new Point(2,-2));
        allPoints.put("P8", new Point(2,0));

    }
    public static void createPolygonScenario9(){
        allPoints.clear();
        //Scenario9  => 6
        allPoints.put("P2", new Point(0,2));
        allPoints.put("P3", new Point(-2,2));
        allPoints.put("P4", new Point(-2,0));
        allPoints.put("P5", new Point(-2,-2));
        allPoints.put("P6", new Point(0,-2));
        allPoints.put("P7", new Point(2,-2));
        allPoints.put("P8", new Point(2,0));
        allPoints.put("P9", new Point(0,0));
    }
    public static void createPolygonScenario10(){
        allPoints.clear();
        //Scenario 10 => 0
        allPoints.put("P1", new Point(1,0));
        allPoints.put("P2", new Point(2,0));
        allPoints.put("P3", new Point(3,0));
        allPoints.put("P4", new Point(4,0));
        allPoints.put("P5", new Point(5,0));
    }
    public static void createPolygonScenario11(){
        allPoints.clear();
        //Scenario11 =>15
        allPoints.put("P1", new Point(1,1));
        allPoints.put("P2", new Point(2,1));
        allPoints.put("P3", new Point(3,1));
        allPoints.put("P4", new Point(4,1));
        allPoints.put("P5", new Point(5,1));
        allPoints.put("P6", new Point(6,1));
        allPoints.put("P7", new Point(1,3));
        allPoints.put("P8", new Point(2,3));
        allPoints.put("P9", new Point(3,3));
        allPoints.put("P10", new Point(4,3));
        allPoints.put("P11", new Point(5,3));
        allPoints.put("P12", new Point(6,3));

    }

    public static void createAllCombinationsOfQuadrilaterals(List<String> allPointsKey){
        List<String> fourKeys=new LinkedList<String>(allPointsKey);
        if(allPointsKey.size()==4){
            saveQuadrilaterals(allPointsKey);
        }else if(allPointsKey.size()>=5){
            List<String> tempList = new ArrayList<>(allPointsKey.subList(0, allPointsKey.size()-1));
            createAllCombinationsOfQuadrilaterals(tempList);
            for (int i=0; i<allPointsKey.size()-1; i++) {
                tempList = new ArrayList<>(allPointsKey.subList(0, allPointsKey.size()-1));
                tempList.set(i,allPointsKey.get(allPointsKey.size()-1));
                createAllCombinationsOfQuadrilaterals(tempList);
            }
        }
    }
    public static void saveQuadrilaterals(List<String> oneCombination){
        List<String> oneCombinationList=new ArrayList<>(oneCombination);
        Collections.sort(oneCombinationList);
        String quadrilateralKey="";

        for(String oneKey: oneCombinationList){
            quadrilateralKey += oneKey;
        }

        if(!allQuadrilaterals.containsKey(quadrilateralKey)) {
            allQuadrilaterals.put(quadrilateralKey, new Quadrilateral(allPoints.get(oneCombinationList.get(0)), allPoints.get(oneCombinationList.get(1)), allPoints.get(oneCombinationList.get(2)), allPoints.get(oneCombinationList.get(3))));
        }
    }

    public static void countRectangleQuadrilateral(){
        int rectangleCount=0;
        int tempCount=0;
        Quadrilateral quadrilateral=null;
        for (String oneQuadrilateralKey: allQuadrilaterals.keySet()){
            quadrilateral=allQuadrilaterals.get(oneQuadrilateralKey);
            tempCount= quadrilateral.checkRectangle();
            rectangleCount +=tempCount;
            if(tempCount==1){
                System.out.println("Point key: " + oneQuadrilateralKey);
            }
        }
        System.out.println("Total Rectangle: " + rectangleCount);
    }

}
