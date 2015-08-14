/*
 * #%L
 * Simmetrics Core
 * %%
 * Copyright (C) 2014 - 2015 Simmetrics Authors
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */
package org.simmetrics.simplifier;

import org.simmetrics.simplifiers.RefinedSoundex;
import org.simmetrics.simplifiers.Simplifier;

@SuppressWarnings("javadoc")
public class RefinedSoundexTest extends SimplifierTest {

	@Override
	protected Simplifier getSimplifier() {
		return new RefinedSoundex();
	}

	@Override
	protected T[] getTests() {
		return new T[] { 
				new T("Tannhauser", "T6080309"),
				new T("James", "J40803"),
				new T("", ""),
				new T("Travis", "T690203"),
				new T("Marcus", "M809303"),
				
				new T("Ozymandias", "O050808603"),
				new T("Jones", "J40803"),
				new T("Jenkins", "J4083083"),
				new T("Trevor", "T690209"),
				new T("Marinus", "M8090803"),
		};
	}

}