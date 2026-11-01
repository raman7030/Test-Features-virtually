package p067l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩺ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 698I */
/* JADX INFO: loaded from: classes.dex */
public class C24151 extends AbstractC6086 {

    /* JADX INFO: renamed from: ᩶ */
    public byte[] f76613;

    /* JADX INFO: renamed from: ᩹ */
    public final int f76614;

    public C24151(byte[] bArr, int i) {
        this.f76613 = bArr;
        this.f76614 = i;
    }

    @Override // p067l.AbstractC6086
    /* JADX INFO: renamed from: ܽ */
    public final long mo13860(int i) {
        byte[] bArr = this.f76613;
        int i2 = i + this.f76614;
        return ((long) ((bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16))) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | (((long) bArr[i2 + 7]) << 56);
    }

    @Override // p067l.AbstractC6086
    /* JADX INFO: renamed from: ۧ */
    public final int mo13857(int i) {
        byte[] bArr = this.f76613;
        int i2 = i + this.f76614;
        return (bArr[i2 + 3] << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    @Override // p067l.AbstractC6086
    /* JADX INFO: renamed from: ᩻ */
    public final int mo13863(int i) {
        byte[] bArr = this.f76613;
        int i2 = i + this.f76614;
        return (bArr[i2 + 1] << 8) | (bArr[i2] & 255);
    }

    @Override // p067l.AbstractC6086
    /* JADX INFO: renamed from: ֫ */
    public final byte mo13853(int i) {
        return this.f76613[this.f76614 + i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m53399(int i, int i2, Charset charset) {
        return new String(this.f76613, this.f76614 + i, i2, charset);
    }

    @Override // p067l.AbstractC6086
    public final int length() {
        return this.f76613.length - this.f76614;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m53400() {
        return this.f76613;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53401(byte[] bArr) {
        this.f76613 = bArr;
    }
}
