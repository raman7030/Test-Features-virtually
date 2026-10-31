package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAOV */
/* JADX INFO: loaded from: classes3.dex */
public final class C1021 extends AbstractC16543 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C13273 f3753;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C1541 f3754;

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ֫ */
    public final String mo1729() {
        return "String.intern";
    }

    public C1021(C17249 c17249, InterfaceC5276 interfaceC5276) {
        super(c17249, interfaceC5276);
        this.f3753 = new C13273("Ljava/lang/String;", "intern", "Ljava/lang/String;", Collections.EMPTY_LIST);
        this.f3754 = new C1541(c17249);
        this.f50835 = EnumC11810.VIRTUAL;
    }

    @Override // l.AbstractC16543
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List mo3535(C17249 c17249) {
        return Collections.singletonList(this.f3753);
    }

    @Override // l.AbstractC16543
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo3534(C1032 c1032, C15152 c15152, C23098 c23098, int i) {
        int iM51289 = c23098.m51289();
        C1541 c1541 = this.f3754;
        if (c1541.m5285(c15152, i, iM51289)) {
            return c1541.m5283();
        }
        C11003.toString(c1032);
        return null;
    }

    @Override // l.AbstractC16543
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3536(C15152 c15152, C0336 c0336, C23098 c23098, C13925 c13925) {
        super.mo3536(c15152, c0336, c23098, c13925);
        this.f3754.m5284(c15152);
    }
}
