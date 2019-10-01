
import java.util.Date;

public class Vehicle implements Engine, Chassis {

  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String vehicleTrain;
  private Engine vehicleEngine;

  public Vehicle() {
    vehicleManufacturedDate = new Date();
    vehicleManufacturer = "Generic";
    vehicleMake = "Generic";
    vehicleModel = "Generic";
    vehicleFrame = new VehicleFrame();
    vehicleType = "Generic";
    vehicleTrain = "Generic";
    vehicleEngine = new ManufacturedEngine();
  }

  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String vehicleTrain, Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.vehicleTrain = vehicleTrain;
    this.vehicleEngine = vehicleEngine;
  }

  @Override
  public Chassis getChassisType() {
    return null;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    return;
  }

  @Override
  public int setEngineCylinders(int engineCylinders) {
    return engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleMake = vehicleMake;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleModel = vehicleModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleTrain = vehicleTrain;
  }

  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine = vehicleEngine;
  }

  public String toString() {
    return "Manufacturer Name : " + vehicleManufacturer + "\n"
        +  "Manufactured Date : " + vehicleManufacturedDate + "\n"
        +  "Vehicle Make : " + vehicleMake + "\n"
        +  "Vehicle Model : " + vehicleModel + "\n"
        +  "Vehicle Type : " + vehicleType + "\n"
        +  vehicleEngine.toString()
        ;
  }



}
