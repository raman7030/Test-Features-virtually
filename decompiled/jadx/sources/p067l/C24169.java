package p067l;

import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;

/* JADX INFO: renamed from: l.᩺ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H79P */
/* JADX INFO: loaded from: classes.dex */
public final class C24169 {

    /* JADX INFO: renamed from: ֫ */
    public final JSONValue f76647;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC7514 f76648;

    /* JADX INFO: renamed from: ֫ */
    public static C24169 m53446(EnumC3490 enumC3490, JSONObject jSONObject) {
        return new C24169(enumC3490, jSONObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24169 m53445(EnumC3490 enumC3490) {
        return new C24169(enumC3490, null);
    }

    public C24169(InterfaceC7514 interfaceC7514, JSONValue jSONValue) {
        this.f76648 = interfaceC7514;
        this.f76647 = jSONValue;
    }

    /* JADX INFO: renamed from: ֫ */
    public final JSONValue m53447() {
        return this.f76647;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10196 m53448() {
        InterfaceC7514 interfaceC7514 = this.f76648;
        JSONValue jSONValue = this.f76647;
        if (jSONValue != null) {
            return AbstractC6843.m15660(interfaceC7514, "application/json", jSONValue.toString());
        }
        return AbstractC6843.m15660(interfaceC7514, "text/plain; charset=UTF-8", "");
    }
}
