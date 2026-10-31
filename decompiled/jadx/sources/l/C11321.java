package l;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: renamed from: l.ۧ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: KA2K */
/* JADX INFO: loaded from: classes3.dex */
public final class C11321 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f33883;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f33884;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static volatile int f33886;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String f33887;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C9204 f33885 = new C9204();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C6554 f33888 = new C6554();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m27970() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f33884 = property == null ? false : property.equalsIgnoreCase("true");
        f33883 = new String[]{"1.6", "1.7"};
        f33887 = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m27963() {
        LinkedHashSet linkedHashSetM27965;
        try {
            try {
                try {
                    try {
                        if (m27970()) {
                            linkedHashSetM27965 = null;
                        } else {
                            linkedHashSetM27965 = m27965();
                            m27966(linkedHashSetM27965);
                        }
                        StaticLoggerBinder.getSingleton();
                        f33886 = 3;
                        m27964(linkedHashSetM27965);
                        m27969();
                    } catch (NoSuchMethodError e) {
                        String message = e.getMessage();
                        if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                            f33886 = 2;
                            C2854.m8742("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                            C2854.m8742("Your binding is version 1.5.5 or earlier.");
                            C2854.m8742("Upgrade your binding to version 1.6.x.");
                        }
                        throw e;
                    }
                } catch (NoClassDefFoundError e2) {
                    String message2 = e2.getMessage();
                    if (message2 == null || (!message2.contains("org/slf4j/impl/StaticLoggerBinder") && !message2.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                        f33886 = 2;
                        System.err.println("Failed to instantiate SLF4J LoggerFactory");
                        System.err.println("Reported exception:");
                        throw e2;
                    }
                    f33886 = 4;
                    C2854.m8742("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    C2854.m8742("Defaulting to no-operation (NOP) logger implementation");
                    C2854.m8742("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                    m27969();
                }
            } catch (Exception e3) {
                f33886 = 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                throw new IllegalStateException("Unexpected initialization failure", e3);
            }
        } catch (Throwable th) {
            m27969();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m27969() {
        C9204 c9204 = f33885;
        synchronized (c9204) {
            c9204.m23641();
            for (C9910 c9910 : c9204.m23640()) {
                c9910.m25017(m27962(c9910.getName()));
            }
        }
        LinkedBlockingQueue linkedBlockingQueueM23639 = f33885.m23639();
        int size = linkedBlockingQueueM23639.size();
        ArrayList<C14847> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueM23639.drainTo(arrayList, 128) != 0) {
            for (C14847 c14847 : arrayList) {
                if (c14847 != null) {
                    C9910 c9910M35247 = c14847.m35247();
                    String name = c9910M35247.getName();
                    if (c9910M35247.m25022()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!c9910M35247.m25019()) {
                        if (c9910M35247.m25020()) {
                            c9910M35247.m25018(c14847);
                        } else {
                            C2854.m8742(name);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (!c14847.m35247().m25020()) {
                        if (!c14847.m35247().m25019()) {
                            C2854.m8742("The following set of substitute loggers may have been accessed");
                            C2854.m8742("during the initialization phase. Logging calls during this");
                            C2854.m8742("phase were not honored. However, subsequent logging calls to these");
                            C2854.m8742("loggers will work as normally expected.");
                            C2854.m8742("See also http://www.slf4j.org/codes.html#substituteLogger");
                        }
                    } else {
                        C2854.m8742("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        C2854.m8742("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        C2854.m8742("See also http://www.slf4j.org/codes.html#replay");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        f33885.m23638();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final void m27967() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f33883) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C2854.m8742("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f33883).toString());
            C2854.m8742("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable unused2) {
            System.err.println("Unexpected problem occured during version sanity check");
            System.err.println("Reported exception:");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m27965() {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C11321.class.getClassLoader();
            String str = f33887;
            if (classLoader == null) {
                resources = ClassLoader.getSystemResources(str);
            } else {
                resources = classLoader.getResources(str);
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException unused) {
            System.err.println("Error getting resources from path");
            System.err.println("Reported exception:");
            return linkedHashSet;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27964(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        C2854.m8742("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27966(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            C2854.m8742("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                C2854.m8742("Found binding in [" + ((URL) it.next()) + "]");
            }
            C2854.m8742("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 m27962(String str) {
        return m27968().mo18065(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 m27961(Class cls) {
        Class clsM8741;
        InterfaceC2148 interfaceC2148M27962 = m27962(cls.getName());
        if (f33884 && (clsM8741 = C2854.m8741()) != null && !clsM8741.isAssignableFrom(cls)) {
            C2854.m8742("Detected logger name mismatch. Given name: \"" + interfaceC2148M27962.getName() + "\"; computed name: \"" + clsM8741.getName() + "\".");
            C2854.m8742("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return interfaceC2148M27962;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7520 m27968() {
        if (f33886 == 0) {
            synchronized (C11321.class) {
                if (f33886 == 0) {
                    f33886 = 1;
                    m27963();
                    if (f33886 == 3) {
                        m27967();
                    }
                }
            }
        }
        int i = f33886;
        if (i == 1) {
            return f33885;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f33888;
        }
        throw new IllegalStateException("Unreachable code");
    }
}
