package p067l;

/* JADX INFO: renamed from: l.᩻ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7Z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24648 implements InterfaceC21967 {

    /* JADX INFO: renamed from: ֫ */
    public long f78006 = 1;

    /* JADX INFO: renamed from: ۧ */
    public long f78007 = 0;

    @Override // p067l.InterfaceC21967
    /* JADX INFO: renamed from: ֫ */
    public final void mo19958(long j) {
        this.f78006 = j & 65535;
        this.f78007 = (j >> 16) & 65535;
    }

    @Override // p067l.InterfaceC21967
    public final void reset() {
        this.f78006 = 1L;
        this.f78007 = 0L;
    }

    @Override // p067l.InterfaceC21967
    public final long getValue() {
        return (this.f78007 << 16) | this.f78006;
    }

    @Override // p067l.InterfaceC21967
    public final void update(byte[] bArr, int i, int i2) {
        if (i2 == 1) {
            long j = this.f78006 + ((long) (bArr[i] & 255));
            long j2 = this.f78007 + j;
            this.f78006 = j % 65521;
            this.f78007 = j2 % 65521;
            return;
        }
        int i3 = i2 / 5552;
        int i4 = i2 % 5552;
        while (true) {
            int i5 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i6 = 5552;
            while (true) {
                int i7 = i6 - 1;
                if (i6 > 0) {
                    long j3 = this.f78006 + ((long) (bArr[i] & 255));
                    this.f78006 = j3;
                    this.f78007 += j3;
                    i++;
                    i6 = i7;
                }
            }
            this.f78006 %= 65521;
            this.f78007 %= 65521;
            i3 = i5;
        }
        while (true) {
            int i8 = i4 - 1;
            if (i4 > 0) {
                long j4 = this.f78006 + ((long) (bArr[i] & 255));
                this.f78006 = j4;
                this.f78007 += j4;
                i++;
                i4 = i8;
            } else {
                this.f78006 %= 65521;
                this.f78007 %= 65521;
                return;
            }
        }
    }
}
