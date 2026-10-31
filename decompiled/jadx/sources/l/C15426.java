package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܶ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y90G */
/* JADX INFO: loaded from: classes5.dex */
public final class C15426 extends AbstractC15594 {
    @Override // l.InterfaceC3601
    /* JADX INFO: renamed from: ֫ */
    public final C21073 mo2488(C19662 c19662, InterfaceC18418 interfaceC18418) {
        int iMo44153 = c19662.mo44153();
        CharSequence charSequenceM38335 = c19662.getLine().m38335();
        if (c19662.mo44151() >= 4 || charSequenceM38335.charAt(iMo44153) != '<') {
            return null;
        }
        for (int i = 1; i <= 7; i++) {
            if (i != 7 || (!(((C4139) interfaceC18418).mo12420().mo7223() instanceof C21365) && !c19662.mo44152().mo7225())) {
                Pattern pattern = C21778.f69763[i][0];
                Pattern pattern2 = C21778.f69763[i][1];
                if (pattern.matcher(charSequenceM38335.subSequence(iMo44153, charSequenceM38335.length())).find()) {
                    C21073 c21073 = new C21073(new C21778(pattern2));
                    c21073.m47974(c19662.getIndex());
                    return c21073;
                }
            }
        }
        return null;
    }
}
