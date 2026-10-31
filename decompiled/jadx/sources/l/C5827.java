package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5827 extends ArrayList {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11472 f17881;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5827(C11472 c11472) {
        super(0);
        this.f17881 = c11472;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        this.f17881.f34274 = obj;
        return super.add(obj);
    }
}
