package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۡܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1VQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9030 implements InterfaceC0562 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f27397;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f27398;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f27399;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f27400;

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2313(long j, C23411 c23411) {
        C4091.m12293(this, c23411, j);
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2315(MessageDigest messageDigest, long j) {
        C4091.m12292(this, messageDigest, j);
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC0562 mo2317() {
        return C4091.m12290(this);
    }

    public C9030(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException();
        }
        this.f27397 = bArr;
        this.f27400 = i;
        this.f27399 = i2;
        this.f27398 = 0;
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ۧ */
    public final long mo2316() {
        return size() - mo2312();
    }

    @Override // l.InterfaceC0562
    public final long size() {
        return this.f27399;
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ֫ */
    public final long mo2312() {
        return this.f27398;
    }

    @Override // l.InterfaceC0562
    public final void reset() {
        this.f27398 = 0;
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ֫ */
    public final void mo2314(OutputStream outputStream, long j) throws IOException {
        if (j > mo2316()) {
            throw new EOFException();
        }
        outputStream.write(this.f27397, this.f27400 + this.f27398, (int) j);
        this.f27398 = (int) (((long) this.f27398) + j);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m23289() {
        return this.f27397;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m23288() {
        return this.f27400;
    }
}
