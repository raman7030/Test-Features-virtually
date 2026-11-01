package p067l;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes4.dex */
public final class C12223 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public long f34159;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21280 f34160;

    /* JADX INFO: renamed from: ܳ */
    public Uri f34161;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC9501 f34162;

    /* JADX INFO: renamed from: ܿ */
    public final C13823 f34163;

    /* JADX INFO: renamed from: ᩳ */
    public long f34164;

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        return Collections.EMPTY_MAP;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
    }

    public C12223(C13823 c13823, InterfaceC21280 interfaceC21280) {
        this.f34163 = c13823;
        this.f34160 = interfaceC21280;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws IOException {
        close();
        InterfaceC21280 interfaceC21280 = this.f34160;
        interfaceC21280.mo23161();
        InterfaceC9501 interfaceC9501M31495 = this.f34163.m31495();
        if (interfaceC9501M31495 == null) {
            throw new IOException("Missing MPEG-TS metadata read handle");
        }
        this.f34162 = interfaceC9501M31495;
        long length = interfaceC9501M31495.length();
        long j = c5318.f12521;
        if (j < 0 || j > length) {
            throw new EOFException("MPEG-TS preview position exceeds source length");
        }
        long jMin = length - j;
        long j2 = c5318.f12516;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2);
        }
        this.f34159 = jMin;
        this.f34164 = c5318.f12521;
        this.f34161 = c5318.f12514;
        interfaceC21280.mo23161();
        return this.f34159;
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f34159 == 0) {
            return -1;
        }
        InterfaceC9501 interfaceC9501 = this.f34162;
        if (interfaceC9501 == null) {
            throw new IOException("MPEG-TS data source is not open");
        }
        InterfaceC21280 interfaceC21280 = this.f34160;
        interfaceC21280.mo23161();
        int iMin = (int) Math.min(this.f34159, i2);
        interfaceC9501.mo10697(this.f34164, bArr, i, iMin);
        interfaceC21280.mo23161();
        long j = iMin;
        this.f34164 += j;
        this.f34159 -= j;
        return iMin;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f34161;
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        C2700.m4192(this.f34162);
        this.f34162 = null;
        this.f34161 = null;
        this.f34164 = 0L;
        this.f34159 = 0L;
    }
}
