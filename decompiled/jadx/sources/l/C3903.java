package l;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ۘۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAVZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3903 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12478 = 1023;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2492[] f12477 = new C2492[1024];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m11900(Type type) {
        for (C2492 c2492 = this.f12477[System.identityHashCode(type) & this.f12478]; c2492 != null; c2492 = c2492.f7942) {
            if (type == c2492.f7941) {
                return c2492.f7943;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11901(Object obj, Type type) {
        int iIdentityHashCode = System.identityHashCode(type) & this.f12478;
        C2492[] c2492Arr = this.f12477;
        for (C2492 c2492 = c2492Arr[iIdentityHashCode]; c2492 != null; c2492 = c2492.f7942) {
            if (type == c2492.f7941) {
                c2492.f7943 = obj;
                return;
            }
        }
        c2492Arr[iIdentityHashCode] = new C2492(type, obj, c2492Arr[iIdentityHashCode]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Class m11899(String str) {
        int i = 0;
        while (true) {
            C2492[] c2492Arr = this.f12477;
            if (i >= c2492Arr.length) {
                return null;
            }
            C2492 c2492 = c2492Arr[i];
            if (c2492 != null) {
                for (C2492 c2493 = c2492; c2493 != null; c2493 = c2493.f7942) {
                    Type type = c2492.f7941;
                    if (type instanceof Class) {
                        Class cls = (Class) type;
                        if (cls.getName().equals(str)) {
                            return cls;
                        }
                    }
                }
            }
            i++;
        }
    }
}
