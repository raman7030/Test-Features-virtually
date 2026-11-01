package p067l;

import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.۬ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAZB */
/* JADX INFO: loaded from: classes3.dex */
public final class C14599 extends PatternSyntaxException {
    public static final long serialVersionUID = -3864639126226059218L;

    @Override // java.util.regex.PatternSyntaxException, java.lang.Throwable
    public final String getMessage() {
        int index = getIndex();
        String description = getDescription();
        String pattern = getPattern();
        StringBuilder sbM17248 = C7470.m17248(description);
        if (index >= 0) {
            sbM17248.append(" near index ");
            sbM17248.append(index);
        }
        sbM17248.append(System.lineSeparator());
        sbM17248.append(pattern);
        if (index >= 0 && pattern != null && index < pattern.length()) {
            sbM17248.append(System.lineSeparator());
            for (int i = 0; i < index; i++) {
                char c = '\t';
                if (pattern.charAt(i) != '\t') {
                    c = ' ';
                }
                sbM17248.append(c);
            }
            sbM17248.append('^');
        }
        return sbM17248.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? "PatternSyntaxException: ".concat(localizedMessage) : "PatternSyntaxException";
    }
}
