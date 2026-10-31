package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBEJ */
/* JADX INFO: loaded from: classes2.dex */
public class C2593 implements InterfaceC8780 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16540 f8202;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15375 f8203;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14586 f8204;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4004 f8205;

    public C2593(C4004 c4004, C14586 c14586) {
        this.f8205 = c4004;
        this.f8204 = c14586;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8218(C16540 c16540, C15375 c15375) {
        this.f8202 = c16540;
        this.f8203 = c15375;
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8212(C1018 c1018) {
        AbstractC4793 c18821;
        C3135 c3135M37484 = c1018.m37484();
        if (c3135M37484.m9562() == 54 || c3135M37484.m9562() == 56) {
            return;
        }
        C10191 c10191M37480 = c1018.m37480();
        C13259 c13259M24584 = C9649.m24584(c1018);
        int iM9558 = c3135M37484.m9558();
        if (iM9558 == 1 || iM9558 == 2) {
            c18821 = new C18821(c13259M24584, c10191M37480, C4004.m12059(c1018));
        } else {
            if (iM9558 == 3) {
                return;
            }
            if (iM9558 != 4) {
                if (iM9558 != 6) {
                    throw new RuntimeException("shouldn't happen");
                }
                c18821 = new C18821(c13259M24584, c10191M37480, C4004.m12059(c1018));
            } else {
                c18821 = new C5415(c13259M24584, c10191M37480, C4004.m12059(c1018), this.f8205.f12698.m45051(this.f8202.m38911().get(1)));
            }
        }
        m8214(c18821);
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8215(C5252 c5252) {
        C10191 c10191M37480 = c5252.m37480();
        C13259 c13259M24584 = C9649.m24584(c5252);
        C3135 c3135M37484 = c5252.m37484();
        int iM9562 = c3135M37484.m9562();
        if (c3135M37484.m9558() != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        if (iM9562 == 3) {
            C4004 c4004 = this.f8205;
            if (c4004.f12706) {
                return;
            }
            C21480 c21480M37483 = c5252.m37483();
            m8214(new C18821(c13259M24584, c10191M37480, C20069.m46250(c21480M37483, C21480.m48631((c4004.f12699 - c4004.f12701) + ((C2635) c5252.m34454()).mo2231(), c21480M37483.getType()))));
            return;
        }
        m8214(new C21727(c13259M24584, c10191M37480, C4004.m12059(c5252), c5252.m34454()));
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8216(C5957 c5957) {
        C10191 c10191M37480 = c5957.m37480();
        C21064 c21064M16682 = c5957.m16682();
        C21064 c21064M38911 = this.f8202.m38911();
        int size = c21064M16682.size();
        int size2 = c21064M38911.size();
        int iM38913 = this.f8202.m38913();
        if (size != size2 - 1 || iM38913 != c21064M38911.get(size)) {
            throw new RuntimeException("shouldn't happen");
        }
        C15375[] c15375Arr = new C15375[size];
        for (int i = 0; i < size; i++) {
            c15375Arr[i] = this.f8205.f12698.m45051(c21064M38911.get(i));
        }
        C15375 c15375 = new C15375(c10191M37480, false);
        C15375 c15376 = new C15375(this.f8203.m13983(), true);
        C0475 c0475 = new C0475(c10191M37480, c15376, c21064M16682, c15375Arr);
        AbstractC4793 c5415 = new C5415(c0475.m2083() ? C12554.f37829 : C12554.f37716, c10191M37480, C4004.m12059(c5957), c15375);
        m8214(c15376);
        m8214(c5415);
        m8221(new C17409(c10191M37480));
        m8221(c15375);
        m8221(c0475);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21480 m8211() {
        int iM38913 = this.f8202.m38913();
        if (iM38913 < 0) {
            return null;
        }
        AbstractC15834 abstractC15834M41001get = this.f8205.f12702.m31591().m40535(iM38913).m38916().m41001get(0);
        if (abstractC15834M41001get.m37484().m9562() != 56) {
            return null;
        }
        return abstractC15834M41001get.m37483();
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8213(C3841 c3841) {
        C10191 c10191M37480 = c3841.m37480();
        C13259 c13259M24584 = C9649.m24584(c3841);
        C3135 c3135M37484 = c3841.m37484();
        if (c3135M37484.m9558() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c3135M37484.m9558());
        }
        if (!c3135M37484.m9563()) {
            throw new RuntimeException("Expected call-like operation");
        }
        m8214(this.f8203);
        m8214(new C18115(c13259M24584, c10191M37480, c3841.m37479(), new AbstractC13717[]{c3841.m11592(), c3841.m11591()}));
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8217(C11602 c11602) {
        AbstractC4793 c21727;
        AbstractC4793 abstractC4793M34836;
        int iM32171;
        C10191 c10191M37480 = c11602.m37480();
        C13259 c13259M24584 = C9649.m24584(c11602);
        C3135 c3135M37484 = c11602.m37484();
        AbstractC13717 abstractC13717M34454 = c11602.m34454();
        if (c3135M37484.m9558() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c3135M37484.m9558());
        }
        m8214(this.f8203);
        if (c3135M37484.m9563()) {
            m8214(new C21727(c13259M24584, c10191M37480, c11602.m37479(), abstractC13717M34454));
            return;
        }
        C21480 c21480M8211 = m8211();
        C20069 c20069M12063 = C4004.m12063(c11602, c21480M8211);
        if ((c13259M24584.m32173() || c3135M37484.m9562() == 43) != (c21480M8211 != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + c11602);
        }
        if (c3135M37484.m9562() == 41 && c13259M24584.m32171() != 35) {
            c21727 = new C18821(c13259M24584, c10191M37480, c20069M12063);
        } else {
            c21727 = new C21727(c13259M24584, c10191M37480, c20069M12063, abstractC13717M34454);
        }
        C14586 c14586 = this.f8204;
        int iM34840 = c14586.m34840() - 1;
        while (true) {
            if (iM34840 < 0) {
                abstractC4793M34836 = null;
                break;
            }
            abstractC4793M34836 = c14586.m34836(iM34840);
            if (abstractC4793M34836.m13994().m32171() != -1) {
                break;
            } else {
                iM34840--;
            }
        }
        if (c13259M24584.m32171() == 32 && abstractC4793M34836 != null && (((iM32171 = abstractC4793M34836.m13994().m32171()) == 7 || iM32171 == 8 || iM32171 == 9) && c21727.m13993().size() > 0 && abstractC4793M34836.m13993().size() > 1 && c21727.m13993().m41004get(0).m48652() == abstractC4793M34836.m13993().m41004get(1).m48652())) {
            m8214(new C18821(C12554.f37725, c10191M37480, C20069.f65002));
        }
        m8214(c21727);
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8220(C22890 c22890) {
        C10191 c10191M37480 = c22890.m37480();
        C13259 c13259M24584 = C9649.m24584(c22890);
        if (c22890.m37484().m9558() != 6) {
            throw new RuntimeException("shouldn't happen");
        }
        C21480 c21480M8211 = m8211();
        if (c13259M24584.m32173() != (c21480M8211 != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + c22890);
        }
        m8214(this.f8203);
        m8214(new C18821(c13259M24584, c10191M37480, C4004.m12063(c22890, c21480M8211)));
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8219(C20775 c20775) {
        C10191 c10191M37480 = c20775.m37480();
        AbstractC13717 abstractC13717M47474 = c20775.m47474();
        ArrayList arrayListM47475 = c20775.m47475();
        if (c20775.m37484().m9558() == 1) {
            C15375 c15375 = new C15375(c10191M37480, false);
            AbstractC4793 c18905 = new C18905(c10191M37480, this.f8203, arrayListM47475, abstractC13717M47474);
            AbstractC4793 c5415 = new C5415(C12554.f37797, c10191M37480, C4004.m12059(c20775), c15375);
            m8214(this.f8203);
            m8214(c5415);
            m8221(new C17409(c10191M37480));
            m8221(c15375);
            m8221(c18905);
            return;
        }
        throw new RuntimeException("shouldn't happen");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8214(AbstractC4793 abstractC4793) {
        this.f8204.m34838(abstractC4793);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8221(AbstractC4793 abstractC4793) {
        this.f8204.m34841(abstractC4793);
    }
}
