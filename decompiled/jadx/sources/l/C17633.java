package l;

import com.google.android.material.motion.MotionUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܿ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17633 extends AbstractC21162 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Pattern f53875;

    public C17633(Pattern pattern) {
        this.f53875 = pattern;
    }

    @Override // l.AbstractC21162
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c19815) {
        return this.f53875.matcher(c19815.m45566()).find();
    }

    public final String toString() {
        return ":matchesWholeOwnText(" + this.f53875 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
