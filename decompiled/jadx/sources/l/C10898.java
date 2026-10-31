package l;

import org.json.JSONArray;

/* JADX INFO: renamed from: l.ۧۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X66Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C10898 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        int iM29168 = ((C11955) c16040.m37919()).m29168();
        JSONArray jSONArray = (JSONArray) ((C11955) c16040.m37919()).m29175();
        C11955 c11955 = new C11955();
        try {
            c11955.m29155(jSONArray.getString(iM29168));
        } catch (Throwable unused) {
        }
        c16040.m37918(c11955);
    }
}
