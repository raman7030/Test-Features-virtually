package p067l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes5.dex */
public final class C18127 extends AbstractC8740 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC19469 f54154;

    public C18127(AbstractC19469 abstractC19469) {
        this.f54154 = abstractC19469;
    }

    @Override // p067l.AbstractC8740
    /* JADX INFO: renamed from: ۧ */
    public final Map mo20213() {
        return this.f54154;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return ((C24676) this.f54154).f78066.mo17189();
    }
}
