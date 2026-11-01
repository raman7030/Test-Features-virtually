package p067l;

import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ۖ */
/* JADX INFO: compiled from: WW6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1478 {
    /* JADX INFO: renamed from: ֫ */
    public static void m33218() {
        C0920 c0920M7578 = C0920.m7578();
        try {
            Field declaredField = C0920.class.getDeclaredField("ܳ");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(c0920M7578);
            if (map != null) {
                map.clear();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
