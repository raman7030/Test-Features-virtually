package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֫ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 439X */
/* JADX INFO: loaded from: classes2.dex */
public final class C2013 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11186 f6718;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f6719 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f6720 = 0;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C2013(C11186 c11186) {
        this.f6718 = c11186;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f6719;
        C11186 c11186 = this.f6718;
        if (i >= c11186.f33577) {
            return -1;
        }
        int iM27747 = c11186.m27747(this.f6719);
        this.f6719++;
        return iM27747;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        C11186 c11186 = this.f6718;
        int i3 = c11186.f33577 - this.f6719;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(c11186.f33576, this.f6719, bArr, i, i2);
        this.f6719 += i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f6718.f33577 - this.f6719;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f6720 = this.f6719;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f6719 = this.f6720;
    }
}
