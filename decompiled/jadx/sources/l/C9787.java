package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9787 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f29601;

    public C9787(Iterator it) {
        this.f29601 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29601.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f29601.next();
        return entry.getValue() instanceof C9081 ? new C21076(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f29601.remove();
    }
}
