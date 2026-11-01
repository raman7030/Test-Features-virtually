package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۚܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1ER */
/* JADX INFO: loaded from: classes3.dex */
public final class C7516 extends C18244 {
    /* JADX WARN: Code duplicated, block: B:24:0x00bd  */
    @Override // p067l.C18244, p067l.InterfaceC24950
    /* JADX INFO: renamed from: ֫ */
    public final void mo17410(InterfaceC15641 interfaceC15641, InterfaceC22528 interfaceC22528, C16232 c16232, C19586 c19586) {
        CharSequence charSequenceM26599;
        if (!interfaceC22528.mo31474()) {
            throw new RuntimeException();
        }
        interfaceC15641.mo3702("style");
        interfaceC15641.mo3699("name", interfaceC22528.mo31468());
        if (interfaceC22528.getParent() != 0) {
            interfaceC15641.mo3699("parent", "@".concat(c16232.mo34338(interfaceC22528.mo31469().mo14722(), interfaceC22528.getParent())));
        }
        C11540.m26606(interfaceC15641, interfaceC22528, c19586);
        C19015 c19015M36999 = c16232.m36999();
        for (InterfaceC3751 interfaceC3751 : interfaceC22528.values()) {
            C18344 c18344M43191 = c19015M36999.m43191(interfaceC3751.mo7249());
            if (c18344M43191 == null) {
                C18244.m41506(interfaceC15641, interfaceC3751, c16232);
            } else {
                if (((C20125) c18344M43191.m41782()).contains(interfaceC3751.mo7247())) {
                    String strM36995 = c16232.m36995(interfaceC22528.mo31469().mo14722(), (c18344M43191.f54786 >>> 24) & 255);
                    interfaceC15641.mo3702("item");
                    StringBuilder sbM17248 = C7470.m17248(strM36995);
                    sbM17248.append(c18344M43191.f54787);
                    interfaceC15641.mo3699("name", sbM17248.toString());
                    if (interfaceC3751.mo7250()) {
                        int i = c18344M43191.f54790;
                        if ((65536 & i) != 0) {
                            charSequenceM26599 = c18344M43191.m41781(interfaceC3751.getValue());
                        } else if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                            charSequenceM26599 = c18344M43191.m41784(interfaceC3751.getValue());
                        } else {
                            charSequenceM26599 = null;
                        }
                    } else {
                        charSequenceM26599 = null;
                    }
                    if (charSequenceM26599 == null) {
                        charSequenceM26599 = C11540.m26599(c16232, interfaceC3751);
                    }
                    C11540.m26602(interfaceC15641, charSequenceM26599);
                    interfaceC15641.mo3698("item");
                } else {
                    C18244.m41506(interfaceC15641, interfaceC3751, c16232);
                }
            }
        }
        interfaceC15641.mo3698("style");
    }
}
