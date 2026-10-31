package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֡֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes2.dex */
public final class C0084 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f1018;

    static {
        HashMap map = new HashMap(10);
        f1018 = map;
        map.put("none", EnumC1475.none);
        map.put("xMinYMin", EnumC1475.xMinYMin);
        map.put("xMidYMin", EnumC1475.xMidYMin);
        map.put("xMaxYMin", EnumC1475.xMaxYMin);
        map.put("xMinYMid", EnumC1475.xMinYMid);
        map.put("xMidYMid", EnumC1475.xMidYMid);
        map.put("xMaxYMid", EnumC1475.xMaxYMid);
        map.put("xMinYMax", EnumC1475.xMinYMax);
        map.put("xMidYMax", EnumC1475.xMidYMax);
        map.put("xMaxYMax", EnumC1475.xMaxYMax);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC1475 m1044(String str) {
        return (EnumC1475) f1018.get(str);
    }
}
