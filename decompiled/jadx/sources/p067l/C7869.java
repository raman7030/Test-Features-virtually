package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1UK */
/* JADX INFO: loaded from: classes3.dex */
public final class C7869 extends AbstractC5050 implements InterfaceC10825 {

    /* JADX INFO: renamed from: ۧ */
    public final C23292[] f20663;

    public C7869(C23292... c23292Arr) {
        super(2);
        this.f20663 = c23292Arr;
    }

    @Override // p067l.AbstractC5050, p067l.InterfaceC10825
    /* JADX INFO: renamed from: ֫ */
    public final void mo3627(C5187 c5187) {
        mo10779(c5187);
        String strM11126 = c5187.m11126();
        if (strM11126 != null) {
            AbstractC21281 abstractC21281M18178 = m18178(C11419.m26418(strM11126));
            if (abstractC21281M18178 instanceof C5187) {
                c5187.m11127((C5187) abstractC21281M18178);
            }
        }
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ۧ */
    public final void mo10779(C5187 c5187) {
        AbstractC21281 abstractC21281M18178;
        if (c5187.m48101() != null && (abstractC21281M18178 = m18178(c5187.m48101())) != null) {
            c5187.m48105(abstractC21281M18178);
            abstractC21281M18178.m48096(c5187);
        }
        Iterator<E> it = c5187.m48110().iterator();
        while (it.hasNext()) {
            AbstractC21281 abstractC21281M18179 = m18178((String) it.next());
            if (abstractC21281M18179 != null) {
                c5187.m48099(abstractC21281M18179);
                abstractC21281M18179.m48096(c5187);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private AbstractC21281 m18178(String str) {
        for (C23292 c23292 : this.f20663) {
            AbstractC21281 abstractC21281M51875 = c23292.m51875(str);
            if (abstractC21281M51875 != null) {
                return abstractC21281M51875;
            }
        }
        return null;
    }
}
