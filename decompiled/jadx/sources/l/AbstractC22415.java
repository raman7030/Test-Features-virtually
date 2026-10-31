package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAP5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC22415 implements InterfaceC16791 {
    @Override // l.InterfaceC1124
    public /* synthetic */ void forEachRemaining(Object obj) {
        C5358.$default$forEachRemaining(this, obj);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11148.m27665(this, consumer);
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
        return C11148.m27666(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC15234 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
