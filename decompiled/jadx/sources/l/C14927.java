package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14927 extends AbstractC8742 {
    public C19532 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۖܰᩴ, l.᩵ܳ᩵] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ۖܰᩴ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ۖܰᩴ] */
    @Override // l.AbstractC1085, l.InterfaceC0585
    public final void c(long j) {
        ?? abstractC2576;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            abstractC2576 = new AbstractC2576();
        } else {
            abstractC2576 = new C19532((int) j);
        }
        this.c = abstractC2576;
    }

    @Override // l.AbstractC1085, l.InterfaceC0585
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC0585 interfaceC0585 = this.a;
        interfaceC0585.c(length);
        int i = 0;
        if (!this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                interfaceC0585.accept(iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i2 = iArr[i];
                if (interfaceC0585.f()) {
                    break;
                }
                interfaceC0585.accept(i2);
                i++;
            }
        }
        interfaceC0585.end();
    }

    @Override // l.InterfaceC10422, l.InterfaceC0585
    public final void accept(int i) {
        this.c.accept(i);
    }
}
