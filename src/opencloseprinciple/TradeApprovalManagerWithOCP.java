package opencloseprinciple;

public class TradeApprovalManagerWithOCP {
	public void processClaim(TradeValidator validator){
        if(validator.isValidTrade()){
            System.out.println("Trade ApprovalManager: Valid Trade. Currently processing Trade for approval....");
        }
    }

}
