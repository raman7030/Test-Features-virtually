package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۤۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DC36 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10195 implements InterfaceC16749 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f30632;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f30633;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5961 f30634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f30635;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30636;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f30637;

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11106.m27535(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11106.m27536(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16749, l.InterfaceC15234
    public final InterfaceC4571 getComparator() {
        throw new IllegalStateException();
    }

    public C10195(C5961 c5961) {
        this.f30634 = c5961;
        this.f30632 = 0;
        this.f30635 = c5961.f18277;
        this.f30636 = 0;
        this.f30633 = c5961.f18280;
        this.f30637 = false;
    }

    public C10195(C5961 c5961, int i, int i2, boolean z) {
        this.f30634 = c5961;
        this.f30636 = 0;
        this.f30632 = i;
        this.f30635 = i2;
        this.f30633 = z;
        this.f30637 = true;
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean z = this.f30633;
        C5961 c5961 = this.f30634;
        if (z) {
            this.f30633 = false;
            this.f30636++;
            intConsumer.accept(c5961.f18279[c5961.f18277]);
            return true;
        }
        int[] iArr = c5961.f18279;
        while (true) {
            int i = this.f30632;
            if (i >= this.f30635) {
                return false;
            }
            int i2 = iArr[i];
            if (i2 != 0) {
                this.f30636++;
                this.f30632 = i + 1;
                intConsumer.accept(i2);
                return true;
            }
            this.f30632 = i + 1;
        }
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        C5961 c5961 = this.f30634;
        int[] iArr = c5961.f18279;
        if (this.f30633) {
            this.f30633 = false;
            intConsumer.accept(iArr[c5961.f18277]);
            this.f30636++;
        }
        while (true) {
            int i = this.f30632;
            if (i >= this.f30635) {
                return;
            }
            int i2 = iArr[i];
            if (i2 != 0) {
                intConsumer.accept(i2);
                this.f30636++;
            }
            this.f30632++;
        }
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f30637 ? 257 : 321;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        boolean z = this.f30637;
        C5961 c5961 = this.f30634;
        if (!z) {
            return c5961.f18276 - this.f30636;
        }
        int i = c5961.f18276;
        long j = i - this.f30636;
        if (c5961.f18280) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c5961.f18277)) * ((double) (this.f30635 - this.f30632)))) + (this.f30633 ? 1L : 0L));
    }

    @Override // l.InterfaceC18764, l.InterfaceC1124, l.InterfaceC15234
    public final C10195 trySplit() {
        int i;
        int i2 = this.f30632;
        int i3 = this.f30635;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C10195 c10195 = new C10195(this.f30634, i2, i4, this.f30633);
        this.f30632 = i4;
        this.f30633 = false;
        this.f30637 = true;
        return c10195;
    }
}
