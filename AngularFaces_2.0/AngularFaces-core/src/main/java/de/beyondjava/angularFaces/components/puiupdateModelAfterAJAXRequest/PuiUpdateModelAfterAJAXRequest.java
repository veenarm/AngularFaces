/**
 *  (C) 2013-2015 Stephan Rauh http://www.beyondjava.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.beyondjava.angularFaces.components.puiupdateModelAfterAJAXRequest;

import java.io.Serializable;

import javax.faces.component.FacesComponent;
import javax.faces.component.html.HtmlOutputText;

/** This generates code to update the AngularJS model after an AJAX request. */
@FacesComponent("de.beyondjava.puiUpdateModelAfterAJAXRequests")
public class PuiUpdateModelAfterAJAXRequest extends HtmlOutputText implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public static final String COMPONENT_FAMILY = "de.beyondjava";

	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
}
