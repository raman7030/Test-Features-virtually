package p067l;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.۠᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10455 implements InterfaceC7773 {
    @Override // p067l.InterfaceC7773
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo17935() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : C21272.f66918.entrySet()) {
            arrayList.add(new C3749(((String) entry.getKey()).substring(6), ((Integer) entry.getValue()).intValue()));
        }
        return arrayList;
    }

    @Override // p067l.InterfaceC7773
    /* JADX INFO: renamed from: ֫ */
    public final void mo17936(C3749 c3749) {
        C21272.f66918.put("local:" + c3749.m7236(), Integer.valueOf(c3749.m7237()));
        C21272.m48056();
    }

    @Override // p067l.InterfaceC7773
    /* JADX INFO: renamed from: ۧ */
    public final void mo17937(C3749 c3749) {
        C21272.f66918.remove("local:" + c3749.m7236());
        C21272.m48056();
    }
}
