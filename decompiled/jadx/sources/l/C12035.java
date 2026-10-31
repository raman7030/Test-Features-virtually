package l;

/* JADX INFO: renamed from: l.ۨ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78NK */
/* JADX INFO: loaded from: classes3.dex */
public final class C12035 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12468 f36004;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f36011;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4979 f36013;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C20502 f36007 = new C20502();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C20537 f36006 = new C20537();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20537 f36005 = new C20537();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3022 f36014 = new C3022();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f36010 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6404 f36009 = C6404.f19812;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f36012 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f36008 = -9223372036854775807L;

    public C12035(C12468 c12468, C4979 c4979) {
        this.f36004 = c12468;
        this.f36013 = c4979;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29396() {
        this.f36014.m9266();
        this.f36010 = -9223372036854775807L;
        this.f36012 = -9223372036854775807L;
        this.f36008 = -9223372036854775807L;
        C20537 c20537 = this.f36005;
        if (c20537.m47029() > 0) {
            C22632.m50631(c20537.m47029() > 0);
            while (c20537.m47029() > 1) {
                c20537.m47027();
            }
            Object objM47027 = c20537.m47027();
            objM47027.getClass();
            this.f36011 = ((Long) objM47027).longValue();
        }
        C20537 c20538 = this.f36006;
        if (c20538.m47029() > 0) {
            C22632.m50631(c20538.m47029() > 0);
            while (c20538.m47029() > 1) {
                c20538.m47027();
            }
            Object objM47028 = c20538.m47027();
            objM47028.getClass();
            c20538.m47026(0L, (C6404) objM47028);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29400(long j, long j2) {
        long jM46975;
        while (true) {
            C3022 c3022 = this.f36014;
            if (c3022.m9269()) {
                return;
            }
            long jM9268 = c3022.m9268();
            Long l2 = (Long) this.f36005.m47028(jM9268);
            C4979 c4979 = this.f36013;
            if (l2 != null && l2.longValue() != this.f36011) {
                this.f36011 = l2.longValue();
                c4979.m14441(2);
            }
            long j3 = this.f36011;
            C4979 c49710 = this.f36013;
            C20502 c20502 = this.f36007;
            int iM14438 = c49710.m14438(jM9268, j, j2, j3, false, false, c20502);
            final C12468 c12468 = this.f36004;
            if (iM14438 == 0 || iM14438 == 1) {
                this.f36012 = jM9268;
                boolean z = iM14438 == 0;
                long jM9270 = c3022.m9270();
                C6404 c6404 = (C6404) this.f36006.m47028(jM9270);
                if (c6404 != null && !c6404.equals(C6404.f19812) && !c6404.equals(this.f36009)) {
                    this.f36009 = c6404;
                    c12468.m30628(c6404);
                }
                if (z) {
                    jM46975 = System.nanoTime();
                } else {
                    jM46975 = c20502.m46975();
                }
                c12468.m30627(jM46975, jM9270, c4979.m14448());
            } else if (iM14438 == 2 || iM14438 == 3) {
                this.f36012 = jM9268;
                c3022.m9270();
                C10352 c10352 = c12468.f37486;
                c10352.f31158.execute(new Runnable() { // from class: l.ۗܳۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c12468.f37486.f31156.mo25027();
                    }
                });
                ((InterfaceC14359) c10352.f31157.remove()).skip();
            } else {
                if (iM14438 != 4) {
                    if (iM14438 != 5) {
                        throw new IllegalStateException(String.valueOf(iM14438));
                    }
                    return;
                }
                this.f36012 = jM9268;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29397(int i, int i2) {
        long j = this.f36010;
        this.f36006.m47026(j == -9223372036854775807L ? 0L : j + 1, new C6404(i, i2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29398(int i, long j) {
        if (this.f36014.m9269()) {
            this.f36013.m14441(i);
            this.f36011 = j;
        } else {
            long j2 = this.f36010;
            this.f36005.m47026(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29399(long j) {
        this.f36014.m9267(j);
        this.f36010 = j;
        this.f36008 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29402() {
        if (this.f36010 == -9223372036854775807L) {
            this.f36010 = Long.MIN_VALUE;
            this.f36012 = Long.MIN_VALUE;
        }
        this.f36008 = this.f36010;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m29401() {
        long j = this.f36008;
        return j != -9223372036854775807L && this.f36012 == j;
    }
}
