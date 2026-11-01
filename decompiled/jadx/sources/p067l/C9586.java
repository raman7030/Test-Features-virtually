package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBEF */
/* JADX INFO: loaded from: classes4.dex */
public final class C9586 extends AbstractC15620 {

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f26387;

    /* JADX INFO: renamed from: ᩹ */
    public final C4262 f26388;

    public C9586(int i) {
        super(i != 0);
        this.f26388 = new C4262(i);
        this.f26387 = new ArrayList();
    }

    public C9586(C4262 c4262, ArrayList arrayList) {
        super(c4262.m8663() > 0);
        this.f26388 = c4262;
        this.f26387 = arrayList;
    }

    @Override // p067l.C20376
    /* JADX INFO: renamed from: ܺ */
    public final void mo22326() {
        this.f26388.mo22326();
        for (AbstractC15620 abstractC15620 : this.f26387) {
            if (abstractC15620 != null) {
                abstractC15620.mo22326();
            }
        }
        super.mo22326();
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC15620 mo8662() {
        return new C9586(this);
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ֫ */
    public final void mo8660(C4933 c4933) {
        c4933.m23570("(locals array set; primary)");
        this.f26388.mo8660(c4933);
        ArrayList arrayList = this.f26387;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC15620 abstractC15620 = (AbstractC15620) arrayList.get(i);
            if (abstractC15620 != null) {
                c4933.m23570("(locals array set: primary for caller " + C16351.m37153(i) + ')');
                abstractC15620.mo8655().mo8660(c4933);
            }
        }
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        StringBuilder sb = new StringBuilder("(locals array set; primary)\n");
        sb.append(this.f26388.mo4819());
        sb.append('\n');
        ArrayList arrayList = this.f26387;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC15620 abstractC15620 = (AbstractC15620) arrayList.get(i);
            if (abstractC15620 != null) {
                sb.append("(locals array set: primary for caller " + C16351.m37153(i) + ")\n");
                sb.append(abstractC15620.mo8655().mo4819());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ۧ */
    public final void mo8664(C9566 c9566) {
        C4262 c4262 = this.f26388;
        if (c4262.m8663() == 0) {
            return;
        }
        m46001();
        c4262.mo8664(c9566);
        for (AbstractC15620 abstractC15620 : this.f26387) {
            if (abstractC15620 != null) {
                abstractC15620.mo8664(c9566);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9586(C9586 c9586) {
        super(c9586.f26388.m8663() > 0);
        this.f26388 = c9586.f26388.mo8662();
        this.f26387 = new ArrayList(c9586.f26387.size());
        int size = c9586.f26387.size();
        for (int i = 0; i < size; i++) {
            AbstractC15620 abstractC15620 = (AbstractC15620) c9586.f26387.get(i);
            if (abstractC15620 == null) {
                this.f26387.add(null);
            } else {
                this.f26387.add(abstractC15620.mo8662());
            }
        }
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ֫ */
    public final void mo8659(int i, InterfaceC3830 interfaceC3830) {
        m46001();
        this.f26388.mo8659(i, interfaceC3830);
        for (AbstractC15620 abstractC15620 : this.f26387) {
            if (abstractC15620 != null) {
                abstractC15620.mo8659(i, interfaceC3830);
            }
        }
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ֫ */
    public final void mo8661(C22783 c22783) {
        mo8659(c22783.m50989(), c22783);
    }

    @Override // p067l.AbstractC15620
    public final InterfaceC3830 get(int i) {
        return this.f26388.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    private C9586 m22323(C4262 c4262) {
        AbstractC15620 abstractC15620Mo8658;
        c4262.getClass();
        C4262 c4263 = this.f26388;
        C4262 c4262M8656 = c4263.m8656(c4262);
        ArrayList arrayList = this.f26387;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AbstractC15620 abstractC15620 = (AbstractC15620) arrayList.get(i);
            if (abstractC15620 != null) {
                try {
                    abstractC15620Mo8658 = abstractC15620.mo8658(c4262);
                } catch (C4933 e) {
                    e.m23570("Merging one locals against caller block ".concat(C16351.m37153(i)));
                    abstractC15620Mo8658 = null;
                }
            } else {
                abstractC15620Mo8658 = null;
            }
            z = z || abstractC15620 != abstractC15620Mo8658;
            arrayList2.add(abstractC15620Mo8658);
        }
        return (c4263 != c4262M8656 || z) ? new C9586(c4262M8656, arrayList2) : this;
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15620 mo8658(AbstractC15620 abstractC15620) {
        C9586 c9586M22323;
        try {
            if (abstractC15620 instanceof C9586) {
                c9586M22323 = m22324((C9586) abstractC15620);
            } else {
                c9586M22323 = m22323((C4262) abstractC15620);
            }
            c9586M22323.mo22326();
            return c9586M22323;
        } catch (C4933 e) {
            e.m23570("underlay locals:");
            mo8660(e);
            e.m23570("overlay locals:");
            abstractC15620.mo8660(e);
            throw e;
        }
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ֫ */
    public final C9586 mo8657(AbstractC15620 abstractC15620, int i) {
        AbstractC15620 abstractC15621;
        ArrayList arrayList = this.f26387;
        AbstractC15620 abstractC15622 = i >= arrayList.size() ? null : (AbstractC15620) arrayList.get(i);
        C4262 c4262Mo8655 = abstractC15620.mo8655();
        C4262 c4262 = this.f26388;
        C4262 c4262M8656 = c4262.m8656(c4262Mo8655);
        if (abstractC15622 == abstractC15620) {
            abstractC15620 = abstractC15622;
        } else if (abstractC15622 != null) {
            abstractC15620 = abstractC15622.mo8658(abstractC15620);
        }
        if (abstractC15620 == abstractC15622 && c4262M8656 == c4262) {
            return this;
        }
        int size = arrayList.size();
        int iMax = Math.max(i + 1, size);
        ArrayList arrayList2 = new ArrayList(iMax);
        int i2 = 0;
        C4262 c4262M8657 = null;
        while (i2 < iMax) {
            if (i2 == i) {
                abstractC15621 = abstractC15620;
            } else {
                abstractC15621 = i2 < size ? (AbstractC15620) arrayList.get(i2) : null;
            }
            if (abstractC15621 != null) {
                if (c4262M8657 == null) {
                    c4262M8657 = abstractC15621.mo8655();
                } else {
                    c4262M8657 = c4262M8657.m8656(abstractC15621.mo8655());
                }
            }
            arrayList2.add(abstractC15621);
            i2++;
        }
        C9586 c9586 = new C9586(c4262M8657, arrayList2);
        c9586.mo22326();
        return c9586;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15620 m22325(int i) {
        ArrayList arrayList = this.f26387;
        if (i >= arrayList.size()) {
            return null;
        }
        return (AbstractC15620) arrayList.get(i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX INFO: renamed from: ֫ */
    private C9586 m22324(C9586 c9586) {
        C4262 c4262 = c9586.f26388;
        C4262 c4263 = this.f26388;
        C4262 c4262M8656 = c4263.m8656(c4262);
        ArrayList arrayList = this.f26387;
        int size = arrayList.size();
        ArrayList arrayList2 = c9586.f26387;
        int size2 = arrayList2.size();
        int iMax = Math.max(size, size2);
        ArrayList arrayList3 = new ArrayList(iMax);
        int i = 0;
        boolean z = false;
        while (i < iMax) {
            AbstractC15620 abstractC15620Mo8658 = null;
            AbstractC15620 abstractC15620 = i < size ? (AbstractC15620) arrayList.get(i) : null;
            AbstractC15620 abstractC15621 = i < size2 ? (AbstractC15620) arrayList2.get(i) : null;
            if (abstractC15620 == abstractC15621) {
                abstractC15620Mo8658 = abstractC15620;
            } else if (abstractC15620 == null) {
                abstractC15620Mo8658 = abstractC15621;
            } else if (abstractC15621 == null) {
                abstractC15620Mo8658 = abstractC15620;
            } else {
                try {
                    abstractC15620Mo8658 = abstractC15620.mo8658(abstractC15621);
                } catch (C4933 e) {
                    e.m23570("Merging locals set for caller block ".concat(C16351.m37153(i)));
                }
            }
            z = z || abstractC15620 != abstractC15620Mo8658;
            arrayList3.add(abstractC15620Mo8658);
            i++;
        }
        return (c4263 != c4262M8656 || z) ? new C9586(c4262M8656, arrayList3) : this;
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ֨ */
    public final C4262 mo8655() {
        return this.f26388;
    }
}
