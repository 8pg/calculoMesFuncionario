package entities_enum;

/**
 *
 * @author 8pg
 */
public enum WorkerLevel {

    JUNIOR, MID_LEVEL, SENIOR;

    public String getByDescription() {
        switch (this) {
            case JUNIOR:
                return "Junior";
            case MID_LEVEL:
                return "Pleno";
            case SENIOR:
                return "Senior";
            default:
                return "";
        }
    }
}
