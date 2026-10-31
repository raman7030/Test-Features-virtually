package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NH */
/* JADX INFO: loaded from: classes5.dex */
public final class C16184 implements InterfaceC8424 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9765 f49847;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f49848 = new byte[65536];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f49849 = new byte[4096];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f49850;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f49851;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f49852;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f49853;

    static {
        C16840.m39615("media3.extractor");
    }

    public C16184(InterfaceC9765 interfaceC9765, long j, long j2) {
        this.f49847 = interfaceC9765;
        this.f49851 = j;
        this.f49853 = j2;
    }

    @Override // l.InterfaceC8424
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        mo22063(false, i, i2, bArr);
    }

    @Override // l.InterfaceC8424
    /* JADX INFO: renamed from: ܽ */
    public final void mo22070(int i) {
        mo22062(i, false);
    }

    @Override // l.InterfaceC8424
    /* JADX INFO: renamed from: ۧ */
    public final int mo22065(int i, int i2, byte[] bArr) throws EOFException, InterruptedIOException {
        int iMin;
        m38124(i2);
        int i3 = this.f49850;
        int i4 = this.f49852;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = m38122(true, i4, this.f49848, i2, 0);
            if (iMin == -1) {
                return -1;
            }
            this.f49850 += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.f49848, this.f49852, bArr, i, iMin);
        this.f49852 += iMin;
        return iMin;
    }

    @Override // l.InterfaceC8424
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo22068(boolean z, int i, int i2, byte[] bArr) {
        if (!mo22067(i2, z)) {
            return false;
        }
        System.arraycopy(this.f49848, this.f49852 - i2, bArr, i, i2);
        return true;
    }

    @Override // l.InterfaceC8424
    /* JADX INFO: renamed from: ֫ */
    public final void mo22061(int i, int i2, byte[] bArr) {
        mo22068(false, i, i2, bArr);
    }

    @Override // l.InterfaceC8424
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo22067(int i, boolean z) throws EOFException, InterruptedIOException {
        m38124(i);
        int iM38122 = this.f49850 - this.f49852;
        while (iM38122 < i) {
            iM38122 = m38122(z, this.f49852, this.f49848, i, iM38122);
            if (iM38122 == -1) {
                return false;
            }
            this.f49850 = this.f49852 + iM38122;
        }
        this.f49852 += i;
        return true;
    }

    @Override // l.InterfaceC8424
    /* JADX INFO: renamed from: ֫ */
    public final void mo22060(int i) throws EOFException, InterruptedIOException {
        mo22067(i, false);
    }

    @Override // l.InterfaceC8424
    /* JADX INFO: renamed from: ۧ */
    public final void mo22066() {
        this.f49852 = 0;
    }

    @Override // l.InterfaceC8424
    /* JADX INFO: renamed from: ܽ */
    public final long mo22069() {
        return this.f49851 + ((long) this.f49852);
    }

    @Override // l.InterfaceC8424
    public final long getPosition() {
        return this.f49851;
    }

    @Override // l.InterfaceC8424
    public final long getLength() {
        return this.f49853;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m38124(int i) {
        int i2 = this.f49852 + i;
        byte[] bArr = this.f49848;
        if (i2 > bArr.length) {
            this.f49848 = Arrays.copyOf(this.f49848, C3603.m11000(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // l.InterfaceC8424
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22062(int i, boolean z) {
        int iMin = Math.min(this.f49850, i);
        m38123(iMin);
        int iM38122 = iMin;
        while (iM38122 < i && iM38122 != -1) {
            byte[] bArr = this.f49849;
            iM38122 = m38122(z, -iM38122, bArr, Math.min(i, bArr.length + iM38122), iM38122);
        }
        if (iM38122 != -1) {
            this.f49851 += (long) iM38122;
        }
        return iM38122 != -1;
    }

    @Override // l.InterfaceC8424
    /* JADX INFO: renamed from: ۧ */
    public final int mo22064(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f49850, i);
        m38123(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f49849;
            iMin = m38122(true, 0, bArr, Math.min(i, bArr.length), 0);
        }
        if (iMin != -1) {
            this.f49851 += (long) iMin;
        }
        return iMin;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int i3 = this.f49850;
        int iM38122 = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f49848, 0, bArr, i, iMin);
            m38123(iMin);
            iM38122 = iMin;
        }
        if (iM38122 == 0) {
            iM38122 = m38122(true, i, bArr, i2, 0);
        }
        if (iM38122 != -1) {
            this.f49851 += (long) iM38122;
        }
        return iM38122;
    }

    @Override // l.InterfaceC8424
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22063(boolean z, int i, int i2, byte[] bArr) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f49850;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f49848, 0, bArr, i, iMin);
            m38123(iMin);
        }
        int iM38122 = iMin;
        while (iM38122 < i2 && iM38122 != -1) {
            iM38122 = m38122(z, i, bArr, i2, iM38122);
        }
        if (iM38122 != -1) {
            this.f49851 += (long) iM38122;
        }
        return iM38122 != -1;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m38123(int i) {
        int i2 = this.f49850 - i;
        this.f49850 = i2;
        this.f49852 = 0;
        byte[] bArr = this.f49848;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f49848 = bArr2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m38122(boolean z, int i, byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f49847.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }
}
