package l;

import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܿۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X66Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C17247 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        String strM29186 = ((C11955) c16040.m37919()).m29186();
        JSONObject jSONObject = (JSONObject) ((C11955) c16040.m37919()).m29175();
        C11955 c11955 = new C11955();
        try {
            c11955.m29152(jSONObject.getInt(strM29186));
        } catch (Throwable unused) {
        }
        c16040.m37918(c11955);
    }
}
