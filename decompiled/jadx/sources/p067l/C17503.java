package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.ܺ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O55N */
/* JADX INFO: loaded from: classes4.dex */
public final class C17503 {

    /* JADX INFO: renamed from: ֫ */
    public int f52332;

    /* JADX INFO: renamed from: ܳ */
    public boolean[] f52334;

    /* JADX INFO: renamed from: ܽ */
    public int f52335;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC9476 f52337;

    /* JADX INFO: renamed from: ۧ */
    public final C16162 f52333 = new C16162();

    /* JADX INFO: renamed from: ܿ */
    public final C11470 f52336 = new C11470();

    /* JADX INFO: renamed from: ۧ */
    public final Set m39877() {
        return new C8787(this.f52333, this);
    }

    /* JADX INFO: renamed from: ܿ */
    public final Set m39880() {
        return new C8787(this.f52336, this);
    }

    public C17503(AbstractC9476 abstractC9476, int i, int i2) {
        this.f52337 = abstractC9476;
        this.f52332 = i;
        this.f52335 = i2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC9476 m39881() {
        return this.f52337;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m39874() {
        return this.f52332;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m39879() {
        return this.f52335;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39875(C17503 c17503) {
        this.f52336.m50011(c17503.f52336, c17503);
        this.f52333.m50011(c17503.f52333, c17503);
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean[] m39878() {
        return this.f52334;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39876(boolean[] zArr) {
        this.f52334 = zArr;
    }
}
