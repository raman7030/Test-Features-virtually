package p067l;

import org.bouncycastle.crypto.generators.KDFCounterBytesGenerator;
import org.bouncycastle.crypto.params.KDFCounterParameters;

/* JADX INFO: renamed from: l.ۧ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12520 implements InterfaceC2617 {

    /* JADX INFO: renamed from: ֫ */
    public final KDFCounterBytesGenerator f35125;

    @Override // p067l.InterfaceC2617
    /* JADX INFO: renamed from: ֫ */
    public final void mo3926(C5814 c5814) {
        this.f35125.init(new KDFCounterParameters(c5814.m13084(), c5814.m13083(), c5814.m13082()));
    }

    public AbstractC12520(KDFCounterBytesGenerator kDFCounterBytesGenerator) {
        this.f35125 = kDFCounterBytesGenerator;
    }

    @Override // p067l.InterfaceC2617
    /* JADX INFO: renamed from: ֫ */
    public final int mo3925(int i, byte[] bArr) {
        return this.f35125.generateBytes(bArr, 0, i);
    }
}
