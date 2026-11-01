package p067l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۘ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A9YW */
/* JADX INFO: loaded from: classes3.dex */
public final class C5807 implements InterfaceC19889 {

    /* JADX INFO: renamed from: ۙ */
    public static final InterfaceC4410 f14268 = C13128.m30022(C5807.class);

    /* JADX INFO: renamed from: ᩶ */
    public final AtomicLong f14269 = new AtomicLong(1);

    /* JADX INFO: renamed from: ᩸ */
    public final C19218 f14270;

    /* JADX INFO: renamed from: ᩹ */
    public final C4466 f14271;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        m13077();
    }

    public C5807(C19218 c19218, C4466 c4466) {
        this.f14270 = c19218;
        c4466.m9415();
        this.f14271 = c4466;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C24582 m13074() {
        return this.f14271.m9423();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m13073() {
        this.f14271.m9414(this.f14270, (InterfaceC17916) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m13065(int i) {
        C24582 c24582M9423 = this.f14271.m9423();
        try {
            if (c24582M9423 != null) {
                C21901 c21901M54201 = c24582M9423.m54201();
                try {
                    boolean zMo12572 = c21901M54201.m49441().mo12572(i);
                    c21901M54201.m21114();
                    c24582M9423.m54210();
                    return zMo12572;
                } catch (Throwable th) {
                    try {
                        c21901M54201.m21114();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new C5255("Not connected");
        } catch (Throwable th3) {
            if (c24582M9423 != null) {
                try {
                    c24582M9423.m54210();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m13071() {
        return this.f14271.m9424();
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC3341 m13070() {
        return this.f14271.m9421();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final long m13075() {
        return this.f14271.m9422();
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3835 m13063(InterfaceC9571 interfaceC9571, InterfaceC3835 interfaceC3835, EnumC2572... enumC2572Arr) {
        return this.f14271.m9410(this.f14270, interfaceC9571, interfaceC3835, enumC2572Arr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13064() {
        if (this.f14269.incrementAndGet() == 1) {
            this.f14271.m9415();
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m13077() {
        long jDecrementAndGet = this.f14269.decrementAndGet();
        if (jDecrementAndGet == 0) {
            this.f14271.m9417();
        } else if (jDecrementAndGet < 0) {
            throw new C14740("Usage count dropped below zero");
        }
    }

    public final void finalize() {
        if (this.f14269.get() != 0) {
            f14268.mo9199("Tree handle was not properly released " + this.f14270.m43768());
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۘ */
    public final long m13068() {
        C24582 c24582M9423 = this.f14271.m9423();
        try {
            C21901 c21901M54201 = c24582M9423.m54201();
            try {
                InterfaceC21941 interfaceC21941M49441 = c21901M54201.m49441();
                if (!(interfaceC21941M49441 instanceof C10580)) {
                    c21901M54201.m21114();
                    c24582M9423.m54210();
                    return 0L;
                }
                long j = ((long) (((C10580) interfaceC21941M49441).m24379().f43468 * 1000)) * 60;
                c21901M54201.m21114();
                c24582M9423.m54210();
                return j;
            } catch (Throwable th) {
                try {
                    c21901M54201.m21114();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c24582M9423 != null) {
                try {
                    c24582M9423.m54210();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
        if (c24582M9423 != null) {
            c24582M9423.m54210();
        }
        throw th3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۜ */
    public final String m13069() {
        C24582 c24582M9423 = this.f14271.m9423();
        try {
            C21901 c21901M54201 = c24582M9423.m54201();
            try {
                InterfaceC21941 interfaceC21941M49441 = c21901M54201.m49441();
                if (!(interfaceC21941M49441 instanceof C10580)) {
                    c21901M54201.m21114();
                    c24582M9423.m54210();
                    return null;
                }
                String str = ((C10580) interfaceC21941M49441).m24379().f43470;
                c21901M54201.m21114();
                c24582M9423.m54210();
                return str;
            } catch (Throwable th) {
                try {
                    c21901M54201.m21114();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c24582M9423 != null) {
                try {
                    c24582M9423.m54210();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
        if (c24582M9423 != null) {
            c24582M9423.m54210();
        }
        throw th3;
    }

    /* JADX INFO: renamed from: ֡ */
    public final int m13062() {
        return this.f14271.m9420();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m13066(InterfaceC19889 interfaceC19889) {
        if (!C14110.m32033(interfaceC19889)) {
            return false;
        }
        return this.f14271.m9416(((C5807) interfaceC19889).f14271);
    }

    public final int getSendBufferSize() {
        C24582 c24582M9423 = this.f14271.m9423();
        try {
            C21901 c21901M54201 = c24582M9423.m54201();
            try {
                int sendBufferSize = c21901M54201.m49441().getSendBufferSize();
                c21901M54201.m21114();
                c24582M9423.m54210();
                return sendBufferSize;
            } catch (Throwable th) {
                try {
                    c21901M54201.m21114();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c24582M9423 != null) {
                try {
                    c24582M9423.m54210();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m13067() {
        C24582 c24582M9423 = this.f14271.m9423();
        try {
            C21901 c21901M54201 = c24582M9423.m54201();
            try {
                int iMo12571 = c21901M54201.m49441().mo12571();
                c21901M54201.m21114();
                c24582M9423.m54210();
                return iMo12571;
            } catch (Throwable th) {
                try {
                    c21901M54201.m21114();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c24582M9423 != null) {
                try {
                    c24582M9423.m54210();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m13078() {
        C24582 c24582M9423 = this.f14271.m9423();
        try {
            C21901 c21901M54201 = c24582M9423.m54201();
            try {
                int iMo12568 = c21901M54201.m49441().mo12568();
                c21901M54201.m21114();
                c24582M9423.m54210();
                return iMo12568;
            } catch (Throwable th) {
                try {
                    c21901M54201.m21114();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c24582M9423 != null) {
                try {
                    c24582M9423.m54210();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m13072() {
        C24582 c24582M9423 = this.f14271.m9423();
        try {
            C21901 c21901M54201 = c24582M9423.m54201();
            try {
                boolean zMo12574 = c21901M54201.m49441().mo12574();
                c21901M54201.m21114();
                c24582M9423.m54210();
                return zMo12574;
            } catch (Throwable th) {
                try {
                    c21901M54201.m21114();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c24582M9423 != null) {
                try {
                    c24582M9423.m54210();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m13076() {
        try {
            C24582 c24582M9423 = this.f14271.m9423();
            try {
                C21901 c21901M54201 = c24582M9423.m54201();
                try {
                    boolean zM49436 = c21901M54201.m49436();
                    c21901M54201.m21114();
                    c24582M9423.m54210();
                    return zM49436;
                } catch (Throwable th) {
                    try {
                        c21901M54201.m21114();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (c24582M9423 != null) {
                    try {
                        c24582M9423.m54210();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C5255 e) {
            f14268.mo9176("Failed to connect for determining SMB2 support", (Exception) e);
            return false;
        }
    }
}
