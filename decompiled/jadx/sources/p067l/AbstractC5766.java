package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5766 {

    /* JADX INFO: renamed from: ۗ */
    public int f14134;

    /* JADX INFO: renamed from: ۙ */
    public boolean f14135;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C12472 f14136;

    /* JADX INFO: renamed from: ᩶ */
    public int f14137;

    /* JADX INFO: renamed from: ᩸ */
    public int f14138;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f14139;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC5766 mo12869(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12870(int i, Object obj);

    public AbstractC5766(C12472 c12472) {
        this.f14136 = c12472;
        this.f14134 = 0;
        this.f14137 = c12472.f34911;
        this.f14138 = 0;
        this.f14135 = c12472.f34916;
        this.f14139 = false;
    }

    public AbstractC5766(C12472 c12472, int i, int i2, boolean z) {
        this.f14136 = c12472;
        this.f14138 = 0;
        this.f14134 = i;
        this.f14137 = i2;
        this.f14135 = z;
        this.f14139 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f14135;
        C12472 c12472 = this.f14136;
        if (z) {
            this.f14135 = false;
            this.f14138++;
            mo12870(c12472.f34911, obj);
            return true;
        }
        int[] iArr = c12472.f34906;
        while (true) {
            int i = this.f14134;
            if (i >= this.f14137) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f14138++;
                this.f14134 = i + 1;
                mo12870(i, obj);
                return true;
            }
            this.f14134 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f14135;
        C12472 c12472 = this.f14136;
        if (z) {
            this.f14135 = false;
            this.f14138++;
            mo12870(c12472.f34911, obj);
        }
        int[] iArr = c12472.f34906;
        while (true) {
            int i = this.f14134;
            if (i >= this.f14137) {
                return;
            }
            if (iArr[i] != 0) {
                mo12870(i, obj);
                this.f14138++;
            }
            this.f14134++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f14139;
        C12472 c12472 = this.f14136;
        if (!z) {
            return c12472.f34917 - this.f14138;
        }
        int i = c12472.f34917;
        long j = i - this.f14138;
        if (c12472.f34916) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c12472.f34911)) * ((double) (this.f14137 - this.f14134)))) + (this.f14135 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC5766 m56198trySplit() {
        int i;
        int i2 = this.f14134;
        int i3 = this.f14137;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC5766 abstractC5766Mo12869 = mo12869(i2, i4, this.f14135);
        this.f14134 = i4;
        this.f14135 = false;
        this.f14139 = true;
        return abstractC5766Mo12869;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC16847 m56199trySplit() {
        return (InterfaceC16847) m56198trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return (InterfaceC3437) m56198trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20202 m56200trySplit() {
        return (InterfaceC20202) m56198trySplit();
    }
}
