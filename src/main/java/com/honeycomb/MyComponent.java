package com.honeycomb;

import com.vaadin.ui.AbstractComponent;
import com.honeycomb.client.MyComponentServerRpc;
import com.vaadin.ui.Notification;
import com.vaadin.shared.MouseEventDetails;

public class MyComponent extends AbstractComponent {
    
        public MyComponent() {
            MyComponentServerRpc rpc =
            new MyComponentServerRpc() {
                private int clickCount = 0;
        
                public void clicked(MouseEventDetails mouseDetails) {
                    Notification.show("Clicked " + clickCount++  +" " + mouseDetails.getButtonName());
                }
            };
            registerRpc(rpc);
        }

}