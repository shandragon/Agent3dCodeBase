/* Copyright 2008 - 2021 Hochschule Offenburg
 * For a list of authors see README.md
 * This software of HSOAutonomy is released under GPL-3 License (see gpl.txt).
 */

package kdo.ebnDevKit.staubs.decision.beliefs;

import kdo.ebnDevKit.staubs.model.IStaubs;

public class Diff extends Belief
{
	public Diff(String name, IStaubs model)
	{
		super(name, model);
	}

	@Override
	public float getTruthValue()
	{
		return Math.abs(((float) model.getDirt() - (float) model.getEnergy()));
	}
}
