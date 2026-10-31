package l;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A7N6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1091 extends AbstractC0578 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f3988;

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object mo3759() {
        return null;
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo3760() {
        return 0;
    }

    public C1091(C13312 c13312, int[] iArr) {
        super(c13312, iArr);
        this.f3988 = m2376(c13312.m32295(iArr[0]));
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3758(long j, long j2, long j3, List list, InterfaceC18218[] interfaceC18218Arr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (mo2380(this.f3988, jElapsedRealtime)) {
            int i = this.f2289;
            do {
                i--;
                if (i < 0) {
                    throw new IllegalStateException();
                }
            } while (mo2380(i, jElapsedRealtime));
            this.f3988 = i;
        }
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo3757() {
        return this.f3988;
    }
}
