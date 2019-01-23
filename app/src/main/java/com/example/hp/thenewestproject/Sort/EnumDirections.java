package com.example.hp.thenewestproject.Sort;

import java.util.ArrayList;

public class EnumDirections {

    public int[] changeCoordinates(int x, int y, Directions p){
        if (p == Directions.UP){
            x = x;
            y += 1;
        }
        if (p == Directions.DOWN){
            x = x;
            y -= 1;
        }
        if (p == Directions.LEFT){
            x -= 1;
            y = y;
        }
        if (p == Directions.RIGHT){
            x += 1;
            y = y;
        }

        return new int[] {0,0,x,y};
    }

    public int[] fewSteps(){
        int[] location = {0,0};
        ArrayList<Integer> fullPath = new ArrayList<Integer>();
        fullPath.add(0);
        fullPath.add(0);
        Directions[] path = {Directions.UP,Directions.UP,Directions.LEFT,
                Directions.DOWN,Directions.LEFT,Directions.DOWN,Directions.DOWN,
                Directions.RIGHT,Directions.RIGHT,Directions.DOWN,
                Directions.RIGHT};
        for (int i = 0; i < path.length; i++){
            if(path[i] == Directions.UP){
                location[0] = location[0];
                location[1] += 1;
            }
            if(path[i] == Directions.DOWN){
                location[0] = location[0];
                location[1] -= 1;
            }
            if(path[i] == Directions.LEFT){
                location[0] -= 1;
                location[1] = location[1];
            }
            if(path[i] == Directions.RIGHT){
                location[0] += 1;
                location[1] = location[1];
            }
            fullPath.add(location[0]);
            fullPath.add(location[1]);
        }
        int[] finalPathArray = new int[fullPath.size()];
        for(int i = 0; i < fullPath.size(); i++){
            finalPathArray[i] = fullPath.get(i);
        }
        return finalPathArray;
    }

    public enum Directions{
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
