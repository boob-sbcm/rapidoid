package org.rapidoid.html.tag;

/*
 * #%L
 * rapidoid-gui
 * %%
 * Copyright (C) 2014 - 2017 Nikolche Mihajlovski and contributors
 * %%
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
 * #L%
 */

import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;
import org.rapidoid.html.SpecificTag;

@Authors("Nikolche Mihajlovski")
@Since("2.0.0")
public interface IframeTag extends SpecificTag<IframeTag> {

	String height();

	IframeTag height(String height);

	String width();

	IframeTag width(String width);

	String name();

	IframeTag name(String name);

	String sandbox();

	IframeTag sandbox(String sandbox);

	String src();

	IframeTag src(String src);

	String srcdoc();

	IframeTag srcdoc(String srcdoc);

	boolean seamless();

	IframeTag seamless(boolean seamless);

}
