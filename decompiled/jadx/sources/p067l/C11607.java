package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۢܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L64G */
/* JADX INFO: loaded from: classes4.dex */
public final class C11607 extends C9614 {
    @Override // p067l.C9614, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder(", expected ");
        int i = this.f26484;
        sb.append(i);
        String string = sb.toString();
        if (i == 0) {
            string = "";
        }
        if (this.f47905 == null) {
            return C6988.m16053("UnwantedTokenException(found=null", string, MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return "UnwantedTokenException(found=" + this.f47905.getText() + string + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
