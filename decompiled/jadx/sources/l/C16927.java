package l;

import com.google.android.material.motion.MotionUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܽ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16927 extends AbstractC21162 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Pattern f51990;

    public C16927(Pattern pattern) {
        this.f51990 = pattern;
    }

    @Override // l.AbstractC21162
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c19815) {
        return this.f51990.matcher(c19815.m45576()).find();
    }

    public final String toString() {
        return ":matches(" + this.f51990 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
