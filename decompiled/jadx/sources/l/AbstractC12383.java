package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37E8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12383 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f37140;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C19460 f37141;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC19898 f37145;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6759 f37147;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C6759 f37149;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3046 f37150;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C7279 f37146 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7279 f37144 = null;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C7279 f37142 = null;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C7279 f37143 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC3251 f37148 = EnumC3251.unknown;

    public AbstractC12383(C3046 c3046, AbstractC19898 abstractC19898, int i) {
        this.f37150 = c3046;
        this.f37145 = abstractC19898;
        this.f37140 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30108() {
        boolean zM16940 = EnumC6073.m16940(this.f37140);
        C3046 c3046 = this.f37150;
        if (zM16940) {
            this.f37149 = new C6759(c3046, EnumC4662.f14791);
            this.f37140 &= ~EnumC6073.f18612.m16978();
        }
        if (EnumC6073.m16957(this.f37140)) {
            this.f37147 = new C6759(c3046, EnumC4662.f14803);
            this.f37140 &= ~EnumC6073.f18592.m16978();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC19898 m30112() {
        return this.f37145;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30110(C15869 c15869) {
        C19460 c19460 = this.f37141;
        if (c19460 != null && c15869.f20943 != c19460.f62935.f20943) {
            this.f37145.mo2245("The new attribute \"{0}\" overwrites an already declared one in the \"{1}\" structure.", EnumC15204.f46530.m35967(), this.f37148.m9948());
        }
        this.f37141 = new C19460(this.f37150, EnumC4662.f14797, c15869);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30111(C15869 c15869, long j) {
        C19460 c19460 = this.f37141;
        if (c19460 != null && c15869.f20943 != c19460.f62935.f20943) {
            this.f37145.mo11949(j, "The new attribute \"{0}\" overwrites an already declared one in the \"{1}\" structure.", EnumC15204.f46530.m35967(), this.f37148.m9948());
        }
        this.f37141 = new C19460(this.f37150, EnumC4662.f14797, c15869);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5868 m30107(InterfaceC1800... interfaceC1800Arr) {
        C5868 c5868 = new C5868();
        for (InterfaceC1800 interfaceC1800 : interfaceC1800Arr) {
            if (interfaceC1800 != null) {
                c5868.m16430(interfaceC1800);
            }
        }
        C7279 c7279 = this.f37146;
        if (c7279 != null) {
            c5868.m16430(c7279);
        }
        C7279 c72710 = this.f37144;
        if (c72710 != null) {
            c5868.m16430(c72710);
        }
        C7279 c72711 = this.f37142;
        if (c72711 != null) {
            c5868.m16430(c72711);
        }
        C7279 c72712 = this.f37143;
        if (c72712 != null) {
            c5868.m16430(c72712);
        }
        return c5868;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30109(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C16636 c16636 = (C16636) it.next();
                boolean z = c16636.f51086;
                boolean z2 = c16636 instanceof C8026;
                C3046 c3046 = this.f37150;
                if (z2) {
                    C8026 c8026 = (C8026) c16636;
                    if (z) {
                        if (this.f37143 == null) {
                            this.f37143 = new C7279(c3046, EnumC4662.f14816);
                        }
                        this.f37143.m19535(c8026);
                    } else {
                        if (this.f37142 == null) {
                            this.f37142 = new C7279(c3046, EnumC4662.f14785);
                        }
                        this.f37142.m19535(c8026);
                    }
                } else if (z) {
                    if (this.f37144 == null) {
                        this.f37144 = new C7279(c3046, EnumC4662.f14790);
                    }
                    this.f37144.m19535(c16636);
                } else {
                    if (this.f37146 == null) {
                        this.f37146 = new C7279(c3046, EnumC4662.f14784);
                    }
                    this.f37146.m19535(c16636);
                }
            }
        }
    }
}
