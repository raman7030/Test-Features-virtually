package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4877 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16416 f15422;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f15423;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f15425 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Collection f15424 = null;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Iterator f15421 = EnumC1120.INSTANCE;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Object mo14233(Object obj, Object obj2);

    public AbstractC4877(AbstractC16416 abstractC16416) {
        this.f15422 = abstractC16416;
        this.f15423 = abstractC16416.f50496.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15423.hasNext() || this.f15421.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f15421.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f15423.next();
            this.f15425 = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f15424 = collection;
            this.f15421 = collection.iterator();
        }
        return this.f15421.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f15421.remove();
        Collection collection = this.f15424;
        C11003.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f15423.remove();
        }
        AbstractC16416.m38684(this.f15422);
    }
}
