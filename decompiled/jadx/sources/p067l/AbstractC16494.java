package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܳ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16494 {

    /* JADX INFO: renamed from: ۗ */
    public int f48447;

    /* JADX INFO: renamed from: ۙ */
    public boolean f48448;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C22531 f48449;

    /* JADX INFO: renamed from: ᩶ */
    public int f48450;

    /* JADX INFO: renamed from: ᩸ */
    public int f48451;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f48452;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC16494 mo21062(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21063(int i, Object obj);

    public AbstractC16494(C22531 c22531) {
        this.f48449 = c22531;
        this.f48447 = 0;
        this.f48450 = c22531.f71031;
        this.f48451 = 0;
        this.f48448 = c22531.f71036;
        this.f48452 = false;
    }

    public AbstractC16494(C22531 c22531, int i, int i2, boolean z) {
        this.f48449 = c22531;
        this.f48451 = 0;
        this.f48447 = i;
        this.f48450 = i2;
        this.f48448 = z;
        this.f48452 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f48448;
        C22531 c22531 = this.f48449;
        if (z) {
            this.f48448 = false;
            this.f48451++;
            mo21063(c22531.f71031, obj);
            return true;
        }
        int[] iArr = c22531.f71035;
        while (true) {
            int i = this.f48447;
            if (i >= this.f48450) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f48451++;
                this.f48447 = i + 1;
                mo21063(i, obj);
                return true;
            }
            this.f48447 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f48448;
        C22531 c22531 = this.f48449;
        if (z) {
            this.f48448 = false;
            this.f48451++;
            mo21063(c22531.f71031, obj);
        }
        int[] iArr = c22531.f71035;
        while (true) {
            int i = this.f48447;
            if (i >= this.f48450) {
                return;
            }
            if (iArr[i] != 0) {
                mo21063(i, obj);
                this.f48451++;
            }
            this.f48447++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f48452;
        C22531 c22531 = this.f48449;
        if (!z) {
            return c22531.f71030 - this.f48451;
        }
        int i = c22531.f71030;
        long j = i - this.f48451;
        if (c22531.f71036) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c22531.f71031)) * ((double) (this.f48450 - this.f48447)))) + (this.f48448 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC16494 m56496trySplit() {
        int i;
        int i2 = this.f48447;
        int i3 = this.f48450;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC16494 abstractC16494Mo21062 = mo21062(i2, i4, this.f48448);
        this.f48447 = i4;
        this.f48448 = false;
        this.f48452 = true;
        return abstractC16494Mo21062;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC16847 m56497trySplit() {
        return (InterfaceC16847) m56496trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return (InterfaceC3437) m56496trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20202 m56498trySplit() {
        return (InterfaceC20202) m56496trySplit();
    }
}
