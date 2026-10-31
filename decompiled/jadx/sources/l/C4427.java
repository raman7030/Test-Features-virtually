package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۙۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DBEE */
/* JADX INFO: loaded from: classes2.dex */
public final class C4427 implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Pattern f14160;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13149(CharSequence charSequence) {
        C11233.m27805(charSequence, "input");
        return this.f14160.matcher(charSequence).matches();
    }

    public C4427(Pattern pattern) {
        this.f14160 = pattern;
    }

    public C4427(String str) {
        Pattern patternCompile = Pattern.compile(str);
        C11233.m27803(patternCompile, "compile(...)");
        this.f14160 = patternCompile;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m13148(String str) {
        String strReplaceAll = this.f14160.matcher(str).replaceAll("$1 $2");
        C11233.m27803(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f14160.toString();
        C11233.m27803(string, "toString(...)");
        return string;
    }

    private final Object writeReplace() {
        Pattern pattern = this.f14160;
        String strPattern = pattern.pattern();
        C11233.m27803(strPattern, "pattern(...)");
        return new C19950(strPattern, pattern.flags());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
