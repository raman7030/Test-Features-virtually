package l;

import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: WW6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12814 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31129() {
        C1566 c1566M5349 = C1566.m5349();
        try {
            Field declaredField = C1566.class.getDeclaredField("ܳ");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(c1566M5349);
            if (map != null) {
                map.clear();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
