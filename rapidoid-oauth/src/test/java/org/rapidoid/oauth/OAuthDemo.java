package org.rapidoid.oauth;

/*
 * #%L
 * rapidoid-oauth
 * %%
 * Copyright (C) 2014 Nikolche Mihajlovski
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

import org.rapidoid.http.HTTP;
import org.rapidoid.http.HTTPServer;
import org.rapidoid.util.LogLevel;
import org.rapidoid.util.U;

public class OAuthDemo {

	public static void main(String[] args) {
		U.setLogLevel(LogLevel.DEBUG);
		HTTPServer server = HTTP.server().build();
		OAuth.register(server);
		server.start();
	}

}
