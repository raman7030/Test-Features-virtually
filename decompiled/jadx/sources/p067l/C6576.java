package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۙۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DBEE */
/* JADX INFO: loaded from: classes2.dex */
public final class C6576 implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public final Pattern f16985;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m15030(CharSequence charSequence) {
        C13045.m29867(charSequence, "input");
        return this.f16985.matcher(charSequence).matches();
    }

    public C6576(Pattern pattern) {
        this.f16985 = pattern;
    }

    public C6576(String str) {
        Pattern patternCompile = Pattern.compile(str);
        C13045.m29865(patternCompile, "compile(...)");
        this.f16985 = patternCompile;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m15029(String str) {
        String strReplaceAll = this.f16985.matcher(str).replaceAll("$1 $2");
        C13045.m29865(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f16985.toString();
        C13045.m29865(string, "toString(...)");
        return string;
    }

    private final Object writeReplace() {
        Pattern pattern = this.f16985;
        String strPattern = pattern.pattern();
        C13045.m29865(strPattern, "pattern(...)");
        return new C21329(strPattern, pattern.flags());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
