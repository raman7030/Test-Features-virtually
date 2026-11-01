package p067l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۘۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N70B */
/* JADX INFO: loaded from: classes2.dex */
public final class C5844 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18588 f14332;

    /* JADX INFO: renamed from: ۜ */
    public volatile boolean f14333;

    /* JADX INFO: renamed from: ۧ */
    public volatile C17242 f14334;

    /* JADX INFO: renamed from: ܳ */
    public C11209 f14335;

    /* JADX INFO: renamed from: ܽ */
    public final C5370 f14336;

    /* JADX INFO: renamed from: ܿ */
    public final C19926 f14337;

    /* JADX INFO: renamed from: ᩳ */
    public final long f14338;

    /* JADX INFO: renamed from: ᩻ */
    public final C24320 f14339;

    /* JADX WARN: Type inference failed for: r4v3, types: [l.ۖۖܿ] */
    public C5844(C19926 c19926, C24320 c24320, C9729 c9729, long j, long j2, InterfaceC18588 interfaceC18588, C17242 c17242, C16611 c16611) {
        C5370 c5370;
        this.f14337 = c19926;
        this.f14339 = c24320;
        this.f14338 = j2;
        this.f14332 = interfaceC18588;
        if (c17242 == null) {
            this.f14336 = c24320.m53661(c9729, new InterfaceC18588() { // from class: l.ۖۖܿ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f10105.m13129();
                }
            });
            return;
        }
        if (c16611.m37665() != c9729.length()) {
            throw new IllegalArgumentException("New text and change set lengths differ");
        }
        boolean z = c17242.f51309 != null && c17242.f51309.m44256(c16611.m37663(), c24320.f77059);
        if (c24320.m53664() && !z) {
            c5370 = c24320.m53661(c9729, new InterfaceC18588() { // from class: l.ۖۖܿ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f10105.m13129();
                }
            });
        } else {
            c5370 = new C5370(c24320, c9729, new InterfaceC18588() { // from class: l.ۖۖܿ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f10105.m13129();
                }
            }, c17242.f51310, c17242.f51311, c17242.f51308, c17242.f51309, c16611);
        }
        this.f14336 = c5370;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13134() {
        this.f14336.m11704();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13133(C22135 c22135, Executor executor, C16748 c16748) {
        this.f14336.m11702(c22135, executor, c16748);
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC6711 m13131(int i, long j, C24460 c24460) {
        C5370 c5370 = this.f14336;
        try {
            EnumC6711 enumC6711M11699 = c5370.m11699(i, j, c24460);
            if (enumC6711M11699 == EnumC6711.COMPLETED) {
                m13126();
            }
            return enumC6711M11699;
        } catch (Error | RuntimeException e) {
            if (c5370.m11705() == EnumC6711.ABORTED) {
                this.f14335 = null;
                this.f14337.m45231(this);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m13126() {
        try {
            try {
                if (m13129()) {
                    this.f14337.m45231(this);
                    this.f14335 = null;
                    return;
                }
                C11209 c11209M11717 = this.f14336.m11717();
                C19452 c19452M11712 = this.f14336.m11712();
                C13930 c13930M11709 = this.f14336.m11709();
                C12391 c12391M11711 = this.f14336.m11711();
                this.f14335.m25896(c11209M11717);
                if (m13129()) {
                    this.f14337.m45231(this);
                } else {
                    this.f14334 = new C17242(this.f14339, this.f14338, c11209M11717, c19452M11712, c13930M11709, c12391M11711);
                }
                this.f14335 = null;
            } catch (Throwable th) {
                this.f14335 = null;
                throw th;
            }
        } catch (Error | RuntimeException e) {
            this.f14337.m45231(this);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17242 m13132() {
        return this.f14334;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public boolean m13129() {
        if (this.f14333) {
            return true;
        }
        if (this.f14332.mo3924()) {
            this.f14333 = true;
        }
        return this.f14333;
    }
}
