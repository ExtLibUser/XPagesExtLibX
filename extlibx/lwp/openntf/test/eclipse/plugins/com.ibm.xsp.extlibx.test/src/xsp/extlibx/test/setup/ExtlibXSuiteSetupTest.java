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
* Date: 28 Sep 2011
* ExtlibXSuiteSetupTest.java
*/

package xsp.extlibx.test.setup;

import xsp.extlibx.test.ExtlibXTestSuite;

import com.ibm.xsp.test.framework.XspTestUtil;
import com.ibm.xsp.test.framework.setup.BaseSuiteSetupTest;

/**
 *
 * @author Maire Kehoe (mkehoe@ie.ibm.com)
 */
public class ExtlibXSuiteSetupTest extends BaseSuiteSetupTest {

    /**
     * @return
     */
    @Override
    protected String getTestedSuiteName() {
        return XspTestUtil.getShortClass(ExtlibXTestSuite.class);
    }
    /**
     * @return
     */
    @Override
    protected long getTestedSuiteVersion() {
        return ExtlibXTestSuite.BASED_ON_SAMPLE_SUITE_VERSION;
    }
}
