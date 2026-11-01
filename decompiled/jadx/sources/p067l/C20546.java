package p067l;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩵֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9OW */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class C20546 extends AbstractList implements InterfaceC6305, RandomAccess {

    /* JADX INFO: renamed from: ᩸ */
    public final C4964 f63509;

    @Override // p067l.InterfaceC6305
    /* JADX INFO: renamed from: ۟ۧ */
    public final InterfaceC6305 mo10517() {
        return this;
    }

    public C20546(C4964 c4964) {
        this.f63509 = c4964;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f63509.get(i);
    }

    @Override // p067l.InterfaceC6305
    /* JADX INFO: renamed from: ᩵ */
    public final Object mo10519(int i) {
        return this.f63509.mo10519(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f63509.size();
    }

    @Override // p067l.InterfaceC6305
    /* JADX INFO: renamed from: ֫ */
    public final void mo10516(AbstractC7962 abstractC7962) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C5793 c5793 = new C5793();
        c5793.f14231 = ((AbstractList) this.f63509).listIterator(i);
        return c5793;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C19875 c19875 = new C19875();
        c19875.f60388 = ((AbstractList) this.f63509).iterator();
        return c19875;
    }

    @Override // p067l.InterfaceC6305
    /* JADX INFO: renamed from: ܰ */
    public final List mo10518() {
        return this.f63509.mo10518();
    }
}
