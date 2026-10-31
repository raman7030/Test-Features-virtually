package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15969 implements InterfaceC15194, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC15194 f49278;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3976 f49279;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo7692((Character) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C8846.m22855(this, consumer);
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

    @Override // l.InterfaceC20881
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void forEachRemaining(InterfaceC23662 interfaceC23662) {
        C8846.m22856((InterfaceC15900) this, interfaceC23662);
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo7695(Character ch) {
        C8140.m21612((InterfaceC15194) this, ch);
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Character.valueOf(mo7697());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C8846.m22854(this);
    }

    public C15969(C3976 c3976, InterfaceC15194 interfaceC15194) {
        this.f49279 = c3976;
        this.f49278 = interfaceC15194;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f49278.nextIndex() - this.f49279.f12619;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f49278.previousIndex() - this.f49279.f12619;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f49278.nextIndex() < this.f49279.f12618;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f49278.previousIndex() >= this.f49279.f12619;
    }

    @Override // l.InterfaceC15900
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo7691() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f49278.mo7691();
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ᩺֫ */
    public final char mo7697() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f49278.mo7697();
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ۧ */
    public final void mo7693(char c) {
        this.f49278.mo7693(c);
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ᩳ */
    public final void mo7696(char c) {
        this.f49278.mo7696(c);
    }

    @Override // l.InterfaceC15194, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f49278.remove();
    }
}
