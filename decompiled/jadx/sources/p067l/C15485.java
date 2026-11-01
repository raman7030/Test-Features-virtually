package p067l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܰۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes4.dex */
public final class C15485 extends AbstractC22509 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ CRC32 f44206;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15485(InterfaceC18588 interfaceC18588, CRC32 crc32) {
        super(interfaceC18588);
        this.f44206 = crc32;
    }

    @Override // p067l.AbstractC22509
    /* JADX INFO: renamed from: ֫ */
    public final void mo35230(byte[] bArr, int i, int i2) {
        this.f44206.update(bArr, i, i2);
    }
}
