/*
 * Copyright (C) 2025  DragonsPlus
 * SPDX-License-Identifier: LGPL-3.0-or-later
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package plus.dragons.createdragonsplus.config;

import net.createmod.catnip.config.ConfigBase;

public class CDPRecipesConfig extends ConfigBase {
    public final ConfigBool enableBulkColoring = b(true,
            "enableBulkColoring",
            Comments.enableBulkColoring);
    public final ConfigBool enableBulkFreezing = b(true,
            "enableBulkFreezing",
            Comments.enableBulkFreezing);

    @Override
    public String getName() {
        return "recipes";
    }

    static class Comments {
        static final String enableBulkColoring = "If Bulk Coloring should be enabled";
        static final String enableBulkFreezing = "If Bulk Freezing should be enabled";
    }
}
