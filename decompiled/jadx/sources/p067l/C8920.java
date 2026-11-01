package p067l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8920 implements InterfaceC18307, Serializable, Cloneable {
    public static final long serialVersionUID = 8379247926738230492L;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16448;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return 0L;
    }

    @Override // p067l.InterfaceC16847
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
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
    @Deprecated
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }

    @Override // p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return null;
    }

    @Override // p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC16847 trySplit() {
        return null;
    }

    @Override // p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // p067l.InterfaceC3437
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // p067l.InterfaceC3437
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return false;
    }

    public final Object clone() {
        return C17636.f52695;
    }

    private Object readResolve() {
        return C17636.f52695;
    }

    @Override // p067l.InterfaceC18307, p067l.InterfaceC16847
    public final InterfaceC4070 getComparator() {
        throw new IllegalStateException();
    }
}
