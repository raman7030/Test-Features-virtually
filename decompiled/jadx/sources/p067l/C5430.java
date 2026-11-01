package p067l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۗۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5430 implements InterfaceC2766 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator.OfLong f12956a;

    public /* synthetic */ C5430(Spliterator.OfLong ofLong) {
        this.f12956a = ofLong;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC2766 m11938a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C10202 ? ((C10202) ofLong).f28281a : new C5430(ofLong);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ int characteristics() {
        return this.f12956a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.f12956a;
        if (obj instanceof C5430) {
            obj = ((C5430) obj).f12956a;
        }
        return ofLong.equals(obj);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long estimateSize() {
        return this.f12956a.estimateSize();
    }

    @Override // p067l.InterfaceC3437
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f12956a.forEachRemaining(obj);
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12956a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // p067l.InterfaceC2766
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f12956a.forEachRemaining(longConsumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return this.f12956a.getComparator();
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f12956a.getExactSizeIfKnown();
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f12956a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12956a.hashCode();
    }

    @Override // p067l.InterfaceC3437
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f12956a.tryAdvance(obj);
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f12956a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // p067l.InterfaceC2766
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f12956a.tryAdvance(longConsumer);
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* synthetic */ InterfaceC2766 trySplit() {
        return m11938a(this.f12956a.trySplit());
    }

    @Override // p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* synthetic */ InterfaceC3437 trySplit() {
        return C22943.m51261a(this.f12956a.trySplit());
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ InterfaceC16847 trySplit() {
        return C5508.m12135a(this.f12956a.trySplit());
    }
}
