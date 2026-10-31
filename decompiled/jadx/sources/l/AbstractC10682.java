package l;

import org.bouncycastle.crypto.generators.KDFCounterBytesGenerator;
import org.bouncycastle.crypto.params.KDFCounterParameters;

/* JADX INFO: renamed from: l.ۧ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10682 implements InterfaceC0262 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final KDFCounterBytesGenerator f32154;

    @Override // l.InterfaceC0262
    /* JADX INFO: renamed from: ֫ */
    public final void mo1528(C3626 c3626) {
        this.f32154.init(new KDFCounterParameters(c3626.m11108(), c3626.m11107(), c3626.m11106()));
    }

    public AbstractC10682(KDFCounterBytesGenerator kDFCounterBytesGenerator) {
        this.f32154 = kDFCounterBytesGenerator;
    }

    @Override // l.InterfaceC0262
    /* JADX INFO: renamed from: ֫ */
    public final int mo1527(int i, byte[] bArr) {
        return this.f32154.generateBytes(bArr, 0, i);
    }
}
