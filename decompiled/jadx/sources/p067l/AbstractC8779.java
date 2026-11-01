package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8779 implements InterfaceC16847 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC16847 f23822;

    /* JADX INFO: renamed from: ᩹ */
    public long f23823;

    @Override // p067l.InterfaceC16847
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C4779.$default$forEachRemaining(this, consumer);
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

    public AbstractC8779(InterfaceC16847 interfaceC16847, long j) {
        this.f23822 = interfaceC16847;
        this.f23823 = j;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        InterfaceC16847 interfaceC16847TrySplit = this.f23822.trySplit();
        if (interfaceC16847TrySplit == null) {
            return null;
        }
        long j = this.f23823;
        C16154 c16154 = new C16154(interfaceC16847TrySplit, j, ((C16154) this).f47574);
        this.f23823 = interfaceC16847TrySplit.getExactSizeIfKnown() + j;
        return c16154;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f23822.estimateSize();
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f23822.characteristics() & 16464;
    }
}
