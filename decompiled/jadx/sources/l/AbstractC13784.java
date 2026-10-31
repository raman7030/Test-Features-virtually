package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13784 implements InterfaceC15234 {
    public int a;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 17488;
    }

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
    public final InterfaceC15234 trySplit() {
        return null;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return (-this.a) - 1;
    }
}
