// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package com.packtpub.springsecurity.events.client.managed.request;

import com.packtpub.springsecurity.events.client.request.EventRequest;
import com.packtpub.springsecurity.events.shared.scaffold.ScaffoldRequestFactory;

public interface ApplicationRequestFactory extends ScaffoldRequestFactory {

    EventRequest eventRequest();
}
