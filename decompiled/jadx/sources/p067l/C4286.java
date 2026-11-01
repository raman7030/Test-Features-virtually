package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֫ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4286 implements InterfaceC12631 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC12631 f9521;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C18367 f9522;

    public C4286(C18367 c18367, InterfaceC12631 interfaceC12631) {
        this.f9522 = c18367;
        this.f9521 = interfaceC12631;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9521.nextIndex() - this.f9522.f54863;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9521.previousIndex() - this.f9522.f54863;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f9521.nextIndex() < this.f9522.f54862;
    }

    @Override // p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f9521.previousIndex() >= this.f9522.f54863;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f9521.next();
    }

    @Override // p067l.InterfaceC16514
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f9521.previous();
    }

    @Override // p067l.InterfaceC12631, java.util.ListIterator
    public final void add(Object obj) {
        this.f9521.add(obj);
    }

    @Override // p067l.InterfaceC12631, java.util.ListIterator
    public final void set(Object obj) {
        this.f9521.set(obj);
    }

    @Override // p067l.InterfaceC12631, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        this.f9521.remove();
    }
}
