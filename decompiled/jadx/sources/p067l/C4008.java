package p067l;

import org.json.JSONArray;

/* JADX INFO: renamed from: l.֫ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X66Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C4008 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        int iM31222 = ((C13731) c17613.m40106()).m31222();
        JSONArray jSONArray = (JSONArray) ((C13731) c17613.m40106()).m31229();
        C13731 c13731 = new C13731();
        try {
            c13731.m31206(jSONArray.getInt(iM31222));
        } catch (Throwable unused) {
        }
        c17613.m40105(c13731);
    }
}
