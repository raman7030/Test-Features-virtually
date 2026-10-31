package l;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.᩻᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes.dex */
public class C24022 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        c23525.m51984(locale == null ? null : locale.toString());
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(c17175.m40399(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (strNextToken2 == null && strNextToken3 == null) {
            return new Locale(strNextToken);
        }
        if (strNextToken3 == null) {
            return new Locale(strNextToken, strNextToken2);
        }
        return new Locale(strNextToken, strNextToken2, strNextToken3);
    }
}
