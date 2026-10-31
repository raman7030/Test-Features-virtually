package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19430 implements InterfaceC15194, Serializable, Cloneable, InterfaceC12433 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo7692((Character) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo7695((Character) obj);
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo7692(Character ch) {
        C8140.m21610((InterfaceC15194) this, ch);
    }

    @Override // l.InterfaceC15900
    /* JADX INFO: renamed from: ۧ */
    public final void forEachRemaining(InterfaceC23662 interfaceC23662) {
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo7695(Character ch) {
        C8140.m21612((InterfaceC15194) this, ch);
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ᩳ */
    public final void mo7696(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        mo7697();
        throw null;
    }

    @Override // l.InterfaceC20881
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ۧ */
    public final void mo7693(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC15900
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo7691() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ᩺֫ */
    public final char mo7697() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC15194, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C0378.f1795;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C8846.m22854(this);
    }

    private Object readResolve() {
        return C0378.f1795;
    }
}
