package p067l;

import bin.p000mt.json.JSONObject;
import com.umeng.analytics.pro.C0708d;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7BU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5109 {
    /* JADX INFO: renamed from: ֫ */
    public static C10196 m10884(Map map) {
        return AbstractC6843.m15660(EnumC3490.OK, "application/json", C8461.m19682(map).toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10196 m10885(EnumC3490 enumC3490, String str) {
        return AbstractC6843.m15660(enumC3490, "application/json", new JSONObject().add(C0708d.f2599O, str).toString());
    }
}
