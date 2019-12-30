package sample;

import java.util.*;

public class Polygon {
    private Map<String, Quadrilateral> allQuadrilaterals;
    private Map<String, Point> allPoints;

    public void createAllCombinationsOfQuadrilaterals(){
        allQuadrilaterals=new TreeMap<>();
        List<String> allPointsKey=new LinkedList<String>(allPoints.keySet());
        createAllQuadrilaterals(allPointsKey);
    }

    private void createAllQuadrilaterals(List<String> allPointsKey){
        if(allPointsKey.size()==4){
            saveQuadrilaterals(allPointsKey);
        }else if(allPointsKey.size()>=5){
            List<String> tempList = new ArrayList<>(allPointsKey.subList(0, allPointsKey.size()-1));
            createAllQuadrilaterals(tempList);
            for (int i=0; i<allPointsKey.size()-1; i++) {
                tempList = new ArrayList<>(allPointsKey.subList(0, allPointsKey.size()-1));
                tempList.set(i,allPointsKey.get(allPointsKey.size()-1));
                createAllQuadrilaterals(tempList);
            }
        }
    }
    private void saveQuadrilaterals(List<String> oneCombination){
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

    public  void countRectangleQuadrilateral(){
        int rectangleCount=0;
        int tempCount=0;
        Quadrilateral quadrilateral=null;
        for (String oneQuadrilateralKey: allQuadrilaterals.keySet()){
            quadrilateral=allQuadrilaterals.get(oneQuadrilateralKey);
            tempCount= quadrilateral.checkRectangle();
            rectangleCount +=tempCount;
            if(tempCount==1){
                System.out.println("Points are: " + oneQuadrilateralKey);
            }
        }
        System.out.println("Total Rectangle: " + rectangleCount);
    }
    public void createPolygonScenario1(){
//        allPoints.clear();
        allPoints=new TreeMap<String, Point>();
        //Scenario 1 => 1
        allPoints.put("P1", new Point(1,1));
        allPoints.put("P2", new Point(4,1));
        allPoints.put("P3", new Point(1,3));
        allPoints.put("P4", new Point(4,3));
    }
    public void createPolygonScenario2(){
        allPoints=new TreeMap<String, Point>();
        //Scenario2 => 1
        allPoints.put("P1", new Point(1,1));
        allPoints.put("P2", new Point(4,1));
        allPoints.put("P3", new Point(1,3));
        allPoints.put("P4", new Point(4,3));
        allPoints.put("P5", new Point(5,1));
    }
    public void createPolygonScenario3(){
        allPoints=new TreeMap<String, Point>();
        //Scenario3 => 3
        allPoints.put("P1", new Point(1,1));
        allPoints.put("P2", new Point(4,1));
        allPoints.put("P3", new Point(1,3));
        allPoints.put("P4", new Point(4,3));
        allPoints.put("P5", new Point(5,1));
        allPoints.put("P6", new Point(5,3));

    }
    public void createPolygonScenario4(){
        allPoints=new TreeMap<String, Point>();
        //Scenario 4 => 0
        allPoints.put("P1", new Point(2,2));
        allPoints.put("P2", new Point(9,2));
        allPoints.put("P3", new Point(16,2));
        allPoints.put("P4", new Point(5,8));
        allPoints.put("P5", new Point(12,8));
        allPoints.put("P6", new Point(18,8));
    }
    public void createPolygonScenario5(){
        allPoints=new TreeMap<String, Point>();
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
    public void createPolygonScenario6(){
        allPoints=new TreeMap<String, Point>();
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
    public void createPolygonScenario7(){
        allPoints=new TreeMap<String, Point>();
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
    public void createPolygonScenario8(){
        allPoints=new TreeMap<String, Point>();
        //Scenario 8 => 3
        allPoints.put("P2", new Point(0,2));
        allPoints.put("P3", new Point(-2,2));
        allPoints.put("P4", new Point(-2,0));
        allPoints.put("P5", new Point(-2,-2));
        allPoints.put("P6", new Point(0,-2));
        allPoints.put("P7", new Point(2,-2));
        allPoints.put("P8", new Point(2,0));

    }
    public void createPolygonScenario9(){
        allPoints=new TreeMap<String, Point>();
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
    public void createPolygonScenario10(){
        allPoints=new TreeMap<String, Point>();
        //Scenario 10 => 0
        allPoints.put("P1", new Point(1,0));
        allPoints.put("P2", new Point(2,0));
        allPoints.put("P3", new Point(3,0));
        allPoints.put("P4", new Point(4,0));
        allPoints.put("P5", new Point(5,0));
    }
    public void createPolygonScenario11(){
        allPoints=new TreeMap<String, Point>();
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
}
