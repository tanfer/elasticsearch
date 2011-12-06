/*
 * Licensed to Elastic Search and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Elastic Search licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.index.indexing;

import org.elasticsearch.index.engine.Engine;

/**
 *
 */
public abstract class IndexingOperationListener {

    public Engine.Create preCreate(Engine.Create create) {
        return create;
    }

    public void postCreate(Engine.Create create) {

    }

    public Engine.Index preIndex(Engine.Index index) {
        return index;
    }

    public void postIndex(Engine.Index index) {

    }

    public Engine.Delete preDelete(Engine.Delete delete) {
        return delete;
    }

    public void postDelete(Engine.Delete delete) {

    }

    public Engine.DeleteByQuery preDeleteByQuery(Engine.DeleteByQuery deleteByQuery) {
        return deleteByQuery;
    }

    public void postDeleteByQuery(Engine.DeleteByQuery deleteByQuery) {

    }
}
