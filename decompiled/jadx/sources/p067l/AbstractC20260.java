package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20260 {

    /* JADX INFO: renamed from: ۗ */
    public int f62609;

    /* JADX INFO: renamed from: ۙ */
    public boolean f62610;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C7519 f62611;

    /* JADX INFO: renamed from: ᩶ */
    public int f62612;

    /* JADX INFO: renamed from: ᩸ */
    public int f62613;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f62614;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC20260 mo4497(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo4498(int i, Object obj);

    public AbstractC20260(C7519 c7519) {
        this.f62611 = c7519;
        this.f62609 = 0;
        this.f62612 = c7519.f19740;
        this.f62613 = 0;
        this.f62610 = c7519.f19745;
        this.f62614 = false;
    }

    public AbstractC20260(C7519 c7519, int i, int i2, boolean z) {
        this.f62611 = c7519;
        this.f62613 = 0;
        this.f62609 = i;
        this.f62612 = i2;
        this.f62610 = z;
        this.f62614 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f62610;
        C7519 c7519 = this.f62611;
        if (z) {
            this.f62610 = false;
            this.f62613++;
            mo4498(c7519.f19740, obj);
            return true;
        }
        int[] iArr = c7519.f19744;
        while (true) {
            int i = this.f62609;
            if (i >= this.f62612) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f62613++;
                this.f62609 = i + 1;
                mo4498(i, obj);
                return true;
            }
            this.f62609 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f62610;
        C7519 c7519 = this.f62611;
        if (z) {
            this.f62610 = false;
            this.f62613++;
            mo4498(c7519.f19740, obj);
        }
        int[] iArr = c7519.f19744;
        while (true) {
            int i = this.f62609;
            if (i >= this.f62612) {
                return;
            }
            if (iArr[i] != 0) {
                mo4498(i, obj);
                this.f62613++;
            }
            this.f62609++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f62614;
        C7519 c7519 = this.f62611;
        if (!z) {
            return c7519.f19739 - this.f62613;
        }
        int i = c7519.f19739;
        long j = i - this.f62613;
        if (c7519.f19745) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c7519.f19740)) * ((double) (this.f62612 - this.f62609)))) + (this.f62610 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC20260 m56544trySplit() {
        int i;
        int i2 = this.f62609;
        int i3 = this.f62612;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC20260 abstractC20260Mo4497 = mo4497(i2, i4, this.f62610);
        this.f62609 = i4;
        this.f62610 = false;
        this.f62614 = true;
        return abstractC20260Mo4497;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC16847 m56542trySplit() {
        return (InterfaceC16847) m56544trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return (InterfaceC3437) m56544trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20202 m56543trySplit() {
        return (InterfaceC20202) m56544trySplit();
    }
}
