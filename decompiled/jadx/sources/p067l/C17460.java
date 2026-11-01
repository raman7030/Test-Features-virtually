package p067l;

import com.umeng.analytics.pro.C0719o;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17460 extends C16789 implements InterfaceC16847 {

    /* JADX INFO: renamed from: i */
    public final ConcurrentMapC12768 f52199i;

    /* JADX INFO: renamed from: j */
    public long f52200j;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return C0719o.a.f2906l;
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

    public C17460(C2708[] c2708Arr, int i, int i2, int i3, long j, ConcurrentMapC12768 concurrentMapC12768) {
        super(c2708Arr, i, i2, i3);
        this.f52199i = concurrentMapC12768;
        this.f52200j = j;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        int i = this.f49477f;
        int i2 = this.f49478g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        C2708[] c2708Arr = this.f49472a;
        this.f49478g = i3;
        long j = this.f52200j >>> 1;
        this.f52200j = j;
        return new C17460(c2708Arr, this.f49479h, i3, i2, j, this.f52199i);
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            C2708 c2708M38035a = m38035a();
            if (c2708M38035a == null) {
                return;
            } else {
                consumer.accept(new C20815(c2708M38035a.f4545b, c2708M38035a.f4546c, this.f52199i));
            }
        }
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        C2708 c2708M38035a = m38035a();
        if (c2708M38035a == null) {
            return false;
        }
        consumer.accept(new C20815(c2708M38035a.f4545b, c2708M38035a.f4546c, this.f52199i));
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f52200j;
    }
}
