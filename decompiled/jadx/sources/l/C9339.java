package l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۢۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8PN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9339 implements InterfaceC9505 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8633 f28321;

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return true;
    }

    public C9339(C8633 c8633) {
        this.f28321 = c8633;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        C8633 c8633 = this.f28321;
        long jM35476 = c8633.f26359.m35476(j);
        C8799 c8799 = new C8799(j, C3603.m11016((BigInteger.valueOf(jM35476).multiply(BigInteger.valueOf(c8633.f26365 - c8633.f26364)).divide(BigInteger.valueOf(c8633.f26362)).longValue() + c8633.f26364) - 30000, c8633.f26364, c8633.f26365 - 1));
        return new C6682(c8799, c8799);
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        C8633 c8633 = this.f28321;
        return c8633.f26359.m35473(c8633.f26362);
    }
}
