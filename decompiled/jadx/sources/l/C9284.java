package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9284 extends AbstractC7514 {
    public C12559 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۖܰᩴ, l.۫ܿ᩵] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ۖܰᩴ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ۖܰᩴ] */
    @Override // l.AbstractC6730, l.InterfaceC0585
    public final void c(long j) {
        ?? abstractC2576;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            abstractC2576 = new AbstractC2576();
        } else {
            abstractC2576 = new C12559((int) j);
        }
        this.c = abstractC2576;
    }

    @Override // l.AbstractC6730, l.InterfaceC0585
    public final void end() {
        double[] dArr = (double[]) this.c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC0585 interfaceC0585 = this.a;
        interfaceC0585.c(length);
        int i = 0;
        if (!this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                interfaceC0585.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d = dArr[i];
                if (interfaceC0585.f()) {
                    break;
                }
                interfaceC0585.accept(d);
                i++;
            }
        }
        interfaceC0585.end();
    }

    @Override // l.InterfaceC5483, l.InterfaceC0585
    public final void accept(double d) {
        this.c.accept(d);
    }
}
