package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24561 {

    /* JADX INFO: renamed from: ۗ */
    public int f77766;

    /* JADX INFO: renamed from: ۙ */
    public boolean f77767;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C11151 f77768;

    /* JADX INFO: renamed from: ᩶ */
    public int f77769;

    /* JADX INFO: renamed from: ᩸ */
    public int f77770;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f77771;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC24561 mo35765(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo35766(int i, Object obj);

    public AbstractC24561(C11151 c11151) {
        this.f77768 = c11151;
        this.f77766 = 0;
        this.f77769 = c11151.f30923;
        this.f77770 = 0;
        this.f77767 = c11151.f30931;
        this.f77771 = false;
    }

    public AbstractC24561(C11151 c11151, int i, int i2, boolean z) {
        this.f77768 = c11151;
        this.f77770 = 0;
        this.f77766 = i;
        this.f77769 = i2;
        this.f77767 = z;
        this.f77771 = true;
    }

    public boolean tryAdvance(Consumer consumer) {
        boolean z = this.f77767;
        C11151 c11151 = this.f77768;
        if (z) {
            this.f77767 = false;
            this.f77770++;
            mo35766(c11151.f30923, consumer);
        } else {
            Object[] objArr = c11151.f30922;
            while (true) {
                int i = this.f77766;
                if (i >= this.f77769) {
                    return false;
                }
                if (objArr[i] != null) {
                    this.f77770++;
                    this.f77766 = i + 1;
                    mo35766(i, consumer);
                } else {
                    this.f77766 = i + 1;
                }
            }
        }
        return true;
    }

    public void forEachRemaining(Consumer consumer) {
        boolean z = this.f77767;
        C11151 c11151 = this.f77768;
        if (z) {
            this.f77767 = false;
            this.f77770++;
            mo35766(c11151.f30923, consumer);
        }
        Object[] objArr = c11151.f30922;
        while (true) {
            int i = this.f77766;
            if (i >= this.f77769) {
                return;
            }
            if (objArr[i] != null) {
                mo35766(i, consumer);
                this.f77770++;
            }
            this.f77766++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f77771;
        C11151 c11151 = this.f77768;
        if (!z) {
            return c11151.f30926 - this.f77770;
        }
        int i = c11151.f30926;
        long j = i - this.f77770;
        if (c11151.f30931) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c11151.f30923)) * ((double) (this.f77769 - this.f77766)))) + (this.f77767 ? 1L : 0L));
    }

    public InterfaceC16847 trySplit() {
        Object objMo35765;
        int i;
        int i2 = this.f77766;
        int i3 = this.f77769;
        if (i2 < i3 - 1 && (i = (i3 - i2) >> 1) > 1) {
            int i4 = i + i2;
            objMo35765 = mo35765(i2, i4, this.f77767);
            this.f77766 = i4;
            this.f77767 = false;
            this.f77771 = true;
        } else {
            objMo35765 = null;
        }
        return (InterfaceC16847) objMo35765;
    }
}
