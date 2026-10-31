package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۬ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65Z3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13187 extends C12171 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16904 f39443;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f39444;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f39445;

    public C13187(C16904 c16904, HashMap map, HashMap map2) {
        this.f39443 = c16904;
        this.f39444 = map;
        this.f39445 = map2;
    }

    @Override // l.C12171
    /* JADX INFO: renamed from: ֫ */
    public final void mo29645(EnumC2815 enumC2815, int i, int i2, C13687 c13687) {
        switch (C12482.f37508[enumC2815.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (c13687.m32933().equals(this.f39443.f51963)) {
                    String str = c13687.m32932() + ":" + c13687.m32934();
                    this.f39444.remove(str);
                    C2794 c2794 = (C2794) this.f39445.get(str);
                    if (c2794 != null) {
                        c2794.f8713 = null;
                    }
                }
                break;
        }
    }
}
