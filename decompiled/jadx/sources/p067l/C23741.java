package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4K9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23741 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC21730 f75536;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterator f75537;

    public C23741(AbstractC21730 abstractC21730, Iterator it) {
        this.f75536 = abstractC21730;
        this.f75537 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75537.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f75536.mo20678(this.f75537.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f75537.remove();
    }
}
