package l;

import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.᩺ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H79P */
/* JADX INFO: loaded from: classes.dex */
public final class C22938 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONValue f73917;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5414 f73918;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22938 m51055(EnumC1180 enumC1180, JSONObject jSONObject) {
        return new C22938(enumC1180, jSONObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22938 m51054(EnumC1180 enumC1180) {
        return new C22938(enumC1180, null);
    }

    public C22938(InterfaceC5414 interfaceC5414, JSONValue jSONValue) {
        this.f73918 = interfaceC5414;
        this.f73917 = jSONValue;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONValue m51056() {
        return this.f73917;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8236 m51057() {
        InterfaceC5414 interfaceC5414 = this.f73918;
        JSONValue jSONValue = this.f73917;
        if (jSONValue != null) {
            return AbstractC4708.m13784(interfaceC5414, "application/json", jSONValue.toString());
        }
        return AbstractC4708.m13784(interfaceC5414, "text/plain; charset=UTF-8", "");
    }
}
