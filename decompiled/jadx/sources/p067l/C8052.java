package p067l;

/* JADX INFO: renamed from: l.ۛۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 570W */
/* JADX INFO: loaded from: classes2.dex */
public final class C8052 {

    /* JADX INFO: renamed from: ֫ */
    public C14087 f21217;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m18709() {
        C14087 c14087 = this.f21217;
        if (c14087 != null) {
            c14087.f39936.m45237();
        }
        this.f21217 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C17242 m18710() {
        C14087 c14087;
        c14087 = this.f21217;
        return c14087 == null ? null : c14087.f39936.m45239();
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m18711() {
        C14087 c14087 = this.f21217;
        if (c14087 != null) {
            c14087.f39936.m45240();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12076 m18707(C24320 c24320, InterfaceC21800 interfaceC21800, C9729 c9729, long j, C2667 c2667) {
        C14087 c14087M18705;
        C10538 c10538M45236;
        C12826.requireNonNull(c24320, "program");
        C12826.requireNonNull(interfaceC21800, "textOwner");
        synchronized (this) {
            c14087M18705 = m18705(c24320, interfaceC21800);
            c10538M45236 = c14087M18705.f39936.m45236(c24320);
        }
        return new C12076(this, c14087M18705, c14087M18705.f39936.m45234(c10538M45236, c9729, j, (InterfaceC18588) c2667), false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12076 m18708(C24320 c24320, InterfaceC21800 interfaceC21800, C9729 c9729, C17242 c17242, long j, C16611 c16611, C2667 c2667) throws Throwable {
        C10538 c10538M45235;
        C16611 c16612;
        C5844 c5844M45234;
        if (c17242 != null) {
            C12826.requireNonNull(c16611, "changes");
        }
        C12826.requireNonNull(c24320, "program");
        C12826.requireNonNull(interfaceC21800, "textOwner");
        synchronized (this) {
            try {
                try {
                    C14087 c14087M18705 = m18705(c24320, interfaceC21800);
                    try {
                        synchronized (c14087M18705.f39936) {
                            try {
                                C17242 c17242M45239 = c14087M18705.f39936.m45239();
                                boolean z = c17242M45239 != null && c17242M45239 == c17242;
                                if (!z) {
                                    c16612 = null;
                                    c10538M45235 = c14087M18705.f39936.m45236(c24320);
                                } else {
                                    int iM25889 = c17242M45239.m39015().m25889();
                                    long j2 = 0;
                                    long j3 = j2 + j2;
                                    if (j3 > iM25889) {
                                        throw new IllegalArgumentException("Syntax edit does not match the current base");
                                    }
                                    C16611 c16611M37650 = c16611 != null ? c16611 : C16611.m37650(iM25889, new C9906(0, (int) j3, 0));
                                    c10538M45235 = c14087M18705.f39936.m45235(c17242M45239, c16611M37650);
                                    c16612 = c16611M37650;
                                }
                                if (z && c16612.m37665() != c9729.length()) {
                                    throw new IllegalArgumentException("Syntax edit does not match the current base");
                                }
                                if (z) {
                                    c5844M45234 = c14087M18705.f39936.m45233(c10538M45235, c9729, j, c2667);
                                } else {
                                    c5844M45234 = c14087M18705.f39936.m45234(c10538M45235, c9729, j, (InterfaceC18588) c2667);
                                }
                                return new C12076(this, c14087M18705, c5844M45234, z);
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

    /* JADX INFO: renamed from: ֫ */
    private C14087 m18705(C24320 c24320, Object obj) {
        C14087 c14087 = this.f21217;
        if (c14087 != null && c14087.f39935 == c24320 && this.f21217.f39937 == obj) {
            return this.f21217;
        }
        C14087 c14088 = this.f21217;
        if (c14088 != null) {
            c14088.f39936.m45237();
        }
        C14087 c14089 = new C14087(c24320, obj);
        this.f21217 = c14089;
        return c14089;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m18706(C8052 c8052, C12076 c12076) {
        boolean z;
        synchronized (c8052) {
            if (c12076.f33642 == c8052 && c8052.f21217 == c12076.f33641) {
                if (!c12076.f33641.f39936.m45238(c12076.f33644)) {
                    return false;
                }
                synchronized (c8052) {
                    z = c8052.f21217 == c12076.f33641;
                }
                return z;
            }
            return false;
        }
    }
}
