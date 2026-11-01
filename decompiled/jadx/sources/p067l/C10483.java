package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 47G4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10483 {

    /* JADX INFO: renamed from: ֫ */
    public long f29012;

    /* JADX INFO: renamed from: ۧ */
    public C8471 f29014;

    /* JADX INFO: renamed from: ܽ */
    public Throwable f29016;

    /* JADX INFO: renamed from: ܿ */
    public long f29017;

    /* JADX INFO: renamed from: ᩳ */
    public long f29018;

    /* JADX INFO: renamed from: ᩷ */
    public long f29019;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f29020;

    /* JADX INFO: renamed from: ۜ */
    public volatile EnumC17187 f29013 = EnumC17187.UNKNOWN;

    /* JADX INFO: renamed from: ܳ */
    public final Object f29015 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public final EnumC17187 m24193() {
        return this.f29013;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24194() {
        synchronized (this.f29015) {
            this.f29013 = EnumC17187.UNKNOWN;
            this.f29014 = null;
            this.f29016 = null;
            this.f29017++;
            this.f29020 = false;
            this.f29019 = 0L;
            this.f29015.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11154 m24192(C3106 c3106, C9812 c9812) {
        Throwable th;
        C8471 c8471M5287;
        boolean z;
        while (c9812.f27151.m33159(c9812.f27152)) {
            EnumC17187 enumC17187 = this.f29013;
            EnumC17187 enumC17188 = EnumC17187.UNKNOWN;
            if (enumC17187 != enumC17188) {
                return new C11154(enumC17187, false);
            }
            synchronized (this.f29015) {
                if (!c9812.f27151.m33159(c9812.f27152)) {
                    return new C11154(enumC17188, true);
                }
                EnumC17187 enumC17189 = this.f29013;
                if (enumC17189 != enumC17188) {
                    return new C11154(enumC17189, false);
                }
                if (this.f29020) {
                    long j = this.f29019;
                    while (this.f29020 && this.f29019 == j) {
                        try {
                            this.f29015.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted while waiting for SMB protocol probing", e);
                        }
                    }
                    if (!c9812.f27151.m33159(c9812.f27152)) {
                        return new C11154(EnumC17187.UNKNOWN, true);
                    }
                    EnumC17187 enumC171810 = this.f29013;
                    EnumC17187 enumC171811 = EnumC17187.UNKNOWN;
                    if (enumC171810 != enumC171811) {
                        return new C11154(enumC171810, false);
                    }
                    C8471 c8471 = this.f29014;
                    if (c8471 != null && this.f29012 == j) {
                        if (c8471.m19696() != null) {
                            m24191(this.f29014.m19696());
                            throw null;
                        }
                        if (this.f29014.m19698() != enumC171811) {
                            return new C11154(this.f29014.m19698(), false);
                        }
                    }
                    Throwable th2 = this.f29016;
                    if (th2 != null && this.f29018 == j) {
                        m24191(th2);
                        throw null;
                    }
                    return new C11154(enumC171811, true);
                }
                this.f29020 = true;
                long j2 = this.f29017 + 1;
                this.f29017 = j2;
                this.f29019 = j2;
                try {
                    c8471M5287 = c3106.m5287();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                    c8471M5287 = null;
                }
                synchronized (this.f29015) {
                    z = this.f29017 != j2;
                    if (!z) {
                        this.f29014 = c8471M5287;
                        this.f29012 = j2;
                        this.f29016 = th;
                        this.f29018 = j2;
                        if (th == null && c8471M5287 != null && c8471M5287.m19698() != EnumC17187.UNKNOWN) {
                            this.f29013 = c8471M5287.m19698();
                        }
                    }
                    if (this.f29019 == j2) {
                        this.f29020 = false;
                        this.f29019 = 0L;
                    }
                    this.f29015.notifyAll();
                }
                if (z) {
                    return new C11154(EnumC17187.UNKNOWN, true);
                }
                if (th != null) {
                    m24191(th);
                    throw null;
                }
                if (c8471M5287.m19696() != null) {
                    m24191(c8471M5287.m19696());
                    throw null;
                }
                if (c8471M5287.m19698() != EnumC17187.UNKNOWN) {
                    return new C11154(c8471M5287.m19698(), false);
                }
            }
        }
        return new C11154(EnumC17187.UNKNOWN, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24191(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new IOException("SMB protocol probing failed", th);
    }
}
