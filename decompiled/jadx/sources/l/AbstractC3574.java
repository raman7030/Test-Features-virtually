package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3574 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f11328;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11329;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10630 f11330;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f11331;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f11332;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f11333;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC3574 mo10889(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo10890(int i, Object obj);

    public AbstractC3574(C10630 c10630) {
        this.f11330 = c10630;
        this.f11328 = 0;
        this.f11331 = c10630.f31939;
        this.f11332 = 0;
        this.f11329 = c10630.f31944;
        this.f11333 = false;
    }

    public AbstractC3574(C10630 c10630, int i, int i2, boolean z) {
        this.f11330 = c10630;
        this.f11332 = 0;
        this.f11328 = i;
        this.f11331 = i2;
        this.f11329 = z;
        this.f11333 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f11329;
        C10630 c10630 = this.f11330;
        if (z) {
            this.f11329 = false;
            this.f11332++;
            mo10890(c10630.f31939, obj);
            return true;
        }
        int[] iArr = c10630.f31934;
        while (true) {
            int i = this.f11328;
            if (i >= this.f11331) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f11332++;
                this.f11328 = i + 1;
                mo10890(i, obj);
                return true;
            }
            this.f11328 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f11329;
        C10630 c10630 = this.f11330;
        if (z) {
            this.f11329 = false;
            this.f11332++;
            mo10890(c10630.f31939, obj);
        }
        int[] iArr = c10630.f31934;
        while (true) {
            int i = this.f11328;
            if (i >= this.f11331) {
                return;
            }
            if (iArr[i] != 0) {
                mo10890(i, obj);
                this.f11332++;
            }
            this.f11328++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f11333;
        C10630 c10630 = this.f11330;
        if (!z) {
            return c10630.f31945 - this.f11332;
        }
        int i = c10630.f31945;
        long j = i - this.f11332;
        if (c10630.f31944) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c10630.f31939)) * ((double) (this.f11331 - this.f11328)))) + (this.f11329 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC3574 m10891trySplit() {
        int i;
        int i2 = this.f11328;
        int i3 = this.f11331;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC3574 abstractC3574Mo10889 = mo10889(i2, i4, this.f11329);
        this.f11328 = i4;
        this.f11329 = false;
        this.f11333 = true;
        return abstractC3574Mo10889;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15234 m10892trySplit() {
        return (InterfaceC15234) m10891trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return (InterfaceC1124) m10891trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18764 m10893trySplit() {
        return (InterfaceC18764) m10891trySplit();
    }
}
