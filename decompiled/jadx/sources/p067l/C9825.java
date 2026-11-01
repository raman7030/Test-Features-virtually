package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۠֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes3.dex */
public final class C9825 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f27249;

    static {
        HashMap map = new HashMap(13);
        f27249 = map;
        map.put("normal", 400);
        map.put("bold", 700);
        C14110.m32032(1, map, "bolder", -1, "lighter");
        C14110.m32032(100, map, "100", 200, "200");
        map.put("300", 300);
        map.put("400", 400);
        C14110.m32032(500, map, "500", 600, "600");
        C17520.m39895(map, "700", 700, 800, "800");
        map.put("900", Integer.valueOf(EnumC5674.f13824));
    }

    /* JADX INFO: renamed from: ֫ */
    public static Integer m22994(String str) {
        return (Integer) f27249.get(str);
    }
}
