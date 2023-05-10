package com.sample.drivers.screen.driver;

import io.jmix.ui.screen.*;
import com.sample.drivers.entity.Driver;

@UiController("Driver.browse")
@UiDescriptor("driver-browse.xml")
@LookupComponent("driversTable")
public class DriverBrowse extends StandardLookup<Driver> {
}