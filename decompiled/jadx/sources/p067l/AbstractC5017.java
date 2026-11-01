package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۖ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5017 {

    /* JADX INFO: renamed from: ۗ */
    public int f11476;

    /* JADX INFO: renamed from: ۙ */
    public boolean f11477;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C21111 f11478;

    /* JADX INFO: renamed from: ᩶ */
    public int f11479;

    /* JADX INFO: renamed from: ᩸ */
    public int f11480;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f11481;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC5017 mo10675(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10676(int i, Object obj);

    public AbstractC5017(C21111 c21111) {
        this.f11478 = c21111;
        this.f11476 = 0;
        this.f11479 = c21111.f66361;
        this.f11480 = 0;
        this.f11477 = c21111.f66368;
        this.f11481 = false;
    }

    public AbstractC5017(C21111 c21111, int i, int i2, boolean z) {
        this.f11478 = c21111;
        this.f11480 = 0;
        this.f11476 = i;
        this.f11479 = i2;
        this.f11477 = z;
        this.f11481 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f11477;
        C21111 c21111 = this.f11478;
        if (z) {
            this.f11477 = false;
            this.f11480++;
            mo10676(c21111.f66361, obj);
            return true;
        }
        int[] iArr = c21111.f66360;
        while (true) {
            int i = this.f11476;
            if (i >= this.f11479) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f11480++;
                this.f11476 = i + 1;
                mo10676(i, obj);
                return true;
            }
            this.f11476 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f11477;
        C21111 c21111 = this.f11478;
        if (z) {
            this.f11477 = false;
            this.f11480++;
            mo10676(c21111.f66361, obj);
        }
        int[] iArr = c21111.f66360;
        while (true) {
            int i = this.f11476;
            if (i >= this.f11479) {
                return;
            }
            if (iArr[i] != 0) {
                mo10676(i, obj);
                this.f11480++;
            }
            this.f11476++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f11481;
        C21111 c21111 = this.f11478;
        if (!z) {
            return c21111.f66363 - this.f11480;
        }
        int i = c21111.f66363;
        long j = i - this.f11480;
        if (c21111.f66368) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c21111.f66361)) * ((double) (this.f11479 - this.f11476)))) + (this.f11477 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC5017 m56081trySplit() {
        int i;
        int i2 = this.f11476;
        int i3 = this.f11479;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC5017 abstractC5017Mo10675 = mo10675(i2, i4, this.f11477);
        this.f11476 = i4;
        this.f11477 = false;
        this.f11481 = true;
        return abstractC5017Mo10675;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC16847 m56082trySplit() {
        return (InterfaceC16847) m56081trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return (InterfaceC3437) m56081trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20202 m56083trySplit() {
        return (InterfaceC20202) m56081trySplit();
    }
}
