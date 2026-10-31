package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3626 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f11475;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f11476;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f11477;

    public C3626(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Missing Seed for KDF");
        }
        this.f11477 = Arrays.copyOf(bArr, bArr.length);
        if (bArr2 == null) {
            this.f11476 = new byte[0];
        } else {
            this.f11476 = Arrays.copyOf(bArr2, bArr2.length);
        }
        this.f11475 = 32;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m11108() {
        return this.f11477;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m11107() {
        return this.f11476;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m11106() {
        return this.f11475;
    }
}
