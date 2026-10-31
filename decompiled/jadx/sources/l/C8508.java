package l;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.۠᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8508 implements InterfaceC5686 {
    @Override // l.InterfaceC5686
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo16000() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : C19890.f64282.entrySet()) {
            arrayList.add(new C1452(((String) entry.getKey()).substring(6), ((Integer) entry.getValue()).intValue()));
        }
        return arrayList;
    }

    @Override // l.InterfaceC5686
    /* JADX INFO: renamed from: ֫ */
    public final void mo16001(C1452 c1452) {
        C19890.f64282.put("local:" + c1452.m4993(), Integer.valueOf(c1452.m4994()));
        C19890.m45745();
    }

    @Override // l.InterfaceC5686
    /* JADX INFO: renamed from: ۧ */
    public final void mo16002(C1452 c1452) {
        C19890.f64282.remove("local:" + c1452.m4993());
        C19890.m45745();
    }
}
