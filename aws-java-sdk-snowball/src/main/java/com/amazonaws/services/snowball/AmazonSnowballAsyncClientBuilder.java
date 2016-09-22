/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.snowball;

import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.builder.AwsAsyncClientBuilder;
import com.amazonaws.client.AwsAsyncClientParams;

/**
 * Fluent builder for {@link com.amazonaws.services.snowball.AmazonSnowballAsync}. Use of the builder is preferred over
 * using constructors of the client class.
 **/
@NotThreadSafe
public final class AmazonSnowballAsyncClientBuilder extends AwsAsyncClientBuilder<AmazonSnowballAsyncClientBuilder, AmazonSnowballAsync> {

    private static final ClientConfigurationFactory CLIENT_CONFIG_FACTORY = new ClientConfigurationFactory();;

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static AmazonSnowballAsyncClientBuilder standard() {
        return new AmazonSnowballAsyncClientBuilder();
    }

    /**
     * @return Default async client using the {@link com.amazonaws.auth.DefaultAWSCredentialsProviderChain} and
     *         {@link com.amazonaws.regions.DefaultAwsRegionProviderChain} chain
     */
    public static AmazonSnowballAsync defaultClient() {
        return standard().build();
    }

    private AmazonSnowballAsyncClientBuilder() {
        super(CLIENT_CONFIG_FACTORY);
    }

    /**
     * Construct an asynchronous implementation of AmazonSnowballAsync using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of AmazonSnowballAsync.
     */
    @Override
    protected AmazonSnowballAsync build(AwsAsyncClientParams params) {
        return new AmazonSnowballAsyncClient(params);
    }

}
