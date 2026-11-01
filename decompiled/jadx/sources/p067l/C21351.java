package p067l;

import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩶ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9QS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21351 implements InterfaceC10503 {

    /* JADX INFO: renamed from: ֫ */
    public long f67327 = 0;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C6598 f67328;

    /* JADX INFO: renamed from: ܽ */
    public long f67329;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f67330;

    public C21351(C6598 c6598, C15314 c15314) {
        this.f67328 = c6598;
        this.f67329 = c15314.m34855();
    }

    @Override // p067l.InterfaceC10503
    /* JADX INFO: renamed from: ֫ */
    public final void mo19742(int i) {
        this.f67327 += (long) i;
        C6598 c6598 = this.f67328;
        boolean z = c6598.f17029;
        long j = this.f67329;
        if (z) {
            c6598.m13477(this.f67327, j);
        } else {
            c6598.m52470(this.f67327, j);
            c6598.m13477(c6598.f17031.m50043() + this.f67327, c6598.f17031.m50039());
        }
    }

    @Override // p067l.InterfaceC10503
    /* JADX INFO: renamed from: ۧ */
    public final void mo19743(int i) {
        boolean z = this.f67330;
        C6598 c6598 = this.f67328;
        if (!z) {
            this.f67330 = true;
            if (c6598.f17031.m50046() > 1) {
                c6598.mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c6598.f17031.m50044() + "/" + c6598.f17031.m50046() + MotionUtils.EASING_TYPE_FORMAT_END);
            } else {
                c6598.m13472(R.string.MT_Protector);
            }
        }
        if (c6598.f17029) {
            c6598.mo13474(i);
        } else {
            c6598.m52469(i);
        }
    }

    @Override // p067l.InterfaceC10503
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo19744() {
        return this.f67328.mo3924();
    }
}
