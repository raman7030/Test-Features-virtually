package p067l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֨ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I13O */
/* JADX INFO: loaded from: classes2.dex */
public final class C3532 implements InterfaceC16942 {

    /* JADX INFO: renamed from: ֫ */
    public final CRC32 f7160 = new CRC32();

    public final String toString() {
        return "CRC32";
    }

    @Override // p067l.InterfaceC16942
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo6306() {
        CRC32 crc32 = this.f7160;
        int value = (int) crc32.getValue();
        crc32.reset();
        return new byte[]{(byte) ((value >>> 24) & 255), (byte) ((value >>> 16) & 255), (byte) ((value >>> 8) & 255), (byte) (value & 255)};
    }

    @Override // p067l.InterfaceC16942
    /* JADX INFO: renamed from: ֫ */
    public final void mo6305(C20297 c20297) {
        this.f7160.update(c20297.m45839(), 0, c20297.m45840());
    }
}
