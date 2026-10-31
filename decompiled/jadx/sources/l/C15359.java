package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܶܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15359 implements InterfaceC18764 {
    public int a;
    public final int b;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 17749;
    }

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C3947.a(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        return null;
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C3947.b(this, consumer);
    }

    public C15359(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        int i = this.a;
        if (i >= this.b) {
            return false;
        }
        this.a = i + 1;
        intConsumer.accept(i);
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        int i = this.b;
        this.a = i;
        for (int i2 = this.a; i2 < i; i2++) {
            intConsumer.accept(i2);
        }
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return (((long) this.b) - ((long) this.a)) + ((long) 0);
    }

    @Override // l.InterfaceC15234
    public final InterfaceC18764 trySplit() {
        long jEstimateSize = estimateSize();
        if (jEstimateSize <= 1) {
            return null;
        }
        int i = this.a;
        int i2 = ((int) (jEstimateSize / ((long) (jEstimateSize < 16777216 ? 2 : 8)))) + i;
        this.a = i2;
        return new C15359(i, i2);
    }
}
