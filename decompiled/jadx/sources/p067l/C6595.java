package p067l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6595 implements InterfaceC9948, Serializable, Cloneable {
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
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
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
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }

    @Override // p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC16847 trySplit() {
        return null;
    }

    public final Object clone() {
        return C11960.f33342;
    }

    private Object readResolve() {
        return C11960.f33342;
    }
}
