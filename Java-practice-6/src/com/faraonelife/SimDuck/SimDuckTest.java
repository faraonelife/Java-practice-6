package com.faraonelife.SimDuck;


import com.faraonelife.SimTurkey.Turkey;

import java.util.ArrayList;

public class SimDuckTest {

   public static void start(){
       ArrayList<IDuck>ducks=new ArrayList<>();
   ducks.add(new Duck("Antony"));
       ducks.add(new Duck("Jameson"));
       ducks.add(new Duck("Hollands"));

       TurkeyAdaptor turkeyAdaptor=new TurkeyAdaptor(new Turkey("sims"));


       ducks.add(turkeyAdaptor);


       SimDuck.simulations(ducks);
   }


}
