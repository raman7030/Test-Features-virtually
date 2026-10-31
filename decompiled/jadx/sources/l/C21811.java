package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes.dex */
public final class C21811 extends AbstractC6704 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20400 f69886;

    public C21811(C20400 c20400) {
        this.f69886 = c20400;
    }

    @Override // l.AbstractC6704
    /* JADX INFO: renamed from: ۧ */
    public final Map mo18265() {
        return this.f69886;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C22516(this.f69886);
    }

    @Override // l.AbstractC6704, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f69886.f65835.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // l.AbstractC6704, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C11003.requireNonNull(entry);
        AbstractC16416.m38681(this.f69886.f65834, entry.getKey());
        return true;
    }
}
