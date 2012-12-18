/*
 * This file is part of VanillaClassic.
 *
 * Copyright (c) 2011-2012, Greatman <http://github.com/greatman/>
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
package org.greatmancode.vanillaclassic.protocol;

import org.jboss.netty.buffer.ChannelBuffer;
import org.spout.api.chat.ChatArguments;
import org.spout.api.command.Command;
import org.spout.api.exception.UnknownPacketException;
import org.spout.api.protocol.Message;
import org.spout.api.protocol.MessageCodec;
import org.spout.api.protocol.Protocol;
import org.spout.api.protocol.Session;

public class VanillaClassicProtocol extends Protocol {

	public final static int DEFAULT_PORT = 25565;
	public VanillaClassicProtocol() {
		super("VanillaClassic", 25565, new VanillaClassicCodecLookupService(), new VanillaClassicHandlerLookupService());
	}
	@Override
	public MessageCodec<?> readHeader(ChannelBuffer buf) throws UnknownPacketException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChannelBuffer writeHeader(MessageCodec<?> codec, ChannelBuffer data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message getKickMessage(ChatArguments message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message getCommandMessage(Command command, ChatArguments arguments) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message getIntroductionMessage(String playerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initializeSession(Session session) {
		// TODO Auto-generated method stub

	}

}
