package l;

import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 569Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C16104 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C11459 f49638 = C11459.m28260("xmlns:(\\w+)\\s*=\\s*\"([^\"]*?)\"");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f49639 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38011(CharSequence charSequence) {
        HashMap map = this.f49639;
        map.clear();
        C12164 c12164Matcher = f49638.matcher(charSequence);
        while (c12164Matcher.find()) {
            map.put(c12164Matcher.group(1), c12164Matcher.group(2));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m38010(String str) {
        String str2 = (String) this.f49639.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m38009() {
        HashMap map = this.f49639;
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
