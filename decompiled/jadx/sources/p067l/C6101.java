package p067l;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۘۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6101 extends C16158 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SortedSet f15343f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6101(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f15343f = sortedSet;
    }

    @Override // p067l.C16158, p067l.InterfaceC16847
    public final Comparator getComparator() {
        return this.f15343f.comparator();
    }
}
