package l;

import com.umeng.analytics.pro.o;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15879 extends C15173 implements InterfaceC15234 {
    public final ConcurrentMapC10942 i;
    public long j;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return o.a.f77939l;
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

    public C15879(C0357[] c0357Arr, int i, int i2, int i3, long j, ConcurrentMapC10942 concurrentMapC10942) {
        super(c0357Arr, i, i2, i3);
        this.i = concurrentMapC10942;
        this.j = j;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        int i = this.f;
        int i2 = this.g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        C0357[] c0357Arr = this.a;
        this.g = i3;
        long j = this.j >>> 1;
        this.j = j;
        return new C15879(c0357Arr, this.h, i3, i2, j, this.i);
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            C0357 c0357A = a();
            if (c0357A == null) {
                return;
            } else {
                consumer.accept(new C19409(c0357A.b, c0357A.c, this.i));
            }
        }
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        C0357 c0357A = a();
        if (c0357A == null) {
            return false;
        }
        consumer.accept(new C19409(c0357A.b, c0357A.c, this.i));
        return true;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.j;
    }
}
