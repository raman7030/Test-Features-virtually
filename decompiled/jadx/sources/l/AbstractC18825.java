package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18825 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f59382;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f59383;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f59384;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f59385;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f59386;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f59387;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC18825 mo2116(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2117(int i, Object obj);

    public AbstractC18825(C5419 c5419) {
        this.f59384 = c5419;
        this.f59382 = 0;
        this.f59385 = c5419.f16902;
        this.f59386 = 0;
        this.f59383 = c5419.f16907;
        this.f59387 = false;
    }

    public AbstractC18825(C5419 c5419, int i, int i2, boolean z) {
        this.f59384 = c5419;
        this.f59386 = 0;
        this.f59382 = i;
        this.f59385 = i2;
        this.f59383 = z;
        this.f59387 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f59383;
        C5419 c5419 = this.f59384;
        if (z) {
            this.f59383 = false;
            this.f59386++;
            mo2117(c5419.f16902, obj);
            return true;
        }
        int[] iArr = c5419.f16906;
        while (true) {
            int i = this.f59382;
            if (i >= this.f59385) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f59386++;
                this.f59382 = i + 1;
                mo2117(i, obj);
                return true;
            }
            this.f59382 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f59383;
        C5419 c5419 = this.f59384;
        if (z) {
            this.f59383 = false;
            this.f59386++;
            mo2117(c5419.f16902, obj);
        }
        int[] iArr = c5419.f16906;
        while (true) {
            int i = this.f59382;
            if (i >= this.f59385) {
                return;
            }
            if (iArr[i] != 0) {
                mo2117(i, obj);
                this.f59386++;
            }
            this.f59382++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f59387;
        C5419 c5419 = this.f59384;
        if (!z) {
            return c5419.f16901 - this.f59386;
        }
        int i = c5419.f16901;
        long j = i - this.f59386;
        if (c5419.f16907) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c5419.f16902)) * ((double) (this.f59385 - this.f59382)))) + (this.f59383 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC18825 m43487trySplit() {
        int i;
        int i2 = this.f59382;
        int i3 = this.f59385;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC18825 abstractC18825Mo2116 = mo2116(i2, i4, this.f59383);
        this.f59382 = i4;
        this.f59383 = false;
        this.f59387 = true;
        return abstractC18825Mo2116;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15234 m43485trySplit() {
        return (InterfaceC15234) m43487trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return (InterfaceC1124) m43487trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18764 m43486trySplit() {
        return (InterfaceC18764) m43487trySplit();
    }
}
