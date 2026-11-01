package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7167 implements InterfaceC16809, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C23261 f18711;

    /* JADX INFO: renamed from: ᩸ */
    public int f18712 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f18713;

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

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Character.valueOf(mo9758());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C10776.m24824(this);
    }

    public C7167(C23261 c23261, int i) {
        this.f18711 = c23261;
        this.f18713 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f18713 < this.f18711.f73100;
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f18713 > 0;
    }

    @Override // p067l.InterfaceC17480
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo9752() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f18711.f73099;
        int i = this.f18713;
        this.f18713 = i + 1;
        this.f18712 = i;
        return cArr[i];
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ᩺֫ */
    public final char mo9758() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f18711.f73099;
        int i = this.f18713 - 1;
        this.f18713 = i;
        this.f18712 = i;
        return cArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18713;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18713 - 1;
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ۧ */
    public final void mo9754(char c) {
        int i = this.f18713;
        this.f18713 = i + 1;
        this.f18711.mo6023(c, i);
        this.f18712 = -1;
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ᩳ */
    public final void mo9757(char c) {
        int i = this.f18712;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f18711.mo6018(c, i);
    }

    @Override // p067l.InterfaceC16809, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f18712;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f18711.mo6017(i);
        int i2 = this.f18712;
        int i3 = this.f18713;
        if (i2 < i3) {
            this.f18713 = i3 - 1;
        }
        this.f18712 = -1;
    }

    @Override // p067l.InterfaceC22214
    /* JADX INFO: renamed from: ۧ */
    public final void forEachRemaining(InterfaceC24857 interfaceC24857) {
        C23261 c23261 = this.f18711;
        char[] cArr = c23261.f73099;
        while (true) {
            int i = this.f18713;
            if (i >= c23261.f73100) {
                return;
            }
            this.f18713 = i + 1;
            this.f18712 = i;
            interfaceC24857.mo20276(cArr[i]);
        }
    }
}
