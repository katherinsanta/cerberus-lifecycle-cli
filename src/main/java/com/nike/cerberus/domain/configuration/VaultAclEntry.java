/*
 * Copyright (c) 2016 Nike Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nike.cerberus.domain.configuration;

/**
 * POJO creating the ACL token and entry JSON.
 */
public class VaultAclEntry {

    private String aclToken;

    private String entry;

    public String getAclToken() {
        return aclToken;
    }

    public VaultAclEntry setAclToken(String aclToken) {
        this.aclToken = aclToken;
        return this;
    }

    public String getEntry() {
        return entry;
    }

    public VaultAclEntry setEntry(String entry) {
        this.entry = entry;
        return this;
    }
}
