package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܳ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16444 extends AbstractC22481 {

    /* JADX INFO: renamed from: ֫ */
    public final Pattern f48321;

    public C16444(Pattern pattern) {
        this.f48321 = pattern;
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        return this.f48321.matcher(c211910.m47879()).find();
    }

    public final String toString() {
        return ":matchesWholeText(" + this.f48321 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
