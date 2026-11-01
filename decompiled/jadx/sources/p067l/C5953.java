package p067l;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5953 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C20765 f14697;

    public C5953(C20765 c20765) {
        this.f14697 = c20765;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C20765 c20765 = this.f14697;
        C5676 c5676 = c20765.f71648;
        C5006 c5006 = c20765.f71624;
        return Integer.compare(c5676.mo12654(c5006.m10635((InterfaceC6227) ((Map.Entry) obj).getKey())), c5676.mo12654(c5006.m10635((InterfaceC6227) ((Map.Entry) obj2).getKey())));
    }
}
