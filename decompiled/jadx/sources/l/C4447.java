package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes3.dex */
public final class C4447 implements InterfaceC7975, Serializable, Cloneable {
    public static final long serialVersionUID = 8379247926738230492L;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16448;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return 0L;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC15234 trySplit() {
        return null;
    }

    public final Object clone() {
        return C10092.f30382;
    }

    private Object readResolve() {
        return C10092.f30382;
    }
}
