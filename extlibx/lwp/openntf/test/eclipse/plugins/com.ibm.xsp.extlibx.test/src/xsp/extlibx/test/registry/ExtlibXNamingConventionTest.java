/*
 * � Copyright IBM Corp. 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
/*
* Author: Maire Kehoe (mkehoe@ie.ibm.com)
* Date: 29 Sep 2011
* ExtlibXNamingConventionTest.java
*/

package xsp.extlibx.test.registry;

import xsp.extlib.test.registry.ExtlibNamingConventionTest;

/**
 *
 * @author Maire Kehoe (mkehoe@ie.ibm.com)
 */
public class ExtlibXNamingConventionTest extends ExtlibNamingConventionTest {

    // ExtlibX naming convention rules & configuration are 
    // the same as the Extlib naming conventions
    
    private String[] skips = new String[]{
    };
    @Override
    protected String[] getSkips() {
        String[] arr = super.getSkips();
        // This is checking a different set of controls than the superclass
        // so none of the superclass skips apply
        arr = skips;
        
        return arr;
    }
}
