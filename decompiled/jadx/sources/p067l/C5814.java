package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5814 {

    /* JADX INFO: renamed from: ֫ */
    public int f14280;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f14281;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f14282;

    public C5814(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Missing Seed for KDF");
        }
        this.f14282 = Arrays.copyOf(bArr, bArr.length);
        if (bArr2 == null) {
            this.f14281 = new byte[0];
        } else {
            this.f14281 = Arrays.copyOf(bArr2, bArr2.length);
        }
        this.f14280 = 32;
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m13084() {
        return this.f14282;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m13083() {
        return this.f14281;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m13082() {
        return this.f14280;
    }
}
