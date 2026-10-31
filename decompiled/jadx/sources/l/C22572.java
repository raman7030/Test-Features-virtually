package l;

import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: l.᩹᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7RJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22572 extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str) {
        if (Object.class.getName().equals(str)) {
            return Object.class;
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException unused) {
            if (C9005.m23241().getName().equals(str)) {
                return C3522.class;
            }
            if (C18473.m42950().getName().equals(str)) {
                return C12694.class;
            }
            if (Class.class.getName().equals(str)) {
                return C4933.class;
            }
            return super.loadClass(str);
        }
    }
}
