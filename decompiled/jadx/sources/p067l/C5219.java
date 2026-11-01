package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N4OR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5219 extends AbstractC11925 {
    @Override // p067l.AbstractC11925
    /* JADX INFO: renamed from: ֫ */
    public final void mo3721(C12556 c12556, C13936 c13936) {
        ArrayList arrayList = this.f33192;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            EnumC16617 enumC16617 = this.f33191;
            if (i < size) {
                c12556.m28939(enumC16617.f48854);
                AbstractC7230 abstractC7230M23209 = C9912.m23209(this.f33190, enumC16617);
                arrayList.set(i, abstractC7230M23209);
                abstractC7230M23209.m16565(c12556, i, c13936);
                i++;
            } else {
                c13936.m31711(enumC16617, arrayList);
                return;
            }
        }
    }
}
