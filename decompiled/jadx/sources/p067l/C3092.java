package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1HV */
/* JADX INFO: loaded from: classes3.dex */
public final class C3092 extends C21199 {

    /* JADX INFO: renamed from: ۟ */
    public EnumC7116 f5594;

    /* JADX INFO: renamed from: ܰ */
    public C12501 f5595;

    /* JADX INFO: renamed from: ᩺ */
    public C2421 f5596;

    @Override // p067l.C21199, p067l.AbstractC13152
    /* JADX INFO: renamed from: ܺ */
    public final String mo5244() {
        return "#document";
    }

    public C3092(String str) {
        super(C17864.m40572("#root", C3783.f8101), str, null);
        this.f5596 = new C2421();
        this.f5594 = EnumC7116.noQuirks;
        this.f5595 = new C12501(new C18654());
    }

    /* JADX INFO: renamed from: ۖ */
    public static C3092 m5235(String str) {
        C3092 c3092 = new C3092(str);
        c3092.f5595 = c3092.f5595;
        C21199 c21199M47903 = c3092.m47903("html");
        c21199M47903.m47903("head");
        c21199M47903.m47903("body");
        return c3092;
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final C21199 m5246() {
        C21199 c21199M47903;
        Iterator it = m47878().iterator();
        do {
            if (!it.hasNext()) {
                c21199M47903 = m47903("html");
                break;
            }
            c21199M47903 = (C21199) it.next();
        } while (!c21199M47903.m47899().equals("html"));
        for (C21199 c21199 : c21199M47903.m47878()) {
            if ("body".equals(c21199.m47899()) || "frameset".equals(c21199.m47899())) {
                return c21199;
            }
        }
        return c21199M47903.m47903("body");
    }

    static {
        new C25162("title");
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ۖ */
    public final String mo5239() {
        return m47891();
    }

    @Override // p067l.C21199
    /* JADX INFO: renamed from: ܺ */
    public final void mo5245(String str) {
        m5246().mo5245(str);
    }

    @Override // p067l.C21199, p067l.AbstractC13152
    /* JADX INFO: renamed from: clone */
    public final Object mo55709clone() {
        C3092 c3092 = (C3092) super.mo55709clone();
        c3092.f5596 = this.f5596.clone();
        return c3092;
    }

    @Override // p067l.C21199, p067l.AbstractC13152
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final AbstractC13152 mo55709clone() {
        C3092 c3092 = (C3092) super.mo55709clone();
        c3092.f5596 = this.f5596.clone();
        return c3092;
    }

    @Override // p067l.C21199, p067l.AbstractC13152
    /* JADX INFO: renamed from: clone */
    public final C21199 mo55709clone() {
        C3092 c3092 = (C3092) super.mo55709clone();
        c3092.f5596 = this.f5596.clone();
        return c3092;
    }

    /* JADX INFO: renamed from: ۬֫ */
    public final C3092 m5242() {
        C3092 c3092 = new C3092(mo27067());
        C17173 c17173 = this.f66645;
        if (c17173 != null) {
            c3092.f66645 = c17173.clone();
        }
        c3092.f5596 = this.f5596.clone();
        return c3092;
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final C2421 m5236() {
        return this.f5596;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5241(C2421 c2421) {
        this.f5596 = c2421;
    }

    /* JADX INFO: renamed from: ܶ֫ */
    public final EnumC7116 m5243() {
        return this.f5594;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5237(EnumC7116 enumC7116) {
        this.f5594 = enumC7116;
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public final C12501 m5240() {
        return this.f5595;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5238(C12501 c12501) {
        this.f5595 = c12501;
    }
}
