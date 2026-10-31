package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18724 implements InterfaceC15194, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f59191;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char[] f59192;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f59193;

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
        return Character.valueOf(mo7697());
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ۧ */
    public final void mo7693(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC15194, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C8846.m22854(this);
    }

    public C18724(char[] cArr, int i) {
        this.f59192 = cArr;
        this.f59191 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f59193 < this.f59191;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f59193 > 0;
    }

    @Override // l.InterfaceC15900
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo7691() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f59193;
        this.f59193 = i + 1;
        return this.f59192[i];
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ᩺֫ */
    public final char mo7697() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f59193 - 1;
        this.f59193 = i;
        return this.f59192[i];
    }

    @Override // l.InterfaceC20881
    /* JADX INFO: renamed from: ۧ */
    public final void forEachRemaining(InterfaceC23662 interfaceC23662) {
        C11003.requireNonNull(interfaceC23662);
        while (true) {
            int i = this.f59193;
            if (i >= this.f59191) {
                return;
            }
            interfaceC23662.mo18328(this.f59192[i]);
            this.f59193++;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f59193;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f59193 - 1;
    }
}
