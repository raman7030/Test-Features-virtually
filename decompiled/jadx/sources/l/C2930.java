package l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۗ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes3.dex */
public final class C2930 extends AbstractC16876 implements InterfaceC2123 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12807 f9314;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2930(C12807 c12807) {
        super(0);
        this.f9314 = c12807;
    }

    @Override // l.InterfaceC2123
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4049() {
        C12807 c12807 = this.f9314;
        return BigInteger.valueOf(c12807.m31118()).shiftLeft(32).or(BigInteger.valueOf(c12807.m31120())).shiftLeft(32).or(BigInteger.valueOf(c12807.m31121()));
    }
}
