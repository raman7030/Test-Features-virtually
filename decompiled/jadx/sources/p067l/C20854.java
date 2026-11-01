package p067l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩵ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20854 implements InterfaceC10124 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator.OfDouble f65512a;

    public /* synthetic */ C20854(Spliterator.OfDouble ofDouble) {
        this.f65512a = ofDouble;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC10124 m47082a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C7442 ? ((C7442) ofDouble).f19486a : new C20854(ofDouble);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ int characteristics() {
        return this.f65512a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.f65512a;
        if (obj instanceof C20854) {
            obj = ((C20854) obj).f65512a;
        }
        return ofDouble.equals(obj);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long estimateSize() {
        return this.f65512a.estimateSize();
    }

    @Override // p067l.InterfaceC3437
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f65512a.forEachRemaining(obj);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f65512a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // p067l.InterfaceC10124
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f65512a.forEachRemaining(doubleConsumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return this.f65512a.getComparator();
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f65512a.getExactSizeIfKnown();
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f65512a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f65512a.hashCode();
    }

    @Override // p067l.InterfaceC3437
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f65512a.tryAdvance(obj);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f65512a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // p067l.InterfaceC10124
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f65512a.tryAdvance(doubleConsumer);
    }

    @Override // p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* synthetic */ InterfaceC3437 trySplit() {
        return C22943.m51261a(this.f65512a.trySplit());
    }

    @Override // p067l.InterfaceC10124, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* synthetic */ InterfaceC10124 trySplit() {
        return m47082a(this.f65512a.trySplit());
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ InterfaceC16847 trySplit() {
        return C5508.m12135a(this.f65512a.trySplit());
    }
}
