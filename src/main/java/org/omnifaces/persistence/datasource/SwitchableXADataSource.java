/*
 * Copyright 2018 OmniFaces
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.omnifaces.persistence.datasource;

import java.sql.SQLException;

import javax.sql.XAConnection;
import javax.sql.XADataSource;

public class SwitchableXADataSource extends SwitchableCommonDataSource implements XADataSource {

	@Override
	public XADataSource getWrapped() {
		return (XADataSource) super.getWrapped();
	}

	// ------------------------- XADataSource-----------------------------------

	@Override
	public XAConnection getXAConnection() throws SQLException {
		return getWrapped().getXAConnection();
	}

	@Override
	public XAConnection getXAConnection(String user, String password) throws SQLException {
		return getWrapped().getXAConnection();
	}

}