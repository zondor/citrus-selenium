/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.consol.citrus.validation.matcher.selenium;

import com.consol.citrus.context.TestContext;
import com.consol.citrus.exceptions.ValidationException;
import com.consol.citrus.validation.matcher.ValidationMatcher;
import java.util.List;

/**
 *
 * @author Tamer Erdogan
 */
public class NotNullValidationMatcher implements ValidationMatcher {

	@Override
	public void validate(String fieldName, String value, List<String> controlParameters, TestContext context) throws ValidationException {
		if (value == null) {
			throw new ValidationException(this.getClass().getSimpleName()
					+ " failed for field '" + fieldName + "'.");
		}
	}
}
