/*
 * Copyright (C) 2015 The Android Open Source Project
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
package com.google.currysrc.api.match;

import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 * Useful factory methods for {@link SourceMatcher} instances.
 */
public final class SourceMatchers {

  private static final SourceMatcher ALWAYS_MATCHER = new SourceMatcher() {
    @Override
    public boolean matches(CompilationUnit cu) {
      return true;
    }
  };

  private SourceMatchers() {
  }

  /** Returns a {@link SourceMatcher} that matches and {@link CompilationUnit}. */
  public static SourceMatcher always() {
    return ALWAYS_MATCHER;
  }

}
