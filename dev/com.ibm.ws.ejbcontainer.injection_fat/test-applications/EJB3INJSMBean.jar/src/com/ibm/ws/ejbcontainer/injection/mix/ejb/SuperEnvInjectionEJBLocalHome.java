/*******************************************************************************
 * Copyright (c) 2006, 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.ws.ejbcontainer.injection.mix.ejb;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

public interface SuperEnvInjectionEJBLocalHome extends EJBLocalHome {
    /**
     * @return SuperEnvInjectionEJBLocal The SessionBean EJB object.
     * @exception javax.ejb.CreateException SessionBean EJB object was not created.
     */
    public SuperEnvInjectionEJBLocal create() throws CreateException;
}
