package l;

/* JADX INFO: renamed from: l.᩹ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C22230 extends C0357 {
    public C22230 e;
    public C22230 f;
    public C22230 g;
    public C22230 h;
    public boolean i;

    public C22230(int i, Object obj, Object obj2, C0357 c0357, C22230 c22230) {
        super(i, obj, obj2, c0357);
        this.e = c22230;
    }

    @Override // l.C0357
    public final C0357 a(int i, Object obj) {
        return b(i, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[PHI: r8
      0x0046: PHI (r8v5 java.lang.Class) = (r8v4 java.lang.Class), (r8v6 java.lang.Class) binds: [B:29:0x003f, B:21:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x004c A[SYNTHETIC] */
    public final C22230 b(int i, Object obj, Class cls) {
        C22230 c22230B;
        if (obj == null) {
            return null;
        }
        C22230 c22230 = this;
        do {
            C22230 c22231 = c22230.f;
            C22230 c22232 = c22230.g;
            int i2 = c22230.a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = c22230.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return c22230;
                    }
                    if (c22231 != null) {
                        if (c22232 != null) {
                            if (cls != null || (cls = ConcurrentMapC10942.c(obj)) != null) {
                                int i3 = ConcurrentMapC10942.g;
                                int iCompareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (iCompareTo == 0) {
                                    c22230B = c22232.b(i, obj, cls);
                                    if (c22230B != null) {
                                        return c22230B;
                                    }
                                } else if (iCompareTo >= 0) {
                                    c22231 = c22232;
                                }
                            } else {
                                c22230B = c22232.b(i, obj, cls);
                                if (c22230B != null) {
                                    return c22230B;
                                }
                            }
                        }
                        c22230 = c22231;
                    }
                }
                c22230 = c22232;
            } else {
                c22230 = c22231;
            }
        } while (c22230 != null);
        return null;
    }
}
