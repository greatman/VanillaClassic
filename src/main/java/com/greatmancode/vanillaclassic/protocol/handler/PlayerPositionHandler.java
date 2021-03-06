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
package com.greatmancode.vanillaclassic.protocol.handler;

import org.spout.api.entity.Player;
import org.spout.api.geo.discrete.Point;
import org.spout.api.math.Quaternion;
import org.spout.api.math.QuaternionMath;
import org.spout.api.protocol.MessageHandler;
import org.spout.api.protocol.Session;

import com.greatmancode.vanillaclassic.protocol.msg.PositionMessage;

public final class PlayerPositionHandler extends MessageHandler<PositionMessage> {

	@Override
	public void handleServer(Session session, PositionMessage message)  {
		Player pl = session.getPlayer();
		pl.getScene().setPosition(new Point(pl.getWorld(), message.getX(), message.getY(), message.getZ()));
		pl.getScene().setRotation(QuaternionMath.rotation(message.getPitch(), message.getYaw(), 0));
	}
}
