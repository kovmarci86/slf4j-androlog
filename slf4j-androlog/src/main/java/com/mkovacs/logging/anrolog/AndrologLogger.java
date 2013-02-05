package com.mkovacs.logging.anrolog;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.helpers.MessageFormatter;

import de.akquinet.android.androlog.Constants;
import de.akquinet.android.androlog.Log;

/**
 * Slf4j Logger implementation using Androlog's {@link Log}. 
 * @author NoTiCe
 */
public class AndrologLogger implements Logger {
    private String name;

    /**
     * Initializes the logger.
     * @param name The logger name.
     */
    public AndrologLogger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isTraceEnabled() {
        return Log.isLoggable(name, Constants.VERBOSE);
    }

    public void trace(String msg) {
        Log.v(msg);
    }

    public void trace(String format, Object arg) {
        Log.v(name, MessageFormatter.format(format, arg).getMessage());
    }

    public void trace(String format, Object arg1, Object arg2) {
        Log.v(name, MessageFormatter.format(format, arg1, arg2).getMessage());
    }

    public void trace(String format, Object... arguments) {
        Log.v(name, MessageFormatter.arrayFormat(format, arguments).getMessage());
    }

    public void trace(String msg, Throwable t) {
        Log.v(name, msg, t);
    }

    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled();
    }

    public void trace(Marker marker, String msg) {
        trace(msg);
    }

    public void trace(Marker marker, String format, Object arg) {
        trace(format, arg);
    }

    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        trace(format, arg1, arg2);
    }

    public void trace(Marker marker, String format, Object... argArray) {
        trace(format, argArray);
    }

    public void trace(Marker marker, String msg, Throwable t) {
        trace(msg, t);
    }

    public boolean isDebugEnabled() {
        return Log.isLoggable(name, Constants.DEBUG);
    }

    public void debug(String msg) {
        Log.d(msg);
    }

    public void debug(String format, Object arg) {
        Log.d(name, MessageFormatter.format(format, arg).getMessage());
    }

    public void debug(String format, Object arg1, Object arg2) {
        Log.d(name, MessageFormatter.format(format, arg1, arg2).getMessage());
    }

    public void debug(String format, Object... arguments) {
        Log.d(name, MessageFormatter.arrayFormat(format, arguments).getMessage());
    }

    public void debug(String msg, Throwable t) {
        Log.d(name, msg, t);
    }

    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled();
    }

    public void debug(Marker marker, String msg) {
        debug(msg);
    }

    public void debug(Marker marker, String format, Object arg) {
        debug(format, arg);
    }

    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        debug(format, arg2, arg2);
    }

    public void debug(Marker marker, String format, Object... arguments) {
        debug(format, arguments);
    }

    public void debug(Marker marker, String msg, Throwable t) {
        debug(msg, t);
    }

    public boolean isInfoEnabled() {
        return Log.isLoggable(name, Constants.INFO);
    }

    public void info(String msg) {
        Log.i(msg);
    }

    public void info(String format, Object arg) {
        Log.i(name, MessageFormatter.format(format, arg).getMessage());
    }

    public void info(String format, Object arg1, Object arg2) {
        Log.i(name, MessageFormatter.format(format, arg1, arg2).getMessage());
    }

    public void info(String format, Object... arguments) {
        Log.i(name, MessageFormatter.arrayFormat(format, arguments).getMessage());
    }

    public void info(String msg, Throwable t) {
        Log.i(name, msg, t);
    }

    public boolean isInfoEnabled(Marker marker) {
        return Log.isLoggable(name, Constants.INFO);
    }

    public void info(Marker marker, String msg) {
        info(msg);
    }

    public void info(Marker marker, String format, Object arg) {
        info(format, arg);
    }

    public void info(Marker marker, String format, Object arg1, Object arg2) {
        info(format, arg1, arg2);
    }

    public void info(Marker marker, String format, Object... arguments) {
        info(format, arguments);
    }

    public void info(Marker marker, String msg, Throwable t) {
        info(msg, t);
    }

    public boolean isWarnEnabled() {
        return Log.isLoggable(name, Constants.WARN);
    }

    public void warn(String msg) {
        Log.w(name, msg);
    }

    public void warn(String format, Object arg) {
        Log.w(name, MessageFormatter.format(format, arg).getMessage());
    }

    public void warn(String format, Object arg1, Object arg2) {
        Log.w(name, MessageFormatter.format(format, arg1, arg2).getMessage());
    }

    public void warn(String format, Object... arguments) {
        Log.w(name, MessageFormatter.arrayFormat(format, arguments).getMessage());
    }

    public void warn(String msg, Throwable t) {
        Log.w(name, msg, t);
    }

    public boolean isWarnEnabled(Marker marker) {
        return Log.isLoggable(name, Constants.WARN);
    }

    public void warn(Marker marker, String msg) {
        warn(msg);
    }

    public void warn(Marker marker, String format, Object arg) {
        warn(format, arg);
    }

    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        warn(format, arg1, arg2);
    }

    public void warn(Marker marker, String format, Object... arguments) {
        warn(format, arguments);
    }

    public void warn(Marker marker, String msg, Throwable t) {
        warn(msg, t);
    }

    public boolean isErrorEnabled() {
        return Log.isLoggable(name, Constants.ERROR);
    }

    public void error(String msg) {
        Log.e(name, msg);
    }

    public void error(String format, Object arg) {
        Log.e(name, MessageFormatter.format(format, arg).getMessage());
    }

    public void error(String format, Object arg1, Object arg2) {
        Log.e(name, MessageFormatter.format(format, arg1, arg2).getMessage());
    }

    public void error(String format, Object... arguments) {
        Log.e(name, MessageFormatter.arrayFormat(format, arguments).getMessage());
    }

    public void error(String msg, Throwable t) {
        Log.e(name, msg, t);
    }

    public boolean isErrorEnabled(Marker marker) {
        return Log.isLoggable(name, Constants.ERROR);
    }

    public void error(Marker marker, String msg) {
        error(msg);
    }

    public void error(Marker marker, String format, Object arg) {
        error(format, arg);
    }

    public void error(Marker marker, String format, Object arg1, Object arg2) {
        error(format, arg1, arg2);
    }

    public void error(Marker marker, String format, Object... arguments) {
        error(format, arguments);
    }

    public void error(Marker marker, String msg, Throwable t) {
        error(msg, t);
    }

}
