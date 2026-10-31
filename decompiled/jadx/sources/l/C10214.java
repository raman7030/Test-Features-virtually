package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۤۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 570W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10214 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12330 f30680;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5980 f30681;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30682;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3657 f30683;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f30684;

    public C10214(C5980 c5980, C12330 c12330, C3657 c3657, boolean z) {
        this.f30681 = c5980;
        this.f30680 = c12330;
        this.f30683 = c3657;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25635() {
        this.f30683.m11158();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25634(C20798 c20798, Executor executor, C15130 c15130) {
        this.f30683.m11157(c20798, executor, c15130);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC4569 m25632(int i, long j, C23244 c23244) {
        return this.f30683.m11155(i, j, c23244);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15650 m25633() {
        return this.f30683.m11156();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m25636() {
        if (!this.f30682) {
            this.f30682 = true;
            this.f30684 = C5980.m16780(this.f30681, this);
        }
        return this.f30684;
    }
}
