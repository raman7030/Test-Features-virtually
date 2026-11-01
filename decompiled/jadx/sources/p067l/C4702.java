package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۖۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91Q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4702 implements InterfaceC8705, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C20125 f10630;

    /* JADX INFO: renamed from: ᩸ */
    public int f10631 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f10632 = 0;

    @Override // p067l.InterfaceC8705, p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C4702(C20125 c20125) {
        this.f10630 = c20125;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10632 < this.f10630.f62310;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f10630.f62309;
        int i = this.f10632;
        this.f10632 = i + 1;
        this.f10631 = i;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f10631 == -1) {
            throw new IllegalStateException();
        }
        this.f10631 = -1;
        C20125 c20125 = this.f10630;
        int i = c20125.f62310;
        c20125.f62310 = i - 1;
        int i2 = this.f10632;
        int i3 = i2 - 1;
        this.f10632 = i3;
        int[] iArr = c20125.f62309;
        System.arraycopy(iArr, i2, iArr, i3, i - i2);
    }

    @Override // p067l.InterfaceC22214
    public final void forEachRemaining(IntConsumer intConsumer) {
        C20125 c20125 = this.f10630;
        int[] iArr = c20125.f62309;
        while (true) {
            int i = this.f10632;
            if (i >= c20125.f62310) {
                return;
            }
            this.f10632 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }
}
