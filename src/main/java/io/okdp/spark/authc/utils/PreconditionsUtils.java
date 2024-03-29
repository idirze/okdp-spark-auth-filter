/*
 *    Copyright 2024 tosit.io
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.okdp.spark.authc.utils;

import static java.lang.String.format;

import com.google.common.base.Strings;

/** Preconditions check utility methods */
public class PreconditionsUtils {

  /** Ensures the given string is not null. */
  public static String checkNotNull(String str, String label) {
    if (Strings.nullToEmpty(str).trim().isEmpty()) {
      throw new NullPointerException(
          format("The parameter <%s> should not be null or blank", label));
    } else {
      return str;
    }
  }
}
