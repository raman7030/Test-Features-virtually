package p067l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5508 implements InterfaceC16847 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator f13160a;

    public /* synthetic */ C5508(Spliterator spliterator) {
        this.f13160a = spliterator;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC16847 m12135a(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        if (spliterator instanceof C10143) {
            return ((C10143) spliterator).f28090a;
        }
        return spliterator instanceof Spliterator.OfPrimitive ? C22943.m51261a((Spliterator.OfPrimitive) spliterator) : new C5508(spliterator);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ int characteristics() {
        return this.f13160a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator spliterator = this.f13160a;
        if (obj instanceof C5508) {
            obj = ((C5508) obj).f13160a;
        }
        return spliterator.equals(obj);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long estimateSize() {
        return this.f13160a.estimateSize();
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f13160a.forEachRemaining(consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return this.f13160a.getComparator();
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f13160a.getExactSizeIfKnown();
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f13160a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f13160a.hashCode();
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f13160a.tryAdvance(consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ InterfaceC16847 trySplit() {
        return m12135a(this.f13160a.trySplit());
    }
}
