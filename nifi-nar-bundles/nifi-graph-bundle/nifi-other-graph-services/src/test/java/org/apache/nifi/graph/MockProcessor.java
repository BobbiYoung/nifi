/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.graph;

import org.apache.nifi.components.PropertyDescriptor;
import org.apache.nifi.processor.AbstractProcessor;
import org.apache.nifi.processor.ProcessContext;
import org.apache.nifi.processor.ProcessSession;
import org.apache.nifi.processor.exception.ProcessException;

import java.util.Arrays;
import java.util.List;

public class MockProcessor extends AbstractProcessor {
    public static final PropertyDescriptor CLIENT = new PropertyDescriptor.Builder()
        .name("client")
        .required(false)
        .identifiesControllerService(GraphClientService.class)
        .build();
    public static final PropertyDescriptor GREMLIN_CLIENT = new PropertyDescriptor.Builder()
            .name("gremlin-client")
            .required(false)
            .identifiesControllerService(GremlinClientService.class)
            .build();

    public static final List<PropertyDescriptor> PROPS = Arrays.asList(CLIENT, GREMLIN_CLIENT);

    @Override
    public List<PropertyDescriptor> getSupportedPropertyDescriptors() {
        return PROPS;
    }

    @Override
    public void onTrigger(ProcessContext context, ProcessSession session) throws ProcessException {

    }
}
