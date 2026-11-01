package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩻ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: CCCZ */
/* JADX INFO: loaded from: classes2.dex */
public class C24922 extends AbstractC7488 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC8829 f79591;

    public C24922(AbstractC8829 abstractC8829) {
        this.f79591 = abstractC8829;
    }

    @Override // p067l.InterfaceC7838
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo11024(char c) {
        return this.f79591.mo15130(c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f79591.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f79591.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        this.f79591.comparator();
        return null;
    }
}
