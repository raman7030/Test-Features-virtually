package p067l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֫ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4T4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4213 {

    /* JADX INFO: renamed from: ֫ */
    public String f9268;

    /* JADX INFO: renamed from: ۧ */
    public int f9269;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m8556(String str) {
        if (!this.f9268.startsWith(str)) {
            return false;
        }
        this.f9269 = str.length();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m8557(Pattern pattern) {
        Matcher matcher = pattern.matcher(this.f9268);
        if (!matcher.find()) {
            return false;
        }
        C6194.m14030(matcher.start() == 0);
        this.f9269 = matcher.end();
        return true;
    }
}
