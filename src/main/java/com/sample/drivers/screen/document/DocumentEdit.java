package com.sample.drivers.screen.document;

import io.jmix.ui.screen.*;
import com.sample.drivers.entity.Document;

@UiController("Document.edit")
@UiDescriptor("document-edit.xml")
@EditedEntityContainer("documentDc")
public class DocumentEdit extends StandardEditor<Document> {

    // test git
    @Subscribe
    public void onInit(InitEvent event) {
        System.out.println("Just remove this code");
    }




}