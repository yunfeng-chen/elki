/*
 * This file is part of ELKI:
 * Environment for Developing KDD-Applications Supported by Index-Structures
 *
 * Copyright (C) 2017
 * ELKI Development Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.lmu.ifi.dbs.elki.data;

import de.lmu.ifi.dbs.elki.utilities.datastructures.arraylike.DoubleArrayAdapter;
import de.lmu.ifi.dbs.elki.utilities.datastructures.arraylike.NumberVectorAdapter;

/**
 * AbstractNumberVector is an abstract implementation of FeatureVector.
 * 
 * @author Arthur Zimek
 * @since 0.2
 */
public abstract class AbstractNumberVector implements NumberVector {
  /**
   * Factory class.
   * 
   * @author Erich Schubert
   * 
   * @apiviz.has AbstractNumberVector
   * 
   * @param <V> Vector type
   */
  public abstract static class Factory<V extends AbstractNumberVector> implements NumberVector.Factory<V> {
    @Override
    public V newNumberVector(double[] values) {
      return newNumberVector(values, DoubleArrayAdapter.STATIC);
    }

    @Override
    public V newNumberVector(NumberVector values) {
      return newNumberVector(values, NumberVectorAdapter.STATIC);
    }
  }
}
