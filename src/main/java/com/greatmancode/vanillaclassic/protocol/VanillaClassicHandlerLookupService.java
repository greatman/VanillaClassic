/*
 * This file is part of VanillaClassic.
 *
 * Copyright (c) 2012 - 2013, Greatman <http://www.github.com/greatman/>
 * VanillaClassic is licensed under the SpoutDev License Version 1.
 *
 * VanillaClassic is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * VanillaClassic is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package com.greatmancode.vanillaclassic.protocol;

import org.spout.api.protocol.HandlerLookupService;

import com.greatmancode.vanillaclassic.protocol.handler.IdentificationHandler;
import com.greatmancode.vanillaclassic.protocol.handler.PlayerMessageHandler;
import com.greatmancode.vanillaclassic.protocol.handler.PlayerPositionHandler;
import com.greatmancode.vanillaclassic.protocol.handler.SetBlockHandler;
import com.greatmancode.vanillaclassic.protocol.msg.IdentificationMessage;
import com.greatmancode.vanillaclassic.protocol.msg.MessageMessage;
import com.greatmancode.vanillaclassic.protocol.msg.PositionMessage;
import com.greatmancode.vanillaclassic.protocol.msg.SetBlockClientMessage;

public class VanillaClassicHandlerLookupService extends HandlerLookupService {
	public VanillaClassicHandlerLookupService() {
		try {
			bind(IdentificationMessage.class, IdentificationHandler.class);
			bind(SetBlockClientMessage.class, SetBlockHandler.class);
			bind(PositionMessage.class, PlayerPositionHandler.class);
			bind(MessageMessage.class, PlayerMessageHandler.class);
		} catch (Exception ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
}
