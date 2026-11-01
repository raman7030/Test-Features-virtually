package p067l;

import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 569Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C17674 {

    /* JADX INFO: renamed from: ۧ */
    public static final C13259 f52801 = C13259.m30304("xmlns:(\\w+)\\s*=\\s*\"([^\"]*?)\"");

    /* JADX INFO: renamed from: ֫ */
    public HashMap f52802 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m40202(CharSequence charSequence) {
        HashMap map = this.f52802;
        map.clear();
        C13929 c13929Matcher = f52801.matcher(charSequence);
        while (c13929Matcher.find()) {
            map.put(c13929Matcher.group(1), c13929Matcher.group(2));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m40201(String str) {
        String str2 = (String) this.f52802.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m40200() {
        HashMap map = this.f52802;
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getValue()).equals(Chip.NAMESPACE_ANDROID)) {
                return (String) entry.getKey();
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (((String) entry2.getValue()).equals("http://schemas.android.com/apk/res-auto")) {
                return (String) entry2.getKey();
            }
        }
        return "android";
    }
}
