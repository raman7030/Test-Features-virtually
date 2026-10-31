package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public enum ClassLoaderHelper {
    ;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static URL m753(String str, Class... clsArr) {
        return m752(str, false, clsArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static URL m752(String str, boolean z, Class... clsArr) {
        URL urlM751;
        if (z) {
            urlM751 = m758(str, clsArr);
            if (urlM751 == null) {
                urlM751 = m751(str);
            }
        } else {
            urlM751 = m751(str);
            if (urlM751 == null) {
                urlM751 = m758(str, clsArr);
            }
        }
        return urlM751 == null ? ClassLoaderHelper.class.getResource(str) : urlM751;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static URL m758(String str, Class[] clsArr) {
        if (clsArr == null) {
            return null;
        }
        for (Class cls : clsArr) {
            URL resource = cls.getResource(str);
            if (resource != null) {
                return resource;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static URL m751(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        return contextClassLoader.getResource(str);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Class m759(String str, Class[] clsArr) {
        if (clsArr == null) {
            return null;
        }
        for (Class cls : clsArr) {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                try {
                    return classLoader.loadClass(str);
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Class m756(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        try {
            return contextClassLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Class m760(String str, Class... clsArr) {
        return m757(str, true, clsArr);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Class m757(String str, boolean z, Class... clsArr) {
        Class clsM756;
        if (z) {
            clsM756 = m759(str, clsArr);
            if (clsM756 == null) {
                clsM756 = m756(str);
            }
        } else {
            clsM756 = m756(str);
            if (clsM756 == null) {
                clsM756 = m759(str, clsArr);
            }
        }
        return clsM756 == null ? Class.forName(str) : clsM756;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InputStream m755(String str, Class... clsArr) {
        return m754(str, false, clsArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InputStream m754(String str, boolean z, Class... clsArr) {
        URL urlM752 = m752(str, z, clsArr);
        if (urlM752 != null) {
            try {
                return urlM752.openStream();
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
