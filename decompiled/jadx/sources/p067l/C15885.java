package p067l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܳ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R9L1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15885 {

    /* JADX INFO: renamed from: ֫ */
    public int f45986;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f45987;

    /* JADX INFO: renamed from: ܽ */
    public int f45988;

    /* JADX INFO: renamed from: ֫ */
    public final void m36014() {
        CRC32 crc32 = new CRC32();
        crc32.update(this.f45988 & 255);
        crc32.update((this.f45988 >>> 8) & 255);
        crc32.update((this.f45988 >>> 16) & 255);
        crc32.update((this.f45988 >>> 24) & 255);
        crc32.update(this.f45987);
        this.f45986 = (int) crc32.getValue();
    }

    public final String toString() {
        byte[] bArr = new byte[4];
        C17548.m39930(0, this.f45988, bArr);
        return new String(bArr) + " dataLen=" + this.f45987.length;
    }
}
