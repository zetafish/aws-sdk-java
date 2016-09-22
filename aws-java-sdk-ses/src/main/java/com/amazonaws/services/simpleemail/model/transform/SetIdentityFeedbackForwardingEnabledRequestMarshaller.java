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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * SetIdentityFeedbackForwardingEnabledRequest Marshaller
 */

public class SetIdentityFeedbackForwardingEnabledRequestMarshaller implements
        Marshaller<Request<SetIdentityFeedbackForwardingEnabledRequest>, SetIdentityFeedbackForwardingEnabledRequest> {

    public Request<SetIdentityFeedbackForwardingEnabledRequest> marshall(SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest) {

        if (setIdentityFeedbackForwardingEnabledRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetIdentityFeedbackForwardingEnabledRequest> request = new DefaultRequest<SetIdentityFeedbackForwardingEnabledRequest>(
                setIdentityFeedbackForwardingEnabledRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SetIdentityFeedbackForwardingEnabled");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (setIdentityFeedbackForwardingEnabledRequest.getIdentity() != null) {
            request.addParameter("Identity", StringUtils.fromString(setIdentityFeedbackForwardingEnabledRequest.getIdentity()));
        }

        if (setIdentityFeedbackForwardingEnabledRequest.getForwardingEnabled() != null) {
            request.addParameter("ForwardingEnabled", StringUtils.fromBoolean(setIdentityFeedbackForwardingEnabledRequest.getForwardingEnabled()));
        }

        return request;
    }

}
