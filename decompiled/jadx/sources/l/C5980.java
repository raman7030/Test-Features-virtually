package l;

/* JADX INFO: renamed from: l.ۛۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 570W */
/* JADX INFO: loaded from: classes2.dex */
public final class C5980 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12330 f18365;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16783() {
        C12330 c12330 = this.f18365;
        if (c12330 != null) {
            c12330.f36922.m42961();
        }
        this.f18365 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C15650 m16784() {
        C12330 c12330;
        c12330 = this.f18365;
        return c12330 == null ? null : c12330.f36922.m42963();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16785() {
        C12330 c12330 = this.f18365;
        if (c12330 != null) {
            c12330.f36922.m42964();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10214 m16781(C23097 c23097, InterfaceC20445 interfaceC20445, C7744 c7744, long j, C0314 c0314) {
        C12330 c12330M16779;
        C8596 c8596M42960;
        C11003.requireNonNull(c23097, "program");
        C11003.requireNonNull(interfaceC20445, "textOwner");
        synchronized (this) {
            c12330M16779 = m16779(c23097, interfaceC20445);
            c8596M42960 = c12330M16779.f36922.m42960(c23097);
        }
        return new C10214(this, c12330M16779, c12330M16779.f36922.m42958(c8596M42960, c7744, j, (InterfaceC17066) c0314), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10214 m16782(C23097 c23097, InterfaceC20445 interfaceC20445, C7744 c7744, C15650 c15650, long j, C14986 c14986, C0314 c0314) throws Throwable {
        C8596 c8596M42959;
        C14986 c14987;
        C3657 c3657M42958;
        if (c15650 != null) {
            C11003.requireNonNull(c14986, "changes");
        }
        C11003.requireNonNull(c23097, "program");
        C11003.requireNonNull(interfaceC20445, "textOwner");
        synchronized (this) {
            try {
                try {
                    C12330 c12330M16779 = m16779(c23097, interfaceC20445);
                    try {
                        synchronized (c12330M16779.f36922) {
                            try {
                                C15650 c15650M42963 = c12330M16779.f36922.m42963();
                                boolean z = c15650M42963 != null && c15650M42963 == c15650;
                                if (!z) {
                                    c14987 = null;
                                    c8596M42959 = c12330M16779.f36922.m42960(c23097);
                                } else {
                                    int iM23880 = c15650M42963.m36849().m23880();
                                    long j2 = 0;
                                    long j3 = j2 + j2;
                                    if (j3 > iM23880) {
                                        throw new IllegalArgumentException("Syntax edit does not match the current base");
                                    }
                                    C14986 c14986M35494 = c14986 != null ? c14986 : C14986.m35494(iM23880, new C7931(0, (int) j3, 0));
                                    c8596M42959 = c12330M16779.f36922.m42959(c15650M42963, c14986M35494);
                                    c14987 = c14986M35494;
                                }
                                if (z && c14987.m35509() != c7744.length()) {
                                    throw new IllegalArgumentException("Syntax edit does not match the current base");
                                }
                                if (z) {
                                    c3657M42958 = c12330M16779.f36922.m42957(c8596M42959, c7744, j, c0314);
                                } else {
                                    c3657M42958 = c12330M16779.f36922.m42958(c8596M42959, c7744, j, (InterfaceC17066) c0314);
                                }
                                return new C10214(this, c12330M16779, c3657M42958, z);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12330 m16779(C23097 c23097, Object obj) {
        C12330 c12330 = this.f18365;
        if (c12330 != null && c12330.f36921 == c23097 && this.f18365.f36923 == obj) {
            return this.f18365;
        }
        C12330 c12331 = this.f18365;
        if (c12331 != null) {
            c12331.f36922.m42961();
        }
        C12330 c12332 = new C12330(c23097, obj);
        this.f18365 = c12332;
        return c12332;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16780(C5980 c5980, C10214 c10214) {
        boolean z;
        synchronized (c5980) {
            if (c10214.f30681 == c5980 && c5980.f18365 == c10214.f30680) {
                if (!c10214.f30680.f36922.m42962(c10214.f30683)) {
                    return false;
                }
                synchronized (c5980) {
                    z = c5980.f18365 == c10214.f30680;
                }
                return z;
            }
            return false;
        }
    }
}
