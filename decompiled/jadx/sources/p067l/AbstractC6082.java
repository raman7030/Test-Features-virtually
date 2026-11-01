package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6082 extends AbstractC4741 implements InterfaceC16809, InterfaceC14185 {
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo9753((Character) obj);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo9756((Character) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10142(char c, int i);

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo9753(Character ch) {
        C10105.m23578((InterfaceC16809) this, ch);
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo10143(char c, int i);

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo9756(Character ch) {
        C10105.m23580((InterfaceC16809) this, ch);
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Character.valueOf(mo9758());
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        return C10776.m24824(this);
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f10739 > 0;
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ᩺֫ */
    public char mo9758() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f10739 - 1;
        this.f10739 = i;
        this.f10738 = i;
        return mo10043(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10739;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10739 - 1;
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ۧ */
    public void mo9754(char c) {
        int i = this.f10739;
        this.f10739 = i + 1;
        mo10142(c, i);
        this.f10738 = -1;
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ᩳ */
    public final void mo9757(char c) {
        int i = this.f10738;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo10143(c, i);
    }
}
