package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11192 extends AbstractC9510 {

    /* JADX INFO: renamed from: c */
    public C14305 f31073c;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۖܰᩴ, l.۫ܿ᩵] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ۖܰᩴ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ۖܰᩴ] */
    @Override // p067l.AbstractC8765, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        ?? abstractC4817;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            abstractC4817 = new AbstractC4817();
        } else {
            abstractC4817 = new C14305((int) j);
        }
        this.f31073c = abstractC4817;
    }

    @Override // p067l.AbstractC8765, p067l.InterfaceC2925
    public final void end() {
        double[] dArr = (double[]) this.f31073c.mo4230b();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC2925 interfaceC2925 = this.f23785a;
        interfaceC2925.mo4231c(length);
        int i = 0;
        if (!this.f26036b) {
            int length2 = dArr.length;
            while (i < length2) {
                interfaceC2925.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d = dArr[i];
                if (interfaceC2925.mo4233f()) {
                    break;
                }
                interfaceC2925.accept(d);
                i++;
            }
        }
        interfaceC2925.end();
    }

    @Override // p067l.InterfaceC7580, p067l.InterfaceC2925
    public final void accept(double d) {
        this.f31073c.accept(d);
    }
}
