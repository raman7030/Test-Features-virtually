package l;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩶ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DBEE */
/* JADX INFO: loaded from: classes4.dex */
public final class C19950 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f64609;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f64610;

    public C19950(String str, int i) {
        this.f64610 = str;
        this.f64609 = i;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.f64610, this.f64609);
        C11233.m27803(patternCompile, "compile(...)");
        return new C4427(patternCompile);
    }
}
