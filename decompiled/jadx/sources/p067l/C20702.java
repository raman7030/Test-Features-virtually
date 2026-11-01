package p067l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩵ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: N1T0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20702 extends AbstractC7290 {

    /* JADX INFO: renamed from: ܽ */
    public final CRC32 f63927 = new CRC32();

    public C20702() {
        this.f19050 = 4;
        this.f19049 = "CRC32";
    }

    @Override // p067l.AbstractC7290
    /* JADX INFO: renamed from: ֫ */
    public final void mo3895(byte[] bArr, int i, int i2) {
        this.f63927.update(bArr, i, i2);
    }

    @Override // p067l.AbstractC7290
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo3896() {
        byte[] bArr = new byte[4];
        CRC32 crc32 = this.f63927;
        C19781.m44963(0, (int) crc32.getValue(), bArr);
        crc32.reset();
        return bArr;
    }
}
