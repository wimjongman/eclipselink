/*******************************************************************************
 * Copyright (c) 1998, 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     @author  mobrien
 *     @since   EclipseLink 2.1.1 enh# 316510
 *     06/30/2010-2.1.1 Michael O'Brien 
 *       - 316513: Enable JMX MBean functionality for JBoss, Glassfish and WebSphere in addition to WebLogic
 *       Move JMX MBean generic registration code up from specific platforms
 *       see <link>http://wiki.eclipse.org/EclipseLink/DesignDocs/316513</link>        
 ******************************************************************************/  
package org.eclipse.persistence.services.websphere;

import java.util.Locale;

import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.services.RuntimeServices;

/**
 * <p>
 * <b>Purpose</b>: Provide a dynamic interface into the EclipseLink Session.
 * <p>
 * <b>Description</b>: This class is meant to provide facilities for managing an EclipseLink session external
 * to EclipseLink over JMX.
 * 
 * @since EclipseLink 2.1.1
 */
public class WebSphereRuntimeServices extends RuntimeServices {

    static {
        PLATFORM_NAME = "WebSphere";
    }
    
    /**
     * PUBLIC:
     *  Default Constructor
     */
    public WebSphereRuntimeServices() {
        super();
    }

    /**
     *  PUBLIC:
     *  Create an instance of WebSphereRuntimeServices to be associated with the provided session
     *
     *  @param session The session to be used with these RuntimeServices
     */
    public WebSphereRuntimeServices(AbstractSession session) {
        super();
        this.session = session;
        this.updateDeploymentTimeData();
    }

    /**
     *  Create an instance of WebSphereRuntimeServices to be associated with the provided locale
     *
     *  The user must call setSession(Session) afterwards to define the session.
     */
    public WebSphereRuntimeServices(Locale locale) {
    }


}