package p067l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17750 implements InterfaceC10375 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11649 f53013;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f53014 = new byte[65536];

    /* JADX INFO: renamed from: ܳ */
    public final byte[] f53015 = new byte[4096];

    /* JADX INFO: renamed from: ܽ */
    public int f53016;

    /* JADX INFO: renamed from: ܿ */
    public long f53017;

    /* JADX INFO: renamed from: ᩳ */
    public int f53018;

    /* JADX INFO: renamed from: ᩻ */
    public final long f53019;

    static {
        C18373.m41851("media3.extractor");
    }

    public C17750(InterfaceC11649 interfaceC11649, long j, long j2) {
        this.f53013 = interfaceC11649;
        this.f53017 = j;
        this.f53019 = j2;
    }

    @Override // p067l.InterfaceC10375
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        mo24033(false, i, i2, bArr);
    }

    @Override // p067l.InterfaceC10375
    /* JADX INFO: renamed from: ܽ */
    public final void mo24040(int i) {
        mo24032(i, false);
    }

    @Override // p067l.InterfaceC10375
    /* JADX INFO: renamed from: ۧ */
    public final int mo24035(int i, int i2, byte[] bArr) throws EOFException, InterruptedIOException {
        int iMin;
        m40336(i2);
        int i3 = this.f53016;
        int i4 = this.f53018;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = m40334(true, i4, this.f53014, i2, 0);
            if (iMin == -1) {
                return -1;
            }
            this.f53016 += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.f53014, this.f53018, bArr, i, iMin);
        this.f53018 += iMin;
        return iMin;
    }

    @Override // p067l.InterfaceC10375
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo24038(boolean z, int i, int i2, byte[] bArr) {
        if (!mo24037(i2, z)) {
            return false;
        }
        System.arraycopy(this.f53014, this.f53018 - i2, bArr, i, i2);
        return true;
    }

    @Override // p067l.InterfaceC10375
    /* JADX INFO: renamed from: ֫ */
    public final void mo24031(int i, int i2, byte[] bArr) {
        mo24038(false, i, i2, bArr);
    }

    @Override // p067l.InterfaceC10375
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo24037(int i, boolean z) throws EOFException, InterruptedIOException {
        m40336(i);
        int iM40334 = this.f53016 - this.f53018;
        while (iM40334 < i) {
            iM40334 = m40334(z, this.f53018, this.f53014, i, iM40334);
            if (iM40334 == -1) {
                return false;
            }
            this.f53016 = this.f53018 + iM40334;
        }
        this.f53018 += i;
        return true;
    }

    @Override // p067l.InterfaceC10375
    /* JADX INFO: renamed from: ֫ */
    public final void mo24030(int i) throws EOFException, InterruptedIOException {
        mo24037(i, false);
    }

    @Override // p067l.InterfaceC10375
    /* JADX INFO: renamed from: ۧ */
    public final void mo24036() {
        this.f53018 = 0;
    }

    @Override // p067l.InterfaceC10375
    /* JADX INFO: renamed from: ܽ */
    public final long mo24039() {
        return this.f53017 + ((long) this.f53018);
    }

    @Override // p067l.InterfaceC10375
    public final long getPosition() {
        return this.f53017;
    }

    @Override // p067l.InterfaceC10375
    public final long getLength() {
        return this.f53019;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m40336(int i) {
        int i2 = this.f53018 + i;
        byte[] bArr = this.f53014;
        if (i2 > bArr.length) {
            this.f53014 = Arrays.copyOf(this.f53014, C5792.m12976(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // p067l.InterfaceC10375
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo24032(int i, boolean z) {
        int iMin = Math.min(this.f53016, i);
        m40335(iMin);
        int iM40334 = iMin;
        while (iM40334 < i && iM40334 != -1) {
            byte[] bArr = this.f53015;
            iM40334 = m40334(z, -iM40334, bArr, Math.min(i, bArr.length + iM40334), iM40334);
        }
        if (iM40334 != -1) {
            this.f53017 += (long) iM40334;
        }
        return iM40334 != -1;
    }

    @Override // p067l.InterfaceC10375
    /* JADX INFO: renamed from: ۧ */
    public final int mo24034(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f53016, i);
        m40335(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f53015;
            iMin = m40334(true, 0, bArr, Math.min(i, bArr.length), 0);
        }
        if (iMin != -1) {
            this.f53017 += (long) iMin;
        }
        return iMin;
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int i3 = this.f53016;
        int iM40334 = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f53014, 0, bArr, i, iMin);
            m40335(iMin);
            iM40334 = iMin;
        }
        if (iM40334 == 0) {
            iM40334 = m40334(true, i, bArr, i2, 0);
        }
        if (iM40334 != -1) {
            this.f53017 += (long) iM40334;
        }
        return iM40334;
    }

    @Override // p067l.InterfaceC10375
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo24033(boolean z, int i, int i2, byte[] bArr) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f53016;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f53014, 0, bArr, i, iMin);
            m40335(iMin);
        }
        int iM40334 = iMin;
        while (iM40334 < i2 && iM40334 != -1) {
            iM40334 = m40334(z, i, bArr, i2, iM40334);
        }
        if (iM40334 != -1) {
            this.f53017 += (long) iM40334;
        }
        return iM40334 != -1;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m40335(int i) {
        int i2 = this.f53016 - i;
        this.f53016 = i2;
        this.f53018 = 0;
        byte[] bArr = this.f53014;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f53014 = bArr2;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m40334(boolean z, int i, byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f53013.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }
}
