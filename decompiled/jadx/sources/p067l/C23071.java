package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4K9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23071 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC21730 f72485;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterator f72486;

    public C23071(AbstractC21730 abstractC21730, Iterator it) {
        this.f72485 = abstractC21730;
        this.f72486 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72486.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f72485.mo20678(this.f72486.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f72486.remove();
    }
}
