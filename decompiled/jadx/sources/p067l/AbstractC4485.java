package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4485 {

    /* JADX INFO: renamed from: ۗ */
    public int f10069;

    /* JADX INFO: renamed from: ۙ */
    public boolean f10070;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C20579 f10071;

    /* JADX INFO: renamed from: ᩶ */
    public int f10072;

    /* JADX INFO: renamed from: ᩸ */
    public int f10073;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f10074;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC4485 mo9490(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9491(int i, Object obj);

    public AbstractC4485(C20579 c20579) {
        this.f10071 = c20579;
        this.f10069 = 0;
        this.f10072 = c20579.f63608;
        this.f10073 = 0;
        this.f10070 = c20579.f63615;
        this.f10074 = false;
    }

    public AbstractC4485(C20579 c20579, int i, int i2, boolean z) {
        this.f10071 = c20579;
        this.f10073 = 0;
        this.f10069 = i;
        this.f10072 = i2;
        this.f10070 = z;
        this.f10074 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f10070;
        C20579 c20579 = this.f10071;
        if (z) {
            this.f10070 = false;
            this.f10073++;
            mo9491(c20579.f63608, obj);
            return true;
        }
        char[] cArr = c20579.f63607;
        while (true) {
            int i = this.f10069;
            if (i >= this.f10072) {
                return false;
            }
            if (cArr[i] != 0) {
                this.f10073++;
                this.f10069 = i + 1;
                mo9491(i, obj);
                return true;
            }
            this.f10069 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f10070;
        C20579 c20579 = this.f10071;
        if (z) {
            this.f10070 = false;
            this.f10073++;
            mo9491(c20579.f63608, obj);
        }
        char[] cArr = c20579.f63607;
        while (true) {
            int i = this.f10069;
            if (i >= this.f10072) {
                return;
            }
            if (cArr[i] != 0) {
                mo9491(i, obj);
                this.f10073++;
            }
            this.f10069++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f10074;
        C20579 c20579 = this.f10071;
        if (!z) {
            return c20579.f63610 - this.f10073;
        }
        int i = c20579.f63610;
        long j = i - this.f10073;
        if (c20579.f63615) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c20579.f63608)) * ((double) (this.f10072 - this.f10069)))) + (this.f10070 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC4485 m56020trySplit() {
        int i;
        int i2 = this.f10069;
        int i3 = this.f10072;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC4485 abstractC4485Mo9490 = mo9490(i2, i4, this.f10070);
        this.f10069 = i4;
        this.f10070 = false;
        this.f10074 = true;
        return abstractC4485Mo9490;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC16847 m56021trySplit() {
        return (InterfaceC16847) m56020trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return (InterfaceC3437) m56020trySplit();
    }
}
