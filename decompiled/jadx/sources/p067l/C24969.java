package p067l;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2LA */
/* JADX INFO: loaded from: classes.dex */
public final class C24969 extends AbstractC15385 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Pattern f79727;

    public C24969(Pattern pattern) {
        pattern.getClass();
        this.f79727 = pattern;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16251 m54859(CharSequence charSequence) {
        return new C16251(this.f79727.matcher(charSequence));
    }

    public final String toString() {
        return this.f79727.toString();
    }
}
