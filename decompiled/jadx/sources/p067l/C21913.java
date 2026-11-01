package p067l;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21913 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ String f68920;

    /* JADX INFO: renamed from: ܳ */
    public boolean f68921;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C9842 f68922;

    public C21913(C9842 c9842, String str) {
        this.f68922 = c9842;
        this.f68920 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C9842 c9842 = this.f68922;
        c9842.f27290.m32378(c9842.f27300, true, false);
        c9842.f27298 = true;
        c9842.f27292 = false;
        c9842.f27285.m38838(".xml");
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C20807 {
        C9842 c9842 = this.f68922;
        c9842.f27288.m31796();
        if (c9842.f27301) {
            C12828 c12828M36366 = c9842.m36366(c9842.f27284.m38429());
            if (c12828M36366.m29398()) {
                try {
                    if (C9842.m23043(c9842, C14677.m33572(c12828M36366.m29399()))) {
                        this.f68921 = true;
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c9842.f27301) {
                String strM47152 = c9842.f27284.m47152(this.f68920);
                if (c9842.f27301) {
                    C14146 c14146 = c9842.f27290;
                    c14146.m32401(c9842.m36369(c9842.f27284.m38429()).m29402(), strM47152);
                    while (c9842.f27301 && c14146.m32434()) {
                        SystemClock.sleep(10L);
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C9842 c9842 = this.f68922;
        if (c9842.f27301) {
            if (this.f68921) {
                c9842.f27290.m32474();
                if (c9842.f27293 != null) {
                    c9842.f27293.setEnabled(!c9842.f27290.m32505());
                    c9842.f27296.setChecked(c9842.f27290.m32505());
                }
                C9842.m23075(c9842);
                c9842.f27290.invalidate();
            } else {
                c9842.f27290.m32424();
                c9842.f27290.m32520(false);
                c9842.f27290.m32367();
            }
            c9842.f46351.putBoolean("changed", c9842.f27290.m32361());
            try {
                c9842.m36372(c9842.f27284.m38429());
            } catch (IOException unused) {
            }
            C7050.m16213(new Runnable() { // from class: l.ۜ֫ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C9842 c9843 = this.f22810.f68922;
                    c9843.f27294 = true;
                    if (c9843.f27301) {
                        C9842.m23079(c9843);
                    }
                }
            }, 200L);
            c9842.m23080();
            c9842.f27290.requestFocus();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C9842 c9842 = this.f68922;
        c9842.f27302.m13320((Throwable) exc);
        c9842.f27292 = true;
        if (c9842.f27301) {
            c9842.f27290.mo27932((CharSequence) exc.toString());
            c9842.f27290.m32471(true);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C9842 c9842 = this.f68922;
        if (c9842.f27301) {
            c9842.f27290.m32378(c9842.f27300, false, !c9842.f27292);
        }
        c9842.f27298 = false;
        c9842.f27291 = true;
    }
}
