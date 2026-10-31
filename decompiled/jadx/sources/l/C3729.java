package l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3729 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21368 f11785;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f11786;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11787;

    public C3729(C21368 c21368) {
        this.f11785 = c21368;
        this.f11787 = c21368.f68839.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f11787;
        return (i > 0 && i <= this.f11785.f68839.size()) || m11343().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!m11343().hasNext()) {
            List list = this.f11785.f68839;
            int i = this.f11787 - 1;
            this.f11787 = i;
            return (Map.Entry) list.get(i);
        }
        return (Map.Entry) m11343().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Iterator m11343() {
        if (this.f11786 == null) {
            this.f11786 = this.f11785.f68836.entrySet().iterator();
        }
        return this.f11786;
    }
}
