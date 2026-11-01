package p067l;

import java.io.StringWriter;

/* JADX INFO: renamed from: l.᩺ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M2E0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23974 extends AbstractC13246 {
    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo25330(int i, StringWriter stringWriter);

    @Override // p067l.AbstractC13246
    /* JADX INFO: renamed from: ֫ */
    public final int mo18199(CharSequence charSequence, int i, StringWriter stringWriter) {
        return mo25330(Character.codePointAt(charSequence, i), stringWriter) ? 1 : 0;
    }
}
