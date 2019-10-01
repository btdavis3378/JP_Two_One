
import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private String engineType;
  private int engineCylinders;
  private String driveTrain;

  public ManufacturedEngine(){
    engineManufacturer = "Generic";
    engineManufacturedDate = new Date();
    engineMake = "Generic";
    engineModel = "Generic";
    engineType = "Generic";
    engineCylinders = 0;
    driveTrain = "Generic";

  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineType = engineType;
    this.engineCylinders = engineCylinders;
    this.driveTrain = driveTrain;
  }

  @Override
  public String toString() {
    return "Engine Manufacturer : " + engineManufacturer + "\n"
        +  "Engine Manufactured : " + engineManufacturedDate + "\n"
        +  "Engine Make : " + engineMake + "\n"
        +  "Engine Model : " + engineModel + "\n"
        +  "Engine Type : " + engineType + "\n"
        +  "Engine Cylinders : " + engineCylinders + "\n"
        +  "Drive Train : " + driveTrain + "\n"
        ;
  }

  public String getEngineManufacturer() {
    return engineManufacturer;
  }

  @Override
  public void setEngineManufacturer(String engineManufacturer) {
    this.engineManufacturer = engineManufacturer;
  }

  public Date getEngineManufacturedDate() {
    return engineManufacturedDate;
  }

  @Override
  public void setEngineManufacturedDate(Date engineManufacturedDate) {
    this.engineManufacturedDate = engineManufacturedDate;
  }

  public String getEngineMake() {
    return engineMake;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  public String getEngineModel() {
    return engineModel;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  @Override
  public int setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
    return engineCylinders;
  }

  public int getEngineCylinders() {
    return engineCylinders;
  }

  public String getEngineType() {
    return engineType;
  }

  @Override
  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }
}
