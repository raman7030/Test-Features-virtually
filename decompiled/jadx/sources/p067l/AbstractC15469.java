package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15469 implements InterfaceC16847 {

    /* JADX INFO: renamed from: a */
    public int f44175a;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 17488;
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        return null;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return (-this.f44175a) - 1;
    }
}
