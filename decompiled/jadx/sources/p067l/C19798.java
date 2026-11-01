package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩳ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19798 extends AbstractC22481 {

    /* JADX INFO: renamed from: ֫ */
    public final Pattern f60211;

    public C19798(Pattern pattern) {
        this.f60211 = pattern;
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        return this.f60211.matcher(c211910.m47897()).find();
    }

    public final String toString() {
        return ":matchesOwn(" + this.f60211 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
