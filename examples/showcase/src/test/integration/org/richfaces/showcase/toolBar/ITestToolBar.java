/*******************************************************************************
 * JBoss, Home of Professional Open Source
 * Copyright 2010-2014, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 *******************************************************************************/
package org.richfaces.showcase.toolBar;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.arquillian.graphene.page.Page;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.richfaces.showcase.AbstractWebDriverTest;
import org.richfaces.showcase.toolBar.page.ToolbarPage;

/**
 * @author <a href="mailto:jhuska@redhat.com">Juraj Huska</a>
 * @version $Revision$
 */
public class ITestToolBar extends AbstractWebDriverTest {

    private final String CONTEXT = "/showcase/images/icons";
    private final String[] EXPECTED_ELEMENTS = { CONTEXT + "/create_doc.gif", CONTEXT + "/create_folder.gif",
            CONTEXT + "/copy.gif", CONTEXT + "/save.gif", CONTEXT + "/save_as.gif", CONTEXT + "/save_all.gif" };
    private Set<String> actualElements = new HashSet<String>();

    @Page
    private ToolbarPage page;

    @Test
    public void testAllExpectedElementsPresention() {
        for (WebElement image : page.toolbarImages) {
            assertTrue("Toolbar image should be present", image.isDisplayed());
            String src = image.getAttribute("src");
            if (!runInPortalEnv) {
                actualElements.add(src);
            } else {
                /* Workaround for portal environment because src attribute is autogenerated there */
                Pattern pattern = Pattern.compile("resourceID=(.*?)&");
                Matcher matcher = pattern.matcher(src);
                matcher.find();
                actualElements.add("/showcase" + matcher.group(1));
            }
        }
        checkExpectedSrcs(actualElements);

        assertTrue("The separator element is missing", isElementPresent(page.separator));
        assertTrue("The search input is missing", isElementPresent(page.searchInput));
        assertTrue("The search input is missing", isElementPresent(page.searchButton));
    }

    /**
     * Checks whether particular set contains all expected values
     * 
     * @param set
     */
    private void checkExpectedSrcs(Set<String> set) {
        for (int i = 0; i < EXPECTED_ELEMENTS.length; i++) {
            assertTrue("There is missing element " + EXPECTED_ELEMENTS[i], set.contains(EXPECTED_ELEMENTS[i]));
        }
    }
}
