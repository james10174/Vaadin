package com.honeycomb.client;

import com.honeycomb.MyComponent;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

@Connect(com.honeycomb.MyComponent.class)
public class MyComponentConnector extends AbstractComponentConnector {
    @Override
    protected Widget createWidget() {
        return GWT.create(MyComponentWidget.class);
    }
    //optional
    @Override
    public MyComponentWidget getWidget() {
        return (MyComponentWidget) super.getWidget();
    }
}