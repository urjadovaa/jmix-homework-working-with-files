package com.sample.drivers.screen.driver;

import io.jmix.ui.screen.*;
import com.sample.drivers.entity.Driver;

@UiController("Driver.edit")
@UiDescriptor("driver-edit.xml")
@EditedEntityContainer("driverDc")
public class DriverEdit extends StandardEditor<Driver> {
}