package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7NG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5230 implements InterfaceC16847 {

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC16847 f12276;

    /* JADX INFO: renamed from: ۙ */
    public final C9053 f12277;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC16847 f12278;

    /* JADX INFO: renamed from: ᩸ */
    public int f12279;

    /* JADX INFO: renamed from: ᩹ */
    public long f12280;

    @Override // p067l.InterfaceC16847
    public /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public AbstractC5230(InterfaceC16847 interfaceC16847, InterfaceC16847 interfaceC16848, C9053 c9053, C21545 c21545, int i, long j) {
        this.f12276 = interfaceC16847;
        this.f12278 = interfaceC16848;
        this.f12277 = c9053;
        this.f12279 = i;
        this.f12280 = j;
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        do {
            InterfaceC16847 interfaceC16847 = this.f12276;
            if (interfaceC16847 != null && interfaceC16847.tryAdvance(consumer)) {
                long j = this.f12280;
                if (j == C14849.FOREVER_NS) {
                    return true;
                }
                this.f12280 = j - 1;
                return true;
            }
            this.f12276 = null;
        } while (this.f12278.tryAdvance(new Consumer() { // from class: l.ۙۙܺ
            public /* synthetic */ Consumer andThen(Consumer consumer2) {
                return C24719.$default$andThen(this, consumer2);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f16958.f12276 = (InterfaceC16847) obj;
            }
        }));
        return false;
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(final Consumer consumer) {
        InterfaceC16847 interfaceC16847 = this.f12276;
        if (interfaceC16847 != null) {
            interfaceC16847.forEachRemaining(consumer);
            this.f12276 = null;
        }
        this.f12278.forEachRemaining(new Consumer(this) { // from class: l.᩶ۙܺ
            public /* synthetic */ Consumer andThen(Consumer consumer2) {
                return C24719.$default$andThen(this, consumer2);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InterfaceC16847 interfaceC16848 = (InterfaceC16847) obj;
                if (interfaceC16848 != null) {
                    interfaceC16848.forEachRemaining(consumer);
                }
            }
        });
        this.f12280 = 0L;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        InterfaceC16847 interfaceC16847TrySplit = this.f12278.trySplit();
        if (interfaceC16847TrySplit != null) {
            int i = this.f12279 & (-65);
            long jEstimateSize = estimateSize();
            if (jEstimateSize < C14849.FOREVER_NS) {
                jEstimateSize /= 2;
                this.f12280 -= jEstimateSize;
                this.f12279 = i;
            }
            C14617 c14617 = new C14617(this.f12276, interfaceC16847TrySplit, this.f12277, i, jEstimateSize);
            this.f12276 = null;
            return c14617;
        }
        InterfaceC16847 interfaceC16847 = this.f12276;
        if (interfaceC16847 == null) {
            return null;
        }
        this.f12276 = null;
        return interfaceC16847;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        InterfaceC16847 interfaceC16847 = this.f12276;
        if (interfaceC16847 != null) {
            this.f12280 = Math.max(this.f12280, interfaceC16847.estimateSize());
        }
        return Math.max(this.f12280, 0L);
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f12279;
    }
}
