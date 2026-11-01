package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;

/* JADX INFO: renamed from: l.᩻ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24611 implements InterfaceC5166 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C14553 f77909;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C9385 f77910;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f77911;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ InterfaceC20589 f77912;

    public C24611(C14553 c14553, InterfaceC20589 interfaceC20589, String str, C9385 c9385) {
        this.f77909 = c14553;
        this.f77912 = interfaceC20589;
        this.f77911 = str;
        this.f77910 = c9385;
    }

    @Override // p067l.InterfaceC5166
    /* JADX INFO: renamed from: ֫ */
    public final C7177 mo11035(AbstractC17043 abstractC17043) throws C5276 {
        this.f77912.mo12540(abstractC17043);
        C14362 c14362M33240 = this.f77909.m33240(abstractC17043.mo25509());
        String str = this.f77910.f25641;
        JSONArray jSONArrayArray = JSON.array();
        String str2 = this.f77911;
        C14553.m33268(str2, c14362M33240, str, jSONArrayArray);
        if (c14362M33240.m32961() < 0 || c14362M33240.m32961() > 9007199254740991L) {
            throw C14553.m33231(JSON.array(), "The prepared file size exceeds the supported JSON integer range.", str2, str, "produce_temp");
        }
        return new C7177(c14362M33240.m32961(), null);
    }

    @Override // p067l.InterfaceC5166
    /* JADX INFO: renamed from: ֫ */
    public final void mo11036(C9385 c9385) {
        this.f77912.mo12539(c9385);
    }
}
