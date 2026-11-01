package p067l;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T90P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24884 {

    /* JADX INFO: renamed from: ֫ */
    public static final Map f79477;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54640(String str) {
        return f79477.containsKey(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m54639(String str, int[] iArr) {
        String str2 = (String) f79477.get(str);
        if (str2 == null) {
            return 0;
        }
        int length = str2.length();
        if (length == 1) {
            iArr[0] = str2.charAt(0);
            return length;
        }
        iArr[0] = str2.charAt(0);
        iArr[1] = str2.charAt(1);
        return length;
    }

    static {
        Map map;
        try {
            Field declaredField = C11806.class.getDeclaredField("֫");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable unused) {
            map = Collections.EMPTY_MAP;
        }
        f79477 = map;
    }
}
