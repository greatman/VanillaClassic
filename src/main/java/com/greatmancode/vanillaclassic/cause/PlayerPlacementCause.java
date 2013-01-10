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
package com.greatmancode.vanillaclassic.cause;

import org.spout.api.entity.Player;
import org.spout.api.event.cause.PlayerCause;
import org.spout.api.geo.cuboid.Block;
import org.spout.api.material.Material;

public class PlayerPlacementCause extends PlayerCause {
	private final Block block;
	private final Material toPlace;

	public PlayerPlacementCause(Player player, Material toPlace, Block block) {
		super(player);
		this.block = block;
		this.toPlace = toPlace;
	}

	/**
	 * Gets where the material is going to be placed
	 * @return placed
	 */
	public Block getBlock() {
		return block;
	}

	/**
	 * Gets the block material that is going to be placed
	 * @return to place
	 */
	public Material getPlacedMaterial() {
		return toPlace;
	}
}
