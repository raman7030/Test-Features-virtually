package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3303 implements InterfaceC15234 {
    public final /* synthetic */ Spliterator a;

    public /* synthetic */ C3303(Spliterator spliterator) {
        this.a = spliterator;
    }

    public static /* synthetic */ InterfaceC15234 a(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        if (spliterator instanceof C8180) {
            return ((C8180) spliterator).a;
        }
        return spliterator instanceof Spliterator.OfPrimitive ? C21648.a((Spliterator.OfPrimitive) spliterator) : new C3303(spliterator);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator spliterator = this.a;
        if (obj instanceof C3303) {
            obj = ((C3303) obj).a;
        }
        return spliterator.equals(obj);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
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

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ InterfaceC15234 trySplit() {
        return a(this.a.trySplit());
    }
}
