package l;

import com.alipay.sdk.m.p.a;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes4.dex */
public final class C19405 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44689(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44688(Map map) {
        int size = map.size();
        C22061.m49620(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(a.h);
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m44687(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }
}
