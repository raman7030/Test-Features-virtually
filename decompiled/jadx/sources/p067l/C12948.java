package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۧܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C5SA */
/* JADX INFO: loaded from: classes4.dex */
public final class C12948 extends C9614 {

    /* JADX INFO: renamed from: ۤ */
    public Object f36409;

    @Override // p067l.C9614, java.lang.Throwable
    public final String toString() {
        Object obj = this.f36409;
        if (obj != null && this.f47905 != null) {
            return "MissingTokenException(inserted " + obj + " at " + this.f47905.getText() + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (this.f47905 == null) {
            return "MissingTokenException";
        }
        return "MissingTokenException(at " + this.f47905.getText() + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
