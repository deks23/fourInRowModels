package pl.damiankotynia.fourinrow.model;

import java.io.Serializable;

public enum ResponseStatus implements Serializable {
    FAILED,
    OK,
    MESSAGE,
    MOVE,
    NO_PLAYERS,
    START,
    LOST,
    WON,
    OPONENT_DISCONECTED
}
