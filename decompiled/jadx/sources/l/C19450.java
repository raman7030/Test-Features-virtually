package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩵ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19450 implements InterfaceC8160 {
    public final /* synthetic */ Spliterator.OfDouble a;

    public /* synthetic */ C19450(Spliterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ InterfaceC8160 a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C5338 ? ((C5338) ofDouble).a : new C19450(ofDouble);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.a;
        if (obj instanceof C19450) {
            obj = ((C19450) obj).a;
        }
        return ofDouble.equals(obj);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC1124
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // l.InterfaceC8160
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.a.forEachRemaining(doubleConsumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC1124
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // l.InterfaceC8160
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.a.tryAdvance(doubleConsumer);
    }

    @Override // l.InterfaceC1124, l.InterfaceC15234
    public final /* synthetic */ InterfaceC1124 trySplit() {
        return C21648.a(this.a.trySplit());
    }

    @Override // l.InterfaceC8160, l.InterfaceC1124, l.InterfaceC15234
    public final /* synthetic */ InterfaceC8160 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ InterfaceC15234 trySplit() {
        return C3303.a(this.a.trySplit());
    }
}
