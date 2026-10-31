package l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.᩸ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21525 extends C0357 {
    public static final C18350 h;
    public static final long i;
    public C22230 e;
    public volatile C22230 f;
    public volatile Thread g;
    public volatile int lockState;

    static {
        C18350 c18350 = C18350.b;
        h = c18350;
        i = c18350.h(C21525.class, "lockState");
    }

    public static int i(Object obj, Object obj2) {
        int iCompareTo;
        if (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return iCompareTo;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b A[PHI: r6
      0x004b: PHI (r6v3 java.lang.Class<?>) = (r6v2 java.lang.Class<?>), (r6v4 java.lang.Class<?>) binds: [B:24:0x0049, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    public C21525(C22230 c22230) {
        int i2;
        super(-2, null, null);
        this.f = c22230;
        C22230 c22231 = null;
        while (c22230 != null) {
            C22230 c22232 = (C22230) c22230.d;
            c22230.g = null;
            c22230.f = null;
            if (c22231 == null) {
                c22230.e = null;
                c22230.i = false;
            } else {
                Object obj = c22230.b;
                int i3 = c22230.a;
                C22230 c22233 = c22231;
                Class<?> clsC = null;
                while (true) {
                    Object obj2 = c22233.b;
                    int i4 = c22233.a;
                    if (i4 > i3) {
                        i2 = -1;
                    } else if (i4 < i3) {
                        i2 = 1;
                    } else if (clsC != null || (clsC = ConcurrentMapC10942.c(obj)) != null) {
                        int i5 = ConcurrentMapC10942.g;
                        int iCompareTo = (obj2 == null || obj2.getClass() != clsC) ? 0 : ((Comparable) obj).compareTo(obj2);
                        if (iCompareTo == 0) {
                            i2 = i(obj, obj2);
                        } else {
                            i2 = iCompareTo;
                        }
                    } else {
                        i2 = i(obj, obj2);
                    }
                    C22230 c22234 = i2 <= 0 ? c22233.f : c22233.g;
                    if (c22234 == null) {
                        break;
                    } else {
                        c22233 = c22234;
                    }
                }
                c22230.e = c22233;
                if (i2 <= 0) {
                    c22233.f = c22230;
                } else {
                    c22233.g = c22230;
                }
                c22230 = c(c22231, c22230);
            }
            c22231 = c22230;
            c22230 = c22232;
        }
        this.e = c22231;
    }

    public final void d() {
        if (h.c(this, i, 0, 1)) {
            return;
        }
        boolean z = false;
        while (true) {
            int i2 = this.lockState;
            if ((i2 & (-3)) == 0) {
                if (h.c(this, i, i2, 1)) {
                    break;
                }
            } else if ((i2 & 2) == 0) {
                if (h.c(this, i, i2, i2 | 2)) {
                    this.g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.g = null;
        }
    }

    @Override // l.C0357
    public final C0357 a(int i2, Object obj) {
        Object obj2;
        Thread thread;
        C0357 c0357 = this.f;
        while (true) {
            C22230 c22230B = null;
            if (c0357 == null) {
                return null;
            }
            int i3 = this.lockState;
            if ((i3 & 3) != 0) {
                if (c0357.a == i2 && ((obj2 = c0357.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c0357;
                }
                c0357 = c0357.d;
            } else if (h.c(this, i, i3, i3 + 4)) {
                try {
                    C22230 c22230 = this.e;
                    if (c22230 != null) {
                        c22230B = c22230.b(i2, obj, null);
                    }
                    return c22230B;
                } finally {
                    if (h.e(this, i) == 6 && (thread = this.g) != null) {
                        LockSupport.unpark(thread);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a A[PHI: r2
      0x005a: PHI (r2v5 java.lang.Class<?>) = (r2v4 java.lang.Class<?>), (r2v6 java.lang.Class<?>) binds: [B:27:0x0058, B:19:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    public final C22230 e(int i2, Object obj, Object obj2) {
        int i3;
        C22230 c22230;
        C22230 c22231;
        C22230 c22230B;
        C22230 c22230B2;
        boolean z = false;
        C22230 c22232 = this.e;
        Class<?> clsC = null;
        while (c22232 != null) {
            int i4 = c22232.a;
            if (i4 > i2) {
                i3 = -1;
            } else if (i4 < i2) {
                i3 = 1;
            } else {
                Object obj3 = c22232.b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return c22232;
                }
                if (clsC != null || (clsC = ConcurrentMapC10942.c(obj)) != null) {
                    int i5 = ConcurrentMapC10942.g;
                    int iCompareTo = (obj3 == null || obj3.getClass() != clsC) ? 0 : ((Comparable) obj).compareTo(obj3);
                    if (iCompareTo == 0) {
                        if (!z) {
                            c22230 = c22232.f;
                            if (c22230 == null && (c22230B2 = c22230.b(i2, obj, clsC)) != null) {
                                return c22230B2;
                            }
                            c22231 = c22232.g;
                            if (c22231 == null && (c22230B = c22231.b(i2, obj, clsC)) != null) {
                                return c22230B;
                            }
                            z = true;
                        }
                        i3 = i(obj, obj3);
                    } else {
                        i3 = iCompareTo;
                    }
                } else {
                    if (!z) {
                        c22230 = c22232.f;
                        if (c22230 == null) {
                        }
                        c22231 = c22232.g;
                        if (c22231 == null) {
                        }
                        z = true;
                    }
                    i3 = i(obj, obj3);
                }
            }
            C22230 c22233 = i3 <= 0 ? c22232.f : c22232.g;
            if (c22233 == null) {
                C22230 c22234 = this.f;
                C22230 c22235 = new C22230(i2, obj, obj2, c22234, c22232);
                this.f = c22235;
                if (c22234 != null) {
                    c22234.h = c22235;
                }
                if (i3 <= 0) {
                    c22232.f = c22235;
                } else {
                    c22232.g = c22235;
                }
                if (!c22232.i) {
                    c22235.i = true;
                    return null;
                }
                d();
                try {
                    this.e = c(this.e, c22235);
                    return null;
                } finally {
                    this.lockState = 0;
                }
            }
            c22232 = c22233;
        }
        C22230 c22236 = new C22230(i2, obj, obj2, null, null);
        this.e = c22236;
        this.f = c22236;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x008b A[PHI: r0
      0x008b: PHI (r0v4 l.᩹ۤᩴ) = (r0v3 l.᩹ۤᩴ), (r0v12 l.᩹ۤᩴ) binds: [B:53:0x0087, B:49:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean f(C22230 c22230) {
        C22230 c22231;
        C22230 c22232;
        C22230 c22233 = (C22230) c22230.d;
        C22230 c22234 = c22230.h;
        if (c22234 == null) {
            this.f = c22233;
        } else {
            c22234.d = c22233;
        }
        if (c22233 != null) {
            c22233.h = c22234;
        }
        if (this.f == null) {
            this.e = null;
            return true;
        }
        C22230 c22230B = this.e;
        if (c22230B == null || c22230B.g == null || (c22231 = c22230B.f) == null || c22231.f == null) {
            return true;
        }
        d();
        try {
            C22230 c22235 = c22230.f;
            C22230 c22236 = c22230.g;
            if (c22235 != null && c22236 != null) {
                C22230 c22237 = c22236;
                while (true) {
                    C22230 c22238 = c22237.f;
                    if (c22238 == null) {
                        break;
                    }
                    c22237 = c22238;
                }
                boolean z = c22237.i;
                c22237.i = c22230.i;
                c22230.i = z;
                C22230 c22239 = c22237.g;
                C22230 c222310 = c22230.e;
                if (c22237 == c22236) {
                    c22230.e = c22237;
                    c22237.g = c22230;
                } else {
                    C22230 c222311 = c22237.e;
                    c22230.e = c222311;
                    if (c222311 != null) {
                        if (c22237 == c222311.f) {
                            c222311.f = c22230;
                        } else {
                            c222311.g = c22230;
                        }
                    }
                    c22237.g = c22236;
                    c22236.e = c22237;
                }
                c22230.f = null;
                c22230.g = c22239;
                if (c22239 != null) {
                    c22239.e = c22230;
                }
                c22237.f = c22235;
                c22235.e = c22237;
                c22237.e = c222310;
                if (c222310 == null) {
                    c22230B = c22237;
                } else if (c22230 == c222310.f) {
                    c222310.f = c22237;
                } else {
                    c222310.g = c22237;
                }
                if (c22239 != null) {
                    c22235 = c22239;
                } else {
                    c22235 = c22230;
                }
            } else if (c22235 == null) {
                if (c22236 != null) {
                    c22235 = c22236;
                } else {
                    c22235 = c22230;
                }
            }
            if (c22235 != c22230) {
                C22230 c222312 = c22230.e;
                c22235.e = c222312;
                if (c222312 == null) {
                    c22230B = c22235;
                } else if (c22230 == c222312.f) {
                    c222312.f = c22235;
                } else {
                    c222312.g = c22235;
                }
                c22230.e = null;
                c22230.g = null;
                c22230.f = null;
            }
            if (!c22230.i) {
                c22230B = b(c22230B, c22235);
            }
            this.e = c22230B;
            if (c22230 == c22235 && (c22232 = c22230.e) != null) {
                if (c22230 == c22232.f) {
                    c22232.f = null;
                } else if (c22230 == c22232.g) {
                    c22232.g = null;
                }
                c22230.e = null;
            }
            return false;
        } finally {
            this.lockState = 0;
        }
    }

    public static C22230 g(C22230 c22230, C22230 c22231) {
        C22230 c22232;
        if (c22231 != null && (c22232 = c22231.g) != null) {
            C22230 c22233 = c22232.f;
            c22231.g = c22233;
            if (c22233 != null) {
                c22233.e = c22231;
            }
            C22230 c22234 = c22231.e;
            c22232.e = c22234;
            if (c22234 == null) {
                c22232.i = false;
                c22230 = c22232;
            } else if (c22234.f == c22231) {
                c22234.f = c22232;
            } else {
                c22234.g = c22232;
            }
            c22232.f = c22231;
            c22231.e = c22232;
        }
        return c22230;
    }

    public static C22230 h(C22230 c22230, C22230 c22231) {
        C22230 c22232;
        if (c22231 != null && (c22232 = c22231.f) != null) {
            C22230 c22233 = c22232.g;
            c22231.f = c22233;
            if (c22233 != null) {
                c22233.e = c22231;
            }
            C22230 c22234 = c22231.e;
            c22232.e = c22234;
            if (c22234 == null) {
                c22232.i = false;
                c22230 = c22232;
            } else if (c22234.g == c22231) {
                c22234.g = c22232;
            } else {
                c22234.f = c22232;
            }
            c22232.g = c22231;
            c22231.e = c22232;
        }
        return c22230;
    }

    public static C22230 c(C22230 c22230, C22230 c22231) {
        C22230 c22232;
        c22231.i = true;
        while (true) {
            C22230 c22233 = c22231.e;
            if (c22233 == null) {
                c22231.i = false;
                return c22231;
            }
            if (!c22233.i || (c22232 = c22233.e) == null) {
                return c22230;
            }
            C22230 c22234 = c22232.f;
            if (c22233 == c22234) {
                C22230 c22235 = c22232.g;
                if (c22235 != null && c22235.i) {
                    c22235.i = false;
                    c22233.i = false;
                    c22232.i = true;
                    c22231 = c22232;
                } else {
                    if (c22231 == c22233.g) {
                        c22230 = g(c22230, c22233);
                        C22230 c22236 = c22233.e;
                        c22232 = c22236 == null ? null : c22236.e;
                        c22233 = c22236;
                        c22231 = c22233;
                    }
                    if (c22233 != null) {
                        c22233.i = false;
                        if (c22232 != null) {
                            c22232.i = true;
                            c22230 = h(c22230, c22232);
                        }
                    }
                }
            } else if (c22234 != null && c22234.i) {
                c22234.i = false;
                c22233.i = false;
                c22232.i = true;
                c22231 = c22232;
            } else {
                if (c22231 == c22233.f) {
                    c22230 = h(c22230, c22233);
                    C22230 c22237 = c22233.e;
                    c22232 = c22237 == null ? null : c22237.e;
                    c22233 = c22237;
                    c22231 = c22233;
                }
                if (c22233 != null) {
                    c22233.i = false;
                    if (c22232 != null) {
                        c22232.i = true;
                        c22230 = g(c22230, c22232);
                    }
                }
            }
        }
    }

    public static C22230 b(C22230 c22230, C22230 c22231) {
        while (c22231 != null && c22231 != c22230) {
            C22230 c22232 = c22231.e;
            if (c22232 == null) {
                c22231.i = false;
                return c22231;
            }
            if (c22231.i) {
                c22231.i = false;
                return c22230;
            }
            C22230 c22233 = c22232.f;
            if (c22233 == c22231) {
                C22230 c22234 = c22232.g;
                if (c22234 != null && c22234.i) {
                    c22234.i = false;
                    c22232.i = true;
                    c22230 = g(c22230, c22232);
                    c22232 = c22231.e;
                    c22234 = c22232 == null ? null : c22232.g;
                }
                if (c22234 != null) {
                    C22230 c22235 = c22234.f;
                    C22230 c22236 = c22234.g;
                    if ((c22236 == null || !c22236.i) && (c22235 == null || !c22235.i)) {
                        c22234.i = true;
                    } else {
                        if (c22236 == null || !c22236.i) {
                            if (c22235 != null) {
                                c22235.i = false;
                            }
                            c22234.i = true;
                            c22230 = h(c22230, c22234);
                            c22232 = c22231.e;
                            c22234 = c22232 != null ? c22232.g : null;
                        }
                        if (c22234 != null) {
                            c22234.i = c22232 == null ? false : c22232.i;
                            C22230 c22237 = c22234.g;
                            if (c22237 != null) {
                                c22237.i = false;
                            }
                        }
                        if (c22232 != null) {
                            c22232.i = false;
                            c22230 = g(c22230, c22232);
                        }
                        c22231 = c22230;
                        c22230 = c22231;
                    }
                }
                c22231 = c22232;
            } else {
                if (c22233 != null && c22233.i) {
                    c22233.i = false;
                    c22232.i = true;
                    c22230 = h(c22230, c22232);
                    c22232 = c22231.e;
                    c22233 = c22232 == null ? null : c22232.f;
                }
                if (c22233 != null) {
                    C22230 c22238 = c22233.f;
                    C22230 c22239 = c22233.g;
                    if ((c22238 == null || !c22238.i) && (c22239 == null || !c22239.i)) {
                        c22233.i = true;
                    } else {
                        if (c22238 == null || !c22238.i) {
                            if (c22239 != null) {
                                c22239.i = false;
                            }
                            c22233.i = true;
                            c22230 = g(c22230, c22233);
                            c22232 = c22231.e;
                            c22233 = c22232 != null ? c22232.f : null;
                        }
                        if (c22233 != null) {
                            c22233.i = c22232 == null ? false : c22232.i;
                            C22230 c222310 = c22233.f;
                            if (c222310 != null) {
                                c222310.i = false;
                            }
                        }
                        if (c22232 != null) {
                            c22232.i = false;
                            c22230 = h(c22230, c22232);
                        }
                        c22231 = c22230;
                        c22230 = c22231;
                    }
                }
                c22231 = c22232;
            }
        }
        return c22230;
    }
}
