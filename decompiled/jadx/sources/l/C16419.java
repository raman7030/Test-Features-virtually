package l;

/* JADX INFO: renamed from: l.ܽۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06RI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16419 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2309 f50499;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C8905 f50500;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C1603 f50501;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f50502;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f50503;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C10776 f50504;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9611 f50505;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f50507;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f50508;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15713 f50498 = new C15713();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14302 f50506 = new C14302();

    public C16419(C2309 c2309, boolean z, boolean z2) {
        C8905 c8905M24544;
        this.f50499 = c2309;
        this.f50507 = z2;
        if (z) {
            C15713 c15713 = c2309.f7441.f29155;
            c8905M24544 = !c15713.isEmpty() ? (C8905) c15713.last() : null;
        } else {
            c8905M24544 = c2309.f7441.m24544();
        }
        this.f50500 = c8905M24544;
        this.f50503 = c2309.f7440;
        this.f50508 = c2309.f7444;
        this.f50505 = c2309.f7441;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38692(C23475 c23475, C2309 c2309) {
        C15713 c15713M37045 = this.f50498.m37045(c23475.m51929());
        boolean zIsEmpty = c15713M37045.isEmpty();
        C2309 c23010 = this.f50499;
        this.f50501 = new C1603(c15713M37045, (zIsEmpty ? c23010.f7441 : c23010.f7441.m24541(c15713M37045, System.currentTimeMillis())).m24540(this.f50506, c2309.f7442, this.f50507), c23475.m51930(), c23475.m51931());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38693() {
        this.f50498 = this.f50501.f5655;
        this.f50505 = this.f50501.f5656;
        this.f50503 = this.f50501.f5657;
        this.f50508 = this.f50501.f5658;
        this.f50501 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38691() {
        this.f50501 = null;
        this.f50506.m34130();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2309 m38690(C2309 c2309) {
        long j = this.f50498.isEmpty() ? this.f50499.f7440 : this.f50503;
        long jMax = Math.max(c2309.f7444, this.f50508);
        C9611 c9611 = this.f50505;
        return new C2309(new C9611(c9611.f29156, c9611.f29155, Math.max(c9611.f29154, c2309.f7441.f29154), this.f50505.f29153), c2309.f7443, j, jMax, c2309.f7442);
    }
}
