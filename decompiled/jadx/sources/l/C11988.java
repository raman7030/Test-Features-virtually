package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2A9M */
/* JADX INFO: loaded from: classes3.dex */
public final class C11988 extends IOException {
    public static final long serialVersionUID = -3900043433469104564L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f35890;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f35891;

    public C11988(String str, int i, String str2) {
        super(str);
        this.f35891 = i;
        this.f35890 = str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29292() {
        return this.f35891;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Locale locale = Locale.US;
        return super.getMessage() + " (" + this.f35891 + " " + this.f35890 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
