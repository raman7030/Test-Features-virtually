package p067l;

/* JADX INFO: renamed from: l.ܽۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06RI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17973 {

    /* JADX INFO: renamed from: ۜ */
    public final C4563 f53671;

    /* JADX INFO: renamed from: ۡ */
    public final C10832 f53672;

    /* JADX INFO: renamed from: ۢ */
    public C3892 f53673;

    /* JADX INFO: renamed from: ۧ */
    public long f53674;

    /* JADX INFO: renamed from: ܳ */
    public long f53675;

    /* JADX INFO: renamed from: ܽ */
    public C12610 f53676;

    /* JADX INFO: renamed from: ܿ */
    public C11503 f53677;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f53679;

    /* JADX INFO: renamed from: ᩻ */
    public long f53680;

    /* JADX INFO: renamed from: ֫ */
    public C17302 f53670 = new C17302();

    /* JADX INFO: renamed from: ᩳ */
    public final C15961 f53678 = new C15961();

    public C17973(C4563 c4563, boolean z, boolean z2) {
        C10832 c10832M26557;
        this.f53671 = c4563;
        this.f53679 = z2;
        if (z) {
            C17302 c17302 = c4563.f10227.f32102;
            c10832M26557 = !c17302.isEmpty() ? (C10832) c17302.last() : null;
        } else {
            c10832M26557 = c4563.f10227.m26557();
        }
        this.f53672 = c10832M26557;
        this.f53675 = c4563.f10226;
        this.f53680 = c4563.f10230;
        this.f53677 = c4563.f10227;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40909(C24679 c24679, C4563 c4563) {
        C17302 c17302M39212 = this.f53670.m39212(c24679.m54331());
        boolean zIsEmpty = c17302M39212.isEmpty();
        C4563 c4564 = this.f53671;
        this.f53673 = new C3892(c17302M39212, (zIsEmpty ? c4564.f10227 : c4564.f10227.m26554(c17302M39212, System.currentTimeMillis())).m26553(this.f53678, c4563.f10228, this.f53679), c24679.m54332(), c24679.m54333());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40910() {
        this.f53670 = this.f53673.f8434;
        this.f53677 = this.f53673.f8435;
        this.f53675 = this.f53673.f8436;
        this.f53680 = this.f53673.f8437;
        this.f53673 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40908() {
        this.f53673 = null;
        this.f53678.m36263();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4563 m40907(C4563 c4563) {
        long j = this.f53670.isEmpty() ? this.f53671.f10226 : this.f53675;
        long jMax = Math.max(c4563.f10230, this.f53680);
        C11503 c11503 = this.f53677;
        return new C4563(new C11503(c11503.f32103, c11503.f32102, Math.max(c11503.f32101, c4563.f10227.f32101), this.f53677.f32100), c4563.f10229, j, jMax, c4563.f10228);
    }
}
