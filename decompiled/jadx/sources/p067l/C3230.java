package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3230 extends C18653 {

    /* JADX INFO: renamed from: ۢ */
    public byte[] f6258;

    /* JADX INFO: renamed from: ᩷ */
    public short f6259;

    @Override // p067l.C18653
    /* JADX INFO: renamed from: ֫ */
    public final void mo5579(C4572 c4572) throws IOException {
        if (this.f6258 == null) {
            throw new IllegalStateException("Invalid stub: " + this.f6258);
        }
        m42407((short) ((m42411().contains(EnumC22007.OBJECT_UUID) ? 40 : 24) + this.f6258.length));
        super.mo5579(c4572);
        byte[] bArr = this.f6258;
        c4572.m9651(bArr.length);
        c4572.m9652(0);
        c4572.m9652(this.f6259);
        c4572.m9650(bArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5581(short s) {
        this.f6259 = s;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5580(byte[] bArr) {
        this.f6258 = bArr;
    }
}
