package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܽۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes4.dex */
public final class C16372 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f50363;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f50364;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC2262 f50365;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f50366;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f50367;

    public C16372() {
        m38536();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38536() {
        this.f50367 = -1;
        this.f50363 = Integer.MIN_VALUE;
        this.f50364 = false;
        this.f50366 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38534() {
        int iMo7478;
        if (this.f50364) {
            iMo7478 = this.f50365.mo7476();
        } else {
            iMo7478 = this.f50365.mo7478();
        }
        this.f50363 = iMo7478;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f50367 + ", mCoordinate=" + this.f50363 + ", mLayoutFromEnd=" + this.f50364 + ", mValid=" + this.f50366 + '}';
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38537(int i, View view) {
        int iM7475 = this.f50365.m7475();
        if (iM7475 >= 0) {
            m38535(i, view);
            return;
        }
        this.f50367 = i;
        if (this.f50364) {
            int iMo7476 = (this.f50365.mo7476() - iM7475) - this.f50365.mo7473(view);
            this.f50363 = this.f50365.mo7476() - iMo7476;
            if (iMo7476 > 0) {
                int iMo7477 = this.f50363 - this.f50365.mo7477(view);
                int iMo7478 = this.f50365.mo7478();
                int iMin = iMo7477 - (Math.min(this.f50365.mo7485(view) - iMo7478, 0) + iMo7478);
                if (iMin < 0) {
                    this.f50363 = Math.min(iMo7476, -iMin) + this.f50363;
                    return;
                }
                return;
            }
            return;
        }
        int iMo7485 = this.f50365.mo7485(view);
        int iMo7479 = iMo7485 - this.f50365.mo7478();
        this.f50363 = iMo7485;
        if (iMo7479 > 0) {
            int iMo74710 = (this.f50365.mo7476() - Math.min(0, (this.f50365.mo7476() - iM7475) - this.f50365.mo7473(view))) - (this.f50365.mo7477(view) + iMo7485);
            if (iMo74710 < 0) {
                this.f50363 -= Math.min(iMo7479, -iMo74710);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38535(int i, View view) {
        if (this.f50364) {
            this.f50363 = this.f50365.m7475() + this.f50365.mo7473(view);
        } else {
            this.f50363 = this.f50365.mo7485(view);
        }
        this.f50367 = i;
    }
}
