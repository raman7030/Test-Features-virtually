package p067l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۤۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 570W */
/* JADX INFO: loaded from: classes3.dex */
public final class C12076 {

    /* JADX INFO: renamed from: ֫ */
    public final C14087 f33641;

    /* JADX INFO: renamed from: ۧ */
    public final C8052 f33642;

    /* JADX INFO: renamed from: ܽ */
    public boolean f33643;

    /* JADX INFO: renamed from: ܿ */
    public final C5844 f33644;

    /* JADX INFO: renamed from: ᩳ */
    public volatile boolean f33645;

    public C12076(C8052 c8052, C14087 c14087, C5844 c5844, boolean z) {
        this.f33642 = c8052;
        this.f33641 = c14087;
        this.f33644 = c5844;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27657() {
        this.f33644.m13134();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27656(C22135 c22135, Executor executor, C16748 c16748) {
        this.f33644.m13133(c22135, executor, c16748);
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC6711 m27654(int i, long j, C24460 c24460) {
        return this.f33644.m13131(i, j, c24460);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17242 m27655() {
        return this.f33644.m13132();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m27658() {
        if (!this.f33643) {
            this.f33643 = true;
            this.f33645 = C8052.m18706(this.f33642, this);
        }
        return this.f33645;
    }
}
