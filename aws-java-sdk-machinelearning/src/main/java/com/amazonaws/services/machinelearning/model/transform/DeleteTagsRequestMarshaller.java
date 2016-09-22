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
package com.amazonaws.services.machinelearning.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DeleteTagsRequest Marshaller
 */
public class DeleteTagsRequestMarshaller implements Marshaller<Request<DeleteTagsRequest>, DeleteTagsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DeleteTagsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteTagsRequest> marshall(DeleteTagsRequest deleteTagsRequest) {

        if (deleteTagsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteTagsRequest> request = new DefaultRequest<DeleteTagsRequest>(deleteTagsRequest, "AmazonMachineLearning");
        request.addHeader("X-Amz-Target", "AmazonML_20141212.DeleteTags");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> tagKeysList = (com.amazonaws.internal.SdkInternalList<String>) deleteTagsRequest.getTagKeys();
            if (!tagKeysList.isEmpty() || !tagKeysList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("TagKeys");
                jsonGenerator.writeStartArray();
                for (String tagKeysListValue : tagKeysList) {
                    if (tagKeysListValue != null) {
                        jsonGenerator.writeValue(tagKeysListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (deleteTagsRequest.getResourceId() != null) {
                jsonGenerator.writeFieldName("ResourceId").writeValue(deleteTagsRequest.getResourceId());
            }
            if (deleteTagsRequest.getResourceType() != null) {
                jsonGenerator.writeFieldName("ResourceType").writeValue(deleteTagsRequest.getResourceType());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
