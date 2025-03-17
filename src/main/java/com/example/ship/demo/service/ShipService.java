package com.example.ship.demo.service;

import com.example.ship.demo.GridLimitReachedExecption;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ShipService {
    private static int x = 3;
    private static int y = 4;

    private static int gridMaxLimit = 6;
    private static int gridMinLimit = 1;

    private static List<Integer> cordinates = new ArrayList<>();

    private static List<Integer> facingDirections = new ArrayList<>();
    static {

        cordinates.add(x);
        cordinates.add(y);

        facingDirections.add(3);
        facingDirections.add(5);

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
                if(facingDirections.get(1) == gridMaxLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(1, cordinates.get(1) + 1);
                facingDirections.set(1, facingDirections.get(1) + 1);
            } else {
                if(facingDirections.get(1) == gridMinLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(1, cordinates.get(1) - 1);
                facingDirections.set(1, facingDirections.get(1) - 1);
            }
        } else {
            if(facingDirections.get(0) > cordinates.get(0)) {
                if(facingDirections.get(0) == gridMaxLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(0, cordinates.get(0) + 1);
                facingDirections.set(0, facingDirections.get(0) + 1);
            } else {
                if(facingDirections.get(0) == gridMinLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(0, cordinates.get(0) - 1);
                facingDirections.set(0, facingDirections.get(0) - 1);
            }
        }
    }

    private static void backward() {
        //Check if direction is in same grid line
        if(Objects.equals(cordinates.get(0), facingDirections.get(0))) {
            if(facingDirections.get(1) > cordinates.get(1)) {
                if(facingDirections.get(1) == gridMaxLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(1, cordinates.get(1) - 1);
                facingDirections.set(1, facingDirections.get(1) - 1);
            } else {
                if(facingDirections.get(1) == gridMinLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(1, cordinates.get(1) + 1);
                facingDirections.set(1, facingDirections.get(1) + 1);
            }
        } else {
            if(facingDirections.get(0) > cordinates.get(0)) {
                if(facingDirections.get(0) == gridMaxLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(0, cordinates.get(0) - 1);
                facingDirections.set(0, facingDirections.get(0) - 1);
            } else {
                if(facingDirections.get(0) == gridMinLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(0, cordinates.get(0) + 1);
                facingDirections.set(0, facingDirections.get(0) + 1);
            }
        }
    }

    private static void right() {
        //Check if direction is in same grid line
        if(!Objects.equals(cordinates.get(0), facingDirections.get(0))) {
            if(facingDirections.get(0) > cordinates.get(0)) {
                if(facingDirections.get(1) == gridMinLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(1, cordinates.get(1) - 1);
                facingDirections.set(1, facingDirections.get(1) - 1);
            } else {
                if(facingDirections.get(1) == gridMaxLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(1, cordinates.get(1) + 1);
                facingDirections.set(1, facingDirections.get(1) + 1);
            }
        } else {
            if(facingDirections.get(1) > cordinates.get(1)) {
                if(facingDirections.get(0) == gridMaxLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(0, cordinates.get(0) + 1);
                facingDirections.set(0, facingDirections.get(0) + 1);
            } else {
                if(facingDirections.get(0) == gridMinLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(0, cordinates.get(0) - 1);
                facingDirections.set(0, facingDirections.get(0) - 1);
            }
        }
    }

    private static void left() {
        //Check if direction is in same grid line
        if(!Objects.equals(cordinates.get(0), facingDirections.get(0))) {
            if(facingDirections.get(0) > cordinates.get(0)) {
                if(facingDirections.get(1) == gridMaxLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(1, cordinates.get(1) + 1);
                facingDirections.set(1, facingDirections.get(1) + 1);
            } else {
                if(facingDirections.get(1) == gridMinLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(1, cordinates.get(1) - 1);
                facingDirections.set(1, facingDirections.get(1) - 1);
            }
        } else {
            if(facingDirections.get(1) > cordinates.get(1)) {
                if(facingDirections.get(1) == gridMinLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(0, cordinates.get(0) - 1);
                facingDirections.set(0, facingDirections.get(0) - 1);
            } else {
                if(facingDirections.get(1) == gridMaxLimit) {
                    throw new GridLimitReachedExecption(cordinates.toString());
                }
                cordinates.set(0, cordinates.get(0) + 1);
                facingDirections.set(0, facingDirections.get(0) + 1);
            }
        }
    }
}
