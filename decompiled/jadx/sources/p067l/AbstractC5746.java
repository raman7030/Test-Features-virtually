package p067l;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۗ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5746 extends AbstractC6158 implements InterfaceC3437 {
    /* JADX INFO: renamed from: b */
    public abstract Object mo4500b();

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public AbstractC5746(InterfaceC3437 interfaceC3437, long j, long j2) {
        super(interfaceC3437, j, j2, 0L, Math.min(interfaceC3437.estimateSize(), j2));
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        long j;
        C12826.requireNonNull(obj);
        long j2 = this.f15453e;
        long j3 = this.f15449a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.f15452d;
            if (j3 <= j) {
                break;
            }
            ((InterfaceC3437) this.f15451c).tryAdvance(mo4500b());
            this.f15452d++;
        }
        if (j >= this.f15453e) {
            return false;
        }
        this.f15452d = j + 1;
        return ((InterfaceC3437) this.f15451c).tryAdvance(obj);
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(Object obj) {
        C12826.requireNonNull(obj);
        long j = this.f15453e;
        long j2 = this.f15449a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.f15452d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && ((InterfaceC3437) this.f15451c).estimateSize() + j3 <= this.f15450b) {
            ((InterfaceC3437) this.f15451c).forEachRemaining(obj);
            this.f15452d = this.f15453e;
            return;
        }
        while (j2 > this.f15452d) {
            ((InterfaceC3437) this.f15451c).tryAdvance(mo4500b());
            this.f15452d++;
        }
        while (this.f15452d < this.f15453e) {
            ((InterfaceC3437) this.f15451c).tryAdvance(obj);
            this.f15452d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
