package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB0C */
/* JADX INFO: loaded from: classes3.dex */
public final class C8236 extends AbstractC24329 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f21829 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m19012(AbstractC24329 abstractC24329) {
        if (abstractC24329 == null) {
            abstractC24329 = C9577.f26370;
        }
        this.f21829.add(abstractC24329);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19011(int i, C19676 c19676) {
    }

    public final int size() {
        return this.f21829.size();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f21829.iterator();
    }

    public final AbstractC24329 get(int i) {
        return (AbstractC24329) this.f21829.get(i);
    }

    @Override // p067l.AbstractC24329
    /* JADX INFO: renamed from: ܽ */
    public final String mo19013() {
        ArrayList arrayList = this.f21829;
        int size = arrayList.size();
        if (size == 1) {
            return ((AbstractC24329) arrayList.get(0)).mo19013();
        }
        throw new IllegalStateException(C20778.m46922(size, "Array must have size 1, but has size "));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C8236) && ((C8236) obj).f21829.equals(this.f21829);
        }
        return true;
    }

    public final int hashCode() {
        return this.f21829.hashCode();
    }
}
