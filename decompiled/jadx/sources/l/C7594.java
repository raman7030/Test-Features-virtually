package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBEF */
/* JADX INFO: loaded from: classes4.dex */
public final class C7594 extends AbstractC13943 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f23476;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1992 f23477;

    public C7594(int i) {
        super(i != 0);
        this.f23477 = new C1992(i);
        this.f23476 = new ArrayList();
    }

    public C7594(C1992 c1992, ArrayList arrayList) {
        super(c1992.m6521() > 0);
        this.f23477 = c1992;
        this.f23476 = arrayList;
    }

    @Override // l.C18947
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo20349() {
        this.f23477.mo20349();
        for (AbstractC13943 abstractC13943 : this.f23476) {
            if (abstractC13943 != null) {
                abstractC13943.mo20349();
            }
        }
        super.mo20349();
    }

    @Override // l.AbstractC13943
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC13943 mo6520() {
        return new C7594(this);
    }

    @Override // l.AbstractC13943
    /* JADX INFO: renamed from: ֫ */
    public final void mo6518(C2698 c2698) {
        c2698.m21602("(locals array set; primary)");
        this.f23477.mo6518(c2698);
        ArrayList arrayList = this.f23476;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC13943 abstractC13943 = (AbstractC13943) arrayList.get(i);
            if (abstractC13943 != null) {
                c2698.m21602("(locals array set: primary for caller " + C14712.m35006(i) + ')');
                abstractC13943.mo6513().mo6518(c2698);
            }
        }
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        StringBuilder sb = new StringBuilder("(locals array set; primary)\n");
        sb.append(this.f23477.mo2463());
        sb.append('\n');
        ArrayList arrayList = this.f23476;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC13943 abstractC13943 = (AbstractC13943) arrayList.get(i);
            if (abstractC13943 != null) {
                sb.append("(locals array set: primary for caller " + C14712.m35006(i) + ")\n");
                sb.append(abstractC13943.mo6513().mo2463());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC13943
    /* JADX INFO: renamed from: ۧ */
    public final void mo6522(C7573 c7573) {
        C1992 c1992 = this.f23477;
        if (c1992.m6521() == 0) {
            return;
        }
        m43734();
        c1992.mo6522(c7573);
        for (AbstractC13943 abstractC13943 : this.f23476) {
            if (abstractC13943 != null) {
                abstractC13943.mo6522(c7573);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7594(C7594 c7594) {
        super(c7594.f23477.m6521() > 0);
        this.f23477 = c7594.f23477.mo6520();
        this.f23476 = new ArrayList(c7594.f23476.size());
        int size = c7594.f23476.size();
        for (int i = 0; i < size; i++) {
            AbstractC13943 abstractC13943 = (AbstractC13943) c7594.f23476.get(i);
            if (abstractC13943 == null) {
                this.f23476.add(null);
            } else {
                this.f23476.add(abstractC13943.mo6520());
            }
        }
    }

    @Override // l.AbstractC13943
    /* JADX INFO: renamed from: ֫ */
    public final void mo6517(int i, InterfaceC1538 interfaceC1538) {
        m43734();
        this.f23477.mo6517(i, interfaceC1538);
        for (AbstractC13943 abstractC13943 : this.f23476) {
            if (abstractC13943 != null) {
                abstractC13943.mo6517(i, interfaceC1538);
            }
        }
    }

    @Override // l.AbstractC13943
    /* JADX INFO: renamed from: ֫ */
    public final void mo6519(C21480 c21480) {
        mo6517(c21480.m48652(), c21480);
    }

    @Override // l.AbstractC13943
    public final InterfaceC1538 get(int i) {
        return this.f23477.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7594 m20346(C1992 c1992) {
        AbstractC13943 abstractC13943Mo6516;
        c1992.getClass();
        C1992 c1993 = this.f23477;
        C1992 c1992M6514 = c1993.m6514(c1992);
        ArrayList arrayList = this.f23476;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AbstractC13943 abstractC13943 = (AbstractC13943) arrayList.get(i);
            if (abstractC13943 != null) {
                try {
                    abstractC13943Mo6516 = abstractC13943.mo6516(c1992);
                } catch (C2698 e) {
                    e.m21602("Merging one locals against caller block ".concat(C14712.m35006(i)));
                    abstractC13943Mo6516 = null;
                }
            } else {
                abstractC13943Mo6516 = null;
            }
            z = z || abstractC13943 != abstractC13943Mo6516;
            arrayList2.add(abstractC13943Mo6516);
        }
        return (c1993 != c1992M6514 || z) ? new C7594(c1992M6514, arrayList2) : this;
    }

    @Override // l.AbstractC13943
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13943 mo6516(AbstractC13943 abstractC13943) {
        C7594 c7594M20346;
        try {
            if (abstractC13943 instanceof C7594) {
                c7594M20346 = m20347((C7594) abstractC13943);
            } else {
                c7594M20346 = m20346((C1992) abstractC13943);
            }
            c7594M20346.mo20349();
            return c7594M20346;
        } catch (C2698 e) {
            e.m21602("underlay locals:");
            mo6518(e);
            e.m21602("overlay locals:");
            abstractC13943.mo6518(e);
            throw e;
        }
    }

    @Override // l.AbstractC13943
    /* JADX INFO: renamed from: ֫ */
    public final C7594 mo6515(AbstractC13943 abstractC13943, int i) {
        AbstractC13943 abstractC13944;
        ArrayList arrayList = this.f23476;
        AbstractC13943 abstractC13945 = i >= arrayList.size() ? null : (AbstractC13943) arrayList.get(i);
        C1992 c1992Mo6513 = abstractC13943.mo6513();
        C1992 c1992 = this.f23477;
        C1992 c1992M6514 = c1992.m6514(c1992Mo6513);
        if (abstractC13945 == abstractC13943) {
            abstractC13943 = abstractC13945;
        } else if (abstractC13945 != null) {
            abstractC13943 = abstractC13945.mo6516(abstractC13943);
        }
        if (abstractC13943 == abstractC13945 && c1992M6514 == c1992) {
            return this;
        }
        int size = arrayList.size();
        int iMax = Math.max(i + 1, size);
        ArrayList arrayList2 = new ArrayList(iMax);
        int i2 = 0;
        C1992 c1992M6515 = null;
        while (i2 < iMax) {
            if (i2 == i) {
                abstractC13944 = abstractC13943;
            } else {
                abstractC13944 = i2 < size ? (AbstractC13943) arrayList.get(i2) : null;
            }
            if (abstractC13944 != null) {
                if (c1992M6515 == null) {
                    c1992M6515 = abstractC13944.mo6513();
                } else {
                    c1992M6515 = c1992M6515.m6514(abstractC13944.mo6513());
                }
            }
            arrayList2.add(abstractC13944);
            i2++;
        }
        C7594 c7594 = new C7594(c1992M6515, arrayList2);
        c7594.mo20349();
        return c7594;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13943 m20348(int i) {
        ArrayList arrayList = this.f23476;
        if (i >= arrayList.size()) {
            return null;
        }
        return (AbstractC13943) arrayList.get(i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7594 m20347(C7594 c7594) {
        C1992 c1992 = c7594.f23477;
        C1992 c1993 = this.f23477;
        C1992 c1992M6514 = c1993.m6514(c1992);
        ArrayList arrayList = this.f23476;
        int size = arrayList.size();
        ArrayList arrayList2 = c7594.f23476;
        int size2 = arrayList2.size();
        int iMax = Math.max(size, size2);
        ArrayList arrayList3 = new ArrayList(iMax);
        int i = 0;
        boolean z = false;
        while (i < iMax) {
            AbstractC13943 abstractC13943Mo6516 = null;
            AbstractC13943 abstractC13943 = i < size ? (AbstractC13943) arrayList.get(i) : null;
            AbstractC13943 abstractC13944 = i < size2 ? (AbstractC13943) arrayList2.get(i) : null;
            if (abstractC13943 == abstractC13944) {
                abstractC13943Mo6516 = abstractC13943;
            } else if (abstractC13943 == null) {
                abstractC13943Mo6516 = abstractC13944;
            } else if (abstractC13944 == null) {
                abstractC13943Mo6516 = abstractC13943;
            } else {
                try {
                    abstractC13943Mo6516 = abstractC13943.mo6516(abstractC13944);
                } catch (C2698 e) {
                    e.m21602("Merging locals set for caller block ".concat(C14712.m35006(i)));
                }
            }
            z = z || abstractC13943 != abstractC13943Mo6516;
            arrayList3.add(abstractC13943Mo6516);
            i++;
        }
        return (c1993 != c1992M6514 || z) ? new C7594(c1992M6514, arrayList3) : this;
    }

    @Override // l.AbstractC13943
    /* JADX INFO: renamed from: ֨ */
    public final C1992 mo6513() {
        return this.f23477;
    }
}
