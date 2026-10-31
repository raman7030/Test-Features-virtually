package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۗܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C30H */
/* JADX INFO: loaded from: classes2.dex */
public final class C3282 extends AbstractC2393 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C13864 f10324 = C13864.m33217("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f10325;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f10326;

    public C3282(ArrayList arrayList, ArrayList arrayList2) {
        this.f10325 = C20032.m46175((List) arrayList);
        this.f10326 = C20032.m46175((List) arrayList2);
    }

    @Override // l.AbstractC2393
    /* JADX INFO: renamed from: ܽ */
    public final C13864 mo1980() {
        return f10324;
    }

    @Override // l.AbstractC2393
    /* JADX INFO: renamed from: ֫ */
    public final long mo1976() {
        return m10091((InterfaceC10405) null, true);
    }

    @Override // l.AbstractC2393
    /* JADX INFO: renamed from: ֫ */
    public final void mo1977(InterfaceC10405 interfaceC10405) {
        m10091(interfaceC10405, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m10091(InterfaceC10405 interfaceC10405, boolean z) {
        C12521 c12521Mo26253;
        if (z) {
            c12521Mo26253 = new C12521();
        } else {
            c12521Mo26253 = interfaceC10405.mo26253();
        }
        List list = this.f10325;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c12521Mo26253.m30720writeByte(38);
            }
            String str = (String) list.get(i);
            c12521Mo26253.getClass();
            c12521Mo26253.m30707(0, str.length(), str);
            c12521Mo26253.m30720writeByte(61);
            String str2 = (String) this.f10326.get(i);
            c12521Mo26253.m30707(0, str2.length(), str2);
        }
        if (!z) {
            return 0L;
        }
        long size2 = c12521Mo26253.size();
        c12521Mo26253.m30706();
        return size2;
    }
}
