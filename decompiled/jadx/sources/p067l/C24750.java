package p067l;

/* JADX INFO: renamed from: l.᩻۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24750 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f78352 = new byte[65536];

    /* JADX INFO: renamed from: ۧ */
    public int f78353;

    /* JADX INFO: renamed from: ܽ */
    public boolean f78354;

    /* JADX INFO: renamed from: ֫ */
    public final void m54411(byte b) {
        int i = this.f78353;
        this.f78352[i] = b;
        int i2 = (i + 1) & 65535;
        if (!this.f78354 && i2 < i) {
            this.f78354 = true;
        }
        this.f78353 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54412(int i, int i2, byte[] bArr) {
        byte[] bArr2 = this.f78352;
        if (i > bArr2.length) {
            throw new IllegalStateException(C20778.m46922(i, "Illegal distance parameter: "));
        }
        int i3 = this.f78353;
        int i4 = (i3 - i) & 65535;
        if (!this.f78354 && i4 >= i3) {
            throw new IllegalStateException(C20778.m46922(i, "Attempt to read beyond memory: dist="));
        }
        int i5 = 0;
        while (i5 < i2) {
            byte b = bArr2[i4];
            m54411(b);
            bArr[i5] = b;
            i5++;
            int i6 = (i4 + 1) & 65535;
            if (!this.f78354 && i6 < i4) {
                this.f78354 = true;
            }
            i4 = i6;
        }
    }
}
