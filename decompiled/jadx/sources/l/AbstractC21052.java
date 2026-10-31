package l;

import java.io.StringWriter;

/* JADX INFO: renamed from: l.᩷ᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M2DV */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21052 extends AbstractC11446 {
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo19297(CharSequence charSequence, StringWriter stringWriter);

    @Override // l.AbstractC11446
    /* JADX INFO: renamed from: ֫ */
    public int mo16274(CharSequence charSequence, int i, StringWriter stringWriter) {
        if (i == 0) {
            mo19297(charSequence, stringWriter);
            return Character.codePointCount(charSequence, i, charSequence.length());
        }
        Class<?> cls = getClass();
        throw new IllegalArgumentException((cls.isAnonymousClass() ? cls.getName() : cls.getSimpleName()).concat(".translate(final CharSequence input, final int index, final Writer out) can not handle a non-zero index."));
    }
}
