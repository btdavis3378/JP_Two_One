
public class VehicleFrame implements Chassis {

  private String vehicleFrameType;

  public VehicleFrame(){
    vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public Chassis getChassisType() {
    return this;
  }

  @Override
  public void setChassisType(String vehicleFrameType) {
    return;
  }

  @Override
  public String toString() {
    return "Chassis : " + chassis + "\n"
        + "Vehicle Frame : " + vehicleFrameType + "\n";
  }

}
