package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܿ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19127 extends AbstractC22481 {

    /* JADX INFO: renamed from: ֫ */
    public final Pattern f57068;

    public C19127(Pattern pattern) {
        this.f57068 = pattern;
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        return this.f57068.matcher(c211910.m47877()).find();
    }

    public final String toString() {
        return ":matchesWholeOwnText(" + this.f57068 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
