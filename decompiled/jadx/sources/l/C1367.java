package l;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: renamed from: l.֨᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1367 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6306 f4997;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f4998;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f4999;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7897 f5000;

    public C1367(C6306 c6306, String str) {
        this.f4997 = c6306;
        this.f4999 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C6306 c6306 = this.f4997;
        c6306.f19506.m30314(c6306.f19520, true, false);
        c6306.f19521 = true;
        c6306.f19525 = false;
        c6306.f19513.m36677(".smali");
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C19401 {
        C6306 c6306 = this.f4997;
        c6306.f19502.m29734();
        if (c6306.f19523) {
            this.f5000 = C7897.m21184(c6306.f19514.m30045(c6306.f19514.m30076(c6306.m17420())).f63232);
            C11005 c11005M34233 = c6306.m34233(c6306.f19514.m36268());
            if (c11005M34233.m27336()) {
                try {
                    if (C6306.m17380(c6306, C12951.m31485(c11005M34233.m27337()))) {
                        this.f4998 = true;
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c6306.f19523) {
                String strM30052 = c6306.f19514.m30052(this.f4999);
                if (c6306.f19523) {
                    C12392 c12392 = c6306.f19506;
                    c12392.m30337(c6306.m34236(c6306.f19514.m36268()).m27340(), strM30052);
                    if (c6306.f19523) {
                        while (c6306.f19523 && c12392.m30370()) {
                            SystemClock.sleep(10L);
                        }
                    }
                }
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C6306 c6306 = this.f4997;
        if (c6306.f19523) {
            c6306.f19506.m30343(new C14693((ActivityC17169) c6306.requireActivity(), this.f5000));
            if (this.f4998) {
                c6306.f19506.m30410();
                if (c6306.f19511 != null) {
                    c6306.f19511.setEnabled(!c6306.f19506.m30441());
                    c6306.f19507.setChecked(c6306.f19506.m30441());
                }
                C6306.m17417(c6306);
                c6306.f19506.invalidate();
            } else {
                c6306.f19506.m30360();
                c6306.f19506.m30456(false);
                c6306.f19506.m30303();
            }
            c6306.f43260.putBoolean("changed", c6306.f19506.m30297());
            try {
                c6306.m34239(c6306.f19514.m36268());
            } catch (IOException unused) {
            }
            C4925.m14316(new Runnable() { // from class: l.ۚ᩷ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C6306 c6307 = this.f17335.f4997;
                    c6307.f19503 = true;
                    if (c6307.f19523) {
                        C6306.m17415(c6307);
                    }
                }
            }, 200L);
            c6306.f19506.requestFocus();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C6306 c6306 = this.f4997;
        c6306.f19500.m11384((Throwable) exc);
        c6306.f19525 = true;
        if (c6306.f19523) {
            c6306.f19506.mo25910((CharSequence) exc.toString());
            c6306.f19506.m30407(true);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C6306 c6306 = this.f4997;
        if (c6306.f19523) {
            c6306.f19506.m30314(c6306.f19520, false, !c6306.f19525);
        }
        c6306.f19521 = false;
        c6306.f19519 = true;
    }
}
