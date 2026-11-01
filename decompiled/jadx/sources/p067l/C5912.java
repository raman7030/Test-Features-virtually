package p067l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5912 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C22676 f14592;

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f14593;

    /* JADX INFO: renamed from: ᩹ */
    public int f14594;

    public C5912(C22676 c22676) {
        this.f14592 = c22676;
        this.f14594 = c22676.f71535.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f14594;
        return (i > 0 && i <= this.f14592.f71535.size()) || m13295().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!m13295().hasNext()) {
            List list = this.f14592.f71535;
            int i = this.f14594 - 1;
            this.f14594 = i;
            return (Map.Entry) list.get(i);
        }
        return (Map.Entry) m13295().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    private Iterator m13295() {
        if (this.f14593 == null) {
            this.f14593 = this.f14592.f71532.entrySet().iterator();
        }
        return this.f14593;
    }
}
