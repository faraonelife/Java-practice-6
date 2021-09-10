package com.faraonelife.Observer;

import java.util.Scanner;
import java.util.Timer;

public class WeatherStationTest {
    // WeatherStationTest file
        public static void start () {
            WeatherStation ws = new WeatherStation ();
// create here new observer devices and register them to WeatherStation
// ...
           CurrConDis currConDis=new CurrConDis(ws);



           ws.run();
// running weather station as daemon thread
            Timer timer = new Timer ( true );
            timer . scheduleAtFixedRate (ws , 0, 5*1000);
// command for stopping timer
            System . out . println (" Type ’exit ’ to quit ");
            Scanner sc = new Scanner( System .in );
            String cmd = "";
            do {
                cmd = sc. nextLine ();
            }
            while (! cmd . equalsIgnoreCase (" exit "));
            timer . cancel ();
        }

}
