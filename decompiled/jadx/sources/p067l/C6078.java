package p067l;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ۘۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAVZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6078 {

    /* JADX INFO: renamed from: ۧ */
    public final int f15286 = 1023;

    /* JADX INFO: renamed from: ֫ */
    public final C4737[] f15285 = new C4737[1024];

    /* JADX INFO: renamed from: ֫ */
    public final Object m13836(Type type) {
        for (C4737 c4737 = this.f15285[System.identityHashCode(type) & this.f15286]; c4737 != null; c4737 = c4737.f10730) {
            if (type == c4737.f10729) {
                return c4737.f10731;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13837(Object obj, Type type) {
        int iIdentityHashCode = System.identityHashCode(type) & this.f15286;
        C4737[] c4737Arr = this.f15285;
        for (C4737 c4737 = c4737Arr[iIdentityHashCode]; c4737 != null; c4737 = c4737.f10730) {
            if (type == c4737.f10729) {
                c4737.f10731 = obj;
                return;
            }
        }
        c4737Arr[iIdentityHashCode] = new C4737(type, obj, c4737Arr[iIdentityHashCode]);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Class m13835(String str) {
        int i = 0;
        while (true) {
            C4737[] c4737Arr = this.f15285;
            if (i >= c4737Arr.length) {
                return null;
            }
            C4737 c4737 = c4737Arr[i];
            if (c4737 != null) {
                for (C4737 c4738 = c4737; c4738 != null; c4738 = c4738.f10730) {
                    Type type = c4737.f10729;
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
