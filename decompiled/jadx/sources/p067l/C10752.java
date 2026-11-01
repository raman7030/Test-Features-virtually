package p067l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes3.dex */
public class C10752 extends AbstractC3257 {

    /* JADX INFO: renamed from: ᩸ */
    public final Map f29815;

    public C10752(Map map) {
        map.getClass();
        this.f29815 = map;
    }

    /* JADX INFO: renamed from: ۧ */
    public Map mo24764() {
        return this.f29815;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C4046(mo24764().entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo24764().size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo24764().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return mo24764().containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        mo24764().remove(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        mo24764().clear();
    }
}
