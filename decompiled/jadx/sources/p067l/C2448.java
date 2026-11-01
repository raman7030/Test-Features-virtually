package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֡֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes2.dex */
public final class C2448 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f3792;

    static {
        HashMap map = new HashMap(10);
        f3792 = map;
        map.put("none", EnumC3770.none);
        map.put("xMinYMin", EnumC3770.xMinYMin);
        map.put("xMidYMin", EnumC3770.xMidYMin);
        map.put("xMaxYMin", EnumC3770.xMaxYMin);
        map.put("xMinYMid", EnumC3770.xMinYMid);
        map.put("xMidYMid", EnumC3770.xMidYMid);
        map.put("xMaxYMid", EnumC3770.xMaxYMid);
        map.put("xMinYMax", EnumC3770.xMinYMax);
        map.put("xMidYMax", EnumC3770.xMidYMax);
        map.put("xMaxYMax", EnumC3770.xMaxYMax);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC3770 m3440(String str) {
        return (EnumC3770) f3792.get(str);
    }
}
