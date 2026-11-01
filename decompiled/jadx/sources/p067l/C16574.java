package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܶۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16574 implements InterfaceC3202 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C6517 f48679;

    /* JADX INFO: renamed from: ᩶ */
    public int f48680;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f48681;

    /* JADX INFO: renamed from: ᩹ */
    public int f48682;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16720;
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7226.m16563(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C7226.m16564(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public C16574(C6517 c6517) {
        this(c6517, 0, c6517.f16850, false);
    }

    public C16574(C6517 c6517, int i, int i2, boolean z) {
        this.f48679 = c6517;
        this.f48680 = i;
        this.f48682 = i2;
        this.f48681 = z;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return (this.f48681 ? this.f48682 : this.f48679.f16850) - this.f48680;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC3202 trySplit() {
        boolean z = this.f48681;
        C6517 c6517 = this.f48679;
        int i = z ? this.f48682 : c6517.f16850;
        int i2 = this.f48680;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f48682 = i;
        int i4 = i3 + i2;
        this.f48680 = i4;
        this.f48681 = true;
        return new C16574(c6517, i2, i4, true);
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(LongConsumer longConsumer) {
        int i = this.f48680;
        boolean z = this.f48681;
        C6517 c6517 = this.f48679;
        if (i >= (z ? this.f48682 : c6517.f16850)) {
            return false;
        }
        long[] jArr = c6517.f16849;
        this.f48680 = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(LongConsumer longConsumer) {
        C6517 c6517 = this.f48679;
        long[] jArr = c6517.f16849;
        int i = this.f48681 ? this.f48682 : c6517.f16850;
        while (true) {
            int i2 = this.f48680;
            if (i2 >= i) {
                return;
            }
            longConsumer.accept(jArr[i2]);
            this.f48680++;
        }
    }
}
