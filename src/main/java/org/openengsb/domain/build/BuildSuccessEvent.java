/**
 * Licensed to the Austrian Association for Software Tool Integration (AASTI)
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. The AASTI licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openengsb.domain.build;

import org.openengsb.core.api.Event;
import org.openengsb.core.api.model.OpenEngSBFileModel;

public class BuildSuccessEvent extends Event {
    private String output;

    private String buildId;

    private OpenEngSBFileModel path;

    public BuildSuccessEvent(String buildId, String output, OpenEngSBFileModel path) {
        this.buildId = buildId;
        this.output = output;
        this.path = path;
    }

    public BuildSuccessEvent(Long processId, String output, OpenEngSBFileModel path) {
        super(processId);
        this.output = output;
        this.path = path;
    }

    public String getBuildId() {
        return buildId;
    }

    public String getOutput() {
        return output;
    }

    public OpenEngSBFileModel getPath() {
        return path;
    }

}
