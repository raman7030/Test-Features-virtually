package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VFO */
/* JADX INFO: loaded from: classes.dex */
public final class C23497 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f75437;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f75438;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6564 f75439;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f75440;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f75441;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f75442;

    @Override // l.InterfaceC15234
    public /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public C23497(C6564 c6564) {
        this.f75439 = c6564;
        this.f75437 = 0;
        this.f75440 = c6564.f20253;
        this.f75441 = 0;
        this.f75438 = c6564.f20256;
        this.f75442 = false;
    }

    public C23497(C6564 c6564, int i, int i2, boolean z) {
        this.f75439 = c6564;
        this.f75441 = 0;
        this.f75437 = i;
        this.f75440 = i2;
        this.f75438 = z;
        this.f75442 = true;
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        boolean z = this.f75438;
        C6564 c6564 = this.f75439;
        if (z) {
            this.f75438 = false;
            this.f75441++;
            consumer.accept(c6564.f20255[c6564.f20253]);
            return true;
        }
        Object[] objArr = c6564.f20255;
        while (true) {
            int i = this.f75437;
            if (i >= this.f75440) {
                return false;
            }
            Object obj = objArr[i];
            if (obj != null) {
                this.f75441++;
                this.f75437 = i + 1;
                consumer.accept(obj);
                return true;
            }
            this.f75437 = i + 1;
        }
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C6564 c6564 = this.f75439;
        Object[] objArr = c6564.f20255;
        if (this.f75438) {
            this.f75438 = false;
            consumer.accept(objArr[c6564.f20253]);
            this.f75441++;
        }
        while (true) {
            int i = this.f75437;
            if (i >= this.f75440) {
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                consumer.accept(obj);
                this.f75441++;
            }
            this.f75437++;
        }
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f75442 ? 1 : 65;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        boolean z = this.f75442;
        C6564 c6564 = this.f75439;
        if (!z) {
            return c6564.f20252 - this.f75441;
        }
        int i = c6564.f20252;
        long j = i - this.f75441;
        if (c6564.f20256) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c6564.f20253)) * ((double) (this.f75440 - this.f75437)))) + (this.f75438 ? 1L : 0L));
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        int i;
        int i2 = this.f75437;
        int i3 = this.f75440;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C23497 c23497 = new C23497(this.f75439, i2, i4, this.f75438);
        this.f75437 = i4;
        this.f75438 = false;
        this.f75442 = true;
        return c23497;
    }
}
