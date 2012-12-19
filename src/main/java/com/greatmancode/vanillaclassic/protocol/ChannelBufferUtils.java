/*
 * This file is part of VanillaClassic.
 *
 * Copyright (c) 2012, Greatman <http://www.github.com/greatman/>
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

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;

import org.jboss.netty.buffer.ChannelBuffer;

import com.greatmancode.vanillaclassic.VanillaClassicPlugin;

public final class ChannelBufferUtils {
	public static final int STRING_LENGTH = 64;

	private ChannelBufferUtils() {

	}

	public static String readString(ChannelBuffer buf) {
		byte[] string = new byte[STRING_LENGTH];
		buf.readBytes(string);
		return new String(string);
	}

	public static void writeString(ChannelBuffer buf, String str) {
		try {
			byte[] string = str.getBytes("US-ASCII");
			byte[] newString = new byte[STRING_LENGTH];
			for (int i = 0; i < newString.length; i++) {
				if (string.length < i) {
					newString[i] = 0x20;
				} else {
					newString[i] = string[i];
				}
			}
			buf.writeBytes(newString);
		} catch (UnsupportedEncodingException e) {
			VanillaClassicPlugin.getInstance().getLogger().log(Level.SEVERE, "The US-ASCII encoding was not found on this system!", e);
		}
	}
}
