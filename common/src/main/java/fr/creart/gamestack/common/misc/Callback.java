/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package fr.creart.gamestack.common.misc;

/**
 * A task which is executed when the attended value is received or finally usable.
 *
 * @author Creart
 */
@FunctionalInterface
public interface Callback<V> {

    /**
     * Does whatever it wants with the given value.
     *
     * @param value Value
     */
    void call(V value) throws Exception;

}
