package p067l;

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
public final class C13128 {

    /* JADX INFO: renamed from: ֫ */
    public static final String[] f36882;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f36883;

    /* JADX INFO: renamed from: ܽ */
    public static volatile int f36885;

    /* JADX INFO: renamed from: ܿ */
    public static String f36886;

    /* JADX INFO: renamed from: ܳ */
    public static final C11116 f36884 = new C11116();

    /* JADX INFO: renamed from: ᩳ */
    public static final C8597 f36887 = new C8597();

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m30031() {
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
        f36883 = property == null ? false : property.equalsIgnoreCase("true");
        f36882 = new String[]{"1.6", "1.7"};
        f36886 = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m30024() {
        LinkedHashSet linkedHashSetM30026;
        try {
            try {
                try {
                    try {
                        if (m30031()) {
                            linkedHashSetM30026 = null;
                        } else {
                            linkedHashSetM30026 = m30026();
                            m30027(linkedHashSetM30026);
                        }
                        StaticLoggerBinder.getSingleton();
                        f36885 = 3;
                        m30025(linkedHashSetM30026);
                        m30030();
                    } catch (NoSuchMethodError e) {
                        String message = e.getMessage();
                        if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                            f36885 = 2;
                            C5081.m10809("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                            C5081.m10809("Your binding is version 1.5.5 or earlier.");
                            C5081.m10809("Upgrade your binding to version 1.6.x.");
                        }
                        throw e;
                    }
                } catch (NoClassDefFoundError e2) {
                    String message2 = e2.getMessage();
                    if (message2 == null || (!message2.contains("org/slf4j/impl/StaticLoggerBinder") && !message2.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                        f36885 = 2;
                        System.err.println("Failed to instantiate SLF4J LoggerFactory");
                        System.err.println("Reported exception:");
                        throw e2;
                    }
                    f36885 = 4;
                    C5081.m10809("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    C5081.m10809("Defaulting to no-operation (NOP) logger implementation");
                    C5081.m10809("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                    m30030();
                }
            } catch (Exception e3) {
                f36885 = 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                throw new IllegalStateException("Unexpected initialization failure", e3);
            }
        } catch (Throwable th) {
            m30030();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m30030() {
        C11116 c11116 = f36884;
        synchronized (c11116) {
            c11116.m25640();
            for (C11787 c11787 : c11116.m25639()) {
                c11787.m27034(m30023(c11787.getName()));
            }
        }
        LinkedBlockingQueue linkedBlockingQueueM25638 = f36884.m25638();
        int size = linkedBlockingQueueM25638.size();
        ArrayList<C16479> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueM25638.drainTo(arrayList, 128) != 0) {
            for (C16479 c16479 : arrayList) {
                if (c16479 != null) {
                    C11787 c11787M37403 = c16479.m37403();
                    String name = c11787M37403.getName();
                    if (c11787M37403.m27039()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!c11787M37403.m27036()) {
                        if (c11787M37403.m27037()) {
                            c11787M37403.m27035(c16479);
                        } else {
                            C5081.m10809(name);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (!c16479.m37403().m27037()) {
                        if (!c16479.m37403().m27036()) {
                            C5081.m10809("The following set of substitute loggers may have been accessed");
                            C5081.m10809("during the initialization phase. Logging calls during this");
                            C5081.m10809("phase were not honored. However, subsequent logging calls to these");
                            C5081.m10809("loggers will work as normally expected.");
                            C5081.m10809("See also http://www.slf4j.org/codes.html#substituteLogger");
                        }
                    } else {
                        C5081.m10809("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        C5081.m10809("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        C5081.m10809("See also http://www.slf4j.org/codes.html#replay");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        f36884.m25637();
    }

    /* JADX INFO: renamed from: ܳ */
    public static final void m30028() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f36882) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C5081.m10809("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f36882).toString());
            C5081.m10809("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable unused2) {
            System.err.println("Unexpected problem occured during version sanity check");
            System.err.println("Reported exception:");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static LinkedHashSet m30026() {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C13128.class.getClassLoader();
            String str = f36886;
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

    /* JADX INFO: renamed from: ֫ */
    public static void m30025(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        C5081.m10809("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m30027(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            C5081.m10809("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                C5081.m10809("Found binding in [" + ((URL) it.next()) + "]");
            }
            C5081.m10809("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC4410 m30023(String str) {
        return m30029().mo20015(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC4410 m30022(Class cls) {
        Class clsM10808;
        InterfaceC4410 interfaceC4410M30023 = m30023(cls.getName());
        if (f36883 && (clsM10808 = C5081.m10808()) != null && !clsM10808.isAssignableFrom(cls)) {
            C5081.m10809("Detected logger name mismatch. Given name: \"" + interfaceC4410M30023.getName() + "\"; computed name: \"" + clsM10808.getName() + "\".");
            C5081.m10809("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return interfaceC4410M30023;
    }

    /* JADX INFO: renamed from: ܽ */
    public static InterfaceC9515 m30029() {
        if (f36885 == 0) {
            synchronized (C13128.class) {
                if (f36885 == 0) {
                    f36885 = 1;
                    m30024();
                    if (f36885 == 3) {
                        m30028();
                    }
                }
            }
        }
        int i = f36885;
        if (i == 1) {
            return f36884;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f36887;
        }
        throw new IllegalStateException("Unreachable code");
    }
}
