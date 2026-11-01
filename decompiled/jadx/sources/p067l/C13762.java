package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2A9M */
/* JADX INFO: loaded from: classes3.dex */
public final class C13762 extends IOException {
    public static final long serialVersionUID = -3900043433469104564L;

    /* JADX INFO: renamed from: ᩸ */
    public String f38900;

    /* JADX INFO: renamed from: ᩹ */
    public final int f38901;

    public C13762(String str, int i, String str2) {
        super(str);
        this.f38901 = i;
        this.f38900 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m31347() {
        return this.f38901;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Locale locale = Locale.US;
        return super.getMessage() + " (" + this.f38901 + " " + this.f38900 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
