package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6893 implements InterfaceC16770, Serializable, Cloneable {
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
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
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
    @Deprecated
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }

    @Override // l.InterfaceC1124, l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return null;
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC15234 trySplit() {
        return null;
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC1124
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // l.InterfaceC1124
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return false;
    }

    public final Object clone() {
        return C16064.f49532;
    }

    private Object readResolve() {
        return C16064.f49532;
    }

    @Override // l.InterfaceC16770, l.InterfaceC15234
    public final InterfaceC1790 getComparator() {
        throw new IllegalStateException();
    }
}
