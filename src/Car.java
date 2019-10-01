
import java.util.Date;

public class Car extends Vehicle {
  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
    feature[0] = new InteriorFeature("No Interior Features");
    feature[1] = new ExteriorFeature("No Exterior Features");
    carAxle = 2;
  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String vehicleTrain, Engine vehicleEngine, Feature[] feature, int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, vehicleTrain, vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;
  }

  public String getExteriorFeatures() {
    String exteriorFeatures = "";
    for (int i = 0; i < feature.length; i++) {
      if (feature[i] instanceof ExteriorFeature) {
        exteriorFeatures += feature[i].toString();
      }
    }
    return exteriorFeatures;
  }

  public String getInteriorFeatures() {
    String interiorFeatures = "";
    for (int k = 0; k < feature.length; k++) {
      if (feature[k] instanceof InteriorFeature){
        interiorFeatures += feature[k].toString();
      }
    }
    return interiorFeatures;
  }

  @Override
  public String toString() {
    return super.toString()
        + "Features : \n"
        + getInteriorFeatures()
        + getExteriorFeatures()
        + "Car Axle : " + carAxle;
  }
}
