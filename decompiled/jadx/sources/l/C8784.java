package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۡۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes4.dex */
public final class C8784 implements InterfaceC15132, Serializable, Cloneable, InterfaceC12433 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.InterfaceC15132
    public final /* synthetic */ void add(int i) {
        C8078.m21440();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo5654((Integer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6667, l.InterfaceC14529, l.InterfaceC12433
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC14529
    public final void forEachRemaining(IntConsumer intConsumer) {
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
        mo5656((Integer) obj);
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo5653(int i) {
        C8078.m21443();
        throw null;
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo5654(Integer num) {
        C8078.m21441((InterfaceC15132) this, num);
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo5656(Integer num) {
        C8078.m21444((InterfaceC15132) this, num);
    }

    @Override // l.InterfaceC20881
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        mo5655();
        throw null;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo5655() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC15132, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C3845.f12278;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C23600.m52076(this);
    }

    private Object readResolve() {
        return C3845.f12278;
    }
}
