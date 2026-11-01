package p067l;

/* JADX INFO: renamed from: l.᩹ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23496 extends C2708 {

    /* JADX INFO: renamed from: e */
    public C23496 f74852e;

    /* JADX INFO: renamed from: f */
    public C23496 f74853f;

    /* JADX INFO: renamed from: g */
    public C23496 f74854g;

    /* JADX INFO: renamed from: h */
    public C23496 f74855h;

    /* JADX INFO: renamed from: i */
    public boolean f74856i;

    public C23496(int i, Object obj, Object obj2, C2708 c2708, C23496 c23496) {
        super(i, obj, obj2, c2708);
        this.f74852e = c23496;
    }

    @Override // p067l.C2708
    /* JADX INFO: renamed from: a */
    public final C2708 mo4197a(int i, Object obj) {
        return m52230b(i, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[PHI: r8
      0x0046: PHI (r8v5 java.lang.Class) = (r8v4 java.lang.Class), (r8v6 java.lang.Class) binds: [B:29:0x003f, B:21:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x004c A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final C23496 m52230b(int i, Object obj, Class cls) {
        C23496 c23496M52230b;
        if (obj == null) {
            return null;
        }
        C23496 c23496 = this;
        do {
            C23496 c23497 = c23496.f74853f;
            C23496 c23498 = c23496.f74854g;
            int i2 = c23496.f4544a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = c23496.f4545b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return c23496;
                    }
                    if (c23497 != null) {
                        if (c23498 != null) {
                            if (cls != null || (cls = ConcurrentMapC12768.m29309c(obj)) != null) {
                                int i3 = ConcurrentMapC12768.f35939g;
                                int iCompareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (iCompareTo == 0) {
                                    c23496M52230b = c23498.m52230b(i, obj, cls);
                                    if (c23496M52230b != null) {
                                        return c23496M52230b;
                                    }
                                } else if (iCompareTo >= 0) {
                                    c23497 = c23498;
                                }
                            } else {
                                c23496M52230b = c23498.m52230b(i, obj, cls);
                                if (c23496M52230b != null) {
                                    return c23496M52230b;
                                }
                            }
                        }
                        c23496 = c23497;
                    }
                }
                c23496 = c23498;
            } else {
                c23496 = c23497;
            }
        } while (c23496 != null);
        return null;
    }
}
