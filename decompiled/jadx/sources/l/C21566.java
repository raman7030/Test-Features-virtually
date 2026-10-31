package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩸ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21566 implements InterfaceC18764 {
    public final /* synthetic */ Spliterator.OfInt a;

    public /* synthetic */ C21566(Spliterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ InterfaceC18764 a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C20155 ? ((C20155) ofInt).a : new C21566(ofInt);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.a;
        if (obj instanceof C21566) {
            obj = ((C21566) obj).a;
        }
        return ofInt.equals(obj);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC1124
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // l.InterfaceC18764
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.a.forEachRemaining(intConsumer);
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

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // l.InterfaceC18764
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.a.tryAdvance(intConsumer);
    }

    @Override // l.InterfaceC1124, l.InterfaceC15234
    public final /* synthetic */ InterfaceC1124 trySplit() {
        return C21648.a(this.a.trySplit());
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ InterfaceC15234 trySplit() {
        return C3303.a(this.a.trySplit());
    }

    @Override // l.InterfaceC18764, l.InterfaceC1124, l.InterfaceC15234
    public final /* synthetic */ InterfaceC18764 trySplit() {
        return a(this.a.trySplit());
    }
}
