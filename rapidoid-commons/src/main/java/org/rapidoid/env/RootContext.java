/*-
 * #%L
 * rapidoid-commons
 * %%
 * Copyright (C) 2014 - 2018 Nikolche Mihajlovski and contributors
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

package org.rapidoid.env;

import org.rapidoid.RapidoidThing;
import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;
import org.rapidoid.log.Log;
import org.rapidoid.u.U;
import org.rapidoid.util.Msc;

import java.io.File;

@Authors("Nikolche Mihajlovski")
@Since("5.4.6")
public class RootContext extends RapidoidThing {

	private final String root;

	private RootContext(String root) {
		this.root = root;
	}

	public String root() {
		return root;
	}

	public static RootContext from(String root) {
		if (root != null) {
			File dir = new File(root);

			if (dir.exists()) {
				int count = getAppResourcesCount(dir);
				Log.info("Setting root path", "!root", root, "items", count);

			} else {
				Log.warn("Setting non-existing root path", "!root", root);
			}
		}

		return new RootContext(root);
	}

	private static int getAppResourcesCount(File dir) {
		int count = 0;

		if (dir.isDirectory()) {
			File[] files = dir.listFiles();

			if (files != null) {

				for (File file : files) {
					if (Msc.isAppResource(file.getName())) count++;
				}

			} else {
				throw U.rte("Couldn't access the root path: " + dir.getAbsolutePath());
			}

		} else {
			throw U.rte("The configured root path must be a folder: " + dir.getAbsolutePath());
		}

		return count;
	}

}
