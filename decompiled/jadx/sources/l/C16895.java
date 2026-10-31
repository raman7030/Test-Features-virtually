package l;

import android.media.AudioDeviceInfo;
import android.net.Uri;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16895 implements InterfaceC7773, InterfaceC21423, InterfaceC20419 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ AudioDeviceInfo m39754(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m39755(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2) {
        return jSONObject2.add(str2, C0899.m3250(jSONObject.get(str)));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m39756() {
        return C20195.synchronizedList(new ArrayList());
    }

    @Override // l.InterfaceC7773
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC17379 mo20802(InterfaceC21553 interfaceC21553, InterfaceC11058 interfaceC11058, InterfaceC14122 interfaceC14122) {
        return new C19063(interfaceC21553, interfaceC11058, interfaceC14122);
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC20419 mo18048() {
        return this;
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC20419 mo18049(C10045 c10045) {
        return this;
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC20419 mo18050(boolean z) {
        return this;
    }

    @Override // l.InterfaceC21423
    public Object apply(Object obj) {
        int i = ActivityC1748.f6044;
        ((Throwable) obj).getClass();
        return null;
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC1368[] mo18051(Uri uri, Map map) {
        return m39757();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC1368[] m39757() {
        return new InterfaceC1368[]{new C15729(2, 1, InterfaceC6950.f21425, new C9248(C13132.FOREVER_NS), new C20524(24))};
    }
}
