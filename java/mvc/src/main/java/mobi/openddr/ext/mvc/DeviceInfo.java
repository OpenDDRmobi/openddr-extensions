/*
 * Copyright (c) 2018, 2021 Eclipse Krazo committers and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package mobi.openddr.ext.mvc;

import jakarta.mvc.RedirectScoped;

import java.io.Serializable;

/**
 * Holds device information.
 *
 * @author Ivar Grimstad
 */
@RedirectScoped
public class DeviceInfo implements Serializable {

    private static final long serialVersionUID = 347652475167L;

    private boolean isMobile;
    private boolean isTablet;

    public DeviceInfo() {
    }

    public void setTablet(boolean tablet) {
        isTablet = tablet;
        isMobile = !tablet;
    }

    public boolean isMobile() {
        return isMobile;
    }

    public boolean isTablet() {
        return isTablet;
    }
}
