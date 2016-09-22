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
package com.amazonaws.services.cloudfront.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetStreamingDistributionResult StAX Unmarshaller
 */
public class GetStreamingDistributionResultStaxUnmarshaller implements Unmarshaller<GetStreamingDistributionResult, StaxUnmarshallerContext> {

    public GetStreamingDistributionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetStreamingDistributionResult getStreamingDistributionResult = new GetStreamingDistributionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            context.setCurrentHeader("ETag");
            getStreamingDistributionResult.setETag(StringStaxUnmarshaller.getInstance().unmarshall(context));

        }

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getStreamingDistributionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("StreamingDistribution", targetDepth)) {
                    getStreamingDistributionResult.setStreamingDistribution(StreamingDistributionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getStreamingDistributionResult;
                }
            }
        }
    }

    private static GetStreamingDistributionResultStaxUnmarshaller instance;

    public static GetStreamingDistributionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetStreamingDistributionResultStaxUnmarshaller();
        return instance;
    }
}
