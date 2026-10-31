package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩵ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: N1T0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19291 extends AbstractC5179 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CRC32 f60697 = new CRC32();

    public C19291() {
        this.f16209 = 4;
        this.f16208 = "CRC32";
    }

    @Override // l.AbstractC5179
    /* JADX INFO: renamed from: ֫ */
    public final void mo1497(byte[] bArr, int i, int i2) {
        this.f60697.update(bArr, i, i2);
    }

    @Override // l.AbstractC5179
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo1498() {
        byte[] bArr = new byte[4];
        CRC32 crc32 = this.f60697;
        C18321.m42701(0, (int) crc32.getValue(), bArr);
        crc32.reset();
        return bArr;
    }
}
