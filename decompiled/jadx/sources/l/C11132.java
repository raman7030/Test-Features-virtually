package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۧܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C5SA */
/* JADX INFO: loaded from: classes4.dex */
public final class C11132 extends C7624 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Object f33409;

    @Override // l.C7624, java.lang.Throwable
    public final String toString() {
        Object obj = this.f33409;
        if (obj != null && this.f44795 != null) {
            return "MissingTokenException(inserted " + obj + " at " + this.f44795.getText() + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (this.f44795 == null) {
            return "MissingTokenException";
        }
        return "MissingTokenException(at " + this.f44795.getText() + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
