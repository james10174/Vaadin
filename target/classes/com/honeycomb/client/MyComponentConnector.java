package com.honeycomb.client;

import com.honeycomb.client.MyComponent;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

@Connect(com.honeycomb.client.MyComponent.class)
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