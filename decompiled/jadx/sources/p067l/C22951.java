package p067l;

/* JADX INFO: renamed from: l.᩸ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6MK */
/* JADX INFO: loaded from: classes4.dex */
public final class C22951 {

    /* JADX INFO: renamed from: ֫ */
    public final C14233 f72196;

    public C22951(C14233 c14233) {
        this.f72196 = c14233;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3092 m51265(C3092 c3092) {
        C3092 c3092M5235 = C3092.m5235(c3092.mo27067());
        C21199 c21199M5246 = c3092.m5246();
        C23669.m52682(new C10210(this, c21199M5246, c3092M5235.m5246()), c21199M5246);
        c3092M5235.m5241(c3092.m5236().clone());
        return c3092M5235;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16914 m51264(C22951 c22951, C21199 c21199) {
        C14233 c14233 = c22951.f72196;
        String strM47902 = c21199.m47902();
        C17173 c17173 = new C17173();
        C21199 c211910 = new C21199(C17864.m40572(strM47902, C3783.f8102), c21199.mo27067(), c17173);
        int i = 0;
        for (C11140 c11140 : c21199.mo27062()) {
            if (c14233.m32710(strM47902, c21199, c11140)) {
                c17173.m38890(c11140);
            } else {
                i++;
            }
        }
        c17173.m38891(c14233.m32704(strM47902));
        if (c21199.m30144().m7709()) {
            c21199.m30144().m7708(c211910, true);
        }
        if (c21199.m47889().m7709()) {
            c21199.m47889().m7708(c211910, false);
        }
        C16914 c16914 = new C16914();
        c16914.f50076 = c211910;
        c16914.f50077 = i;
        return c16914;
    }
}
