package com.example.ship.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class ShipService {

    private static Map<Integer, List> shipMap = new HashMap<>();
    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();
    private static List<Integer> list3 = new ArrayList<>();
    private static List<Integer> list4 = new ArrayList<>();

    private static List<Integer> list5 = new ArrayList<>();
    private static List<Integer> list6 = new ArrayList<>();

    private static int x = 2;
    private static int y = 2;

    private static List<Integer> cordinates = new ArrayList<>();


    private static List<Integer> facingDirections = new ArrayList<>();
    static {


        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(6);

        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        list4.add(6);

        list5.add(1);
        list5.add(2);
        list5.add(3);
        list5.add(4);
        list5.add(5);
        list5.add(6);

        list6.add(1);
        list6.add(2);
        list6.add(3);
        list6.add(4);
        list6.add(5);
        list6.add(6);

        shipMap.put(1,list1);
        shipMap.put(2,list2);
        shipMap.put(3,list3);
        shipMap.put(4,list4);

        cordinates.add(x);
        cordinates.add(y);

        facingDirections.add(2);
        facingDirections.add(3);

    }


    public List<Integer> getCordinates() {
        return cordinates;
    }

    public List<Integer> moveShip(String action) {
        if(action.equals("Forward")) {
            forward();
        } else if (action.equals("Backward")) {
            backward();
        } else if (action.equals("Right")) {
            right();
        } else if (action.equals("Left")) {
            left();
        } else if (action.equals("Stay")) {
            return cordinates;
        }
        return cordinates;
    }

    private static void forward() {
        //Check if direction is in same grid line
        if(Objects.equals(cordinates.get(0), facingDirections.get(0))) {
            if(facingDirections.get(1) > cordinates.get(1)) {
                cordinates.set(1, cordinates.get(1) + 1);
                facingDirections.set(1, facingDirections.get(1) + 1);
            } else {
                cordinates.set(1, cordinates.get(1) - 1);
                facingDirections.set(1, facingDirections.get(1) - 1);
            }
        } else {
            if(facingDirections.get(0) > cordinates.get(0)) {
                cordinates.set(0, cordinates.get(0) + 1);
                facingDirections.set(0, facingDirections.get(0) + 1);
            } else {
                cordinates.set(0, cordinates.get(0) - 1);
                facingDirections.set(0, facingDirections.get(0) - 1);
            }
        }
    }

    private static void backward() {
        //Check if direction is in same grid line
        if(Objects.equals(cordinates.get(0), facingDirections.get(0))) {
            if(facingDirections.get(1) > cordinates.get(1)) {
                cordinates.set(1, cordinates.get(1) - 1);
                facingDirections.set(1, facingDirections.get(1) - 1);
            } else {
                cordinates.set(1, cordinates.get(1) + 1);
                facingDirections.set(1, facingDirections.get(1) + 1);
            }
        } else {
            if(facingDirections.get(0) > cordinates.get(0)) {
                cordinates.set(0, cordinates.get(0) - 1);
                facingDirections.set(0, facingDirections.get(0) - 1);
            } else {
                cordinates.set(0, cordinates.get(0) + 1);
                facingDirections.set(0, facingDirections.get(0) + 1);
            }
        }
    }

    private static void right() {
        //Check if direction is in same grid line
        if(!Objects.equals(cordinates.get(0), facingDirections.get(0))) {
            if(facingDirections.get(0) > cordinates.get(0)) {
                cordinates.set(1, cordinates.get(1) - 1);
                facingDirections.set(1, facingDirections.get(1) - 1);
            } else {
                cordinates.set(1, cordinates.get(1) + 1);
                facingDirections.set(1, facingDirections.get(1) + 1);
            }
        } else {
            if(facingDirections.get(1) > cordinates.get(1)) {
                cordinates.set(0, cordinates.get(0) + 1);
                facingDirections.set(0, facingDirections.get(0) + 1);
            } else {
                cordinates.set(0, cordinates.get(0) - 1);
                facingDirections.set(0, facingDirections.get(0) - 1);
            }
        }
    }

    private static void left() {
        //Check if direction is in same grid line
        if(!Objects.equals(cordinates.get(0), facingDirections.get(0))) {
            if(facingDirections.get(0) > cordinates.get(0)) {
                cordinates.set(1, cordinates.get(1) + 1);
                facingDirections.set(1, facingDirections.get(1) + 1);
            } else {
                cordinates.set(1, cordinates.get(1) - 1);
                facingDirections.set(1, facingDirections.get(1) - 1);
            }
        } else {
            if(facingDirections.get(1) > cordinates.get(1)) {
                cordinates.set(0, cordinates.get(0) - 1);
                facingDirections.set(0, facingDirections.get(0) - 1);
            } else {
                cordinates.set(0, cordinates.get(0) + 1);
                facingDirections.set(0, facingDirections.get(0) + 1);
            }
        }
    }
}
