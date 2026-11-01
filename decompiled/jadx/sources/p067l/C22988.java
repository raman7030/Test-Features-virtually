package p067l;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5B43 */
/* JADX INFO: loaded from: classes.dex */
public final class C22988 extends AbstractC3541 {

    /* JADX INFO: renamed from: ֨ */
    public boolean f72285;

    /* JADX INFO: renamed from: ۠ */
    public float f72286;

    /* JADX INFO: renamed from: ܶ */
    public C23658 f72287;

    public C22988(Object obj, AbstractC16951 abstractC16951) {
        super(obj, abstractC16951);
        this.f72287 = null;
        this.f72286 = Float.MAX_VALUE;
        this.f72285 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51317(C23658 c23658) {
        this.f72287 = c23658;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51318() {
        if (this.f72287.f75285 <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f7189) {
            this.f72285 = true;
        }
    }

    @Override // p067l.AbstractC3541
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6318(long j) {
        if (this.f72285) {
            float f = this.f72286;
            if (f != Float.MAX_VALUE) {
                this.f72287.m52606(f);
                this.f72286 = Float.MAX_VALUE;
            }
            this.f7187 = this.f72287.m52601();
            this.f7186 = 0.0f;
            this.f72285 = false;
            return true;
        }
        if (this.f72286 != Float.MAX_VALUE) {
            this.f72287.getClass();
            long j2 = j / 2;
            C20306 c20306M52602 = this.f72287.m52602(this.f7187, this.f7186, j2);
            this.f72287.m52606(this.f72286);
            this.f72286 = Float.MAX_VALUE;
            C20306 c20306M52603 = this.f72287.m52602(c20306M52602.f62736, c20306M52602.f62737, j2);
            this.f7187 = c20306M52603.f62736;
            this.f7186 = c20306M52603.f62737;
        } else {
            C20306 c20306M52604 = this.f72287.m52602(this.f7187, this.f7186, j);
            this.f7187 = c20306M52604.f62736;
            this.f7186 = c20306M52604.f62737;
        }
        float fMax = Math.max(this.f7187, this.f7190);
        this.f7187 = fMax;
        float fMin = Math.min(fMax, Float.MAX_VALUE);
        this.f7187 = fMin;
        if (!this.f72287.m52605(fMin, this.f7186)) {
            return false;
        }
        this.f7187 = this.f72287.m52601();
        this.f7186 = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51319(float f) {
        if (this.f7189) {
            this.f72286 = f;
            return;
        }
        if (this.f72287 == null) {
            this.f72287 = new C23658(f);
        }
        this.f72287.m52606(f);
        C23658 c23658 = this.f72287;
        if (c23658 == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dM52601 = c23658.m52601();
        if (dM52601 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        float f2 = this.f7190;
        if (dM52601 >= f2) {
            this.f72287.m52603(m6312());
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            }
            boolean z = this.f7189;
            if (z || z) {
                return;
            }
            this.f7189 = true;
            if (!this.f7194) {
                this.f7187 = this.f7191.getValue(this.f7185);
            }
            float f3 = this.f7187;
            if (f3 <= Float.MAX_VALUE && f3 >= f2) {
                ThreadLocal threadLocal = C9420.f25710;
                if (threadLocal.get() == null) {
                    threadLocal.set(new C9420());
                }
                C9420 c9420 = (C9420) threadLocal.get();
                ArrayList arrayList = c9420.f25711;
                if (arrayList.size() == 0) {
                    c9420.m21917().mo30591();
                }
                if (arrayList.contains(this)) {
                    return;
                }
                arrayList.add(this);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
    }
}
