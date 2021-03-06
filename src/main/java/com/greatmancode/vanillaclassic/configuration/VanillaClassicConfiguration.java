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
package com.greatmancode.vanillaclassic.configuration;

import java.io.File;
import java.util.logging.Level;


import org.spout.api.exception.ConfigurationException;
import org.spout.api.util.config.ConfigurationHolder;
import org.spout.api.util.config.ConfigurationHolderConfiguration;
import org.spout.api.util.config.yaml.YamlConfiguration;

import com.greatmancode.vanillaclassic.VanillaClassicPlugin;

public class VanillaClassicConfiguration extends ConfigurationHolderConfiguration {
	
	public static final ConfigurationHolder SERVER_NAME = new ConfigurationHolder("Spout Server", "general", "server-name");
	public static final ConfigurationHolder MOTD = new ConfigurationHolder("Default MOTD", "general", "motd");
	public static final ConfigurationHolder PUBLIC = new ConfigurationHolder(true, "general", "public");
	
	public static final WorldConfiguration WORLDS = new WorldConfiguration(VanillaClassicPlugin.getInstance().getDataFolder());
	
	public VanillaClassicConfiguration(File dataFolder) {
		super(new YamlConfiguration(new File(dataFolder, "config.yml")));
	}

	@Override
	public void load() {
		try {
			WORLDS.load();
			WORLDS.save();
			super.load();
			super.save();
			
		} catch (ConfigurationException e) {
			VanillaClassicPlugin.getInstance().getLogger().log(Level.WARNING, "Error loading VanillaClassic configuration: ", e);
		}
	}

	@Override
	public void save() {
		try {
			WORLDS.save();
			super.save();
		} catch (ConfigurationException e) {
			VanillaClassicPlugin.getInstance().getLogger().log(Level.WARNING, "Error saving VanillaClassic configuration: ", e);
		}
	}
}
