package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C17360 implements InterfaceC19231 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f53169;

    public C17360(HashMap map) {
        this.f53169 = map;
    }

    @Override // l.InterfaceC19231
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo40689(AbstractC1591 abstractC1591) {
        C23710 c23710;
        int iIntValue;
        EnumC7690 enumC7690 = abstractC1591.f5638;
        EnumC7690 enumC7691 = EnumC7690.ASSIGN;
        HashMap map = this.f53169;
        if (enumC7690 == enumC7691) {
            if (abstractC1591.mo5444().f25745 == EnumC1340.NEW_ARRAY && abstractC1591.mo5445().f25745 == EnumC1340.LOCAL) {
                C16156 c16156 = (C16156) abstractC1591.mo5444();
                AbstractC8396 abstractC8396 = c16156.f63597;
                if (abstractC8396.f25745 != EnumC1340.CONSTANT || (iIntValue = ((Number) ((C11987) abstractC8396).f35889).intValue()) < 0) {
                    return;
                }
                C18274 c18274 = (C18274) abstractC1591.mo5445();
                String str = c16156.f49779;
                C23710 c23711 = new C23710();
                c23711.f76775 = new ArrayList();
                c23711.f76777 = new ArrayList();
                c23711.f76776 = iIntValue;
                c23711.f76778 = str;
                c23711.f76774 = (C21802) abstractC1591;
                map.put(c18274, c23711);
                return;
            }
            if (abstractC1591.mo5445().f25745 == EnumC1340.ARRAY) {
                C12692 c12692 = (C12692) abstractC1591.mo5445();
                AbstractC8396 abstractC8397 = c12692.f2428;
                if (abstractC8397.f25745 == EnumC1340.LOCAL) {
                    C18274 c18275 = (C18274) abstractC8397;
                    C23710 c23712 = (C23710) map.get(c18275);
                    if (c23712 != null) {
                        if (c12692.f2429.f25745 == EnumC1340.CONSTANT) {
                            c23712.f76775.add(abstractC1591);
                            return;
                        } else {
                            map.remove(c18275);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (enumC7690 == EnumC7690.FILL_ARRAY_DATA && abstractC1591.mo5445().f25745 == EnumC1340.LOCAL && (c23710 = (C23710) map.get((C18274) abstractC1591.mo5445())) != null) {
            c23710.f76775.add(abstractC1591);
        }
    }
}
