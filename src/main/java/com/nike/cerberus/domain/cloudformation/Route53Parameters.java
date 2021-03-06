/*
 * Copyright (c) 2017 Nike, Inc.
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

package com.nike.cerberus.domain.cloudformation;

/**
 * Represents the route53 stack inputs.
 */
public class Route53Parameters {
    private String hostedZoneId;

    private String loadBalancerDomainName;

    private String loadBalancerStackName;

    private String originDomainName;

    public String getHostedZoneId() {
        return hostedZoneId;
    }

    public Route53Parameters setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    public String getLoadBalancerDomainName() {
        return loadBalancerDomainName;
    }

    public Route53Parameters setLoadBalancerDomainName(String loadBalancerDomainName) {
        this.loadBalancerDomainName = loadBalancerDomainName;
        return this;
    }

    public String getLoadBalancerStackName() {
        return loadBalancerStackName;
    }

    public Route53Parameters setLoadBalancerStackName(String loadBalancerStackName) {
        this.loadBalancerStackName = loadBalancerStackName;
        return this;
    }

    public String getOriginDomainName() {
        return originDomainName;
    }

    public Route53Parameters setOriginDomainName(String originDomainName) {
        this.originDomainName = originDomainName;
        return this;
    }
}
