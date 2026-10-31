package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23869 extends AbstractC8742 {
    public int[] c;
    public int d;

    @Override // l.AbstractC1085, l.InterfaceC0585
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new int[(int) j];
    }

    @Override // l.AbstractC1085, l.InterfaceC0585
    public final void end() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        InterfaceC0585 interfaceC0585 = this.a;
        interfaceC0585.c(j);
        if (!this.b) {
            while (i < this.d) {
                interfaceC0585.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d && !interfaceC0585.f()) {
                interfaceC0585.accept(this.c[i]);
                i++;
            }
        }
        interfaceC0585.end();
        this.c = null;
    }

    @Override // l.InterfaceC10422, l.InterfaceC0585
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }
}
