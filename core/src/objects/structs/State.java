package objects.structs;

import engine.Logger;

public enum State {
    FAINTED(-1),
    IDLE(0),
    WALK(1),
    JUMP(2),
    ATK_RANGED(3);

    private int num;

    State(int num) {
        this.num = num;
    }

    public static State getState(int i) {
        switch (i) {
            case -1:
                return FAINTED;
            case 0:
                return IDLE;
            case 1:
                return WALK;
            case 2:
                return JUMP;
            case 3:
                return ATK_RANGED;
            default:
                Logger.log(Logger.Level.ERROR,
                        "State number not found (%s)\n",
                        i);
                return null;
        }
    }

    public int getNum() {
        return num;
    }
}
