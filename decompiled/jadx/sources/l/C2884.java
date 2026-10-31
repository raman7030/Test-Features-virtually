package l;

import bin.mt.json.JSONObject;
import com.umeng.analytics.pro.d;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7BU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2884 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8236 m8817(Map map) {
        return AbstractC4708.m13784(EnumC1180.OK, "application/json", C6411.m17735(map).toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8236 m8818(EnumC1180 enumC1180, String str) {
        return AbstractC4708.m13784(enumC1180, "application/json", new JSONObject().add(d.O, str).toString());
    }
}
