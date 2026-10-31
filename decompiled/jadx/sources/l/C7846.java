package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۠֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes3.dex */
public final class C7846 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f24333;

    static {
        HashMap map = new HashMap(13);
        f24333 = map;
        map.put("normal", 400);
        map.put("bold", 700);
        C12354.m29971(1, map, "bolder", -1, "lighter");
        C12354.m29971(100, map, "100", 200, "200");
        map.put("300", 300);
        map.put("400", 400);
        C12354.m29971(500, map, "500", 600, "600");
        C15942.m37720(map, "700", 700, 800, "800");
        map.put("900", Integer.valueOf(EnumC3478.f11019));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m21029(String str) {
        return (Integer) f24333.get(str);
    }
}
