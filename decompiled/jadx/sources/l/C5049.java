package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5049 implements InterfaceC15194, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21983 f15879;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f15880 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f15881;

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

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Character.valueOf(mo7697());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C8846.m22854(this);
    }

    public C5049(C21983 c21983, int i) {
        this.f15879 = c21983;
        this.f15881 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f15881 < this.f15879.f70389;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f15881 > 0;
    }

    @Override // l.InterfaceC15900
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo7691() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f15879.f70388;
        int i = this.f15881;
        this.f15881 = i + 1;
        this.f15880 = i;
        return cArr[i];
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ᩺֫ */
    public final char mo7697() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f15879.f70388;
        int i = this.f15881 - 1;
        this.f15881 = i;
        this.f15880 = i;
        return cArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15881;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15881 - 1;
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ۧ */
    public final void mo7693(char c) {
        int i = this.f15881;
        this.f15881 = i + 1;
        this.f15879.mo3752(c, i);
        this.f15880 = -1;
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ᩳ */
    public final void mo7696(char c) {
        int i = this.f15880;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f15879.mo3747(c, i);
    }

    @Override // l.InterfaceC15194, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f15880;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f15879.mo3746(i);
        int i2 = this.f15880;
        int i3 = this.f15881;
        if (i2 < i3) {
            this.f15881 = i3 - 1;
        }
        this.f15880 = -1;
    }

    @Override // l.InterfaceC20881
    /* JADX INFO: renamed from: ۧ */
    public final void forEachRemaining(InterfaceC23662 interfaceC23662) {
        C21983 c21983 = this.f15879;
        char[] cArr = c21983.f70388;
        while (true) {
            int i = this.f15881;
            if (i >= c21983.f70389) {
                return;
            }
            this.f15881 = i + 1;
            this.f15880 = i;
            interfaceC23662.mo18328(cArr[i]);
        }
    }
}
