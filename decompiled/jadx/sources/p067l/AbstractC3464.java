package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAPP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3464 implements InterfaceC18307 {
    @Override // p067l.InterfaceC3437
    public /* synthetic */ void forEachRemaining(Object obj) {
        C7461.$default$forEachRemaining(this, obj);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12944.m29673(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C12944.m29674(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC16847 trySplit() {
        return trySplit();
    }

    @Override // p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // p067l.InterfaceC18307, p067l.InterfaceC16847
    public final InterfaceC4070 getComparator() {
        throw new IllegalStateException();
    }
}
