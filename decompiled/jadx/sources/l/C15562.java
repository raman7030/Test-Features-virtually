package l;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15562 implements InterfaceC5686 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3577 f47970;

    public C15562(AbstractC3577 abstractC3577) {
        this.f47970 = abstractC3577;
    }

    @Override // l.InterfaceC5686
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo16000() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f47970.f11355.entrySet()) {
            arrayList.add(new C1452((String) entry.getKey(), ((Integer) entry.getValue()).intValue()));
        }
        return arrayList;
    }

    @Override // l.InterfaceC5686
    /* JADX INFO: renamed from: ֫ */
    public final void mo16001(C1452 c1452) {
        this.f47970.f11355.put(c1452.m4993(), Integer.valueOf(c1452.m4994()));
        C12749.m31051();
    }

    @Override // l.InterfaceC5686
    /* JADX INFO: renamed from: ۧ */
    public final void mo16002(C1452 c1452) {
        this.f47970.f11355.remove(c1452.m4993());
        C12749.m31051();
    }
}
