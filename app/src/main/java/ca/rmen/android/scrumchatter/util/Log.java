/**
 * Copyright 2016 Carmen Alvarez
 * <p/>
 * This file is part of Scrum Chatter.
 * <p/>
 * Scrum Chatter is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * Scrum Chatter is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with Scrum Chatter. If not, see <http://www.gnu.org/licenses/>.
 */
package ca.rmen.android.scrumchatter.util;

import ca.rmen.android.scrumchatter.BuildConfig;

@SuppressWarnings("unused")
public class Log {
    public static void v(String tag, String message) {
        if (BuildConfig.DEBUG) android.util.Log.v(tag, message);
    }

    public static void v(String tag, String message, Throwable t) {
        if (BuildConfig.DEBUG) android.util.Log.v(tag, message, t);
    }

    public static void d(String tag, String message) {
        if (BuildConfig.DEBUG) android.util.Log.d(tag, message);
    }

    public static void d(String tag, String message, Throwable t) {
        if (BuildConfig.DEBUG) android.util.Log.d(tag, message, t);
    }

    public static void i(String tag, String message) {
        android.util.Log.i(tag, message);
    }

    public static void i(String tag, String message, Throwable t) {
        android.util.Log.i(tag, message, t);
    }

    public static void w(String tag, String message) {
        android.util.Log.w(tag, message);
    }

    public static void w(String tag, String message, Throwable t) {
        android.util.Log.w(tag, message, t);
    }

    public static void e(String tag, String message) {
        android.util.Log.e(tag, message);
    }

    public static void e(String tag, String message, Throwable t) {
        android.util.Log.e(tag, message, t);
    }

    public static void wtf(String tag, String message) {
        android.util.Log.wtf(tag, message);
    }

    public static void wtf(String tag, String message, Throwable t) {
        android.util.Log.wtf(tag, message, t);
    }
}
