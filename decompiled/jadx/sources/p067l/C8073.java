package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۛۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8073 implements InterfaceC10124 {

    /* JADX INFO: renamed from: a */
    public final double[] f21293a;

    /* JADX INFO: renamed from: b */
    public int f21294b;

    /* JADX INFO: renamed from: c */
    public final int f21295c;

    /* JADX INFO: renamed from: d */
    public final int f21296d;

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC17736.m40300b(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC17736.m40305g(this, consumer);
    }

    public C8073(double[] dArr, int i, int i2, int i3) {
        this.f21293a = dArr;
        this.f21294b = i;
        this.f21295c = i2;
        this.f21296d = i3 | 16448;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC10124 trySplit() {
        int i = this.f21294b;
        int i2 = (this.f21295c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f21294b = i2;
        return new C8073(this.f21293a, i, i2, this.f21296d);
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i;
        doubleConsumer.getClass();
        double[] dArr = this.f21293a;
        int length = dArr.length;
        int i2 = this.f21295c;
        if (length < i2 || (i = this.f21294b) < 0) {
            return;
        }
        this.f21294b = i2;
        if (i < i2) {
            do {
                doubleConsumer.accept(dArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i = this.f21294b;
        if (i < 0 || i >= this.f21295c) {
            return false;
        }
        this.f21294b = i + 1;
        doubleConsumer.accept(this.f21293a[i]);
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f21295c - this.f21294b;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f21296d;
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        if (C4779.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
