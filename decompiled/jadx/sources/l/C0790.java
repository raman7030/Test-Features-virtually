package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֨֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes2.dex */
public final class C0790 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f2904;

    static {
        HashMap map = new HashMap(9);
        f2904 = map;
        EnumC7265 enumC7265 = EnumC7265.pt;
        map.put("xx-small", new C0769(0.694f, enumC7265));
        map.put("x-small", new C0769(0.833f, enumC7265));
        map.put("small", new C0769(10.0f, enumC7265));
        map.put("medium", new C0769(12.0f, enumC7265));
        map.put("large", new C0769(14.4f, enumC7265));
        map.put("x-large", new C0769(17.3f, enumC7265));
        map.put("xx-large", new C0769(20.7f, enumC7265));
        EnumC7265 enumC7266 = EnumC7265.percent;
        map.put("smaller", new C0769(83.33f, enumC7266));
        map.put("larger", new C0769(120.0f, enumC7266));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0769 m2994(String str) {
        return (C0769) f2904.get(str);
    }
}
