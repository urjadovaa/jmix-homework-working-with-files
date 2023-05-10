package com.sample.drivers.screen.document;

import io.jmix.ui.screen.*;
import com.sample.drivers.entity.Document;

@UiController("Document.edit")
@UiDescriptor("document-edit.xml")
@EditedEntityContainer("documentDc")
public class DocumentEdit extends StandardEditor<Document> {
}