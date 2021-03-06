/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package fr.creart.gamestack.common.lang;

/**
 * Basic wrapper, just contains a value.
 *
 * {@inheritDoc}
 * @author Creart
 */
public class BasicWrapper<T> extends Wrapper<T> {

    /**
     * {@inheritDoc}
     */
    public BasicWrapper()
    {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public BasicWrapper(T value)
    {
        super(value);
    }

    @Override
    public void set(T value)
    {
        this.value = value;
    }

    @Override
    public T get()
    {
        return value;
    }

}
