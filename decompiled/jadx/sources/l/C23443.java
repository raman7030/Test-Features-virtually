package l;

/* JADX INFO: renamed from: l.᩻ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7Z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23443 implements InterfaceC20622 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f75258 = 1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f75259 = 0;

    @Override // l.InterfaceC20622
    /* JADX INFO: renamed from: ֫ */
    public final void mo18009(long j) {
        this.f75258 = j & 65535;
        this.f75259 = (j >> 16) & 65535;
    }

    @Override // l.InterfaceC20622
    public final void reset() {
        this.f75258 = 1L;
        this.f75259 = 0L;
    }

    @Override // l.InterfaceC20622
    public final long getValue() {
        return (this.f75259 << 16) | this.f75258;
    }

    @Override // l.InterfaceC20622
    public final void update(byte[] bArr, int i, int i2) {
        if (i2 == 1) {
            long j = this.f75258 + ((long) (bArr[i] & 255));
            long j2 = this.f75259 + j;
            this.f75258 = j % 65521;
            this.f75259 = j2 % 65521;
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
                    long j3 = this.f75258 + ((long) (bArr[i] & 255));
                    this.f75258 = j3;
                    this.f75259 += j3;
                    i++;
                    i6 = i7;
                }
            }
            this.f75258 %= 65521;
            this.f75259 %= 65521;
            i3 = i5;
        }
        while (true) {
            int i8 = i4 - 1;
            if (i4 > 0) {
                long j4 = this.f75258 + ((long) (bArr[i] & 255));
                this.f75258 = j4;
                this.f75259 += j4;
                i++;
                i4 = i8;
            } else {
                this.f75258 %= 65521;
                this.f75259 %= 65521;
                return;
            }
        }
    }
}
