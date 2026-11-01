package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public enum ClassLoaderHelper {
    ;

    /* JADX INFO: renamed from: ֫ */
    public static URL m1918(String str, Class... clsArr) {
        return m1917(str, false, clsArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static URL m1917(String str, boolean z, Class... clsArr) {
        URL urlM1916;
        if (z) {
            urlM1916 = m1923(str, clsArr);
            if (urlM1916 == null) {
                urlM1916 = m1916(str);
            }
        } else {
            urlM1916 = m1916(str);
            if (urlM1916 == null) {
                urlM1916 = m1923(str, clsArr);
            }
        }
        return urlM1916 == null ? ClassLoaderHelper.class.getResource(str) : urlM1916;
    }

    /* JADX INFO: renamed from: ܽ */
    public static URL m1923(String str, Class[] clsArr) {
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

    /* JADX INFO: renamed from: ֫ */
    public static URL m1916(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        return contextClassLoader.getResource(str);
    }

    /* JADX INFO: renamed from: ܿ */
    public static Class m1924(String str, Class[] clsArr) {
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

    /* JADX INFO: renamed from: ۧ */
    public static Class m1921(String str) {
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

    /* JADX INFO: renamed from: ᩳ */
    public static Class m1925(String str, Class... clsArr) {
        return m1922(str, true, clsArr);
    }

    /* JADX INFO: renamed from: ܽ */
    public static Class m1922(String str, boolean z, Class... clsArr) {
        Class clsM1921;
        if (z) {
            clsM1921 = m1924(str, clsArr);
            if (clsM1921 == null) {
                clsM1921 = m1921(str);
            }
        } else {
            clsM1921 = m1921(str);
            if (clsM1921 == null) {
                clsM1921 = m1924(str, clsArr);
            }
        }
        return clsM1921 == null ? Class.forName(str) : clsM1921;
    }

    /* JADX INFO: renamed from: ۧ */
    public static InputStream m1920(String str, Class... clsArr) {
        return m1919(str, false, clsArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public static InputStream m1919(String str, boolean z, Class... clsArr) {
        URL urlM1917 = m1917(str, z, clsArr);
        if (urlM1917 != null) {
            try {
                return urlM1917.openStream();
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
