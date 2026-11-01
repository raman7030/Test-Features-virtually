package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N4I6 */
/* JADX INFO: loaded from: classes2.dex */
public class C2535 extends AbstractC11925 {
    @Override // p067l.AbstractC11925
    /* JADX INFO: renamed from: ֫ */
    public final void mo3721(C12556 c12556, C13936 c13936) {
        ArrayList arrayList = this.f33192;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC7230 abstractC7230M23209 = C9912.m23209(this.f33190, this.f33191);
            arrayList.set(i, abstractC7230M23209);
            abstractC7230M23209.m16565(c12556, i, c13936);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7230 m3722(int i) {
        try {
            return (AbstractC7230) this.f33192.get(i);
        } catch (Exception e) {
            throw C17919.m40738("Error occured while retrieving the " + this.f33191.f48852 + " item at index " + i, e);
        }
    }
}
