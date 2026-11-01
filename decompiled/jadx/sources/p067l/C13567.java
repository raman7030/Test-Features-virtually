package p067l;

/* JADX INFO: renamed from: l.ۨܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81T3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13567 {

    /* JADX INFO: renamed from: ۧ */
    public int f38162;

    /* JADX INFO: renamed from: ᩳ */
    public int f38164;

    /* JADX INFO: renamed from: ܽ */
    public boolean f38163 = true;

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f38161 = new byte[40960];

    /* JADX INFO: renamed from: ֫ */
    public final synchronized int m30886(byte[] bArr, boolean z) {
        int i;
        while (true) {
            i = this.f38164;
            if (i != 0 || !this.f38163) {
                break;
            }
            if (!z) {
                return 0;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
        if (!this.f38163) {
            return -1;
        }
        int length = this.f38161.length;
        boolean z2 = length == i;
        int length2 = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (length2 > 0) {
            int i4 = this.f38164;
            if (i4 <= 0) {
                break;
            }
            int iMin = Math.min(length2, Math.min(length - this.f38162, i4));
            System.arraycopy(this.f38161, this.f38162, bArr, i3, iMin);
            int i5 = this.f38162 + iMin;
            this.f38162 = i5;
            if (i5 >= length) {
                this.f38162 = 0;
            }
            this.f38164 -= iMin;
            length2 -= iMin;
            i3 += iMin;
            i2 += iMin;
        }
        if (z2) {
            notify();
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m30887() {
        this.f38163 = false;
        notify();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m30888(int i, byte[] bArr) {
        int i2;
        int i3;
        if (i > bArr.length) {
            throw new IllegalArgumentException("length + offset > buffer.length");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("length <= 0");
        }
        int length = this.f38161.length;
        synchronized (this) {
            int i4 = 0;
            while (true) {
                boolean z = true;
                if (i <= 0) {
                    return true;
                }
                while (true) {
                    try {
                        i2 = this.f38164;
                        if (length != i2 || !this.f38163) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!this.f38163) {
                    return false;
                }
                if (i2 != 0) {
                    z = false;
                }
                int iMin = Math.min(i, length - i2);
                i -= iMin;
                while (iMin > 0) {
                    int i5 = this.f38162;
                    int i6 = this.f38164 + i5;
                    if (i6 >= length) {
                        i6 -= length;
                        i3 = i5 - i6;
                    } else {
                        i3 = length - i6;
                    }
                    int iMin2 = Math.min(i3, iMin);
                    System.arraycopy(bArr, i4, this.f38161, i6, iMin2);
                    i4 += iMin2;
                    iMin -= iMin2;
                    this.f38164 += iMin2;
                }
                if (z) {
                    notify();
                }
            }
        }
    }
}
