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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeExportTasksRequest Marshaller
 */

public class DescribeExportTasksRequestMarshaller implements Marshaller<Request<DescribeExportTasksRequest>, DescribeExportTasksRequest> {

    public Request<DescribeExportTasksRequest> marshall(DescribeExportTasksRequest describeExportTasksRequest) {

        if (describeExportTasksRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeExportTasksRequest> request = new DefaultRequest<DescribeExportTasksRequest>(describeExportTasksRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeExportTasks");
        request.addParameter("Version", "2016-04-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> exportTaskIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeExportTasksRequest
                .getExportTaskIds();
        if (!exportTaskIdsList.isEmpty() || !exportTaskIdsList.isAutoConstruct()) {
            int exportTaskIdsListIndex = 1;

            for (String exportTaskIdsListValue : exportTaskIdsList) {
                if (exportTaskIdsListValue != null) {
                    request.addParameter("ExportTaskId." + exportTaskIdsListIndex, StringUtils.fromString(exportTaskIdsListValue));
                }
                exportTaskIdsListIndex++;
            }
        }

        return request;
    }

}
