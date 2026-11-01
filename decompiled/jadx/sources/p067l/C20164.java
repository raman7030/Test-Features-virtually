package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20164 implements InterfaceC16809, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final int f62415;

    /* JADX INFO: renamed from: ᩸ */
    public final char[] f62416;

    /* JADX INFO: renamed from: ᩹ */
    public int f62417;

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

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo9756(Character ch) {
        C10105.m23580((InterfaceC16809) this, ch);
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ᩳ */
    public final void mo9757(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Character.valueOf(mo9758());
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ۧ */
    public final void mo9754(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC16809, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C10776.m24824(this);
    }

    public C20164(char[] cArr, int i) {
        this.f62416 = cArr;
        this.f62415 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f62417 < this.f62415;
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f62417 > 0;
    }

    @Override // p067l.InterfaceC17480
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo9752() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f62417;
        this.f62417 = i + 1;
        return this.f62416[i];
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ᩺֫ */
    public final char mo9758() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f62417 - 1;
        this.f62417 = i;
        return this.f62416[i];
    }

    @Override // p067l.InterfaceC22214
    /* JADX INFO: renamed from: ۧ */
    public final void forEachRemaining(InterfaceC24857 interfaceC24857) {
        C12826.requireNonNull(interfaceC24857);
        while (true) {
            int i = this.f62417;
            if (i >= this.f62415) {
                return;
            }
            interfaceC24857.mo20276(this.f62416[i]);
            this.f62417++;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f62417;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f62417 - 1;
    }
}
