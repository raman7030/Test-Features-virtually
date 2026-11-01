package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7906 extends ArrayList {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13271 f20733;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7906(C13271 c13271) {
        super(0);
        this.f20733 = c13271;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        this.f20733.f37270 = obj;
        return super.add(obj);
    }
}
