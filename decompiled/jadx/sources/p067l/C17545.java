package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17545 implements InterfaceC16809, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC16809 f52436;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C6147 f52437;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo9753((Character) obj);
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C10776.m24825(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo9756((Character) obj);
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo9753(Character ch) {
        C10105.m23578((InterfaceC16809) this, ch);
    }

    @Override // p067l.InterfaceC22214
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void forEachRemaining(InterfaceC24857 interfaceC24857) {
        C10776.m24826((InterfaceC17480) this, interfaceC24857);
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo9756(Character ch) {
        C10105.m23580((InterfaceC16809) this, ch);
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Character.valueOf(mo9758());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C10776.m24824(this);
    }

    public C17545(C6147 c6147, InterfaceC16809 interfaceC16809) {
        this.f52437 = c6147;
        this.f52436 = interfaceC16809;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f52436.nextIndex() - this.f52437.f15430;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f52436.previousIndex() - this.f52437.f15430;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f52436.nextIndex() < this.f52437.f15429;
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f52436.previousIndex() >= this.f52437.f15430;
    }

    @Override // p067l.InterfaceC17480
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo9752() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f52436.mo9752();
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ᩺֫ */
    public final char mo9758() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f52436.mo9758();
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ۧ */
    public final void mo9754(char c) {
        this.f52436.mo9754(c);
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ᩳ */
    public final void mo9757(char c) {
        this.f52436.mo9757(c);
    }

    @Override // p067l.InterfaceC16809, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f52436.remove();
    }
}
