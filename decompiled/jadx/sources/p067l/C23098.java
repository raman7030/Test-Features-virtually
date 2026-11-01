package p067l;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23098 extends AbstractC8740 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21757 f72594;

    public C23098(C21757 c21757) {
        this.f72594 = c21757;
    }

    @Override // p067l.AbstractC8740
    /* JADX INFO: renamed from: ۧ */
    public final Map mo20213() {
        return this.f72594;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C23768(this.f72594);
    }

    @Override // p067l.AbstractC8740, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f72594.f68511.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // p067l.AbstractC8740, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C12826.requireNonNull(entry);
        AbstractC17970.m40897(this.f72594.f68510, entry.getKey());
        return true;
    }
}
