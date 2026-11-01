package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֫ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4011 implements InterfaceC18287 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C12729 f8745;

    /* JADX INFO: renamed from: ᩸ */
    public int f8746;

    /* JADX INFO: renamed from: ᩹ */
    public int f8747;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 17744;
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12924.m29597(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C12924.m29598(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // p067l.InterfaceC18287, p067l.InterfaceC16847
    public final InterfaceC6713 getComparator() {
        throw new IllegalStateException();
    }

    public C4011(C12729 c12729) {
        this(c12729, 0, c12729.f35753.length);
    }

    public C4011(C12729 c12729, int i, int i2) {
        this.f8745 = c12729;
        this.f8747 = i;
        this.f8746 = i2;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f8746 - this.f8747;
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f8747 >= this.f8746) {
            return false;
        }
        int[] iArr = this.f8745.f35753;
        int i = this.f8747;
        this.f8747 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f8745.f35753;
        while (true) {
            int i = this.f8747;
            if (i >= this.f8746) {
                return;
            }
            intConsumer.accept(iArr[i]);
            this.f8747++;
        }
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final InterfaceC18287 trySplit() {
        int i = this.f8747;
        int i2 = (this.f8746 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = i2 + i;
        this.f8747 = i3;
        return new C4011(this.f8745, i, i3);
    }
}
