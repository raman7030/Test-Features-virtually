package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܶ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y90G */
/* JADX INFO: loaded from: classes5.dex */
public final class C17029 extends AbstractC17188 {
    @Override // p067l.InterfaceC5790
    /* JADX INFO: renamed from: ֫ */
    public final C22396 mo4844(C21055 c21055, InterfaceC19872 interfaceC19872) {
        int iMo46447 = c21055.mo46447();
        CharSequence charSequenceM40550 = c21055.getLine().m40550();
        if (c21055.mo46445() >= 4 || charSequenceM40550.charAt(iMo46447) != '<') {
            return null;
        }
        for (int i = 1; i <= 7; i++) {
            if (i != 7 || (!(((C6302) interfaceC19872).mo14310().mo9302() instanceof C22673) && !c21055.mo46446().mo9304())) {
                Pattern pattern = C23066.f72471[i][0];
                Pattern pattern2 = C23066.f72471[i][1];
                if (pattern.matcher(charSequenceM40550.subSequence(iMo46447, charSequenceM40550.length())).find()) {
                    C22396 c22396 = new C22396(new C23066(pattern2));
                    c22396.m50304(c21055.getIndex());
                    return c22396;
                }
            }
        }
        return null;
    }
}
