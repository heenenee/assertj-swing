/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2015 the original author or authors.
 */
package org.assertj.swing.core;

import static org.assertj.swing.core.MouseButton.LEFT_BUTTON;
import static org.assertj.swing.core.MouseButton.MIDDLE_BUTTON;
import static org.assertj.swing.core.MouseButton.RIGHT_BUTTON;

import javax.annotation.Nonnull;

/**
 * Provider of {@link MouseButton} values.
 * 
 * @author Alex Ruiz
 */
final class MouseButtonProvider {
  static @Nonnull Object[][] mouseButtons() {
    return new Object[][] { { LEFT_BUTTON }, { MIDDLE_BUTTON }, { RIGHT_BUTTON } };
  }

  private MouseButtonProvider() {
  }
}
