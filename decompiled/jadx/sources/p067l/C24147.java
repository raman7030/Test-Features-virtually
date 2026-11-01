package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24147 implements InterfaceC16750, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public int f76583;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C9395 f76584;

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

    public C24147(C9395 c9395, int i) {
        this.f76584 = c9395;
        this.f76583 = i + c9395.f25669;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f76583 < this.f76584.f25666;
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f76583 > this.f76584.f25669;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f76584.f25668;
        int i = this.f76583;
        this.f76583 = i + 1;
        return iArr[i];
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo7885() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f76584.f25668;
        int i = this.f76583 - 1;
        this.f76583 = i;
        return iArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f76583 - this.f76584.f25669;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.f76583 - this.f76584.f25669) - 1;
    }

    @Override // p067l.InterfaceC22214
    public final void forEachRemaining(IntConsumer intConsumer) {
        C9395 c9395 = this.f76584;
        int[] iArr = c9395.f25668;
        while (true) {
            int i = this.f76583;
            if (i >= c9395.f25666) {
                return;
            }
            this.f76583 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }

    @Override // p067l.InterfaceC16750
    public final void add(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ֫ */
    public final void mo7883(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC16750, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
