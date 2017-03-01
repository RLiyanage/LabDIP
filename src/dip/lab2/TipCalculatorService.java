/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Sanuth
 */
public class TipCalculatorService {
    private TipCalculator tipCalculator;

    public TipCalculatorService(TipCalculator tipCalcultor) {
        this.tipCalculator = tipCalcultor;
    }
    

    public TipCalculator getTipCalcultor() {
        return tipCalculator;
    }

    public void setTipCalcultor(TipCalculator tipCalcultor) {
        this.tipCalculator = tipCalcultor;
    }
    public double getCalculatedTip(){
        return tipCalculator.getTip();
    }
}
