package l;

import java.io.StringWriter;

/* JADX INFO: renamed from: l.᩺ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M2E0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22734 extends AbstractC11446 {
    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo23385(int i, StringWriter stringWriter);

    @Override // l.AbstractC11446
    /* JADX INFO: renamed from: ֫ */
    public final int mo16274(CharSequence charSequence, int i, StringWriter stringWriter) {
        return mo23385(Character.codePointAt(charSequence, i), stringWriter) ? 1 : 0;
    }
}
