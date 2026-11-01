package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۬ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7CAF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14563 implements InterfaceC3202 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C13893 f41577;

    /* JADX INFO: renamed from: ᩶ */
    public int f41578;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f41579;

    /* JADX INFO: renamed from: ᩹ */
    public int f41580;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16721;
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

    public C14563(C13893 c13893) {
        this(c13893, 0, c13893.f39228, false);
    }

    public C14563(C13893 c13893, int i, int i2, boolean z) {
        this.f41577 = c13893;
        this.f41578 = i;
        this.f41580 = i2;
        this.f41579 = z;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return (this.f41579 ? this.f41580 : this.f41577.f39228) - this.f41578;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC3202 trySplit() {
        boolean z = this.f41579;
        C13893 c13893 = this.f41577;
        int i = z ? this.f41580 : c13893.f39228;
        int i2 = this.f41578;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f41580 = i;
        int i4 = i3 + i2;
        this.f41578 = i4;
        this.f41579 = true;
        return new C14563(c13893, i2, i4, true);
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(LongConsumer longConsumer) {
        int i = this.f41578;
        boolean z = this.f41579;
        C13893 c13893 = this.f41577;
        if (i >= (z ? this.f41580 : c13893.f39228)) {
            return false;
        }
        long[] jArr = c13893.f39227;
        this.f41578 = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(LongConsumer longConsumer) {
        C13893 c13893 = this.f41577;
        long[] jArr = c13893.f39227;
        int i = this.f41579 ? this.f41580 : c13893.f39228;
        while (true) {
            int i2 = this.f41578;
            if (i2 >= i) {
                return;
            }
            longConsumer.accept(jArr[i2]);
            this.f41578++;
        }
    }
}
