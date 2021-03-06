// -----BEGIN DISCLAIMER-----
/*******************************************************************************
 * Copyright (c) 2011, 2020 JCrypTool Team and Contributors
 *
 * All rights reserved. This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
// -----END DISCLAIMER-----
package org.jcryptool.fileexplorer.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.jcryptool.core.util.directories.DirectoryService;
import org.jcryptool.fileexplorer.views.FileExplorerView;

/**
 * Home handler. Expands and selects the user configured home directory in the <b>File Explorer</b>
 * view.
 *
 * @author Dominik Schadow
 * @version 0.9.5
 */
public class HomeHandler extends AbstractHandler {
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ((FileExplorerView) HandlerUtil.getActivePart(event)).expandToLevel(DirectoryService.getUserHomeDir());

        return null;
    }
}
