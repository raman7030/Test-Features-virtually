package p067l;

import java.io.StringReader;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38VW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3504 extends AbstractC2833 {
    @Override // p067l.AbstractC2833
    /* JADX INFO: renamed from: ۧ */
    public final C3783 mo4527() {
        return C3783.f8102;
    }

    @Override // p067l.AbstractC2833
    /* JADX INFO: renamed from: ֫ */
    public final void mo4521(StringReader stringReader, String str, C12501 c12501) {
        super.mo4521(stringReader, str, c12501);
        this.f4884.add(this.f4881);
        C2421 c2421M5236 = this.f4881.m5236();
        c2421M5236.m3372(EnumC20528.xml);
        c2421M5236.m3371(EnumC5105.xhtml);
        c2421M5236.m3373();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0 A[LOOP:1: B:36:0x00db->B:41:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec A[SYNTHETIC] */
    @Override // p067l.AbstractC2833
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4525(AbstractC4454 abstractC4454) {
        int size;
        C21199 c21199;
        C17983 c17983M12955;
        C21199 c211910 = null;
        switch (C7528.f19763[abstractC4454.f9999.ordinal()]) {
            case 1:
                C11160 c11160 = (C11160) abstractC4454;
                C17864 c17864M4519 = m4519(c11160.m24219(), this.f4875);
                if (c11160.m24220()) {
                    c11160.f29033.m38885(this.f4875);
                }
                C3783 c3783 = this.f4875;
                C17173 c17173 = c11160.f29033;
                c3783.m7396(c17173);
                C21199 c211911 = new C21199(c17864M4519, null, c17173);
                m4520().m47895(c211911);
                m4522((AbstractC13152) c211911, (AbstractC4454) c11160);
                if (!c11160.f29031) {
                    this.f4884.add(c211911);
                    return true;
                }
                if (!c17864M4519.m40575()) {
                    c17864M4519.m40579();
                }
                return true;
            case 2:
                C21889 c21889 = (C21889) abstractC4454;
                Object objM7398 = this.f4875.m7398(c21889.f29032);
                int size2 = this.f4884.size();
                int i = size2 + (-1) >= 256 ? size2 - 257 : 0;
                for (int size3 = this.f4884.size() - 1; size3 >= i; size3--) {
                    C21199 c211912 = (C21199) this.f4884.get(size3);
                    if (c211912.mo5244().equals(objM7398)) {
                        c211910 = c211912;
                        if (c211910 != null) {
                            for (size = this.f4884.size() - 1; size >= 0; size--) {
                                c21199 = (C21199) this.f4884.get(size);
                                this.f4884.remove(size);
                                if (c21199 == c211910) {
                                    m4523(c21199, (AbstractC4454) c21889);
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                }
                if (c211910 != null) {
                    while (size >= 0) {
                        c21199 = (C21199) this.f4884.get(size);
                        this.f4884.remove(size);
                        if (c21199 == c211910) {
                            m4523(c21199, (AbstractC4454) c21889);
                            return true;
                        }
                    }
                }
                return true;
            case 3:
                C15852 c15852 = (C15852) abstractC4454;
                C5775 c5775 = new C5775(c15852.m35981());
                if (c15852.f45914 && c5775.m12954() && (c17983M12955 = c5775.m12955()) != null) {
                    c5775 = c17983M12955;
                }
                m4520().m47895(c5775);
                m4522(c5775, c15852);
                return true;
            case 4:
                C18535 c18535 = (C18535) abstractC4454;
                String strM42138 = c18535.m42138();
                AbstractC13152 c4434 = c18535 instanceof C19206 ? new C4434(strM42138) : new C12620(strM42138);
                m4520().m47895(c4434);
                m4522(c4434, c18535);
                return true;
            case 5:
                C24570 c24570 = (C24570) abstractC4454;
                C9798 c9798 = new C9798(this.f4875.m7398(c24570.f77786.toString()), c24570.f77788.toString(), c24570.f77784.toString());
                c9798.m22867(c24570.f77785);
                m4520().m47895(c9798);
                m4522(c9798, c24570);
                return true;
            case 6:
                return true;
            default:
                throw new C15832("Unexpected token type: ".concat(String.valueOf(abstractC4454.f9999)));
        }
    }

    @Override // p067l.AbstractC2833
    /* JADX INFO: renamed from: ֫ */
    public final List mo4518(String str, C21199 c21199, String str2, C12501 c12501) {
        mo4521(new StringReader(str), str2, c12501);
        m4529();
        return this.f4881.m30141();
    }
}
