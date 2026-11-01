package p067l;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֡ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8QT */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2918 implements InterfaceC11617 {

    /* JADX INFO: renamed from: ֫ */
    public final long[] f5060;

    /* JADX INFO: renamed from: ۧ */
    public final C10307[] f5061;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f5062;

    /* JADX INFO: renamed from: ܽ */
    public final C15020 f5063;

    /* JADX INFO: renamed from: ܿ */
    public final int f5064;

    /* JADX INFO: renamed from: ᩳ */
    public int f5065;

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ֫ */
    public void mo4749(float f) {
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ֫ */
    public final void mo4750(boolean z) {
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ boolean mo4752(long j, AbstractC9584 abstractC9584, List list) {
        return false;
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ void mo4754() {
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ܳ */
    public void mo4757() {
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo4758() {
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ᩳ */
    public void mo4760() {
    }

    public AbstractC2918(C15020 c15020, int[] iArr) {
        int i = 0;
        C23877.m52960(iArr.length > 0);
        c15020.getClass();
        this.f5063 = c15020;
        int length = iArr.length;
        this.f5064 = length;
        this.f5061 = new C10307[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f5061[i2] = c15020.m34395(iArr[i2]);
        }
        Arrays.sort(this.f5061, new C21025());
        this.f5062 = new int[this.f5064];
        while (true) {
            int i3 = this.f5064;
            if (i < i3) {
                this.f5062[i] = c15020.m34394(this.f5061[i]);
                i++;
            } else {
                this.f5060 = new long[i3];
                return;
            }
        }
    }

    @Override // p067l.InterfaceC20334
    /* JADX INFO: renamed from: ܿ */
    public final C15020 mo4759() {
        return this.f5063;
    }

    @Override // p067l.InterfaceC20334
    public final int length() {
        return this.f5062.length;
    }

    @Override // p067l.InterfaceC20334
    /* JADX INFO: renamed from: ֫ */
    public final C10307 mo4748(int i) {
        return this.f5061[i];
    }

    @Override // p067l.InterfaceC20334
    /* JADX INFO: renamed from: ۧ */
    public final int mo4755(int i) {
        return this.f5062[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m4747(C10307 c10307) {
        for (int i = 0; i < this.f5064; i++) {
            if (this.f5061[i] == c10307) {
                return i;
            }
        }
        return -1;
    }

    @Override // p067l.InterfaceC20334
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.f5064; i2++) {
            if (this.f5062[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ۜ */
    public final C10307 mo4753() {
        return this.f5061[mo6029()];
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ᩻ */
    public final int mo4761() {
        return this.f5062[mo6029()];
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ֫ */
    public int mo4746(long j, List list) {
        return list.size();
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4756(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo4751 = mo4751(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f5064 && !zMo4751) {
            zMo4751 = (i2 == i || mo4751(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zMo4751) {
            return false;
        }
        long[] jArr = this.f5060;
        long j2 = jArr[i];
        String str = C5792.f14228;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = C14849.FOREVER_NS;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4751(int i, long j) {
        return this.f5060[i] > j;
    }

    public final int hashCode() {
        if (this.f5065 == 0) {
            this.f5065 = Arrays.hashCode(this.f5062) + (System.identityHashCode(this.f5063) * 31);
        }
        return this.f5065;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC2918 abstractC2918 = (AbstractC2918) obj;
            if (this.f5063.equals(abstractC2918.f5063) && Arrays.equals(this.f5062, abstractC2918.f5062)) {
                return true;
            }
        }
        return false;
    }
}
