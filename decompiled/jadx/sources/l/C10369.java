package l;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes4.dex */
public final class C10369 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f31197;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19899 f31198;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Uri f31199;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC7505 f31200;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12053 f31201;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f31202;

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        return Collections.EMPTY_MAP;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
    }

    public C10369(C12053 c12053, InterfaceC19899 interfaceC19899) {
        this.f31201 = c12053;
        this.f31198 = interfaceC19899;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws IOException {
        close();
        InterfaceC19899 interfaceC19899 = this.f31198;
        interfaceC19899.mo21195();
        InterfaceC7505 interfaceC7505M29433 = this.f31201.m29433();
        if (interfaceC7505M29433 == null) {
            throw new IOException("Missing MPEG-TS metadata read handle");
        }
        this.f31200 = interfaceC7505M29433;
        long length = interfaceC7505M29433.length();
        long j = c3104.f9718;
        if (j < 0 || j > length) {
            throw new EOFException("MPEG-TS preview position exceeds source length");
        }
        long jMin = length - j;
        long j2 = c3104.f9713;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2);
        }
        this.f31197 = jMin;
        this.f31202 = c3104.f9718;
        this.f31199 = c3104.f9711;
        interfaceC19899.mo21195();
        return this.f31197;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f31197 == 0) {
            return -1;
        }
        InterfaceC7505 interfaceC7505 = this.f31200;
        if (interfaceC7505 == null) {
            throw new IOException("MPEG-TS data source is not open");
        }
        InterfaceC19899 interfaceC19899 = this.f31198;
        interfaceC19899.mo21195();
        int iMin = (int) Math.min(this.f31197, i2);
        interfaceC7505.mo8637(this.f31202, bArr, i, iMin);
        interfaceC19899.mo21195();
        long j = iMin;
        this.f31202 += j;
        this.f31197 -= j;
        return iMin;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        return this.f31199;
    }

    @Override // l.InterfaceC21449
    public final void close() {
        C0349.m1793(this.f31200);
        this.f31200 = null;
        this.f31199 = null;
        this.f31202 = 0L;
        this.f31197 = 0L;
    }
}
