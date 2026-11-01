package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֨֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes2.dex */
public final class C3119 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f5676;

    static {
        HashMap map = new HashMap(9);
        f5676 = map;
        EnumC9273 enumC9273 = EnumC9273.pt;
        map.put("xx-small", new C3099(0.694f, enumC9273));
        map.put("x-small", new C3099(0.833f, enumC9273));
        map.put("small", new C3099(10.0f, enumC9273));
        map.put("medium", new C3099(12.0f, enumC9273));
        map.put("large", new C3099(14.4f, enumC9273));
        map.put("x-large", new C3099(17.3f, enumC9273));
        map.put("xx-large", new C3099(20.7f, enumC9273));
        EnumC9273 enumC9274 = EnumC9273.percent;
        map.put("smaller", new C3099(83.33f, enumC9274));
        map.put("larger", new C3099(120.0f, enumC9274));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3099 m5323(String str) {
        return (C3099) f5676.get(str);
    }
}
