/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package fr.creart.gamestack.common.misc;

import com.google.common.base.Preconditions;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Modifier;

/**
 * Json utils
 *
 * @author Creart
 */
public final class JsonUtil {

    private static final Gson GSON = new GsonBuilder()
            .enableComplexMapKeySerialization()
            .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.TRANSIENT)
            .create();

    private JsonUtil()
    {

    }

    /**
     * Returns a textual json representation of the given object.
     * Transient and static fields are not serialized
     *
     * @param obj Object to serialize
     * @return a textual json representation of the given object
     */
    public static String toJson(Object obj)
    {
        Preconditions.checkNotNull(obj, "object can't be null");

        return GSON.toJson(obj);
    }

    /**
     * Returns the object deserialized from the String
     *
     * @param clazz source class
     * @param json  source String
     * @return the object deserialized from the String
     */
    public static <T> T fromJson(Class<T> clazz, String json)
    {
        return GSON.fromJson(json, clazz);
    }

}
