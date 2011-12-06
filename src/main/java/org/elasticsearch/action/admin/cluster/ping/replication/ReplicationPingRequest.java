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

package org.elasticsearch.action.admin.cluster.ping.replication;

import org.elasticsearch.action.support.replication.IndicesReplicationOperationRequest;
import org.elasticsearch.action.support.replication.ReplicationType;
import org.elasticsearch.common.unit.TimeValue;

/**
 *
 */
public class ReplicationPingRequest extends IndicesReplicationOperationRequest {

    public ReplicationPingRequest(String... indices) {
        this.indices = indices;
    }

    public ReplicationPingRequest() {

    }

    @Override
    public ReplicationPingRequest listenerThreaded(boolean threadedListener) {
        super.listenerThreaded(threadedListener);
        return this;
    }

    public ReplicationPingRequest replicationType(ReplicationType replicationType) {
        this.replicationType = replicationType;
        return this;
    }

    public ReplicationPingRequest timeout(TimeValue timeout) {
        this.timeout = timeout;
        return this;
    }

    public ReplicationPingRequest timeout(String timeout) {
        return timeout(TimeValue.parseTimeValue(timeout, null));
    }
}