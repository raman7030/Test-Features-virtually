package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB0C */
/* JADX INFO: loaded from: classes3.dex */
public final class C6174 extends AbstractC23107 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f18970 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17080(AbstractC23107 abstractC23107) {
        if (abstractC23107 == null) {
            abstractC23107 = C7585.f23459;
        }
        this.f18970.add(abstractC23107);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17079(int i, C18211 c18211) {
    }

    public final int size() {
        return this.f18970.size();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f18970.iterator();
    }

    public final AbstractC23107 get(int i) {
        return (AbstractC23107) this.f18970.get(i);
    }

    @Override // l.AbstractC23107
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo17081() {
        ArrayList arrayList = this.f18970;
        int size = arrayList.size();
        if (size == 1) {
            return ((AbstractC23107) arrayList.get(0)).mo17081();
        }
        throw new IllegalStateException(C19370.m44628(size, "Array must have size 1, but has size "));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C6174) && ((C6174) obj).f18970.equals(this.f18970);
        }
        return true;
    }

    public final int hashCode() {
        return this.f18970.hashCode();
    }
}
