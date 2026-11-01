package p067l;

import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܿۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X66Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C18760 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        String strM31240 = ((C13731) c17613.m40106()).m31240();
        JSONObject jSONObject = (JSONObject) ((C13731) c17613.m40106()).m31229();
        C13731 c13731 = new C13731();
        try {
            c13731.m31206(jSONObject.getInt(strM31240));
        } catch (Throwable unused) {
        }
        c17613.m40105(c13731);
    }
}
