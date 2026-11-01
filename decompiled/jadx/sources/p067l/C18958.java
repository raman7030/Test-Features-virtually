package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public class C18958 implements InterfaceC18287 {

    /* JADX INFO: renamed from: ۗ */
    public final int f56507;

    /* JADX INFO: renamed from: ۙ */
    public int f56508;

    /* JADX INFO: renamed from: ᩶ */
    public int f56509;

    /* JADX INFO: renamed from: ᩸ */
    public final int[] f56510;

    /* JADX INFO: renamed from: ᩹ */
    public final int f56511;

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
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // p067l.InterfaceC18287, p067l.InterfaceC16847
    public InterfaceC6713 getComparator() {
        throw new IllegalStateException();
    }

    public C18958(int i, int i2, int i3, int[] iArr) {
        this.f56510 = iArr;
        this.f56507 = i;
        this.f56508 = i2;
        this.f56511 = i3 | 16720;
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f56509 >= this.f56508) {
            return false;
        }
        C12826.requireNonNull(intConsumer);
        int i = this.f56509;
        this.f56509 = i + 1;
        intConsumer.accept(this.f56510[this.f56507 + i]);
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f56508 - this.f56509;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f56511;
    }

    /* JADX INFO: renamed from: ֫ */
    public C18958 mo37075(int i, int i2) {
        return new C18958(i, i2, this.f56511, this.f56510);
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final InterfaceC18287 trySplit() {
        int i = this.f56509;
        int i2 = (this.f56508 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f56507 + i;
        this.f56509 = i + i2;
        return mo37075(i3, i2);
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        C12826.requireNonNull(intConsumer);
        while (true) {
            int i = this.f56509;
            if (i >= this.f56508) {
                return;
            }
            intConsumer.accept(this.f56510[this.f56507 + i]);
            this.f56509++;
        }
    }
}
