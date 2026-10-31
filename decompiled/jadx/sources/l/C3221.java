package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۗۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3221 implements InterfaceC0418 {
    public final /* synthetic */ Spliterator.OfLong a;

    public /* synthetic */ C3221(Spliterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ InterfaceC0418 a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C8242 ? ((C8242) ofLong).a : new C3221(ofLong);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.a;
        if (obj instanceof C3221) {
            obj = ((C3221) obj).a;
        }
        return ofLong.equals(obj);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC1124
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // l.InterfaceC0418, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // l.InterfaceC0418
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
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

    @Override // l.InterfaceC0418, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // l.InterfaceC0418
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.a.tryAdvance(longConsumer);
    }

    @Override // l.InterfaceC0418, l.InterfaceC1124, l.InterfaceC15234
    public final /* synthetic */ InterfaceC0418 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // l.InterfaceC1124, l.InterfaceC15234
    public final /* synthetic */ InterfaceC1124 trySplit() {
        return C21648.a(this.a.trySplit());
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ InterfaceC15234 trySplit() {
        return C3303.a(this.a.trySplit());
    }
}
