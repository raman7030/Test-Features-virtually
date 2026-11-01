package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes2.dex */
public final class C24818 implements InterfaceC16750, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C17441 f79287;

    /* JADX INFO: renamed from: ᩸ */
    public int f79288 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f79289;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo7884((Integer) obj);
    }

    @Override // java.util.Iterator, p067l.InterfaceC8705, p067l.InterfaceC16177, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo7886((Integer) obj);
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo7884(Integer num) {
        C10046.m23409((InterfaceC16750) this, num);
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo7886(Integer num) {
        C10046.m23412((InterfaceC16750) this, num);
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Integer.valueOf(mo7885());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C24798.m54479(this);
    }

    public C24818(int i, C17441 c17441) {
        this.f79287 = c17441;
        this.f79289 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f79289 < this.f79287.f52159;
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f79289 > 0;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f79287.f52158;
        int i = this.f79289;
        this.f79289 = i + 1;
        this.f79288 = i;
        return iArr[i];
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo7885() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f79287.f52158;
        int i = this.f79289 - 1;
        this.f79289 = i;
        this.f79288 = i;
        return iArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f79289;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f79289 - 1;
    }

    @Override // p067l.InterfaceC16750
    public final void add(int i) {
        int i2 = this.f79289;
        this.f79289 = i2 + 1;
        this.f79287.add(i2, i);
        this.f79288 = -1;
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ֫ */
    public final void mo7883(int i) {
        int i2 = this.f79288;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        this.f79287.set(i2, i);
    }

    @Override // p067l.InterfaceC16750, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f79288;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f79287.mo5829(i);
        int i2 = this.f79288;
        int i3 = this.f79289;
        if (i2 < i3) {
            this.f79289 = i3 - 1;
        }
        this.f79288 = -1;
    }

    @Override // p067l.InterfaceC22214
    public final void forEachRemaining(IntConsumer intConsumer) {
        C17441 c17441 = this.f79287;
        int[] iArr = c17441.f52158;
        while (true) {
            int i = this.f79289;
            if (i >= c17441.f52159) {
                return;
            }
            this.f79289 = i + 1;
            this.f79288 = i;
            intConsumer.accept(iArr[i]);
        }
    }
}
