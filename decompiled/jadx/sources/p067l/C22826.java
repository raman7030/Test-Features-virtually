package p067l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.᩸ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22826 extends C2708 {

    /* JADX INFO: renamed from: h */
    public static final C19809 f71902h;

    /* JADX INFO: renamed from: i */
    public static final long f71903i;

    /* JADX INFO: renamed from: e */
    public C23496 f71904e;

    /* JADX INFO: renamed from: f */
    public volatile C23496 f71905f;

    /* JADX INFO: renamed from: g */
    public volatile Thread f71906g;
    public volatile int lockState;

    static {
        C19809 c19809 = C19809.f60241b;
        f71902h = c19809;
        f71903i = c19809.m45040h(C22826.class, "lockState");
    }

    /* JADX INFO: renamed from: i */
    public static int m51031i(Object obj, Object obj2) {
        int iCompareTo;
        if (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return iCompareTo;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b A[PHI: r6
      0x004b: PHI (r6v3 java.lang.Class<?>) = (r6v2 java.lang.Class<?>), (r6v4 java.lang.Class<?>) binds: [B:24:0x0049, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    public C22826(C23496 c23496) {
        int iM51031i;
        super(-2, null, null);
        this.f71905f = c23496;
        C23496 c23497 = null;
        while (c23496 != null) {
            C23496 c23498 = (C23496) c23496.f4547d;
            c23496.f74854g = null;
            c23496.f74853f = null;
            if (c23497 == null) {
                c23496.f74852e = null;
                c23496.f74856i = false;
            } else {
                Object obj = c23496.f4545b;
                int i = c23496.f4544a;
                C23496 c23499 = c23497;
                Class<?> clsM29309c = null;
                while (true) {
                    Object obj2 = c23499.f4545b;
                    int i2 = c23499.f4544a;
                    if (i2 > i) {
                        iM51031i = -1;
                    } else if (i2 < i) {
                        iM51031i = 1;
                    } else if (clsM29309c != null || (clsM29309c = ConcurrentMapC12768.m29309c(obj)) != null) {
                        int i3 = ConcurrentMapC12768.f35939g;
                        int iCompareTo = (obj2 == null || obj2.getClass() != clsM29309c) ? 0 : ((Comparable) obj).compareTo(obj2);
                        if (iCompareTo == 0) {
                            iM51031i = m51031i(obj, obj2);
                        } else {
                            iM51031i = iCompareTo;
                        }
                    } else {
                        iM51031i = m51031i(obj, obj2);
                    }
                    C23496 c234910 = iM51031i <= 0 ? c23499.f74853f : c23499.f74854g;
                    if (c234910 == null) {
                        break;
                    } else {
                        c23499 = c234910;
                    }
                }
                c23496.f74852e = c23499;
                if (iM51031i <= 0) {
                    c23499.f74853f = c23496;
                } else {
                    c23499.f74854g = c23496;
                }
                c23496 = m51028c(c23497, c23496);
            }
            c23497 = c23496;
            c23496 = c23498;
        }
        this.f71904e = c23497;
    }

    /* JADX INFO: renamed from: d */
    public final void m51032d() {
        if (f71902h.m45036c(this, f71903i, 0, 1)) {
            return;
        }
        boolean z = false;
        while (true) {
            int i = this.lockState;
            if ((i & (-3)) == 0) {
                if (f71902h.m45036c(this, f71903i, i, 1)) {
                    break;
                }
            } else if ((i & 2) == 0) {
                if (f71902h.m45036c(this, f71903i, i, i | 2)) {
                    this.f71906g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.f71906g = null;
        }
    }

    @Override // p067l.C2708
    /* JADX INFO: renamed from: a */
    public final C2708 mo4197a(int i, Object obj) {
        Object obj2;
        Thread thread;
        C2708 c2708 = this.f71905f;
        while (true) {
            C23496 c23496M52230b = null;
            if (c2708 == null) {
                return null;
            }
            int i2 = this.lockState;
            if ((i2 & 3) != 0) {
                if (c2708.f4544a == i && ((obj2 = c2708.f4545b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c2708;
                }
                c2708 = c2708.f4547d;
            } else if (f71902h.m45036c(this, f71903i, i2, i2 + 4)) {
                try {
                    C23496 c23496 = this.f71904e;
                    if (c23496 != null) {
                        c23496M52230b = c23496.m52230b(i, obj, null);
                    }
                    return c23496M52230b;
                } finally {
                    if (f71902h.m45038e(this, f71903i) == 6 && (thread = this.f71906g) != null) {
                        LockSupport.unpark(thread);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a A[PHI: r2
      0x005a: PHI (r2v5 java.lang.Class<?>) = (r2v4 java.lang.Class<?>), (r2v6 java.lang.Class<?>) binds: [B:27:0x0058, B:19:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX INFO: renamed from: e */
    public final C23496 m51033e(int i, Object obj, Object obj2) {
        int iM51031i;
        C23496 c23496;
        C23496 c23497;
        C23496 c23496M52230b;
        C23496 c23496M52230b2;
        boolean z = false;
        C23496 c23498 = this.f71904e;
        Class<?> clsM29309c = null;
        while (c23498 != null) {
            int i2 = c23498.f4544a;
            if (i2 > i) {
                iM51031i = -1;
            } else if (i2 < i) {
                iM51031i = 1;
            } else {
                Object obj3 = c23498.f4545b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return c23498;
                }
                if (clsM29309c != null || (clsM29309c = ConcurrentMapC12768.m29309c(obj)) != null) {
                    int i3 = ConcurrentMapC12768.f35939g;
                    int iCompareTo = (obj3 == null || obj3.getClass() != clsM29309c) ? 0 : ((Comparable) obj).compareTo(obj3);
                    if (iCompareTo == 0) {
                        if (!z) {
                            c23496 = c23498.f74853f;
                            if (c23496 == null && (c23496M52230b2 = c23496.m52230b(i, obj, clsM29309c)) != null) {
                                return c23496M52230b2;
                            }
                            c23497 = c23498.f74854g;
                            if (c23497 == null && (c23496M52230b = c23497.m52230b(i, obj, clsM29309c)) != null) {
                                return c23496M52230b;
                            }
                            z = true;
                        }
                        iM51031i = m51031i(obj, obj3);
                    } else {
                        iM51031i = iCompareTo;
                    }
                } else {
                    if (!z) {
                        c23496 = c23498.f74853f;
                        if (c23496 == null) {
                        }
                        c23497 = c23498.f74854g;
                        if (c23497 == null) {
                        }
                        z = true;
                    }
                    iM51031i = m51031i(obj, obj3);
                }
            }
            C23496 c23499 = iM51031i <= 0 ? c23498.f74853f : c23498.f74854g;
            if (c23499 == null) {
                C23496 c234910 = this.f71905f;
                C23496 c234911 = new C23496(i, obj, obj2, c234910, c23498);
                this.f71905f = c234911;
                if (c234910 != null) {
                    c234910.f74855h = c234911;
                }
                if (iM51031i <= 0) {
                    c23498.f74853f = c234911;
                } else {
                    c23498.f74854g = c234911;
                }
                if (!c23498.f74856i) {
                    c234911.f74856i = true;
                    return null;
                }
                m51032d();
                try {
                    this.f71904e = m51028c(this.f71904e, c234911);
                    return null;
                } finally {
                    this.lockState = 0;
                }
            }
            c23498 = c23499;
        }
        C23496 c234912 = new C23496(i, obj, obj2, null, null);
        this.f71904e = c234912;
        this.f71905f = c234912;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x008b A[PHI: r0
      0x008b: PHI (r0v4 l.᩹ۤᩴ) = (r0v3 l.᩹ۤᩴ), (r0v12 l.᩹ۤᩴ) binds: [B:53:0x0087, B:49:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: f */
    public final boolean m51034f(C23496 c23496) {
        C23496 c23497;
        C23496 c23498;
        C23496 c23499 = (C23496) c23496.f4547d;
        C23496 c234910 = c23496.f74855h;
        if (c234910 == null) {
            this.f71905f = c23499;
        } else {
            c234910.f4547d = c23499;
        }
        if (c23499 != null) {
            c23499.f74855h = c234910;
        }
        if (this.f71905f == null) {
            this.f71904e = null;
            return true;
        }
        C23496 c23496M51027b = this.f71904e;
        if (c23496M51027b == null || c23496M51027b.f74854g == null || (c23497 = c23496M51027b.f74853f) == null || c23497.f74853f == null) {
            return true;
        }
        m51032d();
        try {
            C23496 c234911 = c23496.f74853f;
            C23496 c234912 = c23496.f74854g;
            if (c234911 != null && c234912 != null) {
                C23496 c234913 = c234912;
                while (true) {
                    C23496 c234914 = c234913.f74853f;
                    if (c234914 == null) {
                        break;
                    }
                    c234913 = c234914;
                }
                boolean z = c234913.f74856i;
                c234913.f74856i = c23496.f74856i;
                c23496.f74856i = z;
                C23496 c234915 = c234913.f74854g;
                C23496 c234916 = c23496.f74852e;
                if (c234913 == c234912) {
                    c23496.f74852e = c234913;
                    c234913.f74854g = c23496;
                } else {
                    C23496 c234917 = c234913.f74852e;
                    c23496.f74852e = c234917;
                    if (c234917 != null) {
                        if (c234913 == c234917.f74853f) {
                            c234917.f74853f = c23496;
                        } else {
                            c234917.f74854g = c23496;
                        }
                    }
                    c234913.f74854g = c234912;
                    c234912.f74852e = c234913;
                }
                c23496.f74853f = null;
                c23496.f74854g = c234915;
                if (c234915 != null) {
                    c234915.f74852e = c23496;
                }
                c234913.f74853f = c234911;
                c234911.f74852e = c234913;
                c234913.f74852e = c234916;
                if (c234916 == null) {
                    c23496M51027b = c234913;
                } else if (c23496 == c234916.f74853f) {
                    c234916.f74853f = c234913;
                } else {
                    c234916.f74854g = c234913;
                }
                if (c234915 != null) {
                    c234911 = c234915;
                } else {
                    c234911 = c23496;
                }
            } else if (c234911 == null) {
                if (c234912 != null) {
                    c234911 = c234912;
                } else {
                    c234911 = c23496;
                }
            }
            if (c234911 != c23496) {
                C23496 c234918 = c23496.f74852e;
                c234911.f74852e = c234918;
                if (c234918 == null) {
                    c23496M51027b = c234911;
                } else if (c23496 == c234918.f74853f) {
                    c234918.f74853f = c234911;
                } else {
                    c234918.f74854g = c234911;
                }
                c23496.f74852e = null;
                c23496.f74854g = null;
                c23496.f74853f = null;
            }
            if (!c23496.f74856i) {
                c23496M51027b = m51027b(c23496M51027b, c234911);
            }
            this.f71904e = c23496M51027b;
            if (c23496 == c234911 && (c23498 = c23496.f74852e) != null) {
                if (c23496 == c23498.f74853f) {
                    c23498.f74853f = null;
                } else if (c23496 == c23498.f74854g) {
                    c23498.f74854g = null;
                }
                c23496.f74852e = null;
            }
            return false;
        } finally {
            this.lockState = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public static C23496 m51029g(C23496 c23496, C23496 c23497) {
        C23496 c23498;
        if (c23497 != null && (c23498 = c23497.f74854g) != null) {
            C23496 c23499 = c23498.f74853f;
            c23497.f74854g = c23499;
            if (c23499 != null) {
                c23499.f74852e = c23497;
            }
            C23496 c234910 = c23497.f74852e;
            c23498.f74852e = c234910;
            if (c234910 == null) {
                c23498.f74856i = false;
                c23496 = c23498;
            } else if (c234910.f74853f == c23497) {
                c234910.f74853f = c23498;
            } else {
                c234910.f74854g = c23498;
            }
            c23498.f74853f = c23497;
            c23497.f74852e = c23498;
        }
        return c23496;
    }

    /* JADX INFO: renamed from: h */
    public static C23496 m51030h(C23496 c23496, C23496 c23497) {
        C23496 c23498;
        if (c23497 != null && (c23498 = c23497.f74853f) != null) {
            C23496 c23499 = c23498.f74854g;
            c23497.f74853f = c23499;
            if (c23499 != null) {
                c23499.f74852e = c23497;
            }
            C23496 c234910 = c23497.f74852e;
            c23498.f74852e = c234910;
            if (c234910 == null) {
                c23498.f74856i = false;
                c23496 = c23498;
            } else if (c234910.f74854g == c23497) {
                c234910.f74854g = c23498;
            } else {
                c234910.f74853f = c23498;
            }
            c23498.f74854g = c23497;
            c23497.f74852e = c23498;
        }
        return c23496;
    }

    /* JADX INFO: renamed from: c */
    public static C23496 m51028c(C23496 c23496, C23496 c23497) {
        C23496 c23498;
        c23497.f74856i = true;
        while (true) {
            C23496 c23499 = c23497.f74852e;
            if (c23499 == null) {
                c23497.f74856i = false;
                return c23497;
            }
            if (!c23499.f74856i || (c23498 = c23499.f74852e) == null) {
                return c23496;
            }
            C23496 c234910 = c23498.f74853f;
            if (c23499 == c234910) {
                C23496 c234911 = c23498.f74854g;
                if (c234911 != null && c234911.f74856i) {
                    c234911.f74856i = false;
                    c23499.f74856i = false;
                    c23498.f74856i = true;
                    c23497 = c23498;
                } else {
                    if (c23497 == c23499.f74854g) {
                        c23496 = m51029g(c23496, c23499);
                        C23496 c234912 = c23499.f74852e;
                        c23498 = c234912 == null ? null : c234912.f74852e;
                        c23499 = c234912;
                        c23497 = c23499;
                    }
                    if (c23499 != null) {
                        c23499.f74856i = false;
                        if (c23498 != null) {
                            c23498.f74856i = true;
                            c23496 = m51030h(c23496, c23498);
                        }
                    }
                }
            } else if (c234910 != null && c234910.f74856i) {
                c234910.f74856i = false;
                c23499.f74856i = false;
                c23498.f74856i = true;
                c23497 = c23498;
            } else {
                if (c23497 == c23499.f74853f) {
                    c23496 = m51030h(c23496, c23499);
                    C23496 c234913 = c23499.f74852e;
                    c23498 = c234913 == null ? null : c234913.f74852e;
                    c23499 = c234913;
                    c23497 = c23499;
                }
                if (c23499 != null) {
                    c23499.f74856i = false;
                    if (c23498 != null) {
                        c23498.f74856i = true;
                        c23496 = m51029g(c23496, c23498);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C23496 m51027b(C23496 c23496, C23496 c23497) {
        while (c23497 != null && c23497 != c23496) {
            C23496 c23498 = c23497.f74852e;
            if (c23498 == null) {
                c23497.f74856i = false;
                return c23497;
            }
            if (c23497.f74856i) {
                c23497.f74856i = false;
                return c23496;
            }
            C23496 c23499 = c23498.f74853f;
            if (c23499 == c23497) {
                C23496 c234910 = c23498.f74854g;
                if (c234910 != null && c234910.f74856i) {
                    c234910.f74856i = false;
                    c23498.f74856i = true;
                    c23496 = m51029g(c23496, c23498);
                    c23498 = c23497.f74852e;
                    c234910 = c23498 == null ? null : c23498.f74854g;
                }
                if (c234910 != null) {
                    C23496 c234911 = c234910.f74853f;
                    C23496 c234912 = c234910.f74854g;
                    if ((c234912 == null || !c234912.f74856i) && (c234911 == null || !c234911.f74856i)) {
                        c234910.f74856i = true;
                    } else {
                        if (c234912 == null || !c234912.f74856i) {
                            if (c234911 != null) {
                                c234911.f74856i = false;
                            }
                            c234910.f74856i = true;
                            c23496 = m51030h(c23496, c234910);
                            c23498 = c23497.f74852e;
                            c234910 = c23498 != null ? c23498.f74854g : null;
                        }
                        if (c234910 != null) {
                            c234910.f74856i = c23498 == null ? false : c23498.f74856i;
                            C23496 c234913 = c234910.f74854g;
                            if (c234913 != null) {
                                c234913.f74856i = false;
                            }
                        }
                        if (c23498 != null) {
                            c23498.f74856i = false;
                            c23496 = m51029g(c23496, c23498);
                        }
                        c23497 = c23496;
                        c23496 = c23497;
                    }
                }
                c23497 = c23498;
            } else {
                if (c23499 != null && c23499.f74856i) {
                    c23499.f74856i = false;
                    c23498.f74856i = true;
                    c23496 = m51030h(c23496, c23498);
                    c23498 = c23497.f74852e;
                    c23499 = c23498 == null ? null : c23498.f74853f;
                }
                if (c23499 != null) {
                    C23496 c234914 = c23499.f74853f;
                    C23496 c234915 = c23499.f74854g;
                    if ((c234914 == null || !c234914.f74856i) && (c234915 == null || !c234915.f74856i)) {
                        c23499.f74856i = true;
                    } else {
                        if (c234914 == null || !c234914.f74856i) {
                            if (c234915 != null) {
                                c234915.f74856i = false;
                            }
                            c23499.f74856i = true;
                            c23496 = m51029g(c23496, c23499);
                            c23498 = c23497.f74852e;
                            c23499 = c23498 != null ? c23498.f74853f : null;
                        }
                        if (c23499 != null) {
                            c23499.f74856i = c23498 == null ? false : c23498.f74856i;
                            C23496 c234916 = c23499.f74853f;
                            if (c234916 != null) {
                                c234916.f74856i = false;
                            }
                        }
                        if (c23498 != null) {
                            c23498.f74856i = false;
                            c23496 = m51030h(c23496, c23498);
                        }
                        c23497 = c23496;
                        c23496 = c23497;
                    }
                }
                c23497 = c23498;
            }
        }
        return c23496;
    }
}
