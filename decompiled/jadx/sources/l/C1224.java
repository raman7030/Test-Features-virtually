package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֨ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I13O */
/* JADX INFO: loaded from: classes2.dex */
public final class C1224 implements InterfaceC15334 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CRC32 f4390 = new CRC32();

    public final String toString() {
        return "CRC32";
    }

    @Override // l.InterfaceC15334
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] mo4062() {
        CRC32 crc32 = this.f4390;
        int value = (int) crc32.getValue();
        crc32.reset();
        return new byte[]{(byte) ((value >>> 24) & 255), (byte) ((value >>> 16) & 255), (byte) ((value >>> 8) & 255), (byte) (value & 255)};
    }

    @Override // l.InterfaceC15334
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo4061(C18864 c18864) {
        this.f4390.update(c18864.m43573(), 0, c18864.m43574());
    }
}
