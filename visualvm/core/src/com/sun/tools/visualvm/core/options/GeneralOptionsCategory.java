/*
 * Copyright 2007-2008 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package com.sun.tools.visualvm.core.options;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.netbeans.spi.options.OptionsCategory;
import org.netbeans.spi.options.OptionsPanelController;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;

public final class GeneralOptionsCategory extends OptionsCategory {

    public Icon getIcon() {
        return new ImageIcon(Utilities.loadImage("com/sun/tools/visualvm/core/ui/resources/options.png"));
    }

    public String getCategoryName() {
        return NbBundle.getMessage(GeneralOptionsCategory.class, "OptionsCategory_Name_Core");
    }

    public String getTitle() {
        return NbBundle.getMessage(GeneralOptionsCategory.class, "OptionsCategory_Title_Core");
    }

    public OptionsPanelController create() {
        return new GeneralOptionsPanelController();
    }
}
