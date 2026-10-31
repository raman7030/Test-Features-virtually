package l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۘ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A9YW */
/* JADX INFO: loaded from: classes3.dex */
public final class C3618 implements InterfaceC18435 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f11463 = C11321.m27961(C3618.class);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicLong f11464 = new AtomicLong(1);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17729 f11465;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2207 f11466;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        m11101();
    }

    public C3618(C17729 c17729, C2207 c2207) {
        this.f11465 = c17729;
        c2207.m7332();
        this.f11466 = c2207;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23373 m11098() {
        return this.f11466.m7340();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m11097() {
        this.f11466.m7331(this.f11465, (InterfaceC16359) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11089(int i) {
        C23373 c23373M7340 = this.f11466.m7340();
        try {
            if (c23373M7340 != null) {
                C20552 c20552M51804 = c23373M7340.m51804();
                try {
                    boolean zMo10548 = c20552M51804.m47117().mo10548(i);
                    c20552M51804.m19171();
                    c23373M7340.m51813();
                    return zMo10548;
                } catch (Throwable th) {
                    try {
                        c20552M51804.m19171();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new C3037("Not connected");
        } catch (Throwable th3) {
            if (c23373M7340 != null) {
                try {
                    c23373M7340.m51813();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m11095() {
        return this.f11466.m7341();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1023 m11094() {
        return this.f11466.m7338();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long m11099() {
        return this.f11466.m7339();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1543 m11087(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, EnumC0214... enumC0214Arr) {
        return this.f11466.m7327(this.f11465, interfaceC7578, interfaceC1543, enumC0214Arr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11088() {
        if (this.f11464.incrementAndGet() == 1) {
            this.f11466.m7332();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m11101() {
        long jDecrementAndGet = this.f11464.decrementAndGet();
        if (jDecrementAndGet == 0) {
            this.f11466.m7334();
        } else if (jDecrementAndGet < 0) {
            throw new C13017("Usage count dropped below zero");
        }
    }

    public final void finalize() {
        if (this.f11464.get() != 0) {
            f11463.mo7104("Tree handle was not properly released " + this.f11465.m41522());
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m11092() {
        C23373 c23373M7340 = this.f11466.m7340();
        try {
            C20552 c20552M51804 = c23373M7340.m51804();
            try {
                InterfaceC20594 interfaceC20594M47117 = c20552M51804.m47117();
                if (!(interfaceC20594M47117 instanceof C8640)) {
                    c20552M51804.m19171();
                    c23373M7340.m51813();
                    return 0L;
                }
                long j = ((long) (((C8640) interfaceC20594M47117).m22410().f40398 * 1000)) * 60;
                c20552M51804.m19171();
                c23373M7340.m51813();
                return j;
            } catch (Throwable th) {
                try {
                    c20552M51804.m19171();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c23373M7340 != null) {
                try {
                    c23373M7340.m51813();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
        if (c23373M7340 != null) {
            c23373M7340.m51813();
        }
        throw th3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m11093() {
        C23373 c23373M7340 = this.f11466.m7340();
        try {
            C20552 c20552M51804 = c23373M7340.m51804();
            try {
                InterfaceC20594 interfaceC20594M47117 = c20552M51804.m47117();
                if (!(interfaceC20594M47117 instanceof C8640)) {
                    c20552M51804.m19171();
                    c23373M7340.m51813();
                    return null;
                }
                String str = ((C8640) interfaceC20594M47117).m22410().f40400;
                c20552M51804.m19171();
                c23373M7340.m51813();
                return str;
            } catch (Throwable th) {
                try {
                    c20552M51804.m19171();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c23373M7340 != null) {
                try {
                    c23373M7340.m51813();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
        if (c23373M7340 != null) {
            c23373M7340.m51813();
        }
        throw th3;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m11086() {
        return this.f11466.m7337();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11090(InterfaceC18435 interfaceC18435) {
        if (!C12354.m29972(interfaceC18435)) {
            return false;
        }
        return this.f11466.m7333(((C3618) interfaceC18435).f11466);
    }

    public final int getSendBufferSize() {
        C23373 c23373M7340 = this.f11466.m7340();
        try {
            C20552 c20552M51804 = c23373M7340.m51804();
            try {
                int sendBufferSize = c20552M51804.m47117().getSendBufferSize();
                c20552M51804.m19171();
                c23373M7340.m51813();
                return sendBufferSize;
            } catch (Throwable th) {
                try {
                    c20552M51804.m19171();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c23373M7340 != null) {
                try {
                    c23373M7340.m51813();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m11091() {
        C23373 c23373M7340 = this.f11466.m7340();
        try {
            C20552 c20552M51804 = c23373M7340.m51804();
            try {
                int iMo10547 = c20552M51804.m47117().mo10547();
                c20552M51804.m19171();
                c23373M7340.m51813();
                return iMo10547;
            } catch (Throwable th) {
                try {
                    c20552M51804.m19171();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c23373M7340 != null) {
                try {
                    c23373M7340.m51813();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m11102() {
        C23373 c23373M7340 = this.f11466.m7340();
        try {
            C20552 c20552M51804 = c23373M7340.m51804();
            try {
                int iMo10544 = c20552M51804.m47117().mo10544();
                c20552M51804.m19171();
                c23373M7340.m51813();
                return iMo10544;
            } catch (Throwable th) {
                try {
                    c20552M51804.m19171();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c23373M7340 != null) {
                try {
                    c23373M7340.m51813();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m11096() {
        C23373 c23373M7340 = this.f11466.m7340();
        try {
            C20552 c20552M51804 = c23373M7340.m51804();
            try {
                boolean zMo10550 = c20552M51804.m47117().mo10550();
                c20552M51804.m19171();
                c23373M7340.m51813();
                return zMo10550;
            } catch (Throwable th) {
                try {
                    c20552M51804.m19171();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c23373M7340 != null) {
                try {
                    c23373M7340.m51813();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m11100() {
        try {
            C23373 c23373M7340 = this.f11466.m7340();
            try {
                C20552 c20552M51804 = c23373M7340.m51804();
                try {
                    boolean zM47112 = c20552M51804.m47112();
                    c20552M51804.m19171();
                    c23373M7340.m51813();
                    return zM47112;
                } catch (Throwable th) {
                    try {
                        c20552M51804.m19171();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (c23373M7340 != null) {
                    try {
                        c23373M7340.m51813();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C3037 e) {
            f11463.mo7081("Failed to connect for determining SMB2 support", (Exception) e);
            return false;
        }
    }
}
