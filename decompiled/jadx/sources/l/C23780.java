package l;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2LA */
/* JADX INFO: loaded from: classes.dex */
public final class C23780 extends AbstractC13696 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Pattern f76975;

    public C23780(Pattern pattern) {
        pattern.getClass();
        this.f76975 = pattern;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14607 m52450(CharSequence charSequence) {
        return new C14607(this.f76975.matcher(charSequence));
    }

    public final String toString() {
        return this.f76975.toString();
    }
}
