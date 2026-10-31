package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes3.dex */
public class C8821 extends AbstractC0935 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map f26890;

    public C8821(Map map) {
        map.getClass();
        this.f26890 = map;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Map mo22794() {
        return this.f26890;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C1765(mo22794().entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo22794().size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo22794().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return mo22794().containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        mo22794().remove(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        mo22794().clear();
    }
}
