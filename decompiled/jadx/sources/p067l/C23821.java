package p067l;

import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: l.᩹᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7RJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23821 extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str) {
        if (Object.class.getName().equals(str)) {
            return Object.class;
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException unused) {
            if (C10927.m25185().getName().equals(str)) {
                return C5716.class;
            }
            if (C19925.m45226().getName().equals(str)) {
                return C14433.class;
            }
            if (Class.class.getName().equals(str)) {
                return C7057.class;
            }
            return super.loadClass(str);
        }
    }
}
