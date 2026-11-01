package p067l;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13635 implements InterfaceC16847 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC16847 f38385a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f38386b;

    /* JADX INFO: renamed from: c */
    public boolean f38387c;

    /* JADX INFO: renamed from: d */
    public int f38388d;

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC16847 mo21942b(InterfaceC16847 interfaceC16847);

    @Override // p067l.InterfaceC16847
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C4779.$default$forEachRemaining(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public AbstractC13635(InterfaceC16847 interfaceC16847) {
        this.f38387c = true;
        this.f38385a = interfaceC16847;
        this.f38386b = new AtomicBoolean();
    }

    public AbstractC13635(InterfaceC16847 interfaceC16847, AbstractC13635 abstractC13635) {
        this.f38387c = true;
        this.f38385a = interfaceC16847;
        this.f38386b = abstractC13635.f38386b;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f38385a.estimateSize();
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f38385a.characteristics() & (-16449);
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        return this.f38385a.getComparator();
    }

    @Override // p067l.InterfaceC16847
    public InterfaceC16847 trySplit() {
        InterfaceC16847 interfaceC16847TrySplit = this.f38385a.trySplit();
        if (interfaceC16847TrySplit != null) {
            return mo21942b(interfaceC16847TrySplit);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m31013a() {
        return (this.f38388d == 0 && this.f38386b.get()) ? false : true;
    }

    @Override // p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC20202 trySplit() {
        return (InterfaceC20202) trySplit();
    }

    @Override // p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC2766 trySplit() {
        return (InterfaceC2766) trySplit();
    }

    @Override // p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return (InterfaceC3437) trySplit();
    }

    @Override // p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC10124 trySplit() {
        return (InterfaceC10124) trySplit();
    }
}
