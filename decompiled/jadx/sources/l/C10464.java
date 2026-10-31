package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10464 extends AbstractC13679 {
    public Object[] d;
    public int e;

    @Override // l.AbstractC23827, l.InterfaceC0585
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        InterfaceC0585 interfaceC0585 = this.a;
        interfaceC0585.c(j);
        if (!this.c) {
            while (i < this.e) {
                interfaceC0585.accept(this.d[i]);
                i++;
            }
        } else {
            while (i < this.e && !interfaceC0585.f()) {
                interfaceC0585.accept(this.d[i]);
                i++;
            }
        }
        interfaceC0585.end();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }
}
