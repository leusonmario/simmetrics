/*
 * SimMetrics - SimMetrics is a java library of Similarity or Distance
 * Metrics, e.g. Levenshtein Distance, that provide float based similarity
 * measures between String Data. All metrics return consistent measures
 * rather than unbounded similarity scores.
 * 
 * Copyright (C) 2014  SimMetrics authors
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * 
 */
package org.simmetrics.tokenizers;

import org.simmetrics.tokenizers.QGram3Tokenizer;
import org.simmetrics.tokenizers.Tokenizer;


public class QGram3TokenizerTest extends TokenizerTest {


	@Override
	protected Tokenizer getTokenizer() {
		return new QGram3Tokenizer();
	}

	@Override
	public T[] getTests() {

		return new T[] {
				new T("12345678", "123", "234", "345", "456", "567", "678"),
				new T("123123", "123", "231", "312", "123"),

		};
	}
}