package p067l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩶֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21200 implements InterfaceC3693 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f66648;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ boolean[] f66649;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ long f66650;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C17984 f66651;

    /* JADX INFO: renamed from: ᩸ */
    public int f66652;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f66653 = false;

    @Override // p067l.InterfaceC7717
    /* JADX INFO: renamed from: ᩷֫ */
    public final /* synthetic */ void mo4048() {
        throw null;
    }

    public C21200(C17984 c17984, long j, int i, boolean[] zArr) {
        this.f66651 = c17984;
        this.f66650 = j;
        this.f66648 = i;
        this.f66649 = zArr;
    }

    @Override // p067l.InterfaceC3693
    /* JADX INFO: renamed from: ֫ */
    public final void mo4047(long j, long j2, long j3) {
        if (mo3924()) {
            return;
        }
        C17984 c17984 = this.f66651;
        if (c17984.f53707 == null) {
            return;
        }
        int iM46750 = C20689.m46750(j2, j3);
        boolean z = this.f66653;
        int i = this.f66648;
        if (!z) {
            if (((int) (SystemClock.uptimeMillis() - this.f66650)) <= 500 || iM46750 >= 50) {
                return;
            }
            this.f66653 = true;
            C17984.m40944(c17984, i);
        }
        if (iM46750 != this.f66652) {
            this.f66652 = iM46750;
            C17984.m40934(c17984, i, iM46750);
        }
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        C17984 c17984 = this.f66651;
        boolean z = c17984.f53708 || !c17984.m40946(this.f66648);
        if (z) {
            this.f66649[0] = true;
        }
        return z;
    }
}
