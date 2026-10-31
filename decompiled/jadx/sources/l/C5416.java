package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۚܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1ER */
/* JADX INFO: loaded from: classes3.dex */
public final class C5416 extends C16704 {
    /* JADX WARN: Code duplicated, block: B:24:0x00bd  */
    @Override // l.C16704, l.InterfaceC23760
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15499(InterfaceC13965 interfaceC13965, InterfaceC21211 interfaceC21211, C14587 c14587, C18116 c18116) {
        CharSequence charSequenceM24585;
        if (!interfaceC21211.mo29412()) {
            throw new RuntimeException();
        }
        interfaceC13965.mo1294("style");
        interfaceC13965.mo1291("name", interfaceC21211.mo29406());
        if (interfaceC21211.getParent() != 0) {
            interfaceC13965.mo1291("parent", "@".concat(c14587.mo32239(interfaceC21211.mo29407().mo12858(), interfaceC21211.getParent())));
        }
        C9650.m24592(interfaceC13965, interfaceC21211, c18116);
        C17515 c17515M34848 = c14587.m34848();
        for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
            C16809 c16809M40933 = c17515M34848.m40933(interfaceC1454.mo5006());
            if (c16809M40933 == null) {
                C16704.m39270(interfaceC13965, interfaceC1454, c14587);
            } else {
                if (((C18683) c16809M40933.m39546()).contains(interfaceC1454.mo5004())) {
                    String strM34844 = c14587.m34844(interfaceC21211.mo29407().mo12858(), (c16809M40933.f51604 >>> 24) & 255);
                    interfaceC13965.mo1294("item");
                    StringBuilder sbM15339 = C5368.m15339(strM34844);
                    sbM15339.append(c16809M40933.f51605);
                    interfaceC13965.mo1291("name", sbM15339.toString());
                    if (interfaceC1454.mo5007()) {
                        int i = c16809M40933.f51608;
                        if ((65536 & i) != 0) {
                            charSequenceM24585 = c16809M40933.m39545(interfaceC1454.getValue());
                        } else if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                            charSequenceM24585 = c16809M40933.m39548(interfaceC1454.getValue());
                        } else {
                            charSequenceM24585 = null;
                        }
                    } else {
                        charSequenceM24585 = null;
                    }
                    if (charSequenceM24585 == null) {
                        charSequenceM24585 = C9650.m24585(c14587, interfaceC1454);
                    }
                    C9650.m24588(interfaceC13965, charSequenceM24585);
                    interfaceC13965.mo1290("item");
                } else {
                    C16704.m39270(interfaceC13965, interfaceC1454, c14587);
                }
            }
        }
        interfaceC13965.mo1290("style");
    }
}
