package p067l;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩶ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DBEE */
/* JADX INFO: loaded from: classes4.dex */
public final class C21329 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final int f67250;

    /* JADX INFO: renamed from: ᩹ */
    public final String f67251;

    public C21329(String str, int i) {
        this.f67251 = str;
        this.f67250 = i;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.f67251, this.f67250);
        C13045.m29865(patternCompile, "compile(...)");
        return new C6576(patternCompile);
    }
}
