package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۘۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N70B */
/* JADX INFO: loaded from: classes2.dex */
public final class C3657 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f11526;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile boolean f11527;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile C15650 f11528;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9302 f11529;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3158 f11530;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18474 f11531;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f11532;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C23097 f11533;

    /* JADX WARN: Type inference failed for: r4v3, types: [l.ۖۖܿ] */
    public C3657(C18474 c18474, C23097 c23097, C7744 c7744, long j, long j2, InterfaceC17066 interfaceC17066, C15650 c15650, C14986 c14986) {
        C3158 c3158;
        this.f11531 = c18474;
        this.f11533 = c23097;
        this.f11532 = j2;
        this.f11526 = interfaceC17066;
        if (c15650 == null) {
            this.f11530 = c23097.m51267(c7744, new InterfaceC17066() { // from class: l.ۖۖܿ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f7317.m11153();
                }
            });
            return;
        }
        if (c14986.m35509() != c7744.length()) {
            throw new IllegalArgumentException("New text and change set lengths differ");
        }
        boolean z = c15650.f48169 != null && c15650.f48169.m42007(c14986.m35507(), c23097.f74313);
        if (c23097.m51270() && !z) {
            c3158 = c23097.m51267(c7744, new InterfaceC17066() { // from class: l.ۖۖܿ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f7317.m11153();
                }
            });
        } else {
            c3158 = new C3158(c23097, c7744, new InterfaceC17066() { // from class: l.ۖۖܿ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f7317.m11153();
                }
            }, c15650.f48170, c15650.f48171, c15650.f48168, c15650.f48169, c14986);
        }
        this.f11530 = c3158;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11158() {
        this.f11530.m9660();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11157(C20798 c20798, Executor executor, C15130 c15130) {
        this.f11530.m9658(c20798, executor, c15130);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC4569 m11155(int i, long j, C23244 c23244) {
        C3158 c3158 = this.f11530;
        try {
            EnumC4569 enumC4569M9655 = c3158.m9655(i, j, c23244);
            if (enumC4569M9655 == EnumC4569.COMPLETED) {
                m11150();
            }
            return enumC4569M9655;
        } catch (Error | RuntimeException e) {
            if (c3158.m9661() == EnumC4569.ABORTED) {
                this.f11529 = null;
                this.f11531.m42955(this);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m11150() {
        try {
            try {
                if (m11153()) {
                    this.f11531.m42955(this);
                    this.f11529 = null;
                    return;
                }
                C9302 c9302M9673 = this.f11530.m9673();
                C17975 c17975M9668 = this.f11530.m9668();
                C12165 c12165M9665 = this.f11530.m9665();
                C10545 c10545M9667 = this.f11530.m9667();
                this.f11529.m23887(c9302M9673);
                if (m11153()) {
                    this.f11531.m42955(this);
                } else {
                    this.f11528 = new C15650(this.f11533, this.f11532, c9302M9673, c17975M9668, c12165M9665, c10545M9667);
                }
                this.f11529 = null;
            } catch (Throwable th) {
                this.f11529 = null;
                throw th;
            }
        } catch (Error | RuntimeException e) {
            this.f11531.m42955(this);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15650 m11156() {
        return this.f11528;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m11153() {
        if (this.f11527) {
            return true;
        }
        if (this.f11526.mo1526()) {
            this.f11527 = true;
        }
        return this.f11527;
    }
}
