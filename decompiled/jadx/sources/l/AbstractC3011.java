package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7NG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3011 implements InterfaceC15234 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC15234 f9478;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7033 f9479;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC15234 f9480;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9481;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f9482;

    @Override // l.InterfaceC15234
    public /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public AbstractC3011(InterfaceC15234 interfaceC15234, InterfaceC15234 interfaceC15235, C7033 c7033, C20177 c20177, int i, long j) {
        this.f9478 = interfaceC15234;
        this.f9480 = interfaceC15235;
        this.f9479 = c7033;
        this.f9481 = i;
        this.f9482 = j;
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        do {
            InterfaceC15234 interfaceC15234 = this.f9478;
            if (interfaceC15234 != null && interfaceC15234.tryAdvance(consumer)) {
                long j = this.f9482;
                if (j == C13132.FOREVER_NS) {
                    return true;
                }
                this.f9482 = j - 1;
                return true;
            }
            this.f9478 = null;
        } while (this.f9480.tryAdvance(new Consumer() { // from class: l.ۙۙܺ
            public /* synthetic */ Consumer andThen(Consumer consumer2) {
                return C23517.$default$andThen(this, consumer2);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f14142.f9478 = (InterfaceC15234) obj;
            }
        }));
        return false;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(final Consumer consumer) {
        InterfaceC15234 interfaceC15234 = this.f9478;
        if (interfaceC15234 != null) {
            interfaceC15234.forEachRemaining(consumer);
            this.f9478 = null;
        }
        this.f9480.forEachRemaining(new Consumer(this) { // from class: l.᩶ۙܺ
            public /* synthetic */ Consumer andThen(Consumer consumer2) {
                return C23517.$default$andThen(this, consumer2);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InterfaceC15234 interfaceC15235 = (InterfaceC15234) obj;
                if (interfaceC15235 != null) {
                    interfaceC15235.forEachRemaining(consumer);
                }
            }
        });
        this.f9482 = 0L;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        InterfaceC15234 interfaceC15234TrySplit = this.f9480.trySplit();
        if (interfaceC15234TrySplit != null) {
            int i = this.f9481 & (-65);
            long jEstimateSize = estimateSize();
            if (jEstimateSize < C13132.FOREVER_NS) {
                jEstimateSize /= 2;
                this.f9482 -= jEstimateSize;
                this.f9481 = i;
            }
            C12888 c12888 = new C12888(this.f9478, interfaceC15234TrySplit, this.f9479, i, jEstimateSize);
            this.f9478 = null;
            return c12888;
        }
        InterfaceC15234 interfaceC15234 = this.f9478;
        if (interfaceC15234 == null) {
            return null;
        }
        this.f9478 = null;
        return interfaceC15234;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        InterfaceC15234 interfaceC15234 = this.f9478;
        if (interfaceC15234 != null) {
            this.f9482 = Math.max(this.f9482, interfaceC15234.estimateSize());
        }
        return Math.max(this.f9482, 0L);
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f9481;
    }
}
