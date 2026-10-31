package l;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֡ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8QT */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0578 implements InterfaceC9731 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long[] f2285;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8353[] f2286;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f2287;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13312 f2288;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f2289;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f2290;

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo2378(float f) {
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2379(boolean z) {
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo2381(long j, AbstractC7592 abstractC7592, List list) {
        return false;
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo2383() {
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo2386() {
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo2387() {
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo2389() {
    }

    public AbstractC0578(C13312 c13312, int[] iArr) {
        int i = 0;
        C22632.m50634(iArr.length > 0);
        c13312.getClass();
        this.f2288 = c13312;
        int length = iArr.length;
        this.f2289 = length;
        this.f2286 = new C8353[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f2286[i2] = c13312.m32295(iArr[i2]);
        }
        Arrays.sort(this.f2286, new C19630());
        this.f2287 = new int[this.f2289];
        while (true) {
            int i3 = this.f2289;
            if (i < i3) {
                this.f2287[i] = c13312.m32294(this.f2286[i]);
                i++;
            } else {
                this.f2285 = new long[i3];
                return;
            }
        }
    }

    @Override // l.InterfaceC18903
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13312 mo2388() {
        return this.f2288;
    }

    @Override // l.InterfaceC18903
    public final int length() {
        return this.f2287.length;
    }

    @Override // l.InterfaceC18903
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353 mo2377(int i) {
        return this.f2286[i];
    }

    @Override // l.InterfaceC18903
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo2384(int i) {
        return this.f2287[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m2376(C8353 c8353) {
        for (int i = 0; i < this.f2289; i++) {
            if (this.f2286[i] == c8353) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC18903
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.f2289; i2++) {
            if (this.f2287[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C8353 mo2382() {
        return this.f2286[mo3757()];
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo2390() {
        return this.f2287[mo3757()];
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo2375(long j, List list) {
        return list.size();
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo2385(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo2380 = mo2380(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f2289 && !zMo2380) {
            zMo2380 = (i2 == i || mo2380(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zMo2380) {
            return false;
        }
        long[] jArr = this.f2285;
        long j2 = jArr[i];
        String str = C3603.f11424;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = C13132.FOREVER_NS;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo2380(int i, long j) {
        return this.f2285[i] > j;
    }

    public final int hashCode() {
        if (this.f2290 == 0) {
            this.f2290 = Arrays.hashCode(this.f2287) + (System.identityHashCode(this.f2288) * 31);
        }
        return this.f2290;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC0578 abstractC0578 = (AbstractC0578) obj;
            if (this.f2288.equals(abstractC0578.f2288) && Arrays.equals(this.f2287, abstractC0578.f2287)) {
                return true;
            }
        }
        return false;
    }
}
