package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܽ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18456 extends AbstractC22481 {

    /* JADX INFO: renamed from: ֫ */
    public final Pattern f55171;

    public C18456(Pattern pattern) {
        this.f55171 = pattern;
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        return this.f55171.matcher(c211910.m47887()).find();
    }

    public final String toString() {
        return ":matches(" + this.f55171 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
