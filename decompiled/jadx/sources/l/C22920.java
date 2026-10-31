package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩺ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 698I */
/* JADX INFO: loaded from: classes.dex */
public class C22920 extends AbstractC3912 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f73883;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f73884;

    public C22920(byte[] bArr, int i) {
        this.f73883 = bArr;
        this.f73884 = i;
    }

    @Override // l.AbstractC3912
    /* JADX INFO: renamed from: ܽ */
    public final long mo11940(int i) {
        byte[] bArr = this.f73883;
        int i2 = i + this.f73884;
        return ((long) ((bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16))) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | (((long) bArr[i2 + 7]) << 56);
    }

    @Override // l.AbstractC3912
    /* JADX INFO: renamed from: ۧ */
    public final int mo11937(int i) {
        byte[] bArr = this.f73883;
        int i2 = i + this.f73884;
        return (bArr[i2 + 3] << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    @Override // l.AbstractC3912
    /* JADX INFO: renamed from: ᩻ */
    public final int mo11943(int i) {
        byte[] bArr = this.f73883;
        int i2 = i + this.f73884;
        return (bArr[i2 + 1] << 8) | (bArr[i2] & 255);
    }

    @Override // l.AbstractC3912
    /* JADX INFO: renamed from: ֫ */
    public final byte mo11933(int i) {
        return this.f73883[this.f73884 + i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m51008(int i, int i2, Charset charset) {
        return new String(this.f73883, this.f73884 + i, i2, charset);
    }

    @Override // l.AbstractC3912
    public final int length() {
        return this.f73883.length - this.f73884;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m51009() {
        return this.f73883;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51010(byte[] bArr) {
        this.f73883 = bArr;
    }
}
