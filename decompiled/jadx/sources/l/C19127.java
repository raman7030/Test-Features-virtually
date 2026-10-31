package l;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩵֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9OW */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class C19127 extends AbstractList implements InterfaceC4142, RandomAccess {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2731 f60277;

    @Override // l.InterfaceC4142
    /* JADX INFO: renamed from: ۟ۧ */
    public final InterfaceC4142 mo8470() {
        return this;
    }

    public C19127(C2731 c2731) {
        this.f60277 = c2731;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f60277.get(i);
    }

    @Override // l.InterfaceC4142
    /* JADX INFO: renamed from: ᩵ */
    public final Object mo8472(int i) {
        return this.f60277.mo8472(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f60277.size();
    }

    @Override // l.InterfaceC4142
    /* JADX INFO: renamed from: ֫ */
    public final void mo8469(AbstractC5886 abstractC5886) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C3604 c3604 = new C3604();
        c3604.f11427 = ((AbstractList) this.f60277).listIterator(i);
        return c3604;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C18421 c18421 = new C18421();
        c18421.f57169 = ((AbstractList) this.f60277).iterator();
        return c18421;
    }

    @Override // l.InterfaceC4142
    /* JADX INFO: renamed from: ܰ */
    public final List mo8471() {
        return this.f60277.mo8471();
    }
}
