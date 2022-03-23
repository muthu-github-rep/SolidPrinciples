package opencloseprinciple;

public class TradeApprovalManagerTest {
	 public static void main(String[] args) {
	      FxTradeValidator healthInsuranceSurveyor=new FxTradeValidator();
	      TradeApprovalManagerWithOCP claim1=new TradeApprovalManagerWithOCP();
	      claim1.processClaim(healthInsuranceSurveyor);
	 
	      SpotTradeValidator vehicleInsuranceSurveyor=new SpotTradeValidator();
	      TradeApprovalManagerWithOCP claim2=new TradeApprovalManagerWithOCP();
	      claim2.processClaim(vehicleInsuranceSurveyor);
	    }
}
