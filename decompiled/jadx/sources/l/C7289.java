package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7289 extends AbstractC16169 implements InterfaceC15234 {
    @Override // l.InterfaceC15234
    public final /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        C11003.requireNonNull(consumer);
        return false;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C11003.requireNonNull(consumer);
    }
}
