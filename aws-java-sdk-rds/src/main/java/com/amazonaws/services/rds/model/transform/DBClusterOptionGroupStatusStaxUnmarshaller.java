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
package com.amazonaws.services.rds.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DBClusterOptionGroupStatus StAX Unmarshaller
 */
public class DBClusterOptionGroupStatusStaxUnmarshaller implements Unmarshaller<DBClusterOptionGroupStatus, StaxUnmarshallerContext> {

    public DBClusterOptionGroupStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBClusterOptionGroupStatus dBClusterOptionGroupStatus = new DBClusterOptionGroupStatus();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBClusterOptionGroupStatus;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DBClusterOptionGroupName", targetDepth)) {
                    dBClusterOptionGroupStatus.setDBClusterOptionGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    dBClusterOptionGroupStatus.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBClusterOptionGroupStatus;
                }
            }
        }
    }

    private static DBClusterOptionGroupStatusStaxUnmarshaller instance;

    public static DBClusterOptionGroupStatusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterOptionGroupStatusStaxUnmarshaller();
        return instance;
    }
}
