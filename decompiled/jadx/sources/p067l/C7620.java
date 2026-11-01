package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7620 extends AbstractC22747 {

    /* JADX INFO: renamed from: c */
    public long[] f19936c;

    /* JADX INFO: renamed from: d */
    public int f19937d;

    @Override // p067l.AbstractC8094, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f19936c = new long[(int) j];
    }

    @Override // p067l.AbstractC8094, p067l.InterfaceC2925
    public final void end() {
        int i = 0;
        Arrays.sort(this.f19936c, 0, this.f19937d);
        long j = this.f19937d;
        InterfaceC2925 interfaceC2925 = this.f21348a;
        interfaceC2925.mo4231c(j);
        if (!this.f71725b) {
            while (i < this.f19937d) {
                interfaceC2925.accept(this.f19936c[i]);
                i++;
            }
        } else {
            while (i < this.f19937d && !interfaceC2925.mo4233f()) {
                interfaceC2925.accept(this.f19936c[i]);
                i++;
            }
        }
        interfaceC2925.end();
        this.f19936c = null;
    }

    @Override // p067l.InterfaceC16336, p067l.InterfaceC2925
    public final void accept(long j) {
        long[] jArr = this.f19936c;
        int i = this.f19937d;
        this.f19937d = i + 1;
        jArr[i] = j;
    }
}
