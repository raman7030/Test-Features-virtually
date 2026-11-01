package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13615 implements InterfaceC16847, Consumer {

    /* JADX INFO: renamed from: d */
    public static final Object f38304d = new Object();

    /* JADX INFO: renamed from: a */
    public final InterfaceC16847 f38305a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentMapC12768 f38306b;

    /* JADX INFO: renamed from: c */
    public Object f38307c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public C13615(InterfaceC16847 interfaceC16847, ConcurrentMapC12768 concurrentMapC12768) {
        this.f38305a = interfaceC16847;
        this.f38306b = concurrentMapC12768;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f38307c = obj;
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f38305a.tryAdvance(this)) {
            Object obj = this.f38307c;
            if (obj == null) {
                obj = f38304d;
            }
            if (this.f38306b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f38307c);
                this.f38307c = null;
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        this.f38305a.forEachRemaining(new C12233(8, this, consumer));
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        InterfaceC16847 interfaceC16847TrySplit = this.f38305a.trySplit();
        if (interfaceC16847TrySplit != null) {
            return new C13615(interfaceC16847TrySplit, this.f38306b);
        }
        return null;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f38305a.estimateSize();
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return (this.f38305a.characteristics() & (-16469)) | 1;
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        return this.f38305a.getComparator();
    }
}
