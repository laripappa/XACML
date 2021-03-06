/*
 *                        AT&T - PROPRIETARY
 *          THIS FILE CONTAINS PROPRIETARY INFORMATION OF
 *        AT&T AND IS NOT TO BE DISCLOSED OR USED EXCEPT IN
 *             ACCORDANCE WITH APPLICABLE AGREEMENTS.
 *
 *          Copyright (c) 2013 AT&T Knowledge Ventures
 *              Unpublished and Not for Publication
 *                     All Rights Reserved
 */
package com.att.research.xacml.std.pep;

import java.util.Properties;

import com.att.research.xacml.api.pep.PEPEngine;
import com.att.research.xacml.api.pep.PEPEngineFactory;
import com.att.research.xacml.api.pep.PEPException;

public class StdEngineFactory extends PEPEngineFactory {

	public StdEngineFactory() {
	}

	@Override
	public PEPEngine newEngine() throws PEPException {
		return new StdEngine();
	}

	@Override
	public PEPEngine newEngine(Properties properties) throws PEPException {
		return new StdEngine(properties);
	}

}
