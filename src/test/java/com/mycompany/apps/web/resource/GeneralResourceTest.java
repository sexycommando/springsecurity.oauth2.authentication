/*
 * Copyright 2014 stnetadmin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mycompany.apps.web.resource;

import com.mycompany.apps.web.resources.GeneralResource;
import com.sun.jersey.test.framework.AppDescriptor;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.LowLevelAppDescriptor.Builder;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author stnetadmin
 */
public class GeneralResourceTest extends JerseyTest {

    @Test
    public void test_say() throws Exception {
        String response = resource()
                .path("test")
                .queryParam("name", "world")
                .get(String.class);
        assertThat(response, is("Hello, world!"));
    }

    @Override
    protected AppDescriptor configure() {
        return new Builder(GeneralResource.class).build();
    }
}
