package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩹ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes2.dex */
public final class C22045 implements InterfaceC0877, Serializable, Cloneable {
    public static final long serialVersionUID = 8379247926738230492L;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16448;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return 0L;
    }

    @Override // l.InterfaceC0418, l.InterfaceC15234
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC0418
    public final void forEachRemaining(LongConsumer longConsumer) {
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC0418, l.InterfaceC15234
    @Deprecated
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }

    @Override // l.InterfaceC0418
    public final boolean tryAdvance(LongConsumer longConsumer) {
        return false;
    }

    @Override // l.InterfaceC0418, l.InterfaceC1124, l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC0418 trySplit() {
        return null;
    }

    @Override // l.InterfaceC1124, l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return null;
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC15234 trySplit() {
        return null;
    }

    @Override // l.InterfaceC1124
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // l.InterfaceC1124
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return false;
    }

    public final Object clone() {
        return C2995.f9443;
    }

    private Object readResolve() {
        return C2995.f9443;
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
