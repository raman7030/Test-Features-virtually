package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes2.dex */
public final class C2596 implements InterfaceC20703 {

    /* JADX INFO: renamed from: ֫ */
    public final int f4294;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC7291 f4295;

    public C2596(AbstractC7291 abstractC7291, int i) {
        this.f4295 = abstractC7291;
        this.f4294 = i;
    }

    @Override // p067l.InterfaceC20703
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3897(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC7291 abstractC7291 = this.f4295;
        ComponentCallbacksC11117 componentCallbacksC11117 = abstractC7291.f19069;
        int i = this.f4294;
        if (componentCallbacksC11117 == null || i >= 0 || !componentCallbacksC11117.getChildFragmentManager().m16808()) {
            return abstractC7291.m16794(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
