/*
 *   Licensed to ObjectStyle LLC under one
 *   or more contributor license agreements.  See the NOTICE file
 *   distributed with this work for additional information
 *   regarding copyright ownership.  The ObjectStyle LLC licenses
 *   this file to you under the Apache License, Version 2.0 (the
 *   "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 */

package io.bootique.tools.shell.template;

import java.nio.file.Path;
import java.util.Objects;

public class Template {

    private final Path path;
    private final String content;

    public Template(Path path, String content) {
        this.path = Objects.requireNonNull(path);
        this.content = Objects.requireNonNull(content)  ;
    }

    public Path getPath() {
        return path;
    }

    public String getContent() {
        return content;
    }

    public Template withPath(Path newPath) {
        if(path.equals(newPath)) {
            return this;
        }
        return new Template(newPath, content);
    }

    public Template withContent(String newContent) {
        if(content.equals(newContent)) {
            return this;
        }
        return new Template(path, newContent);
    }

    @Override
    public String toString() {
        return "template {" + path + "}";
    }
}
