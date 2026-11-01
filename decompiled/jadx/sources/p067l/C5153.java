package p067l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۗ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes3.dex */
public final class C5153 extends AbstractC18408 implements InterfaceC4387 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C14540 f12113;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5153(C14540 c14540) {
        super(0);
        this.f12113 = c14540;
    }

    @Override // p067l.InterfaceC4387
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6293() {
        C14540 c14540 = this.f12113;
        return BigInteger.valueOf(c14540.m33203()).shiftLeft(32).or(BigInteger.valueOf(c14540.m33205())).shiftLeft(32).or(BigInteger.valueOf(c14540.m33206()));
    }
}
