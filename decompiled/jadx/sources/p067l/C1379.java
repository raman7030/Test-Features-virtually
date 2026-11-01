package p067l;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۜ */
/* JADX INFO: compiled from: B54W */
/* JADX INFO: loaded from: classes3.dex */
public final class C1379 {

    /* JADX INFO: renamed from: ܽ */
    public Interpolator f35526;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC1927 f35527;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f35528;

    /* JADX INFO: renamed from: ۧ */
    public long f35524 = -1;

    /* JADX INFO: renamed from: ܳ */
    public final C3395 f35525 = new C0924(this);

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f35523 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m29102(C1612 c1612) {
        if (this.f35528) {
            return;
        }
        this.f35523.add(c1612);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29103(C1612 c1612, C1612 c1613) {
        ArrayList arrayList = this.f35523;
        arrayList.add(c1612);
        c1613.m38766(c1612.m38764());
        arrayList.add(c1613);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m29106() {
        if (this.f35528) {
            return;
        }
        for (C1612 c1612 : this.f35523) {
            long j = this.f35524;
            if (j >= 0) {
                c1612.m38760(j);
            }
            Interpolator interpolator = this.f35526;
            if (interpolator != null) {
                c1612.m38761(interpolator);
            }
            if (this.f35527 != null) {
                c1612.m38762(this.f35525);
            }
            c1612.m38767();
        }
        this.f35528 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29104() {
        this.f35528 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29099() {
        if (this.f35528) {
            Iterator it = this.f35523.iterator();
            while (it.hasNext()) {
                ((C1612) it.next()).m38758();
            }
            this.f35528 = false;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m29105() {
        if (this.f35528) {
            return;
        }
        this.f35524 = 250L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29100(Interpolator interpolator) {
        if (this.f35528) {
            return;
        }
        this.f35526 = interpolator;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29101(C3395 c3395) {
        if (this.f35528) {
            return;
        }
        this.f35527 = c3395;
    }
}
