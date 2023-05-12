package com.sample.drivers.screen.driver;

import io.jmix.ui.component.Image;
import io.jmix.ui.model.InstanceContainer;
import io.jmix.ui.screen.*;
import com.sample.drivers.entity.Driver;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Driver.edit")
@UiDescriptor("driver-edit.xml")
@EditedEntityContainer("driverDc")
public class DriverEdit extends StandardEditor<Driver> {

    @Autowired
    private Image<byte[]> driverPhoto;

    // (*) (опционально) скрывать компонент, если фотография водителя еще не загружена.

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        if (getEditedEntity().getPhoto() == null ) driverPhoto.setVisible(false);
    }

    @Subscribe(id = "driverDc", target = Target.DATA_CONTAINER)
    public void onDriverDcItemPropertyChange(InstanceContainer.ItemPropertyChangeEvent<Driver> event) {
        driverPhoto.setVisible("photo".equals(event.getProperty()) && event.getValue() != null);
    }

}