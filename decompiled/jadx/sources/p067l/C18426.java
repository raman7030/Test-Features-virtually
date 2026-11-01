package p067l;

import android.media.AudioDeviceInfo;
import android.net.Uri;
import bin.p000mt.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18426 implements InterfaceC9756, InterfaceC22729, InterfaceC21775 {
    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ AudioDeviceInfo m41995(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m41996(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2) {
        return jSONObject2.add(str2, C3223.m5569(jSONObject.get(str)));
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m41997() {
        return C21562.synchronizedList(new ArrayList());
    }

    @Override // p067l.InterfaceC9756
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC18885 mo22783(InterfaceC22852 interfaceC22852, InterfaceC12878 interfaceC12878, InterfaceC15790 interfaceC15790) {
        return new C20486(interfaceC22852, interfaceC12878, interfaceC15790);
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC21775 mo19998() {
        return this;
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC21775 mo19999(C11915 c11915) {
        return this;
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC21775 mo20000(boolean z) {
        return this;
    }

    @Override // p067l.InterfaceC22729
    public Object apply(Object obj) {
        int i = ActivityC4030.f8821;
        ((Throwable) obj).getClass();
        return null;
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC3669[] mo20001(Uri uri, Map map) {
        return m41998();
    }

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC3669[] m41998() {
        return new InterfaceC3669[]{new C17317(2, 1, InterfaceC8974.f24307, new C11157(C14849.FOREVER_NS), new C21874(24))};
    }
}
