package l;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5B43 */
/* JADX INFO: loaded from: classes.dex */
public final class C21696 extends AbstractC1234 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f69580;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f69581;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C22401 f69582;

    public C21696(Object obj, AbstractC15344 abstractC15344) {
        super(obj, abstractC15344);
        this.f69582 = null;
        this.f69581 = Float.MAX_VALUE;
        this.f69580 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48968(C22401 c22401) {
        this.f69582 = c22401;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48969() {
        if (this.f69582.f72559 <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f4420) {
            this.f69580 = true;
        }
    }

    @Override // l.AbstractC1234
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4074(long j) {
        if (this.f69580) {
            float f = this.f69581;
            if (f != Float.MAX_VALUE) {
                this.f69582.m50266(f);
                this.f69581 = Float.MAX_VALUE;
            }
            this.f4418 = this.f69582.m50261();
            this.f4417 = 0.0f;
            this.f69580 = false;
            return true;
        }
        if (this.f69581 != Float.MAX_VALUE) {
            this.f69582.getClass();
            long j2 = j / 2;
            C18874 c18874M50262 = this.f69582.m50262(this.f4418, this.f4417, j2);
            this.f69582.m50266(this.f69581);
            this.f69581 = Float.MAX_VALUE;
            C18874 c18874M50263 = this.f69582.m50262(c18874M50262.f59507, c18874M50262.f59508, j2);
            this.f4418 = c18874M50263.f59507;
            this.f4417 = c18874M50263.f59508;
        } else {
            C18874 c18874M50264 = this.f69582.m50262(this.f4418, this.f4417, j);
            this.f4418 = c18874M50264.f59507;
            this.f4417 = c18874M50264.f59508;
        }
        float fMax = Math.max(this.f4418, this.f4421);
        this.f4418 = fMax;
        float fMin = Math.min(fMax, Float.MAX_VALUE);
        this.f4418 = fMin;
        if (!this.f69582.m50265(fMin, this.f4417)) {
            return false;
        }
        this.f4418 = this.f69582.m50261();
        this.f4417 = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48970(float f) {
        if (this.f4420) {
            this.f69581 = f;
            return;
        }
        if (this.f69582 == null) {
            this.f69582 = new C22401(f);
        }
        this.f69582.m50266(f);
        C22401 c22401 = this.f69582;
        if (c22401 == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dM50261 = c22401.m50261();
        if (dM50261 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        float f2 = this.f4421;
        if (dM50261 >= f2) {
            this.f69582.m50263(m4068());
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            }
            boolean z = this.f4420;
            if (z || z) {
                return;
            }
            this.f4420 = true;
            if (!this.f4425) {
                this.f4418 = this.f4422.getValue(this.f4416);
            }
            float f3 = this.f4418;
            if (f3 <= Float.MAX_VALUE && f3 >= f2) {
                ThreadLocal threadLocal = C7420.f22797;
                if (threadLocal.get() == null) {
                    threadLocal.set(new C7420());
                }
                C7420 c7420 = (C7420) threadLocal.get();
                ArrayList arrayList = c7420.f22798;
                if (arrayList.size() == 0) {
                    c7420.m19943().mo28543();
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
