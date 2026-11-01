package p067l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22943 implements InterfaceC3437 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator.OfPrimitive f72187a;

    public /* synthetic */ C22943(Spliterator.OfPrimitive ofPrimitive) {
        this.f72187a = ofPrimitive;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC3437 m51261a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof C21602) {
            return ((C21602) ofPrimitive).f68091a;
        }
        if (ofPrimitive instanceof Spliterator.OfDouble) {
            return C20854.m47082a((Spliterator.OfDouble) ofPrimitive);
        }
        if (ofPrimitive instanceof Spliterator.OfInt) {
            return C22865.m51071a((Spliterator.OfInt) ofPrimitive);
        }
        return ofPrimitive instanceof Spliterator.OfLong ? C5430.m11938a((Spliterator.OfLong) ofPrimitive) : new C22943(ofPrimitive);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ int characteristics() {
        return this.f72187a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.f72187a;
        if (obj instanceof C22943) {
            obj = ((C22943) obj).f72187a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long estimateSize() {
        return this.f72187a.estimateSize();
    }

    @Override // p067l.InterfaceC3437
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f72187a.forEachRemaining(obj);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f72187a.forEachRemaining(consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return this.f72187a.getComparator();
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f72187a.getExactSizeIfKnown();
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f72187a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f72187a.hashCode();
    }

    @Override // p067l.InterfaceC3437
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f72187a.tryAdvance(obj);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f72187a.tryAdvance(consumer);
    }

    @Override // p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* synthetic */ InterfaceC3437 trySplit() {
        return m51261a(this.f72187a.trySplit());
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ InterfaceC16847 trySplit() {
        return C5508.m12135a(this.f72187a.trySplit());
    }
}
