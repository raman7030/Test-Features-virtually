package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes2.dex */
public final class C0240 implements InterfaceC19292 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f1516;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5180 f1517;

    public C0240(AbstractC5180 abstractC5180, int i) {
        this.f1517 = abstractC5180;
        this.f1516 = i;
    }

    @Override // l.InterfaceC19292
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1499(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC5180 abstractC5180 = this.f1517;
        ComponentCallbacksC9205 componentCallbacksC9205 = abstractC5180.f16228;
        int i = this.f1516;
        if (componentCallbacksC9205 == null || i >= 0 || !componentCallbacksC9205.getChildFragmentManager().m14898()) {
            return abstractC5180.m14884(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
