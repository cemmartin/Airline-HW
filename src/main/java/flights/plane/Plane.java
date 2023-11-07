package flights.plane;

public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
//        super(planeType.getPlaneName()); //why doesn't this work??????
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() { 
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }
}
