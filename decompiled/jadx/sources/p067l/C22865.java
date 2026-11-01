package p067l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩸ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22865 implements InterfaceC20202 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator.OfInt f71994a;

    public /* synthetic */ C22865(Spliterator.OfInt ofInt) {
        this.f71994a = ofInt;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC20202 m51071a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C21524 ? ((C21524) ofInt).f67909a : new C22865(ofInt);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ int characteristics() {
        return this.f71994a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.f71994a;
        if (obj instanceof C22865) {
            obj = ((C22865) obj).f71994a;
        }
        return ofInt.equals(obj);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long estimateSize() {
        return this.f71994a.estimateSize();
    }

    @Override // p067l.InterfaceC3437
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f71994a.forEachRemaining(obj);
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f71994a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // p067l.InterfaceC20202
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f71994a.forEachRemaining(intConsumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return this.f71994a.getComparator();
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f71994a.getExactSizeIfKnown();
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f71994a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f71994a.hashCode();
    }

    @Override // p067l.InterfaceC3437
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f71994a.tryAdvance(obj);
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f71994a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // p067l.InterfaceC20202
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f71994a.tryAdvance(intConsumer);
    }

    @Override // p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* synthetic */ InterfaceC3437 trySplit() {
        return C22943.m51261a(this.f71994a.trySplit());
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ InterfaceC16847 trySplit() {
        return C5508.m12135a(this.f71994a.trySplit());
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* synthetic */ InterfaceC20202 trySplit() {
        return m51071a(this.f71994a.trySplit());
    }
}
