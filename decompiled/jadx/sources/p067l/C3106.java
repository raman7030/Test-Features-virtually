package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.֨֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N9ZJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3106 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C21213 f5648;

    public /* synthetic */ C3106(C21213 c21213) {
        this.f5648 = c21213;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8471 m5287() {
        C21213 c21213 = this.f5648;
        int i = C14506.f41405;
        C13836 c13836 = c21213.f66698;
        int i2 = C3777.f8087;
        EnumC13697 enumC13697 = EnumC13697.SMB2_ONLY;
        EnumC17187 enumC17187 = EnumC17187.SMB2_ONLY;
        C8471 c8471M7373 = C3777.m7373(c13836, enumC13697, true, enumC17187);
        EnumC17187 enumC17187M19698 = c8471M7373.m19698();
        EnumC17187 enumC17188 = EnumC17187.UNKNOWN;
        if (enumC17187M19698 == enumC17188) {
            Throwable thM19696 = c8471M7373.m19696();
            if (C21883.m49340(thM19696)) {
                c8471M7373 = C3777.m7373(c13836, EnumC13697.SMB3_ONLY, false, EnumC17187.SMB3_ONLY);
                if (c8471M7373.m19698() == enumC17188) {
                    Throwable thM19697 = c8471M7373.m19696();
                    if (thM19696 != null && thM19697 != null) {
                        C3777.m7377(thM19696, thM19697);
                    }
                    if (thM19696 == null) {
                        thM19696 = thM19697;
                    }
                    c8471M7373 = new C8471(enumC17188, thM19696, false);
                }
            }
        } else if (c8471M7373.m19698() == enumC17187 && TextUtils.isEmpty(c13836.f39095) && TextUtils.isEmpty(c13836.f39098)) {
            EnumC13697 enumC13698 = EnumC13697.SMB3_ONLY;
            EnumC17187 enumC17189 = EnumC17187.SMB3_ONLY;
            C8471 c8471M7374 = C3777.m7373(c13836, enumC13698, false, enumC17189);
            if (c8471M7374.m19698() == enumC17189) {
                c8471M7373 = c8471M7374;
            }
        }
        c21213.f66699 = c8471M7373.m19697();
        return c8471M7373;
    }
}
