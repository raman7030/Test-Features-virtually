package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4584 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۗ */
    public int f10264;

    /* JADX INFO: renamed from: ۙ */
    public boolean f10265;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C5925 f10266;

    /* JADX INFO: renamed from: ᩶ */
    public int f10267;

    /* JADX INFO: renamed from: ᩸ */
    public int f10268;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f10269;

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

    public C4584(C5925 c5925) {
        this.f10266 = c5925;
        this.f10264 = 0;
        this.f10267 = c5925.f14624;
        this.f10268 = 0;
        this.f10265 = c5925.f14627;
        this.f10269 = false;
    }

    public C4584(C5925 c5925, int i, int i2, boolean z) {
        this.f10266 = c5925;
        this.f10268 = 0;
        this.f10264 = i;
        this.f10267 = i2;
        this.f10265 = z;
        this.f10269 = true;
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        boolean z = this.f10265;
        C5925 c5925 = this.f10266;
        if (z) {
            this.f10265 = false;
            this.f10268++;
            consumer.accept(c5925.f14626[c5925.f14624]);
            return true;
        }
        Object[] objArr = c5925.f14626;
        while (true) {
            int i = this.f10264;
            if (i >= this.f10267) {
                return false;
            }
            Object obj = objArr[i];
            if (obj != null) {
                this.f10268++;
                this.f10264 = i + 1;
                consumer.accept(obj);
                return true;
            }
            this.f10264 = i + 1;
        }
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C5925 c5925 = this.f10266;
        Object[] objArr = c5925.f14626;
        if (this.f10265) {
            this.f10265 = false;
            consumer.accept(objArr[c5925.f14624]);
            this.f10268++;
        }
        while (true) {
            int i = this.f10264;
            if (i >= this.f10267) {
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                consumer.accept(obj);
                this.f10268++;
            }
            this.f10264++;
        }
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f10269 ? 1 : 65;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        boolean z = this.f10269;
        C5925 c5925 = this.f10266;
        if (!z) {
            return c5925.f14623 - this.f10268;
        }
        int i = c5925.f14623;
        long j = i - this.f10268;
        if (c5925.f14627) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c5925.f14624)) * ((double) (this.f10267 - this.f10264)))) + (this.f10265 ? 1L : 0L));
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        int i;
        int i2 = this.f10264;
        int i3 = this.f10267;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C4584 c4584 = new C4584(this.f10266, i2, i4, this.f10265);
        this.f10264 = i4;
        this.f10265 = false;
        this.f10269 = true;
        return c4584;
    }
}
