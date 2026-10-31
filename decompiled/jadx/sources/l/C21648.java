package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21648 implements InterfaceC1124 {
    public final /* synthetic */ Spliterator.OfPrimitive a;

    public /* synthetic */ C21648(Spliterator.OfPrimitive ofPrimitive) {
        this.a = ofPrimitive;
    }

    public static /* synthetic */ InterfaceC1124 a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof C20237) {
            return ((C20237) ofPrimitive).a;
        }
        if (ofPrimitive instanceof Spliterator.OfDouble) {
            return C19450.a((Spliterator.OfDouble) ofPrimitive);
        }
        if (ofPrimitive instanceof Spliterator.OfInt) {
            return C21566.a((Spliterator.OfInt) ofPrimitive);
        }
        return ofPrimitive instanceof Spliterator.OfLong ? C3221.a((Spliterator.OfLong) ofPrimitive) : new C21648(ofPrimitive);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.a;
        if (obj instanceof C21648) {
            obj = ((C21648) obj).a;
        }
        return ofPrimitive.equals(obj);
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

    @Override // l.InterfaceC1124
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // l.InterfaceC1124, l.InterfaceC15234
    public final /* synthetic */ InterfaceC1124 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ InterfaceC15234 trySplit() {
        return C3303.a(this.a.trySplit());
    }
}
