/**
 * Copyright (C) 2009 Kenji Nozawa
 * This file is part of LAPIN.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package lapin.util;
import lapin.lang.Lists;
import lapin.lang.Symbols;
public class TracableException extends RuntimeException {
    private Object trace = Symbols.NIL;
    public TracableException(String msg, Throwable cause) {
        super(msg, cause);
    }
    public TracableException(String msg) {
        super(msg);
    }
    public TracableException push(Object exp) {
        trace = Lists.cons(exp, trace);
        return this;
    }
    public Object backTrace() {
        return trace;
    }
}
