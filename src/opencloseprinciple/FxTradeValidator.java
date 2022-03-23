package opencloseprinciple;

public class FxTradeValidator extends TradeValidator {
    public boolean isValidTrade(){
        System.out.println("FxTradeValidator: Validating Spot Trade Details...");
        /*Logic to validate Spot Trade*/
        return true;
    }

}