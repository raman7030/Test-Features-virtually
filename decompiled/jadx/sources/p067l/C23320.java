package p067l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩹ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes2.dex */
public final class C23320 implements InterfaceC3202, Serializable, Cloneable {
    public static final long serialVersionUID = 8379247926738230492L;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16448;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return 0L;
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // p067l.InterfaceC2766
    public final void forEachRemaining(LongConsumer longConsumer) {
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    @Deprecated
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }

    @Override // p067l.InterfaceC2766
    public final boolean tryAdvance(LongConsumer longConsumer) {
        return false;
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC2766 trySplit() {
        return null;
    }

    @Override // p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return null;
    }

    @Override // p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC16847 trySplit() {
        return null;
    }

    @Override // p067l.InterfaceC3437
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // p067l.InterfaceC3437
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return false;
    }

    public final Object clone() {
        return C5215.f12242;
    }

    private Object readResolve() {
        return C5215.f12242;
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
