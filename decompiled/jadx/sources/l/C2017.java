package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֫ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes3.dex */
public final class C2017 implements InterfaceC10798 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC10798 f6735;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16833 f6736;

    public C2017(C16833 c16833, InterfaceC10798 interfaceC10798) {
        this.f6736 = c16833;
        this.f6735 = interfaceC10798;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6735.nextIndex() - this.f6736.f51683;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6735.previousIndex() - this.f6736.f51683;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f6735.nextIndex() < this.f6736.f51682;
    }

    @Override // l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f6735.previousIndex() >= this.f6736.f51683;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f6735.next();
    }

    @Override // l.InterfaceC14884
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f6735.previous();
    }

    @Override // l.InterfaceC10798, java.util.ListIterator
    public final void add(Object obj) {
        this.f6735.add(obj);
    }

    @Override // l.InterfaceC10798, java.util.ListIterator
    public final void set(Object obj) {
        this.f6735.set(obj);
    }

    @Override // l.InterfaceC10798, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        this.f6735.remove();
    }
}
