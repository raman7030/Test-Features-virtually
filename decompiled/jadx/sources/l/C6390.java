package l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: renamed from: l.ۛ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6390 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ChoreographerFrameCallbackC10624 f19764;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f19765;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f19766;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f19767;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f19768;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f19769;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f19770;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12740 f19771;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f19772;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Surface f19773;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f19774;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11763 f19775 = new C11763();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f19776;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f19777;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f19778;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f19779;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f19780;

    public C6390(Context context) {
        DisplayManager displayManager;
        C12740 c12740 = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new C12740(this, displayManager);
        this.f19771 = c12740;
        this.f19764 = c12740 != null ? ChoreographerFrameCallbackC10624.m26652() : null;
        this.f19777 = -9223372036854775807L;
        this.f19778 = -9223372036854775807L;
        this.f19774 = -1.0f;
        this.f19770 = 1.0f;
        this.f19765 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17715(int i) {
        if (this.f19765 == i) {
            return;
        }
        this.f19765 = i;
        m17709(true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17717() {
        this.f19769 = true;
        this.f19776 = 0L;
        this.f19772 = -1L;
        this.f19768 = -1L;
        C12740 c12740 = this.f19771;
        if (c12740 != null) {
            ChoreographerFrameCallbackC10624 choreographerFrameCallbackC10624 = this.f19764;
            choreographerFrameCallbackC10624.getClass();
            choreographerFrameCallbackC10624.m26653();
            c12740.m31027();
        }
        m17709(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17716(Surface surface) {
        if (this.f19773 == surface) {
            return;
        }
        m17711();
        this.f19773 = surface;
        m17709(true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17718(float f) {
        this.f19770 = f;
        this.f19776 = 0L;
        this.f19772 = -1L;
        this.f19768 = -1L;
        m17709(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17714(float f) {
        this.f19774 = f;
        this.f19775.m28790();
        m17710();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17719(long j) {
        long j2 = this.f19768;
        if (j2 != -1) {
            this.f19772 = j2;
            this.f19780 = this.f19779;
        }
        this.f19776++;
        this.f19775.m28788(j * 1000);
        m17710();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m17720() {
        this.f19769 = false;
        C12740 c12740 = this.f19771;
        if (c12740 != null) {
            c12740.m31028();
            ChoreographerFrameCallbackC10624 choreographerFrameCallbackC10624 = this.f19764;
            choreographerFrameCallbackC10624.getClass();
            choreographerFrameCallbackC10624.m26654();
        }
        m17711();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m17712(long j) {
        long j2;
        if (this.f19772 != -1 && this.f19775.m28792()) {
            long jM28787 = this.f19780 + ((long) (((this.f19776 - this.f19772) * this.f19775.m28787()) / this.f19770));
            if (Math.abs(j - jM28787) <= 20000000) {
                j = jM28787;
            } else {
                this.f19776 = 0L;
                this.f19772 = -1L;
                this.f19768 = -1L;
            }
        }
        this.f19768 = this.f19776;
        this.f19779 = j;
        ChoreographerFrameCallbackC10624 choreographerFrameCallbackC10624 = this.f19764;
        if (choreographerFrameCallbackC10624 != null && this.f19777 != -9223372036854775807L) {
            long j3 = choreographerFrameCallbackC10624.f31906;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f19777;
                long j5 = (((j - j3) / j4) * j4) + j3;
                if (j <= j5) {
                    j2 = j5 - j4;
                } else {
                    j2 = j5;
                    j5 = j4 + j5;
                }
                if (j5 - j >= j - j2) {
                    j5 = j2;
                }
                return j5 - this.f19778;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17713() {
        this.f19776 = 0L;
        this.f19772 = -1L;
        this.f19768 = -1L;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m17710() {
        if (Build.VERSION.SDK_INT < 30 || this.f19773 == null) {
            return;
        }
        C11763 c11763 = this.f19775;
        float fM28789 = c11763.m28792() ? c11763.m28789() : this.f19774;
        float f = this.f19766;
        if (fM28789 == f) {
            return;
        }
        if (fM28789 != -1.0f && f != -1.0f) {
            if (Math.abs(fM28789 - this.f19766) < ((!c11763.m28792() || c11763.m28793() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fM28789 == -1.0f && c11763.m28791() < 30) {
            return;
        }
        this.f19766 = fM28789;
        m17709(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17709(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f19773) == null || this.f19765 == Integer.MIN_VALUE) {
            return;
        }
        if (this.f19769) {
            float f2 = this.f19766;
            if (f2 != -1.0f) {
                f = f2 * this.f19770;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.f19767 != f) {
            this.f19767 = f;
            C13445.m32474(surface, f);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m17711() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f19773) == null || this.f19765 == Integer.MIN_VALUE || this.f19767 == 0.0f) {
            return;
        }
        this.f19767 = 0.0f;
        C13445.m32474(surface, 0.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17708(C6390 c6390, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            c6390.f19777 = refreshRate;
            c6390.f19778 = (refreshRate * 80) / 100;
        } else {
            C19956.m46037("Unable to query display refresh rate");
            c6390.f19777 = -9223372036854775807L;
            c6390.f19778 = -9223372036854775807L;
        }
    }
}
