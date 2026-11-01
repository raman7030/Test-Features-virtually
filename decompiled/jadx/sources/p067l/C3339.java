package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAOV */
/* JADX INFO: loaded from: classes3.dex */
public final class C3339 extends AbstractC18091 {

    /* JADX INFO: renamed from: ۡ */
    public C14983 f6526;

    /* JADX INFO: renamed from: ܺ */
    public C3833 f6527;

    @Override // p067l.AbstractC24797
    /* JADX INFO: renamed from: ֫ */
    public final String mo4127() {
        return "String.intern";
    }

    public C3339(C18762 c18762, InterfaceC7383 interfaceC7383) {
        super(c18762, interfaceC7383);
        this.f6526 = new C14983("Ljava/lang/String;", "intern", "Ljava/lang/String;", Collections.EMPTY_LIST);
        this.f6527 = new C3833(c18762);
        this.f54013 = EnumC13593.VIRTUAL;
    }

    @Override // p067l.AbstractC18091
    /* JADX INFO: renamed from: ֫ */
    public final List mo5822(C18762 c18762) {
        return Collections.singletonList(this.f6526);
    }

    @Override // p067l.AbstractC18091
    /* JADX INFO: renamed from: ֫ */
    public final String mo5821(C3349 c3349, C16769 c16769, C24321 c24321, int i) {
        int iM53683 = c24321.m53683();
        C3833 c3833 = this.f6527;
        if (c3833.m7514(c16769, i, iM53683)) {
            return c3833.m7512();
        }
        C12826.toString(c3349);
        return null;
    }

    @Override // p067l.AbstractC18091
    /* JADX INFO: renamed from: ֫ */
    public final void mo5823(C16769 c16769, C2688 c2688, C24321 c24321, C15603 c15603) {
        super.mo5823(c16769, c2688, c24321, c15603);
        this.f6527.m7513(c16769);
    }
}
