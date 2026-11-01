package p067l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C11670 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f32553;

    public C11670(Iterator it) {
        this.f32553 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32553.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f32553.next();
        return entry.getValue() instanceof C10999 ? new C22399(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f32553.remove();
    }
}
