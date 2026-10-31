package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8180 implements Spliterator {
    public final /* synthetic */ InterfaceC15234 a;

    public /* synthetic */ C8180(InterfaceC15234 interfaceC15234) {
        this.a = interfaceC15234;
    }

    public static /* synthetic */ Spliterator convert(InterfaceC15234 interfaceC15234) {
        if (interfaceC15234 == null) {
            return null;
        }
        if (interfaceC15234 instanceof C3303) {
            return ((C3303) interfaceC15234).a;
        }
        return interfaceC15234 instanceof InterfaceC1124 ? C20237.a((InterfaceC1124) interfaceC15234) : new C8180(interfaceC15234);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC15234 interfaceC15234 = this.a;
        if (obj instanceof C8180) {
            obj = ((C8180) obj).a;
        }
        return interfaceC15234.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return convert(this.a.trySplit());
    }
}
