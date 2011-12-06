/*
 * Licensed to ElasticSearch and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. ElasticSearch licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.client.action.admin.indices.exists;

import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.admin.indices.exists.IndicesExistsRequest;
import org.elasticsearch.action.admin.indices.exists.IndicesExistsResponse;
import org.elasticsearch.client.IndicesAdminClient;
import org.elasticsearch.client.action.admin.indices.support.BaseIndicesRequestBuilder;

/**
 *
 */
public class IndicesExistsRequestBuilder extends BaseIndicesRequestBuilder<IndicesExistsRequest, IndicesExistsResponse> {

    public IndicesExistsRequestBuilder(IndicesAdminClient indicesClient, String... indices) {
        super(indicesClient, new IndicesExistsRequest(indices));
    }

    public IndicesExistsRequestBuilder setIndices(String... indices) {
        request.indices(indices);
        return this;
    }

    @Override
    protected void doExecute(ActionListener<IndicesExistsResponse> listener) {
        client.exists(request, listener);
    }
}
