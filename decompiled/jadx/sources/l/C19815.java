package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩶֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19815 implements InterfaceC1393 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f64011;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f64012;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f64013;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16431 f64014;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f64015;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f64016 = false;

    @Override // l.InterfaceC5627
    /* JADX INFO: renamed from: ᩷֫ */
    public final /* synthetic */ void mo1648() {
        throw null;
    }

    public C19815(C16431 c16431, long j, int i, boolean[] zArr) {
        this.f64014 = c16431;
        this.f64013 = j;
        this.f64011 = i;
        this.f64012 = zArr;
    }

    @Override // l.InterfaceC1393
    /* JADX INFO: renamed from: ֫ */
    public final void mo1647(long j, long j2, long j3) {
        if (mo1526()) {
            return;
        }
        C16431 c16431 = this.f64014;
        if (c16431.f50527 == null) {
            return;
        }
        int iM44456 = C19277.m44456(j2, j3);
        boolean z = this.f64016;
        int i = this.f64011;
        if (!z) {
            if (((int) (SystemClock.uptimeMillis() - this.f64013)) <= 500 || iM44456 >= 50) {
                return;
            }
            this.f64016 = true;
            C16431.m38719(c16431, i);
        }
        if (iM44456 != this.f64015) {
            this.f64015 = iM44456;
            C16431.m38709(c16431, i, iM44456);
        }
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        C16431 c16431 = this.f64014;
        boolean z = c16431.f50528 || !c16431.m38721(this.f64011);
        if (z) {
            this.f64012[0] = true;
        }
        return z;
    }
}
