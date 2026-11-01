package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes4.dex */
public final class C12468 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۗ */
    public C21856 f34885;

    /* JADX INFO: renamed from: ۛ */
    public final C23648 f34886;

    /* JADX INFO: renamed from: ۤ */
    public final boolean f34887;

    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC12548 f34888;

    /* JADX INFO: renamed from: ۫ */
    public C15819 f34889;

    /* JADX INFO: renamed from: ۬ */
    public final C21677 f34890;

    public C12468(C23648 c23648, C21677 c21677, boolean z, InterfaceC12548 interfaceC12548) {
        super(4, -1);
        if (c21677 == null) {
            throw new NullPointerException("code == null");
        }
        if (interfaceC12548 == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.f34886 = c23648;
        this.f34890 = c21677;
        this.f34887 = z;
        this.f34888 = interfaceC12548;
        this.f34885 = null;
        this.f34889 = null;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_CODE_ITEM;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        C6630 c6630M7844 = c3948.m7844();
        C18423 c18423M7862 = c3948.m7862();
        C21677 c21677 = this.f34890;
        if (c21677.m48928() || c21677.m48922()) {
            C15819 c15819 = new C15819(c21677, this.f34887, this.f34886);
            this.f34889 = c15819;
            c6630M7844.m15102((AbstractC5289) c15819);
        }
        if (c21677.m48929()) {
            Iterator it = c21677.m48920().iterator();
            while (it.hasNext()) {
                c18423M7862.m41992((C9566) it.next());
            }
            this.f34885 = new C21856(c21677);
        }
        Iterator it2 = c21677.m48925().iterator();
        while (it2.hasNext()) {
            c3948.m7855((AbstractC15405) it2.next());
        }
    }

    public final String toString() {
        return "CodeItem{" + this.f34886.mo4819() + C0249l.f1198d;
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        return this.f34886.mo4819();
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5195(C6630 c6630, int i) {
        int iM49302;
        C3948 c3948M18447 = c6630.m18447();
        C14479 c14479 = new C14479(c3948M18447);
        C21677 c21677 = this.f34890;
        c21677.m48921(c14479);
        C21856 c21856 = this.f34885;
        if (c21856 != null) {
            c21856.m49300(c3948M18447);
            iM49302 = this.f34885.m49302();
        } else {
            iM49302 = 0;
        }
        int iM12353 = c21677.m48927().m12353();
        if ((iM12353 & 1) != 0) {
            iM12353++;
        }
        m11431((iM12353 * 2) + 16 + iM49302);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010e  */
    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        int i;
        String string;
        boolean zM44765 = c19705.m44765();
        C21677 c21677 = this.f34890;
        int iM12356 = c21677.m48927().m12356();
        int iM12355 = c21677.m48927().m12355();
        boolean z = this.f34887;
        C23648 c23648 = this.f34886;
        int iM35476 = c23648.m41621(z).m53653().m35476();
        int iM12353 = c21677.m48927().m12353();
        boolean z2 = (iM12353 & 1) != 0;
        C21856 c21856 = this.f34885;
        int iM49299 = c21856 == null ? 0 : c21856.m49299();
        C15819 c15819 = this.f34889;
        int iM11432 = c15819 == null ? 0 : c15819.m11432();
        if (zM44765) {
            c19705.m44760(0, m11433() + ' ' + c23648.mo4819());
            c19705.m44760(2, "  registers_size: ".concat(C16351.m37153(iM12356)));
            c19705.m44760(2, "  ins_size:       ".concat(C16351.m37153(iM35476)));
            c19705.m44760(2, "  outs_size:      ".concat(C16351.m37153(iM12355)));
            c19705.m44760(2, "  tries_size:     ".concat(C16351.m37153(iM49299)));
            c19705.m44760(4, "  debug_off:      ".concat(C16351.m37155(iM11432)));
            c19705.m44760(4, "  insns_size:     ".concat(C16351.m37155(iM12353)));
            InterfaceC12548 interfaceC12548 = this.f34888;
            if (interfaceC12548.size() != 0) {
                StringBuilder sb = new StringBuilder("  throws ");
                int size = interfaceC12548.size();
                if (size == 0) {
                    string = "<empty>";
                } else {
                    StringBuilder sb2 = new StringBuilder(100);
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = size;
                        if (i2 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(interfaceC12548.getType(i2).mo4819());
                        i2++;
                        size = i3;
                    }
                    string = sb2.toString();
                }
                sb.append(string);
                c19705.m44760(0, sb.toString());
            } else {
                c23648 = c23648;
            }
        } else {
            c23648 = c23648;
        }
        c19705.m44770(iM12356);
        c19705.m44770(iM35476);
        c19705.m44770(iM12355);
        c19705.m44770(iM49299);
        c19705.m44773(iM11432);
        c19705.m44773(iM12353);
        try {
            c21677.m48927().m12354(c19705);
            if (this.f34885 != null) {
                if (z2) {
                    if (zM44765) {
                        c19705.m44760(2, "  padding: 0");
                    }
                    i = 0;
                    c19705.m44770(0);
                } else {
                    i = 0;
                }
                this.f34885.m49301(c19705);
            } else {
                i = 0;
            }
            if (!zM44765 || this.f34889 == null) {
                return;
            }
            c19705.m44760(i, "  debug info");
            this.f34889.m35897(c3948, c19705);
        } catch (RuntimeException e) {
            throw C10101.m23569("...while writing instructions for " + c23648.mo4819(), e);
        }
    }
}
