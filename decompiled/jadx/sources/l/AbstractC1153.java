package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAPP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1153 implements InterfaceC16770 {
    @Override // l.InterfaceC1124
    public /* synthetic */ void forEachRemaining(Object obj) {
        C5358.$default$forEachRemaining(this, obj);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11127.m27611(this, consumer);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11127.m27612(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC15234 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16770, l.InterfaceC15234
    public final InterfaceC1790 getComparator() {
        throw new IllegalStateException();
    }
}
