package tech.meliora.natujenge.factory;

import tech.meliora.natujenge.factory.impl.Mercedes;
import tech.meliora.natujenge.factory.impl.Subaru;
import tech.meliora.natujenge.factory.impl.Toyota;

public class CarFactory {

    public static ICar getInstance(String useCase){

        if(useCase.equalsIgnoreCase("reliability")){
            return new Toyota();
        }else if(useCase.equalsIgnoreCase("look")){
            return new Mercedes();
        }else if(useCase.equalsIgnoreCase("power")){
            return new Subaru();
        }else{
            return null;
        }
    }
}
