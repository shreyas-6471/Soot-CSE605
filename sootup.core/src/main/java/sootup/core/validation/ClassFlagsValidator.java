package sootup.core.validation;

/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 1997-2020 Raja Vallée-Rai, Linghui Luo
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

import java.util.List;
import sootup.core.model.SootClass;

/**
 * Validator that checks for impossible combinations of class flags
 *
 * @author Steven Arzt
 */
public class ClassFlagsValidator implements ClassValidator {

  @Override
  public void validate(SootClass sc, List<ValidationException> exceptions) {
    // TODO: check code from old soot in the comment

    /*
     * if (sc.isInterface() && sc.isEnum()) { exceptions.add(new ValidationException(sc,
     * "Class is both an interface and an enum")); } if (sc.isSynchronized()) { exceptions.add(new ValidationException(sc,
     * "Classes cannot be synchronized")); }
     */
  }

  @Override
  public boolean isBasicValidator() {
    return true;
  }
}
