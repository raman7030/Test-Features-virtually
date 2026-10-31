package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.֨֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N9ZJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0776 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19828 f2876;

    public /* synthetic */ C0776(C19828 c19828) {
        this.f2876 = c19828;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6421 m2958() {
        C19828 c19828 = this.f2876;
        int i = C12771.f38365;
        C12066 c12066 = c19828.f64061;
        int i2 = C1482.f5314;
        EnumC11919 enumC11919 = EnumC11919.SMB2_ONLY;
        EnumC15592 enumC15592 = EnumC15592.SMB2_ONLY;
        C6421 c6421M5131 = C1482.m5131(c12066, enumC11919, true, enumC15592);
        EnumC15592 enumC15592M17751 = c6421M5131.m17751();
        EnumC15592 enumC15593 = EnumC15592.UNKNOWN;
        if (enumC15592M17751 == enumC15593) {
            Throwable thM17749 = c6421M5131.m17749();
            if (C20533.m47017(thM17749)) {
                c6421M5131 = C1482.m5131(c12066, EnumC11919.SMB3_ONLY, false, EnumC15592.SMB3_ONLY);
                if (c6421M5131.m17751() == enumC15593) {
                    Throwable thM177410 = c6421M5131.m17749();
                    if (thM17749 != null && thM177410 != null) {
                        C1482.m5135(thM17749, thM177410);
                    }
                    if (thM17749 == null) {
                        thM17749 = thM177410;
                    }
                    c6421M5131 = new C6421(enumC15593, thM17749, false);
                }
            }
        } else if (c6421M5131.m17751() == enumC15592 && TextUtils.isEmpty(c12066.f36084) && TextUtils.isEmpty(c12066.f36087)) {
            EnumC11919 enumC119110 = EnumC11919.SMB3_ONLY;
            EnumC15592 enumC15594 = EnumC15592.SMB3_ONLY;
            C6421 c6421M5132 = C1482.m5131(c12066, enumC119110, false, enumC15594);
            if (c6421M5132.m17751() == enumC15594) {
                c6421M5131 = c6421M5132;
            }
        }
        c19828.f64062 = c6421M5131.m17750();
        return c6421M5131;
    }
}
