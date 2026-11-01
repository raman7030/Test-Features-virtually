package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3556 extends AbstractC15369 {

    /* JADX INFO: renamed from: d */
    public ArrayList f7214d;

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f7214d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    public final void end() {
        C8150.sort(this.f7214d, this.f43910b);
        long size = this.f7214d.size();
        InterfaceC2925 interfaceC2925 = this.f79851a;
        interfaceC2925.mo4231c(size);
        if (!this.f43911c) {
            ArrayList arrayList = this.f7214d;
            C12826.requireNonNull(interfaceC2925);
            C7480.m17260a(arrayList, new C18546(13, interfaceC2925));
        } else {
            ArrayList arrayList2 = this.f7214d;
            int size2 = arrayList2.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList2.get(i);
                i++;
                if (interfaceC2925.mo4233f()) {
                    break;
                } else {
                    interfaceC2925.m45213n(obj);
                }
            }
        }
        interfaceC2925.end();
        this.f7214d = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        this.f7214d.add(obj);
    }
}
