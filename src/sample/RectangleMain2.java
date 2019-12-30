package sample;

import java.util.*;

public class RectangleMain2 {
    static Map<String, Integer> rectangleStatus=new TreeMap<String, Integer>();
    static Map<String, Quadrilateral> allQuadrilaterals=new TreeMap<>();
    static Map<String, Point> allPoints=new TreeMap<String, Point>();
    public static void main(String[] args) {
        System.out.println("Start...");
        createPolygonScenario1();//1
//        createPolygonScenario2();//1
//        createPolygonScenario3();//3
//        createPolygonScenario4();//0
//        createPolygonScenario5();//10
//        createPolygonScenario6();//10
//        createPolygonScenario7();//6
//        createPolygonScenario8();//3
//        createPolygonScenario9();//6
//        createPolygonScenario10();//0
//        createPolygonScenario11();//15
        createAllCombinationsOfFourPoints(new ArrayList<String>(allPoints.keySet()));
        System.out.println("allQuadrilaterals.size() : " + allQuadrilaterals.size());
        System.out.println("allQuadrilaterals : " + allQuadrilaterals);
        countRectangleQuadrilateral();
//        pickFourPointsAndCheckRectangle(allPoints, "P1,P2,P5,P4");
//        pickFourPointsAndCheckRectangle(allPoints, "P1,P3,P4,P6");
//        pickFourPointsAndCheckRectangle(allPoints, "P1,P2,P5,P6");
//        printRectangleStatus();
//        checkRectangle(p2x, p2y, p1x, p1y, p3x, p3y, p4x, p4y);

//        checkRightAngleTriangle(p1x, p1y, p2x, p2y, p3x, p3y);
//        checkRightAngleTriangle(p1x, p1y, p3x, p3y, p4x, p4y);

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

    public static void createAllCombinationsOfFourPoints( List<String> allPointsKey){
        List<String> fourKeys=new LinkedList<String>(allPointsKey);
        if(allPointsKey.size()==4){
            saveQuadrilaterals(allPointsKey);
        }else if(allPointsKey.size()>=5){
            List<String> tempList = new ArrayList<>(allPointsKey.subList(0, allPointsKey.size()-1));
            createAllCombinationsOfFourPoints(tempList);
            for (int i=0; i<allPointsKey.size()-1; i++) {
                tempList = new ArrayList<>(allPointsKey.subList(0, allPointsKey.size()-1));
                tempList.set(i,allPointsKey.get(allPointsKey.size()-1));
                createAllCombinationsOfFourPoints(tempList);
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

//        System.out.println("oneCombinationList : " + oneCombinationList);
        if(!allQuadrilaterals.containsKey(quadrilateralKey)) {
            allQuadrilaterals.put(quadrilateralKey, new Quadrilateral(allPoints.get(oneCombinationList.get(0)), allPoints.get(oneCombinationList.get(1)), allPoints.get(oneCombinationList.get(2)), allPoints.get(oneCombinationList.get(3))));
        }
    }

    public static void printRectangleStatus(){
        int rectangleCount=0;
        for (String onePoint: rectangleStatus.keySet()){
            rectangleCount += rectangleStatus.get(onePoint);
        }
        System.out.println("Total Rectangle: " + rectangleCount);
        System.out.println(rectangleStatus);
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
        System.out.println(rectangleStatus);
    }

        public static void pickFourPointsAndCheckRectangle(Map<String, String> allPoints, String pointsKey){
            System.out.println("Checking for : " + pointsKey);
        String []fourPointsKey=pointsKey.split(",");
        int rectangleCount=checkRectangle(getX(allPoints.get(fourPointsKey[0])),getY(allPoints.get(fourPointsKey[0])),getX(allPoints.get(fourPointsKey[1])),getY(allPoints.get(fourPointsKey[1])),getX(allPoints.get(fourPointsKey[2])),getY(allPoints.get(fourPointsKey[2])),getX(allPoints.get(fourPointsKey[3])),getY(allPoints.get(fourPointsKey[3])));
        rectangleStatus.put(pointsKey,rectangleCount);
    }
    public static int getX(String point){
        return Integer.parseInt(point.split(",")[0]);
    }
    public static int getY(String point){
        return Integer.parseInt(point.split(",")[1]);
    }
    public static int checkRectangle(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y, int p4x, int p4y){
//        System.out.println("Points are : " + "("+p1x + ", " + p1y + "), (" +p2x + ", " + p2y+"), ("+ p3x +", "+ p3y+ "), (" +p4x+", "+ p4y+")");
        List<Integer> allDistance=new ArrayList<Integer>();
        allDistance.add((p1x-p2x)*(p1x-p2x) +(p1y-p2y)*(p1y-p2y));
        allDistance.add((p2x-p3x)*(p2x-p3x) +(p2y-p3y)*(p2y-p3y));
        allDistance.add((p1x-p3x)*(p1x-p3x) +(p1y-p3y)*(p1y-p3y));

        allDistance.add((p3x-p4x)*(p3x-p4x) +(p3y-p4y)*(p3y-p4y));
        allDistance.add((p1x-p4x)*(p1x-p4x) +(p1y-p4y)*(p1y-p4y));
        allDistance.add((p2x-p4x)*(p2x-p4x) +(p2y-p4y)*(p2y-p4y));

        Collections.sort(allDistance);
//        System.out.println("All distance: " + allDistance);

        if(allDistance.get(allDistance.size()-1)==allDistance.get(allDistance.size()-2) && allDistance.get(0)!=0){
            System.out.println("Points are : " + "("+p1x + ", " + p1y + "), (" +p2x + ", " + p2y+"), ("+ p3x +", "+ p3y+ "), (" +p4x+", "+ p4y+")");
            System.out.println("Points are forming rectangle: ");
            return 1;
        }else{
//            System.out.println("Points are NOT forming rectangle: ");
            return 0;
        }

    }
}
