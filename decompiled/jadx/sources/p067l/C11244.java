package p067l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۢۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8PN */
/* JADX INFO: loaded from: classes3.dex */
public final class C11244 implements InterfaceC11402 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10573 f31271;

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return true;
    }

    public C11244(C10573 c10573) {
        this.f31271 = c10573;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        C10573 c10573 = this.f31271;
        long jM37632 = c10573.f29277.m37632(j);
        C10731 c10731 = new C10731(j, C5792.m12992((BigInteger.valueOf(jM37632).multiply(BigInteger.valueOf(c10573.f29283 - c10573.f29282)).divide(BigInteger.valueOf(c10573.f29280)).longValue() + c10573.f29282) - 30000, c10573.f29282, c10573.f29283 - 1));
        return new C8719(c10731, c10731);
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        C10573 c10573 = this.f31271;
        return c10573.f29277.m37629(c10573.f29280);
    }
}
