package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۘۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3927 extends C14509 {
    public final /* synthetic */ SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3927(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f = sortedSet;
    }

    @Override // l.C14509, l.InterfaceC15234
    public final Comparator getComparator() {
        return this.f.comparator();
    }
}
