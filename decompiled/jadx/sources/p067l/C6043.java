package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91Q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6043 implements InterfaceC18287 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C20125 f15171;

    /* JADX INFO: renamed from: ᩶ */
    public int f15172;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f15173;

    /* JADX INFO: renamed from: ᩹ */
    public int f15174;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16721;
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

    public C6043(C20125 c20125) {
        this(c20125, 0, c20125.f62310, false);
    }

    public C6043(C20125 c20125, int i, int i2, boolean z) {
        this.f15171 = c20125;
        this.f15172 = i;
        this.f15174 = i2;
        this.f15173 = z;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return (this.f15173 ? this.f15174 : this.f15171.f62310) - this.f15172;
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final InterfaceC18287 trySplit() {
        boolean z = this.f15173;
        C20125 c20125 = this.f15171;
        int i = z ? this.f15174 : c20125.f62310;
        int i2 = this.f15172;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f15174 = i;
        int i4 = i3 + i2;
        this.f15172 = i4;
        this.f15173 = true;
        return new C6043(c20125, i2, i4, true);
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f15172;
        boolean z = this.f15173;
        C20125 c20125 = this.f15171;
        if (i >= (z ? this.f15174 : c20125.f62310)) {
            return false;
        }
        int[] iArr = c20125.f62309;
        this.f15172 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        C20125 c20125 = this.f15171;
        int[] iArr = c20125.f62309;
        int i = this.f15173 ? this.f15174 : c20125.f62310;
        while (true) {
            int i2 = this.f15172;
            if (i2 >= i) {
                return;
            }
            intConsumer.accept(iArr[i2]);
            this.f15172++;
        }
    }
}
