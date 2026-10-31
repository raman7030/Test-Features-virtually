package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1249 extends AbstractC13679 {
    public ArrayList d;

    @Override // l.AbstractC23827, l.InterfaceC0585
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // l.AbstractC23827, l.InterfaceC0585
    public final void end() {
        C6083.sort(this.d, this.b);
        long size = this.d.size();
        InterfaceC0585 interfaceC0585 = this.a;
        interfaceC0585.c(size);
        if (!this.c) {
            ArrayList arrayList = this.d;
            C11003.requireNonNull(interfaceC0585);
            C5378.a(arrayList, new C17022(13, interfaceC0585));
        } else {
            ArrayList arrayList2 = this.d;
            int size2 = arrayList2.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList2.get(i);
                i++;
                if (interfaceC0585.f()) {
                    break;
                } else {
                    interfaceC0585.n(obj);
                }
            }
        }
        interfaceC0585.end();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.d.add(obj);
    }
}
