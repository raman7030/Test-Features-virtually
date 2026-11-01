package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܶܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16966 implements InterfaceC20202 {

    /* JADX INFO: renamed from: a */
    public int f50196a;

    /* JADX INFO: renamed from: b */
    public final int f50197b;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 17749;
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C6120.m13914a(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        return null;
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C6120.m13915b(this, consumer);
    }

    public C16966(int i, int i2) {
        this.f50196a = i;
        this.f50197b = i2;
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C12826.requireNonNull(intConsumer);
        int i = this.f50196a;
        if (i >= this.f50197b) {
            return false;
        }
        this.f50196a = i + 1;
        intConsumer.accept(i);
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        C12826.requireNonNull(intConsumer);
        int i = this.f50197b;
        this.f50196a = i;
        for (int i2 = this.f50196a; i2 < i; i2++) {
            intConsumer.accept(i2);
        }
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return (((long) this.f50197b) - ((long) this.f50196a)) + ((long) 0);
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC20202 trySplit() {
        long jEstimateSize = estimateSize();
        if (jEstimateSize <= 1) {
            return null;
        }
        int i = this.f50196a;
        int i2 = ((int) (jEstimateSize / ((long) (jEstimateSize < 16777216 ? 2 : 8)))) + i;
        this.f50196a = i2;
        return new C16966(i, i2);
    }
}
