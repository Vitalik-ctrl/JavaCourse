package Lesson04;

public class SmartWatch extends Gadget implements StepCount {
    private int shape;
    private String beltMaterial;
    private boolean isWaterProofed;

    public SmartWatch(String model, int batteryCapacity, String OS, int yearRelease, int shape, String beltMaterial, boolean isWaterProofed) {
        super(model, batteryCapacity, OS, yearRelease);
        this.shape = shape;
        this.beltMaterial = beltMaterial;
        this.isWaterProofed = isWaterProofed;
    }

    public SmartWatch(int shape, String beltMaterial, boolean isWaterProofed) {
        this.shape = shape;
        this.beltMaterial = beltMaterial;
        this.isWaterProofed = isWaterProofed;
    }

    public int getShape() {
        return shape;
    }

    public void setShape(int shape) {
        this.shape = shape;
    }

    public String getBeltMaterial() {
        return beltMaterial;
    }

    public void setBeltMaterial(String beltMaterial) {
        this.beltMaterial = beltMaterial;
    }

    public boolean isWaterProofed() {
        return isWaterProofed;
    }

    public void setWaterProofed(boolean waterProofed) {
        isWaterProofed = waterProofed;
    }

    @Override
    public int calculateStep() {
        // TODO: 11/21/22 implements logic
        return 0;
    }

    @Override
    public int calculateDistance() {
        // TODO: 11/21/22 implements logic
        return 0;
    }

    @Override
    public int calculateFloors() {
        // TODO: 11/21/22 implements logic
        return 0;
    }

    @Override
    public int calculateStep(int startPoint, int endPoint) {
        return 0;

    }

    public void showInfo(double meters) {
        System.out.println("Result of converting "+meters+" meters to foots is "+convert(meters)+".");
    }

    private double convert(double meters) {
        return meters*MtoF;
        }
}
