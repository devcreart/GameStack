/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package fr.creart.gamestack.common.connection.database.sql;

import fr.creart.gamestack.common.connection.database.AbstractRequest;
import fr.creart.gamestack.common.connection.database.RequestType;
import fr.creart.gamestack.common.misc.Callback;
import java.sql.ResultSet;

/**
 * Represents a SQL request to the database
 *
 * @author Creart
 */
public class SQLRequest extends AbstractRequest<ResultSet> {

    private String request;

    /**
     * @param type    request's type. If it is a query, please use the other constructor with the callback.
     * @param request the sql request
     */
    public SQLRequest(RequestType type, String request)
    {
        this(type, request, null);
    }

    /**
     * @param type          request's type
     * @param request       the sql request
     * @param queryCallback the callback, called when the query is executed
     */
    public SQLRequest(RequestType type, String request, Callback<ResultSet> queryCallback)
    {
        super(type, queryCallback);
        this.request = request;
    }

    /**
     * Returns the SQL request
     *
     * @return the SQL request
     */
    public String getRequest()
    {
        return request;
    }

    @Override
    public String toString()
    {
        return "SQLRequest{request" + request + ", request_type=" + type.name() + "}";
    }

}
