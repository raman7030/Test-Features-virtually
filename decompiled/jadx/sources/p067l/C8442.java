package p067l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: renamed from: l.ۛ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8442 {

    /* JADX INFO: renamed from: ֡ */
    public final ChoreographerFrameCallbackC12466 f22637;

    /* JADX INFO: renamed from: ֫ */
    public int f22638;

    /* JADX INFO: renamed from: ۖ */
    public float f22639;

    /* JADX INFO: renamed from: ۘ */
    public float f22640;

    /* JADX INFO: renamed from: ۜ */
    public long f22641;

    /* JADX INFO: renamed from: ۡ */
    public boolean f22642;

    /* JADX INFO: renamed from: ۢ */
    public float f22643;

    /* JADX INFO: renamed from: ۧ */
    public final C14477 f22644;

    /* JADX INFO: renamed from: ܳ */
    public long f22645;

    /* JADX INFO: renamed from: ܺ */
    public Surface f22646;

    /* JADX INFO: renamed from: ܽ */
    public float f22647;

    /* JADX INFO: renamed from: ܿ */
    public final C13548 f22648 = new C13548();

    /* JADX INFO: renamed from: ᩳ */
    public long f22649;

    /* JADX INFO: renamed from: ᩴ */
    public long f22650;

    /* JADX INFO: renamed from: ᩵ */
    public long f22651;

    /* JADX INFO: renamed from: ᩷ */
    public long f22652;

    /* JADX INFO: renamed from: ᩻ */
    public long f22653;

    public C8442(Context context) {
        DisplayManager displayManager;
        C14477 c14477 = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new C14477(this, displayManager);
        this.f22644 = c14477;
        this.f22637 = c14477 != null ? ChoreographerFrameCallbackC12466.m28692() : null;
        this.f22650 = -9223372036854775807L;
        this.f22651 = -9223372036854775807L;
        this.f22647 = -1.0f;
        this.f22643 = 1.0f;
        this.f22638 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19662(int i) {
        if (this.f22638 == i) {
            return;
        }
        this.f22638 = i;
        m19656(true);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m19664() {
        this.f22642 = true;
        this.f22649 = 0L;
        this.f22645 = -1L;
        this.f22641 = -1L;
        C14477 c14477 = this.f22644;
        if (c14477 != null) {
            ChoreographerFrameCallbackC12466 choreographerFrameCallbackC12466 = this.f22637;
            choreographerFrameCallbackC12466.getClass();
            choreographerFrameCallbackC12466.m28693();
            c14477.m33111();
        }
        m19656(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19663(Surface surface) {
        if (this.f22646 == surface) {
            return;
        }
        m19658();
        this.f22646 = surface;
        m19656(true);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m19665(float f) {
        this.f22643 = f;
        this.f22649 = 0L;
        this.f22645 = -1L;
        this.f22641 = -1L;
        m19656(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19661(float f) {
        this.f22647 = f;
        this.f22648.m30837();
        m19657();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m19666(long j) {
        long j2 = this.f22641;
        if (j2 != -1) {
            this.f22645 = j2;
            this.f22653 = this.f22652;
        }
        this.f22649++;
        this.f22648.m30835(j * 1000);
        m19657();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m19667() {
        this.f22642 = false;
        C14477 c14477 = this.f22644;
        if (c14477 != null) {
            c14477.m33112();
            ChoreographerFrameCallbackC12466 choreographerFrameCallbackC12466 = this.f22637;
            choreographerFrameCallbackC12466.getClass();
            choreographerFrameCallbackC12466.m28694();
        }
        m19658();
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m19659(long j) {
        long j2;
        if (this.f22645 != -1 && this.f22648.m30839()) {
            long jM30834 = this.f22653 + ((long) (((this.f22649 - this.f22645) * this.f22648.m30834()) / this.f22643));
            if (Math.abs(j - jM30834) <= 20000000) {
                j = jM30834;
            } else {
                this.f22649 = 0L;
                this.f22645 = -1L;
                this.f22641 = -1L;
            }
        }
        this.f22641 = this.f22649;
        this.f22652 = j;
        ChoreographerFrameCallbackC12466 choreographerFrameCallbackC12466 = this.f22637;
        if (choreographerFrameCallbackC12466 != null && this.f22650 != -9223372036854775807L) {
            long j3 = choreographerFrameCallbackC12466.f34878;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f22650;
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
                return j5 - this.f22651;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19660() {
        this.f22649 = 0L;
        this.f22645 = -1L;
        this.f22641 = -1L;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m19657() {
        if (Build.VERSION.SDK_INT < 30 || this.f22646 == null) {
            return;
        }
        C13548 c13548 = this.f22648;
        float fM30836 = c13548.m30839() ? c13548.m30836() : this.f22647;
        float f = this.f22639;
        if (fM30836 == f) {
            return;
        }
        if (fM30836 != -1.0f && f != -1.0f) {
            if (Math.abs(fM30836 - this.f22639) < ((!c13548.m30839() || c13548.m30840() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fM30836 == -1.0f && c13548.m30838() < 30) {
            return;
        }
        this.f22639 = fM30836;
        m19656(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX INFO: renamed from: ֫ */
    private void m19656(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f22646) == null || this.f22638 == Integer.MIN_VALUE) {
            return;
        }
        if (this.f22642) {
            float f2 = this.f22639;
            if (f2 != -1.0f) {
                f = f2 * this.f22643;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.f22640 != f) {
            this.f22640 = f;
            C15147.m34576(surface, f);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m19658() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f22646) == null || this.f22638 == Integer.MIN_VALUE || this.f22640 == 0.0f) {
            return;
        }
        this.f22640 = 0.0f;
        C15147.m34576(surface, 0.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19655(C8442 c8442, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            c8442.f22650 = refreshRate;
            c8442.f22651 = (refreshRate * 80) / 100;
        } else {
            C21334.m48351("Unable to query display refresh rate");
            c8442.f22650 = -9223372036854775807L;
            c8442.f22651 = -9223372036854775807L;
        }
    }
}
