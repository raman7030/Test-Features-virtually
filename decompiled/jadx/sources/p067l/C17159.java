package p067l;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes4.dex */
public final class C17159 implements InterfaceC7773 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5769 f51102;

    public C17159(AbstractC5769 abstractC5769) {
        this.f51102 = abstractC5769;
    }

    @Override // p067l.InterfaceC7773
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo17935() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f51102.f14160.entrySet()) {
            arrayList.add(new C3749((String) entry.getKey(), ((Integer) entry.getValue()).intValue()));
        }
        return arrayList;
    }

    @Override // p067l.InterfaceC7773
    /* JADX INFO: renamed from: ֫ */
    public final void mo17936(C3749 c3749) {
        this.f51102.f14160.put(c3749.m7236(), Integer.valueOf(c3749.m7237()));
        C14486.m33135();
    }

    @Override // p067l.InterfaceC7773
    /* JADX INFO: renamed from: ۧ */
    public final void mo17937(C3749 c3749) {
        this.f51102.f14160.remove(c3749.m7236());
        C14486.m33135();
    }
}
