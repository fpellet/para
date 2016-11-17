/*
 * Copyright 2013-2016 Erudika. https://erudika.com
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
 *
 * For issues and patches go to: https://github.com/erudika
 */
package com.erudika.para.iot;

/**
 * IoT service factory.
 * @author Alex Bogdanovski [alex@erudika.com]
 */
public interface IoTServiceFactory {

	/**
	 * Creates the appropriate IoT service for a given name.
	 * @param name a name, e.g. AWS, Azure
	 * @return a IoT service
	 */
	IoTService getIoTService(String name);

}