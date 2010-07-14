/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.weld.bootstrap.api.test;

import java.util.concurrent.ScheduledExecutorService;

import org.jboss.weld.resources.spi.ScheduledExecutorServiceFactory;

public class MockScheduledExecutorServiceFactory implements ScheduledExecutorServiceFactory
{

   public ScheduledExecutorService get()
   {
      // TODO Auto-generated method stub
      return null;
   }

   public void cleanup()
   {
      // TODO Auto-generated method stub

   }

}
