package p067l;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A7N6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3405 extends AbstractC2918 {

    /* JADX INFO: renamed from: ᩻ */
    public int f6759;

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ۧ */
    public final Object mo6031() {
        return null;
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ᩷ */
    public final int mo6032() {
        return 0;
    }

    public C3405(C15020 c15020, int[] iArr) {
        super(c15020, iArr);
        this.f6759 = m4747(c15020.m34395(iArr[0]));
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ֫ */
    public final void mo6030(long j, long j2, long j3, List list, InterfaceC19683[] interfaceC19683Arr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (mo4751(this.f6759, jElapsedRealtime)) {
            int i = this.f5064;
            do {
                i--;
                if (i < 0) {
                    throw new IllegalStateException();
                }
            } while (mo4751(i, jElapsedRealtime));
            this.f6759 = i;
        }
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ֫ */
    public final int mo6029() {
        return this.f6759;
    }
}
