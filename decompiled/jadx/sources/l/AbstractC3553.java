package l;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۗ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3553 extends AbstractC3987 implements InterfaceC1124 {
    public abstract Object b();

    @Override // l.InterfaceC15234
    public final /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public AbstractC3553(InterfaceC1124 interfaceC1124, long j, long j2) {
        super(interfaceC1124, j, j2, 0L, Math.min(interfaceC1124.estimateSize(), j2));
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(Object obj) {
        long j;
        C11003.requireNonNull(obj);
        long j2 = this.e;
        long j3 = this.a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.d;
            if (j3 <= j) {
                break;
            }
            ((InterfaceC1124) this.c).tryAdvance(b());
            this.d++;
        }
        if (j >= this.e) {
            return false;
        }
        this.d = j + 1;
        return ((InterfaceC1124) this.c).tryAdvance(obj);
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(Object obj) {
        C11003.requireNonNull(obj);
        long j = this.e;
        long j2 = this.a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && ((InterfaceC1124) this.c).estimateSize() + j3 <= this.b) {
            ((InterfaceC1124) this.c).forEachRemaining(obj);
            this.d = this.e;
            return;
        }
        while (j2 > this.d) {
            ((InterfaceC1124) this.c).tryAdvance(b());
            this.d++;
        }
        while (this.d < this.e) {
            ((InterfaceC1124) this.c).tryAdvance(obj);
            this.d++;
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
