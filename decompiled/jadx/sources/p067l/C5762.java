package p067l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۗ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4YN */
/* JADX INFO: loaded from: classes3.dex */
public final class C5762 extends AbstractC17358 {

    /* JADX INFO: renamed from: ۗ */
    public C19765 f14122;

    /* JADX INFO: renamed from: ۙ */
    public final C7103 f14123;

    /* JADX INFO: renamed from: ۛ */
    public final C14260 f14124;

    /* JADX INFO: renamed from: ۤ */
    public final C14260 f14125;

    /* JADX INFO: renamed from: ۫ */
    public C12666 f14126;

    /* JADX INFO: renamed from: ۬ */
    public final C14930 f14127;

    /* JADX INFO: renamed from: ᩶ */
    public C10456 f14128;

    /* JADX INFO: renamed from: ᩹ */
    public final int f14129;

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ۧ */
    public final int mo5704() {
        return 32;
    }

    public C5762(C14260 c14260, int i, C14260 c14261, InterfaceC12548 interfaceC12548, C14930 c14930) {
        if (c14260 == null) {
            throw new NullPointerException("thisClass == null");
        }
        if (interfaceC12548 == null) {
            throw new NullPointerException("interfaces == null");
        }
        this.f14124 = c14260;
        this.f14129 = i;
        this.f14125 = c14261;
        this.f14122 = interfaceC12548.size() == 0 ? null : new C19765(interfaceC12548);
        this.f14127 = c14930;
        this.f14123 = new C7103(c14260);
        this.f14126 = null;
        this.f14128 = new C10456();
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_CLASS_DEF_ITEM;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        C18423 c18423M7862 = c3948.m7862();
        C6630 c6630M7844 = c3948.m7844();
        C6630 c6630M7850 = c3948.m7850();
        C6630 c6630M7842 = c3948.m7842();
        C4342 c4342M7861 = c3948.m7861();
        c18423M7862.m41991(this.f14124);
        C7103 c7103 = this.f14123;
        if (!c7103.m16370()) {
            c3948.m7858().m15102((AbstractC5289) c7103);
            C12920 c12920M16368 = c7103.m16368();
            if (c12920M16368 != null) {
                this.f14126 = (C12666) c6630M7844.m15105(new C12666(c12920M16368));
            }
        }
        C14260 c14260 = this.f14125;
        if (c14260 != null) {
            c18423M7862.m41991(c14260);
        }
        C19765 c19765 = this.f14122;
        if (c19765 != null) {
            this.f14122 = (C19765) c6630M7842.m15105(c19765);
        }
        C14930 c14930 = this.f14127;
        if (c14930 != null) {
            c4342M7861.m8958(c14930);
        }
        if (this.f14128.m24174()) {
            return;
        }
        if (this.f14128.m24175()) {
            this.f14128 = (C10456) c6630M7850.m15105(this.f14128);
        } else {
            c6630M7850.m15102((AbstractC5289) this.f14128);
        }
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5703(C3948 c3948, C19705 c19705) {
        boolean zM44765 = c19705.m44765();
        C18423 c18423M7862 = c3948.m7862();
        C14260 c14260 = this.f14124;
        int iM41989 = c18423M7862.m41989(c14260);
        C14260 c14261 = this.f14125;
        int iM419810 = c14261 == null ? -1 : c18423M7862.m41989(c14261);
        C19765 c19765 = this.f14122;
        int iM11432 = c19765 == null ? 0 : c19765.m11432();
        int iM11433 = this.f14128.m24174() ? 0 : this.f14128.m11432();
        C14930 c14930 = this.f14127;
        int iM8956 = c14930 != null ? c3948.m7861().m8956(c14930) : -1;
        C7103 c7103 = this.f14123;
        int iM11434 = c7103.m16370() ? 0 : c7103.m11432();
        C12666 c12666 = this.f14126;
        int iM11435 = c12666 == null ? 0 : c12666.m11432();
        int i = this.f14129;
        if (zM44765) {
            c19705.m44760(0, m39359() + ' ' + c14260.mo4819());
            c19705.m44760(4, "  class_idx:           ".concat(C16351.m37155(iM41989)));
            StringBuilder sb = new StringBuilder("  access_flags:        ");
            sb.append(C4007.m7982(i));
            c19705.m44760(4, sb.toString());
            StringBuilder sb2 = new StringBuilder("  superclass_idx:      ");
            sb2.append(C16351.m37155(iM419810));
            sb2.append(" // ");
            sb2.append(c14261 == null ? "<none>" : c14261.mo4819());
            c19705.m44760(4, sb2.toString());
            c19705.m44760(4, "  interfaces_off:      ".concat(C16351.m37155(iM11432)));
            if (iM11432 != 0) {
                InterfaceC12548 interfaceC12548M44904 = this.f14122.m44904();
                int i2 = 0;
                for (int size = interfaceC12548M44904.size(); i2 < size; size = size) {
                    c19705.m44760(0, ASN1Dump.TAB + interfaceC12548M44904.getType(i2).mo4819());
                    i2++;
                }
            }
            StringBuilder sb3 = new StringBuilder("  source_file_idx:     ");
            sb3.append(C16351.m37155(iM8956));
            sb3.append(" // ");
            sb3.append(c14930 != null ? c14930.mo4819() : "<none>");
            c19705.m44760(4, sb3.toString());
            c19705.m44760(4, "  annotations_off:     ".concat(C16351.m37155(iM11433)));
            c19705.m44760(4, "  class_data_off:      ".concat(C16351.m37155(iM11434)));
            c19705.m44760(4, "  static_values_off:   ".concat(C16351.m37155(iM11435)));
        }
        c19705.m44773(iM41989);
        c19705.m44773(i);
        c19705.m44773(iM419810);
        c19705.m44773(iM11432);
        c19705.m44773(iM8956);
        c19705.m44773(iM11433);
        c19705.m44773(iM11434);
        c19705.m44773(iM11435);
    }

    /* JADX INFO: renamed from: ۢ */
    public final C14260 m12865() {
        return this.f14124;
    }

    /* JADX INFO: renamed from: ۜܽ */
    public final C14260 m12864() {
        return this.f14125;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final InterfaceC12548 m12867() {
        C19765 c19765 = this.f14122;
        if (c19765 == null) {
            return C15600.f44675;
        }
        return c19765.m44904();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12859(C18029 c18029, AbstractC15405 abstractC15405) {
        this.f14123.m16366(c18029, abstractC15405);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12858(C18029 c18029) {
        this.f14123.m16365(c18029);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12860(C18700 c18700) {
        this.f14123.m16367(c18700);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12866(C18700 c18700) {
        this.f14123.m16369(c18700);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12863(C24143 c24143, C3948 c3948) {
        this.f14128.m24173(c24143, c3948);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12857(C10908 c10908, C24143 c24143, C3948 c3948) {
        this.f14128.m24170(c10908, c24143, c3948);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12862(C23648 c23648, C24143 c24143, C3948 c3948) {
        this.f14128.m24172(c23648, c24143, c3948);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12861(C23648 c23648, C15425 c15425, C3948 c3948) {
        this.f14128.m24171(c23648, c15425, c3948);
    }
}
