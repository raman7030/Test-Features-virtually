package p067l;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: renamed from: l.֨᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3668 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C8362 f7769;

    /* JADX INFO: renamed from: ܳ */
    public boolean f7770;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f7771;

    /* JADX INFO: renamed from: ᩻ */
    public C9873 f7772;

    public C3668(C8362 c8362, String str) {
        this.f7769 = c8362;
        this.f7771 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C8362 c8362 = this.f7769;
        c8362.f22377.m32378(c8362.f22391, true, false);
        c8362.f22392 = true;
        c8362.f22396 = false;
        c8362.f22384.m38838(".smali");
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C20807 {
        C8362 c8362 = this.f7769;
        c8362.f22373.m31796();
        if (c8362.f22394) {
            this.f7772 = C9873.m23150(c8362.f22385.m32106(c8362.f22385.m32137(c8362.m19360())).f65851);
            C12828 c12828M36366 = c8362.m36366(c8362.f22385.m38429());
            if (c12828M36366.m29398()) {
                try {
                    if (C8362.m19320(c8362, C14677.m33572(c12828M36366.m29399()))) {
                        this.f7770 = true;
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c8362.f22394) {
                String strM32113 = c8362.f22385.m32113(this.f7771);
                if (c8362.f22394) {
                    C14146 c14146 = c8362.f22377;
                    c14146.m32401(c8362.m36369(c8362.f22385.m38429()).m29402(), strM32113);
                    if (c8362.f22394) {
                        while (c8362.f22394 && c14146.m32434()) {
                            SystemClock.sleep(10L);
                        }
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C8362 c8362 = this.f7769;
        if (c8362.f22394) {
            c8362.f22377.m32407(new C16333((ActivityC18686) c8362.requireActivity(), this.f7772));
            if (this.f7770) {
                c8362.f22377.m32474();
                if (c8362.f22382 != null) {
                    c8362.f22382.setEnabled(!c8362.f22377.m32505());
                    c8362.f22378.setChecked(c8362.f22377.m32505());
                }
                C8362.m19357(c8362);
                c8362.f22377.invalidate();
            } else {
                c8362.f22377.m32424();
                c8362.f22377.m32520(false);
                c8362.f22377.m32367();
            }
            c8362.f46351.putBoolean("changed", c8362.f22377.m32361());
            try {
                c8362.m36372(c8362.f22385.m38429());
            } catch (IOException unused) {
            }
            C7050.m16213(new Runnable() { // from class: l.ۚ᩷ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C8362 c8363 = this.f20179.f7769;
                    c8363.f22374 = true;
                    if (c8363.f22394) {
                        C8362.m19355(c8363);
                    }
                }
            }, 200L);
            c8362.f22377.requestFocus();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C8362 c8362 = this.f7769;
        c8362.f22371.m13320((Throwable) exc);
        c8362.f22396 = true;
        if (c8362.f22394) {
            c8362.f22377.mo27932((CharSequence) exc.toString());
            c8362.f22377.m32471(true);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C8362 c8362 = this.f7769;
        if (c8362.f22394) {
            c8362.f22377.m32378(c8362.f22391, false, !c8362.f22396);
        }
        c8362.f22392 = false;
        c8362.f22390 = true;
    }
}
